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
public class Exe04_1810_doWhile {
    public static void main(String arg[]){
        int num = 0;
    float soma = 0f;
    do{
            if(num % 2 == 0){
                //JOptionPane.showMessageDialog(null,num);
                soma += num;
            }
            num++;
        }while(num < 100);
    JOptionPane.showMessageDialog(null,"Soma: "+soma);
    }
}
