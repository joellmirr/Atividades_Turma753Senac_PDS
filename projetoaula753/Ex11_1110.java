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
public class Ex11_1110 {
    public static void main(String arg[]){
        float celcios = 0f;
        float fah = 0f;
        fah = Float.parseFloat(JOptionPane.showInputDialog("Informe Temperatura em Graus Fahrenheit(°F): "));
        celcios = (5 * (fah-32)) / 9;
        JOptionPane.showMessageDialog(null,"Graus Fahrenheit(°F): "+fah+
                "\nConvesão:\nGraus Celcios(°C): "+celcios);
        
    }
}
