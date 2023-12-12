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
public class Ex15_1110 {
    public static void main(String arg[]){
        String Nome  = "";
        float N1 = 0.0f, N2 = 0.0f;
        float Media = 0.0f;
        Nome = JOptionPane.showInputDialog("Informe Nome do Aluno: ");
        N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite primeita nota: "));
        N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite segunda nota: "));
        Media = (N1+N2)/2;
        
        if (Media >=7 && Media < 10){
            JOptionPane.showMessageDialog(null, "Aluno: "+Nome+"\nPrimeira Nota: "+N1+
         "\nSegunda Nota: "+N2+"\nMedia do Aluno: "+Media+"\n\n  APROVADO");
        }else if(Media == 10){
           JOptionPane.showMessageDialog(null, "Aluno: "+Nome+"\nPrimeira Nota: "+N1+
         "\nSegunda Nota:"+N2+"\nMedia do Aluno:"+Media+"\n\n  APROVADO COM DISTINÇÃO");
        }else{
            JOptionPane.showMessageDialog(null, "Aluno: "+Nome+"\nPrimeira Nota: "+N1+
         "\nSegunda Nota: "+N2+"\nMedia do Aluno: "+Media+"\n\n REPROVADO");
               }
    }
    }

