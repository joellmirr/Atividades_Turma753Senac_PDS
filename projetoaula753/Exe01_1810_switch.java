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
public class Exe01_1810_switch {
    public static void main(String arg[]){
       int Opcao=0;
       String Nome1="",Nome2="";
       float num = 0f, num2 = 0f;
       boolean sair = true;
       
       
       do{
           Opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo:"+
             "\n1 - Exercício 01"+"\n2 - Exercício 02"+"\n3 - Exercício 03"+"\n4 - Exercício 04"+"\n0 - para sair"));
            switch(Opcao){
                case 0:
                    JOptionPane.showMessageDialog(null,"Saindo........");
                    sair = false;
                    break;
                case 1:
                   // Faça um programa para verificar se o número é par ou é ímpar. Sendo que o número
                   //zero não é par e não é impar.
                    num = Float.parseFloat(JOptionPane.showInputDialog("Informe Numero:"));
                    if(num % 2 == 0){
                        JOptionPane.showMessageDialog(null,"Numero Par");
                    }else{
                        JOptionPane.showMessageDialog(null,"Numero Impar");
                    }
                    break;
                case 2:
                    //Fazer um programa que leia dois valores e retorne qual é o maior
                    num = Float.parseFloat(JOptionPane.showInputDialog("Digite Primeiro Valor: "));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite Segundo Valor: "));
                    if(num > num2){
                            JOptionPane.showMessageDialog(null,"Primeiro Valor "+num+" - Maior Numero: ");
                     }else if(num < num2){
                         JOptionPane.showMessageDialog(null,"Segundo Valor "+num2+" - Maior Numero: ");
                     }else{
                         JOptionPane.showMessageDialog(null,"Numero Iguais: ");
                     }
                    break;
                case 3:
                    //Faça um programa para verificar se o número informado é positivo ou negativo.
                      num = Float.parseFloat(JOptionPane.showInputDialog("Digite Numero: "));
                      if(num>=0){
                          JOptionPane.showMessageDialog(null,"Numero Positivo");
                      }else{
                          JOptionPane.showMessageDialog(null,"Numero Negativo");
                      }
                    break;
                case 4:
                 //4.Faça um programa que informe dois nomes e verifique se são 
                //iguais ou diferentes.
                    Nome1= JOptionPane.showInputDialog("Informe o primeiro nome: ");
                    Nome2= JOptionPane.showInputDialog("Informe o segundo nome: ");
                    if(Nome1.equals(Nome2)){
                        JOptionPane.showMessageDialog(null,"Os dois são iguais");
                    }else{
                        JOptionPane.showMessageDialog(null,"Os dois são diferentes");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
            }
     }while(Opcao != 0);
    }
}