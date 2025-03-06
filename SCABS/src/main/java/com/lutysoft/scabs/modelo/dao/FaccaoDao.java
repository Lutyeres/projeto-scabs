/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lutysoft.scabs.modelo.dao;

import com.lutysoft.scabs.modelo.conexao.Conexao;
import com.lutysoft.scabs.modelo.conexao.ConexaoMysql;
import com.lutysoft.scabs.modelo.dominio.Faccao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55629
 */
public class FaccaoDao {

    private final Conexao conexao;
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public FaccaoDao() {
        this.conexao = new ConexaoMysql();
    }

    public String salvar(Faccao faccao) {
        return faccao.getId() == 0L ? adcionar(faccao) : editar(faccao);
    }

    private String adcionar(Faccao faccao) {
        String sql = "INSERTO INTO faccao(faccao_name) VALUES (?)";
        
        Faccao faccaoTemp = buscarFaccaoPeloNome(faccao.getNome());
        
        if(faccaoTemp != null){
            return String.format("Error: Facção %s já existe no banco de dados", faccao.getNome());
        }
        
        try {
            con = conexao.obterConexao();
            stmt = con.prepareStatement(sql);

            preecherValoresPreparedStatement(stmt, faccao);

            int resultado = stmt.executeUpdate();

            return resultado == 1 ? "Facção adicionada com sucesso!" : "Não foi possível adicionar a facção!";

        } catch (SQLException e) {

            return String.format("Error: %s", e.getMessage());
        }
    }

    private String editar(Faccao faccao) {
        String sql = "UPDATE faccao SET faccao_name = ? WHERE idFaccao = ?";
        try {
            con = conexao.obterConexao();
            stmt = con.prepareStatement(sql);

            preecherValoresPreparedStatement(stmt, faccao);

            int resultado = stmt.executeUpdate();

            return resultado == 1 ? "Facção alterada com sucesso!" : "Não foi possível alterar a facção!";

        } catch (SQLException e) {

            return String.format("Error: %s", e.getMessage());
        }
    }

    private void preecherValoresPreparedStatement(PreparedStatement stmt, Faccao faccao) throws SQLException {
        stmt.setString(1, faccao.getNome());

        if (faccao.getId() != 0L) {
            stmt.setLong(2, faccao.getId());
        }
    }

    public List<Faccao> buscarTodasFaccao() {
        String sql = "SELECT * FROM faccao";
        List<Faccao> faccoes = new ArrayList<>();

        try {
            con = conexao.obterConexao();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                faccoes.add(getFaccao(rs));
            }

        } catch (SQLException e) {
            System.out.println(String.format("Error: ", e.getMessage()));
        }

        return faccoes;
    }

    private Faccao getFaccao(ResultSet rs) throws SQLException {
        Faccao faccao = new Faccao();

        faccao.setId(rs.getLong("idFaccao"));
        faccao.setNome(rs.getString("faccao_name"));

        return faccao;
    }

    public Faccao buscarFaccaoPeloID(Long id) {
        String sql = String.format("SELECT * FROM faccao WHERE idFaccao = %d", id);

        try {
            con = conexao.obterConexao();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                return getFaccao(rs);
            }

        } catch (SQLException e) {
            System.out.println(String.format("Error: ", e.getMessage()));
        }

        return null;
    }

    public Faccao buscarFaccaoPeloNome(String nome) {
        String sql = String.format("SELECT * FROM faccao WHERE idFaccao = %s", nome);

        try {
            con = conexao.obterConexao();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                return getFaccao(rs);
            }

        } catch (SQLException e) {
            System.out.println(String.format("Error: ", e.getMessage()));
        }

        return null;
    }

}
