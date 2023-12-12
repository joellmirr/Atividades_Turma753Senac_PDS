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
public class Ex19_1110 {
    public static void main(String arg[]){
        String letra = "";
        letra = JOptionPane.showInputDialog("Informe um Letra: ");
        //JOptionPane.showMessageDialog(null,"letra  "+letra.toUpperCase());
        if(letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"){
            JOptionPane.showMessageDialog(null,"Letra Vogal");
        
        }else{
            JOptionPane.showMessageDialog(null,"Letra Consoante");
        }
    }
}
