/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lutysoft.scabs.modelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lutye
 */
public class ConexaoMysql implements Conexao {

    private final String usuario = "root";
    private final String senha = "";
    private final String url = "jdbc:mysql://localhost:3306/estamparia_bs?serverTimezone=UTC";

    private Connection conectar;

    //Método que foi herdado da classe interface.
    @Override
    public Connection obterConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem sucedida");
            return conectar;
        } catch (ClassNotFoundException cnf) {
            System.out.println("Houve um erro no DRIVER: classnotfoundexcepition-" + cnf);
            return null;
        } catch (SQLException sql) {
            System.out.println("Houve um erro no SQL:sqlexception sql-" + sql);
            return null;
        }

    }
