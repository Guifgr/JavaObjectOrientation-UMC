/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplic_persistencia;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author guifg
 */
public class Produto {
    private int id;
    private String descricao;
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void cadastrarProduto(String nome, Double preco){
        Produto produto = new Produto();
        produto.setDescricao(nome);
        produto.setPreco(preco);
        ProdutoDAO produtodao = new ProdutoDAO();
        try{
            produtodao.cadastrar(produto);
        }catch(ClassNotFoundException ex){
            System.out.println("Erro: " + ex.getMessage());
        }catch(SQLException ex){
            System.out.println("Erro SQL: " + ex.getMessage());
        }
    }
    public void pesquisarProduto(int id){
        Produto produto = new Produto();
        produto.setId(2);
        ProdutoDAO produtodao = new ProdutoDAO();
        
        try{
            produto = produtodao.ConsultarById(produto.getId());
            System.out.println("ID........" + produto.getId());
            System.out.println("Descricao." + produto.getDescricao());
            System.out.println("preco....." + produto.getPreco());
        }catch(ClassNotFoundException ex){
            System.out.println("Erro ClassNotFound: "+ ex.getMessage());
        }catch(SQLException ex){
            System.out.println("Erro SQL: "+ ex.getMessage());
        }
    }
    public void ListarProdutos(){
        try{
        ProdutoDAO pdao = new ProdutoDAO();
        List<Produto> lp = pdao.ConsultarTodos();
            for (Produto p : lp) {
                System.out.println("\n");
                System.out.println("ID........" + p.getId());
                System.out.println("Descricao." + p.getDescricao());
                System.out.println("preco....." + p.getPreco());
            }
        }catch(ClassNotFoundException ex){
            System.out.println("Erro ClassNotFound: "+ ex.getMessage());
        }catch(SQLException ex){
            System.out.println("Erro SQL: "+ ex.getMessage());
        }
    }
    
}
