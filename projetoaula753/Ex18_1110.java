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
public class Ex18_1110 {
    public static void main(String arg[]){
        float n1 = 0.0f, n2 = 0.0f, n3 = 0.0f;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite primeita numero: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite segunda numero: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite terceira numero: "));
        if(n1 > n2 && n1 > n3){
            JOptionPane.showMessageDialog(null,"Primeiro Numero: "+n1+" - Maior");
        }else if(n2 > n1 && n2 > n3){
            JOptionPane.showMessageDialog(null,"Segundo Numero: "+n2+" - Maior");
        }else if(n3 > n1 && n3 > n2){
            JOptionPane.showMessageDialog(null,"Terceiro Numero: "+n3+" - Maior"); 
        }else{
            JOptionPane.showMessageDialog(null,"Numero iguais"); 
        }
    }

}
