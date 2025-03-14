/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lutysoft.scabs.controller;

import com.lutysoft.scabs.modelo.dao.FaccaoDao;
import com.lutysoft.scabs.modelo.dominio.Faccao;
import com.lutysoft.scabs.view.formulario.CadastroFaccao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lutye
 */
public class CadastroFaccaoController implements ActionListener {

    private final CadastroFaccao cadastroFaccao;
    private FaccaoDao faccaoDao;

    public CadastroFaccaoController(CadastroFaccao cadastroFaccao) {
        this.cadastroFaccao = cadastroFaccao;
        this.faccaoDao = new FaccaoDao();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();

        switch (acao) {
            case "salvar":
                salvar();
                break;
            case "editar":
                editar();
                break;
            case "cancelar":
                voltar();
                break;
        }
    }

    private void salvar() {
        String faccao = this.cadastroFaccao.getTxtCadastroFaccaoFaccao().getText();
        String faccaoId = this.cadastroFaccao.getTxtCadastroFaccaoId().getText();

        if (faccao.equals("")) {
            this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("O campo do nome da facção deve ser preenchido.");
            return;
        }


        //System.out.println(faccaoTemp.getId()+""+faccaoTemp.getNome());
        try {
            Faccao faccaoTemp = this.faccaoDao.buscarFaccaoPeloNome(faccao);
            Long idLong = Long.parseLong(faccaoId);
            if (idLong > 0L) {
                this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("ID não deve ser informado para opção salvar.");
            }else if (faccaoTemp == null) {
                Faccao faccaoDb = new Faccao(idLong, faccao);
                this.faccaoDao.salvar(faccaoDb);
                this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("Facção cadastrada com sucesso.");
            } else {
                this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("A facção que você tentou registrar já está cadastrada no sistema");
            }
        } catch (NumberFormatException e) {
            this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("ID inválido! Digite um número válido.");
        }
    }

    private void voltar() {

    }

    private void editar() {
        String faccao = this.cadastroFaccao.getTxtCadastroFaccaoFaccao().getText();
        String id = this.cadastroFaccao.getTxtCadastroFaccaoId().getText();

        Faccao faccaoTemp = this.faccaoDao.buscarFaccaoPeloNome(faccao);
        //System.out.println(faccaoTemp.getId());

        try {
            Long idLong = Long.parseLong(id);
            if (idLong != 0L) {
                if (faccaoTemp == null) {
                    faccaoTemp = this.faccaoDao.buscarFaccaoPeloID(idLong);
                    if (faccaoTemp == null) {
                        this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("A facção que você tentou alterar não existe no sistema");
                    } else {
                        Faccao faccaoBD = new Faccao(idLong, faccao);
                        this.faccaoDao.salvar(faccaoBD);
                        this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("Facção alterada com sucesso.");

                    }
                } else {
                    this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("A facção que você tentou alterar já está cadastrada no sistema");
                }
            } else {
                this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("Digite o ID da facção para alterá-la.");
            }
        } catch (NumberFormatException e) {
            //SwingUtilities.invokeLater(() -> {
            this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("ID inválido! Digite um número válido.");
            //});
        }

        if (faccao.equals("")) {
            this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("O campo do nome da facção deve ser preenchido.");
            return;
        }

//        if(idLong != 0L){
//            this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("Facção alterada com sucesso.");
//            Faccao faccaoBD = new Faccao(idLong,faccao);
//            this.faccaoDao.salvar(faccaoBD);
//        }
//        else{
//            this.cadastroFaccao.getLabelCadastroFaccaoMensagem().setText("Digite o ID da facção para alterá-la.");
//
//        }
    }

}
