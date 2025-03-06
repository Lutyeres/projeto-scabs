/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lutysoft.scabs.main;

import com.lutysoft.scabs.modelo.conexao.Conexao;
import com.lutysoft.scabs.modelo.conexao.ConexaoMysql;
import com.lutysoft.scabs.modelo.dominio.Faccao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lutye
 */
public class Main {
    
    public static void main(String[] args) throws SQLException{
        //Códigos em sql para o BD
        String sql = "Select * from faccao";
        String slqIN = "Insert into faccao(faccao_name) values(?)";
        //Instanciado o obj conexão e Instanciando o Obj Facção
        Conexao conexao = new ConexaoMysql();
        Faccao faccao = new Faccao(null,"Pastor");
        // Obtem a conexão com o BD
        Connection con = conexao.obterConexao();
        //Prepara a consulta
        PreparedStatement stmt = con.prepareStatement(sql);
        //Prepara a Adição dos Dados
        PreparedStatement stmtIn = con.prepareStatement(slqIN);
        //Adiciona os valores 
        stmtIn.setString(1, faccao.getNome());
        //Executa a linha para o banco de dados
        stmtIn.executeUpdate();
        //Executa a consulta
        ResultSet result = stmt.executeQuery();
        

        // Percorre os resultados da consulta e imprime o nome da facção
        while(result.next()){
            System.out.println(result.getString("faccao_name"));
        }
        
    }
    
}
