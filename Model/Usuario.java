/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Turma753Senac.Model;

/**
 *
 * @author joelmir
 */
public class Usuario extends Pessoa {
    private String Login;
    private String Senha;
    private String ConfirmSenha;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getConfirmSenha() {
        return ConfirmSenha;
    }

    public void setConfirmSenha(String ConfirmSenha) {
        this.ConfirmSenha = ConfirmSenha;
    }
    
}
