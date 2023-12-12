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
public class Ex13_1110 {
     public static void main(String args[]){
   int num = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        if(num % 3 == 0 && num % 5 == 0){
            JOptionPane.showMessageDialog(null,"É divisível por 3 e o 5 ao mesmo tempo");
        }else{
            JOptionPane.showMessageDialog(null,"Não é divisível pelos dois ao mesmo tempo!");
        }
     }
}
