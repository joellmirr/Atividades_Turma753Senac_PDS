/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Turma753Senac.Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public class ExercicioArrayList {
    public static void main(String[] args) {
        /*ArrayList<Integer> num = new ArrayList<>();
         for(int i=0;i<3;i++){
            int nume = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
            Num.add(nume);
        }
        for(int numero: num){
            JOptionPane.showMessageDialog(null,numero); 
        }
        for(int i=0;i<num.size();i++){
             JOptionPane.showMessageDialog(null, num.get(i));
        }*/
        
       ArrayList<Aluno> ListaA = new ArrayList<>();
       
       int tam = 3;
       for(int i=0;i<tam;i++){
           Aluno a = new Aluno();
           a.setNome(JOptionPane.showInputDialog("Nome Aluno"));
           a.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Informe primeira Nota")));
           a.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Informe Segunda Nota:")));
           
           ListaA.add(a);
       }
       for(Aluno x: ListaA){
           JOptionPane.showMessageDialog(null,"Nome: "+x.getNome()+"\nNota 1:"+x.getNota1()+"\nNota2: "+
                   x.getNota2()+"\nMedia: "+x.getMedia()+"\nStatus:\n"+x.getStatus());
       }
    }
}
