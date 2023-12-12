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
public class Ex06_1110 {
    public static void main(String arg[]){
        float x = 0f;
        float y = 0f;
        x = Float.parseFloat(JOptionPane.showInputDialog("Informe valor X:"));
        y = Float.parseFloat(JOptionPane.showInputDialog("Informe valor Y:"));
        if(x > y){
            JOptionPane.showMessageDialog(null,"Valor "+x+"(X) Maior");
        }else if(x<y){
             JOptionPane.showMessageDialog(null," Valor "+y+"(Y) Maior");
        }else{
            JOptionPane.showMessageDialog(null,x+"(X) = "+y+"(Y)");
        }
    }
}
