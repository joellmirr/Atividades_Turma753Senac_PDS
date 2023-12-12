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
public class Exe11_1910_doWhile {
     public static void main(String arg[]){
        String nome = "";
        float nota1 = 0f, nota2 = 0f, nota3 = 0f;
        float somaN1 = 0f, somaN2 = 0f, somaN3 = 0f;
        float mediaN1 = 0f, mediaN2 = 0f, mediaN3 = 0f, mediaMedias = 0f;
        int qtd = 0, cont = 0;
        
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe Quantidade de Aluos:"));
        do{
            nome = JOptionPane.showInputDialog("CADASTRO NOTAS ALUNOS\nInforme nome do aluno:");
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe primeira nota:"));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe segunda nota:"));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe terceira nota:"));
            cont++;
            somaN1 += nota1;
            somaN2 += nota2;
            somaN3 += nota3;
        }while(qtd != cont);
        mediaN1 = somaN1 / qtd;
        mediaN2 = somaN2 / qtd;
        mediaN3 = somaN3 / qtd;
        mediaMedias = mediaN1 + mediaN2 + mediaN3 / 3;
        JOptionPane.showMessageDialog(null,"MEDIAS\nMedia Primeiras Notas: "+mediaN1+"\nMedias Segundas Notas: "
        +""+mediaN2+"\nMedias Terceiras Notas: "+mediaN3+"\nMedia das Medias: "+mediaMedias);
    }
}
