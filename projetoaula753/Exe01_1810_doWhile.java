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
public class Exe01_1810_doWhile {
    public static void main(String arg[]){
        int num = 0;
        do{
            if(num % 2 == 1){
                JOptionPane.showMessageDialog(null,num);
            }
            num++;
        }while(num < 350);
    }
}
