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
public class Ex16_1110 {
    public static void main(String arg[]){
         String aluno = "";
         String turno = "";
         
        aluno = JOptionPane.showInputDialog("Informe nome aluno:");
        turno = JOptionPane.showInputDialog("Informe Turno:\nM-Matutino\nV-Vespertino\nN-Noturno");
        // JOptionPane.showMessageDialog(null,"aluono   "+aluno+"\n turno  "+turno.toUpperCase());
        if(turno == "m" || turno == "M"){
          JOptionPane.showMessageDialog(null,"Bom Dia "+aluno+"...!");
        }else if(turno == "v" || turno == "V"){
          JOptionPane.showMessageDialog(null,"Boa Tarde "+aluno+"...!");
        }else if(turno == "n" || turno == "N"){
          JOptionPane.showMessageDialog(null,"Boa Noite "+aluno+"...!");
        }else{
          JOptionPane.showMessageDialog( null,"Valor Inválido");
        }
    }
}
