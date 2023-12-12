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
public class Ex14_1110 {
    public static void main(String arg[]){
        int idade = 0;
        String nome = "";
        nome = JOptionPane.showInputDialog("Informe nome eleitor:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade do eleitor:"));
        if(idade >= 16 && idade < 18){
            JOptionPane.showMessageDialog(null,"Eleitor "+nome+" - Voto Facultativo");
        }else if(idade >= 18 && idade <= 65){
            JOptionPane.showMessageDialog(null,"Eleitor "+nome+" - Voto Obrigatorio");
        }else{
            JOptionPane.showMessageDialog(null,"Eleitor "+nome+" - Nao Eleitor");
        }
    }
    
}
