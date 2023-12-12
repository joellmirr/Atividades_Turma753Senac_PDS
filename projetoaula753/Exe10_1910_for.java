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
public class Exe10_1910_for {
    public static void main(String arg[]){
        String pessoa = "";
        float peso = 0f;
        int idade = 0;
        String estudo = "";
        int rg = 0;
        int cpf = 0;
        int qtd = 0;
        float somaPeso = 0f;
        float mediaPeso = 0f;
        int somaIdade = 0;
        float mediaIdade = 0f;
        
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe Quantidade de Pessoas"));
         for(int i=0;i<qtd;i++){
            
            pessoa = JOptionPane.showInputDialog("CADASTRO PESSOA\nDigite Nome da Pessoa: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe Idade: "));
            peso = Float.parseFloat(JOptionPane.showInputDialog("Informe Peso: "));
            estudo = JOptionPane.showInputDialog("Informe Escolaridade:");
            rg = Integer.parseInt(JOptionPane.showInputDialog("Informe o Indentidade:"));
            cpf = Integer.parseInt(JOptionPane.showInputDialog("Informe CPF:"));
            somaPeso += peso;
            somaIdade += idade;
            
        }
        mediaPeso = somaPeso / qtd;
        mediaIdade = somaIdade / qtd;
        JOptionPane.showMessageDialog(null,"Media dos Pesos: "+mediaPeso+"\nMedia das Idades: "+mediaIdade);
    }
}
