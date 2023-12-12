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
public class Ex08_1110 {
    public static void main(String arg[]){
        float area = 0f;
        float dobro = 0f;
        float lado = 0f;
        lado = Float.parseFloat(JOptionPane.showInputDialog("Informe valor lado quadrado:"));
        area = lado * 4;
        dobro = area * 2;
        JOptionPane.showMessageDialog(null,"Quadrado de lado: "+lado+""
                + "\nArea quadrado: "+area+"\nDobro da area: "+dobro);
    }
    
}
