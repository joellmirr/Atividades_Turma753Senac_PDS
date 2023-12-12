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
public class Ex05_1110 {
    public static void main(String arg[]){
        float valor = 0f;
        float aVista = 0f;
        float aPrazo = 0f;
        int j = 0;
        valor = Float.parseFloat(JOptionPane.showInputDialog("Informe valor de produto:"));
        j = Integer.parseInt(JOptionPane.showInputDialog("Digite opçao pagamento:\n1.Valor a Vista\n2.Valor a Prazo"));
        if( j == 1){
             aVista = (float) ( valor - (valor * 0.1));
             JOptionPane.showMessageDialog(null,"Valor: R$"+valor+"\nValor a vista com desconto: R$"
                     +aVista);
        }else if( j == 2 ){
              aPrazo = (float)( valor + (valor * 0.15));
              JOptionPane.showMessageDialog(null,"Valor: R$"+valor+"\nValor a prazo: R$"
                     +aPrazo);
        }else{
            JOptionPane.showMessageDialog(null,"Opção Invalida...!");
        }
    }
}
