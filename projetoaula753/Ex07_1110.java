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
public class Ex07_1110 {
    public static void main(String arg[]){
        float salario = 0f;
        String nome = "";
        float salarioBaixo = 0f;
        float salarioAlto = 0f;
        nome = JOptionPane.showInputDialog("Nome do funcionario:");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Salario do funcionario"));
        if(salario < 1700){
            salarioBaixo = (float) (salario + salario*0.35);
            JOptionPane.showMessageDialog(null,"Funcionario: "+nome+
                "\nSalario: R$"+salario+"\nReajuste Salarial: R$"+salarioBaixo);
        }else{
            salarioAlto = (float) (salario + (salario*0.2));
            JOptionPane.showMessageDialog(null,"Funcionario: "+nome+
                "\nSalario: R$"+salario+"\nReajuste Salarial: R$"+salarioAlto);
        }
    }
}
