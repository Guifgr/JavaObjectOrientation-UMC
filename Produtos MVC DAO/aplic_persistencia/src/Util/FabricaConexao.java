/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guifg
 */
public class FabricaConexao {
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException{
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_produto", "postgres", "postgres");            
        return con;    
    }
}
