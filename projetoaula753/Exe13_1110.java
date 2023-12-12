/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula753;

import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public class Exe13_1110 {
    public static void main(String arg[]){
        float Valor = 0f;
        float Porcentagem = 0f;
        float ValorPor = 0f;
        
        Valor = Float.parseFloat(JOptionPane.showInputDialog("Informe Valor: "));
        Porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Informe Porcentagem:"));
        Porcentagem/=100;
        ValorPor = Valor * Porcentagem;
        
        JOptionPane.showMessageDialog(null,"CALCULO PORCENTAGEM\nValor: "+Valor+"\nPorcentagem: "
                +Porcentagem+"\nPorcentagem Valor Total: "+ValorPor);
        
    }
    
}
