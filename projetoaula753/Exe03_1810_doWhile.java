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
public class Exe03_1810_doWhile {
    public static void main(String arg[]){
       int idade = 0,cont=0;
       int soma = 0;
       int media = 0;
       do{
           idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade:"));
           soma += idade;
           cont++;
       }while(cont < 10);
       media = soma /10;
       JOptionPane.showMessageDialog(null,"Media Idade: "+media);
    }
}
