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
public class Ex10_1110 {
    public static void main(String arg[]){
        float hora = 0f;
        float salario = 0f;
        hora = Float.parseFloat(JOptionPane.showInputDialog("Informe valor da hora: "));
        salario = Float.parseFloat(JOptionPane.showInputDialog("Informe Quantidade horas trabalhadas no mes: "));
        salario *= hora;
        JOptionPane.showMessageDialog(null,"Salario: R$"+salario);
    } 
}
