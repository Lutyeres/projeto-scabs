/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lutysoft.scabs.modelo.dominio;

import java.time.LocalDate;

/**
 *
 * @author 55629
 */
public class ControleFaccao {
    private Long idControleFaccao;
    private Long idFaccao;
    private String tipoCorte;
    private int quantEntrada;
    private int quantSaida;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private int quantRiscoXGG;
    private int quantRiscoGG;
    private int quantRiscoG;
    private int quantRiscoM;
    private int quantRiscoP;

    public ControleFaccao() {
    }

    public ControleFaccao(Long idControleFaccao, Long idFaccao, String tipoCorte, int quantEntrada, int quantSaida, LocalDate dataEntrada, LocalDate dataSaida, int quantRiscoXGG, int quantRiscoGG, int quantRiscoG, int quantRiscoM, int quantRiscoP) {
        this.idControleFaccao = idControleFaccao;
        this.idFaccao = idFaccao;
        this.tipoCorte = tipoCorte;
        this.quantEntrada = quantEntrada;
        this.quantSaida = quantSaida;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quantRiscoXGG = quantRiscoXGG;
        this.quantRiscoGG = quantRiscoGG;
        this.quantRiscoG = quantRiscoG;
        this.quantRiscoM = quantRiscoM;
        this.quantRiscoP = quantRiscoP;
    }

    public Long getIdControleFaccao() {
        return idControleFaccao;
    }

    public void setIdControleFaccao(Long idControleFaccao) {
        this.idControleFaccao = idControleFaccao;
    }

    public Long getIdFaccao() {
        return idFaccao;
    }

    public void setIdFaccao(Long idFaccao) {
        this.idFaccao = idFaccao;
    }

    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public int getQuantEntrada() {
        return quantEntrada;
    }

    public void setQuantEntrada(int quantEntrada) {
        this.quantEntrada = quantEntrada;
    }

    public int getQuantSaida() {
        return quantSaida;
    }

    public void setQuantSaida(int quantSaida) {
        this.quantSaida = quantSaida;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getQuantRiscoXGG() {
        return quantRiscoXGG;
    }

    public void setQuantRiscoXGG(int quantRiscoXGG) {
        this.quantRiscoXGG = quantRiscoXGG;
    }

    public int getQuantRiscoGG() {
        return quantRiscoGG;
    }

    public void setQuantRiscoGG(int quantRiscoGG) {
        this.quantRiscoGG = quantRiscoGG;
    }

    public int getQuantRiscoG() {
        return quantRiscoG;
    }

    public void setQuantRiscoG(int quantRiscoG) {
        this.quantRiscoG = quantRiscoG;
    }

    public int getQuantRiscoM() {
        return quantRiscoM;
    }

    public void setQuantRiscoM(int quantRiscoM) {
        this.quantRiscoM = quantRiscoM;
    }

    public int getQuantRiscoP() {
        return quantRiscoP;
    }

    public void setQuantRiscoP(int quantRiscoP) {
        this.quantRiscoP = quantRiscoP;
    }
    
    
}



