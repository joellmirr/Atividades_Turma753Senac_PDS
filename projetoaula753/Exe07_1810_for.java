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
public class Exe07_1810_for {
    public static void main(String arg[]){
        long num = 0l;
        long maior = -999999999;
        long menor = 999999999;
        boolean x = true;
        
        for(;x;){
            num = Long.parseLong(JOptionPane.showInputDialog("Digite Valor: \nPara Sair Digite - 0"));
            if(num > maior){
                maior = num;
            }
            if(num < menor && num != 0){
                menor = num;
            }
            if(num == 0){
                x = false;
            }
        }
        JOptionPane.showMessageDialog(null,"Menor: "+menor+"\nMaior: "+maior);
    }
}
