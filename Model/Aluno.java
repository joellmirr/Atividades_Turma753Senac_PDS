/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Turma753Senac.Model;

/**
 *
 * @author joelmir
 */
public class Aluno {
    String Nome;
    float nota1;
    float nota2;
    float media;
    String status;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    

    public float getMedia() {
        media=(this.nota1+this.nota2)/2;
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getStatus() {
        if(this.media>7){
            status="Aprovado";
        }else{
            status="Reprovado";
        }
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
