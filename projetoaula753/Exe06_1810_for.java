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
public class Exe06_1810_for {
    public static void main(String arg[]){
        int cont = 0;
        long num = 0l;
        long maior = -999999999;
        long menor = 999999999;
        float media = 0l;
        long soma = 0l;
        for(int i=0;i<200;i++){
            num = Long.parseLong(JOptionPane.showInputDialog("Digite Valor: "));
            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            cont++;
            soma = maior + menor;
        }
        media = soma / 2;
        JOptionPane.showMessageDialog(null,"Media: "+media);
    }
}
