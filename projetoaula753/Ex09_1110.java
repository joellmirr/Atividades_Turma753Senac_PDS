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
public class Ex09_1110 {
    public static void main(String arg[]){
        float h = 0f;// Lado Hipotenusa
        float o = 0f;// Lado Cateto Oposto
        float a = 0f;// lado Cateto Adjacente
        
        h = Float.parseFloat(JOptionPane.showInputDialog("Digite valor lado Hipotenusa: "));
        o = Float.parseFloat(JOptionPane.showInputDialog("Digite valor lado Cateto Oposto: "));
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite valor lado Cateto Adjacente: "));
        
        if(h==o && o==a && h==a){
            JOptionPane.showMessageDialog(null,"Triangulo Equilatero");
        }else if(h==o || o==a || h==a){
             JOptionPane.showMessageDialog(null,"Triangulo Isoceles");
        }else{
             JOptionPane.showMessageDialog(null,"Triangulo Escaleno");
        }
    }
    
}
