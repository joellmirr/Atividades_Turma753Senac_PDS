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
public class Exe05_1810_doWhile {
     public static void main(String arg[]){
        int cont = 0;
        long num = 0l;
        long maior = -999999999;
        do{
            num = Long.parseLong(JOptionPane.showInputDialog("Digite Valor: "));
            if(num > maior){
                maior = num;
            }
            cont++;
        }while(cont <= 100);
        JOptionPane.showMessageDialog(null,"Maior Valor: "+maior);
    }
}
