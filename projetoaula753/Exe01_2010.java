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
public class Exe01_2010 {
    public static void main(String arg[]){
         String aluno = "";
        float nota1 = 0f, nota2 = 0f;
        float media = 0f, mediaApro = 0f, mediaRepro = 0f, mediaRecu = 0f;
        float aprovado = 0f, reprovado = 0f, recuperacao = 0f;
        float maiorApro = -999999f, menorApro = 999999f;
        float maiorRepro = -99999f, menorRepro = 99999f;
        float maiorRecu = -99999f, menorRecu = 999999f;
        float maiorMediaApro = 0f;
        int contApro = 0, contRepro = 0, contRecu = 0;
        int opcao = -1;
        boolean sair = true;
        
       for(int i=0; i<1000;i++){
            aluno = JOptionPane.showInputDialog("CADASTRO NOTAS ALUNOS\nInforme nome do aluno:");
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe primeira nota:"));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe segunda nota:"));
            
            media = (nota1 + nota2) / 2;
            
            if(nota1>=7){
                if(nota1<menorApro){
                  menorApro=nota1;
                }
                if(nota1>maiorApro){
                  maiorApro=nota1;
                }
              }
            if(nota2>=7){
                if(nota2<menorApro){
                  menorApro=nota2;
                }
                if(nota2>maiorApro){
                  maiorApro=nota2;
                }
              }
            
            if(nota1>=6 && nota1<7){
                if(nota1<menorRecu){
                  menorRecu=nota1;
                }
                if(nota1>maiorRecu){
                  maiorRecu=nota1;
                }
              }
            if(nota2>=6 && nota2<7){
                if(nota2<maiorRecu){
                  menorApro=nota2;
                }
                if(nota2>maiorRecu){
                  maiorRecu=nota2;
                }
              }
            
            if(nota1<6){
                if(nota1<menorRepro){
                  menorRepro=nota1;
                }
                if(nota1>maiorRepro){
                  maiorRepro=nota1;
                }
              }
            if(nota2<6){
                if(nota2<menorRepro){
                  menorRepro=nota2;
                }
                if(nota2>maiorRepro){
                  maiorRepro=nota2;
                }
              }

            
            if(media >= 7){
                if(maiorMediaApro <= media){
                    maiorMediaApro = media;
                }
                JOptionPane.showMessageDialog(null,"Aluno: "+aluno+"\nMedia: "+media+"\n  APROVADO");
                aprovado += media;
                contApro++;
                mediaApro = aprovado / contApro;
                
            }else if( media >= 6 ){
                JOptionPane.showMessageDialog(null,"Aluno: "+aluno+"\nMedia: "+media+"\n  RECUPERAÇÃO");
                recuperacao += media;
                contRecu++;
                mediaRecu = recuperacao / contRecu;
            }else{
                JOptionPane.showMessageDialog(null,"Aluno: "+aluno+"\nMedia: "+media+"\n  REPROVADO");
                reprovado += media;
                contRepro++;
                mediaRepro = reprovado / contRepro;
            }
        }
       
       do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("RELATORIO NOTAS:\nDigite:\n1-Aprovados"
                   + "\n2-Recuperação\n3-Reprovados\n0-Sair"));
           switch(opcao){
               case 1:{
                JOptionPane.showMessageDialog(null,"Total Alunos Aprovados: "+contApro+"\nMedia Aprovados: "
                 +mediaApro+"\nMaior Nota: "+maiorApro+"\nMenor Nota: "+menorApro+"\nMaior Media Aprovados: "+maiorMediaApro);
                break;
               }
               case 2:{
                JOptionPane.showMessageDialog(null,"Total Alunos Recuperação: "+contRecu+"\nMedia Recuperação: "
                   +mediaRecu+"\nMaior Nota: "+maiorRecu+"\nMenor Nota: "+menorRecu);
                break;
               }
               case 3:{
                JOptionPane.showMessageDialog(null,"Total alunos reprovados: "+contRepro+"\nMedia Reprovados: "
                   +mediaRepro+"\nMaior Nota: "+maiorRepro+"\nMenor Nota: "+menorRepro);
                break;
               }
               case 0:{
                   sair = false;
                   JOptionPane.showMessageDialog(null,"Fechando Programa");
                   break;
               }
               default:{
                   JOptionPane.showMessageDialog(null,"Opção Invalida...!");
               }
           }
        }while(opcao != 0);
       
    }
}
    
