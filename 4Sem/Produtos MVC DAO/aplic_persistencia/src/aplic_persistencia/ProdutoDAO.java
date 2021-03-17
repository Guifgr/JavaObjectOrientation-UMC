/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplic_persistencia;

import Util.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guifg
 */
public class ProdutoDAO {
    public void cadastrar(Produto prod) throws ClassNotFoundException, SQLException{
        Connection con = FabricaConexao.getConexao();
        
        String sql =  "insert into produtos(descricao, preco) values (?, ?)";
        PreparedStatement comando = con.prepareStatement(sql);
        comando.setString(1, prod.getDescricao());
        comando.setDouble(2, prod.getPreco());
        
        comando.execute();
        
        comando.close();
    }
    public Produto ConsultarById(int id) throws ClassNotFoundException, SQLException{
        Connection con = FabricaConexao.getConexao();

        String sql =  "select id, descricao, preco from produtos where id = ?";
        PreparedStatement comando = con.prepareStatement(sql);
        comando.setInt(1, id);
        
        ResultSet resultado = comando.executeQuery(); 
        Produto p  = new Produto();
        if(resultado.next()){
            p.setId(resultado.getInt("id"));
            p.setDescricao(resultado.getString("descricao"));
            p.setPreco(resultado.getDouble("preco"));
        }
        return p;
    }
    public List ConsultarTodos() throws ClassNotFoundException, SQLException{
        Connection con = FabricaConexao.getConexao();
        String sql =  "select id, descricao, preco from produtos";
        PreparedStatement comando = con.prepareStatement(sql);
        
        ResultSet resultado = comando.executeQuery(); 
        List<Produto> listaProdutos = new ArrayList<Produto>();
        while(resultado.next()){
            Produto novoProduto = new Produto();
            novoProduto.setId(resultado.getInt("id"));
            novoProduto.setDescricao(resultado.getString("descricao"));
            novoProduto.setPreco(resultado.getDouble("preco"));
            listaProdutos.add(novoProduto);
        }
        return listaProdutos;
    }
}
