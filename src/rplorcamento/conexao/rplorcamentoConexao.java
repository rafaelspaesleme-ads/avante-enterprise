/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoConexao {

    Connection connection = null;
    static rplorcamentoConexao instance = null;

    public static Connection GeraConexao() throws ClassNotFoundException {
        Connection conexao = null;

        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            //jdbc:mysql://localhost:3306/my_database?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8
            String url = "jdbc:mysql://db4free.net:3306/bd_rplorcamento";
            String usuario = "rplorcamento2016";
            String senha = "rplorcamento2016";
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao tentar conectar: " + e.getMessage());
            conexao = null;
        }
        return conexao;
    }

    public static rplorcamentoConexao getInstance() throws Exception {
        if (instance == null) {
            instance = new rplorcamentoConexao();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
