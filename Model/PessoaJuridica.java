/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Turma753Senac.Model;

import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public class PessoaJuridica extends Pessoa {
    private String Cnpj;
    private String RazaoSocial;
    private String InscricaoEstadual;
    private String InscricaoMunicipal;
    private String Segmento;
    private String DataAbertura;

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(String InscricaoEstadual) {
        this.InscricaoEstadual = InscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return InscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String InscricaoMunicipal) {
        this.InscricaoMunicipal = InscricaoMunicipal;
    }

    public String getSegmento() {
        return Segmento;
    }

    public void setSegmento(String Segmento) {
        this.Segmento = Segmento;
    }

    public String getDataAbertura() {
        return DataAbertura;
    }

    public void setDataAbertura(String DataAbertura) {
        this.DataAbertura = DataAbertura;
    }
    
    public static void main(String[] args) {

        final int TAM = 2;
        PessoaJuridica pessoa[] = new PessoaJuridica[TAM];
        PessoaJuridica Empresa[] = new PessoaJuridica[TAM];

        for (int i = 0; i < pessoa.length; i++) {
            pessoa[i] = new PessoaJuridica();
            pessoa[i].setNome(JOptionPane.showInputDialog("Informe o Nome: "));
            pessoa[i].setCnpj(JOptionPane.showInputDialog("Informe o CNPJ:"));
        }

        for (int i = 0; i < TAM; i++) {
            JOptionPane.showMessageDialog(null, " Nome: "+pessoa[i].getNome()+
                    "\nCnpj: " +pessoa[i].getCnpj());
        }
        
        for(int i=0;i<Empresa.length;i++){
            Empresa[i] = new PessoaJuridica();
            Empresa[i].setNome(JOptionPane.showInputDialog("Informe Nome Empresa:"));
            Empresa[i].setCnpj(JOptionPane.showInputDialog("Informe CNPJ:"));
        }

    }
}
