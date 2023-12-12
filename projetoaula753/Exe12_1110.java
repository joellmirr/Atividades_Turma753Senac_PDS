
package com.mycompany.projetoaula753;

import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public class Exe12_1110 {
    public static void main(String arg[]){
        float Raio = 0f; 
        float Diametro = 0f;
        float Circuferencia = 0f;
        float Area = 0f;
        float Pi = 3.14f;
        
        Raio = Float.parseFloat(JOptionPane.showInputDialog("Informe Raio do Circulo:"));
        Diametro = 2 * Raio;
        Circuferencia = 2 * Pi * (Raio*Raio);
        Area = Pi * (Raio*Raio);
        
        JOptionPane.showMessageDialog(null,"CALCULO CIRCULO\nValor Raio: "+Raio+""
                + "\nValor Circunferencia: "+Circuferencia+"\nValor Area: "+Area);
        
    }
}
