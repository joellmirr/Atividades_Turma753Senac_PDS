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
public class Ex12_1110 {
    public static void main(String arg[]){
        int num1 = 0;
        int num2 = 0;
        float num3 = 0f;
        float a = 0f, b = 0f, c = 0f;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe Valor Primeiro NUmero "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe Valor Segundo NUmero "));
        num3 = Float.parseFloat(JOptionPane.showInputDialog("Informe Valor Terceiro Numero: "));
        
        a = (num1*2) * (num2/2);
        b = (num1 *3) + num3;
        c = (float) Math.pow(num3,3);
        
        JOptionPane.showMessageDialog(null,"Produto do dobro do primeiro com metade do segundo: "
                +a+"\nA soma do triplo do primeiro com o terceiro: "+b+"\nTerceiro elevado ao cubo: "+c);
    }
    
}
