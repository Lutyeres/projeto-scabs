/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lutysoft.scabs.modelo.dao;

import com.lutysoft.scabs.modelo.conexao.Conexao;
import com.lutysoft.scabs.modelo.conexao.ConexaoMysql;
import com.lutysoft.scabs.modelo.dominio.ControleFaccao;
import com.lutysoft.scabs.modelo.dominio.Faccao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 55629
 */
public class ControleFaccaoDao {
    private final Conexao conexao;
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ControleFaccaoDao() {
        this.conexao = new ConexaoMysql();
    }
    
    public String salvar(ControleFaccao controleFaccao, Faccao faccao){
        if faccao
    }

    private String adicionar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
