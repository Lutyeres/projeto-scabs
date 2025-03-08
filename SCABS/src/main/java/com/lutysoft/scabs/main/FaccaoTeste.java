/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lutysoft.scabs.main;

import com.lutysoft.scabs.modelo.dao.FaccaoDao;
import com.lutysoft.scabs.modelo.dominio.Faccao;

/**
 *
 * @author 55629
 */
public class FaccaoTeste {
    
    public static void main(String[] args) {
        Faccao faccao = new Faccao(0L, "Girafa");
        
        FaccaoDao faccaoDao = new FaccaoDao();
        
        System.out.println(faccaoDao.salvar(faccao));
    }
    
}
