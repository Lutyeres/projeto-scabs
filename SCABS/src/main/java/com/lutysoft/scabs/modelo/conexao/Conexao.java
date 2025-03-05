/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lutysoft.scabs.modelo.conexao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lutye
 */
public interface Conexao {
       
    //Método que vai ser utilizado para fazer a Conexão com o BD, para ser usada para conectar em qualquer banco de dados.
    public Connection obterConexao() throws SQLException;
}
