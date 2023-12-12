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
public class Ex17_1110 {
    public static void main(String arg[]){
        String nome = "";
        float salario = 0f;
        float novoSalario = 0f;
        float reajuste = 0f;
        
        nome = JOptionPane.showInputDialog("Informe Nome do Funcionario: ");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Informe salario do funcionario: "));
        if(salario >= 1280 && salario <= 1700){
            reajuste = (float) (salario * 0.15);
            novoSalario = salario + reajuste;
            JOptionPane.showMessageDialog(null,"Oragnizações TABAJARA\nFuncionario: "
            +nome+"\nSalario: R&"+salario+"\nReajuste 15%: R&"+reajuste+"\nNovo Salario: R$"+novoSalario);
        }else if(salario >1700 && salario <= 3500){
            reajuste = (float) (salario * 0.1);
            novoSalario = salario + reajuste;
            JOptionPane.showMessageDialog(null,"Oragnizações TABAJARA\nFuncionario: "
            +nome+"\nSalario: R&"+salario+"\nReajuste 10%: R&"+reajuste+"\nNovo Salario: R$"+novoSalario);
        }else if(salario > 3500){
            reajuste = (float) (salario * 0.05);
            novoSalario = salario + reajuste;
            JOptionPane.showMessageDialog(null,"Oragnizações TABAJARA\nFuncionario: "
            +nome+"\nSalario: R&"+salario+"\nReajuste 5%: R&"+reajuste+"\nNovo Salario: R$"+novoSalario);
        }else{
            reajuste = (float) (salario * 0.2);
            novoSalario = salario + reajuste;
            JOptionPane.showMessageDialog(null,"Oragnizações TABAJARA\nFuncionario: "
            +nome+"\nSalario: R&"+salario+"\nReajuste 20%: R&"+reajuste+"\nNovo Salario: R$"+novoSalario);  
        }
    }
    
}
