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
    private long Cnpj;
    private long NomeFantasia;
    private long InscricaoEstadual;
    private long InscricaoMunicipal;
    private String Segmento;
    private String DataAbertura;

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

    public long getCnpj() {
        return Cnpj;
    }

    public void setCnpj(long Cnpj) {
        this.Cnpj = Cnpj;
    }

    public long getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(long NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public long getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(long InscricaoEstadual) {
        this.InscricaoEstadual = InscricaoEstadual;
    }

    public long getInscricaoMunicipal() {
        return InscricaoMunicipal;
    }

    public void setInscricaoMunicipal(long InscricaoMunicipal) {
        this.InscricaoMunicipal = InscricaoMunicipal;
    }
    
    public static void main(String[] args) {

        final int TAM = 2;
        PessoaJuridica pessoa[] = new PessoaJuridica[TAM];
        PessoaJuridica Empresa[] = new PessoaJuridica[TAM];

        for (int i = 0; i < pessoa.length; i++) {
            pessoa[i] = new PessoaJuridica();
            pessoa[i].setNome(JOptionPane.showInputDialog("Informe o Nome: "));
            pessoa[i].setCnpj(Long.parseLong(JOptionPane.showInputDialog("Informe o CNPJ:")));
        }

        for (int i = 0; i < TAM; i++) {
            JOptionPane.showMessageDialog(null, " Nome: "+pessoa[i].getNome()+
                    "\nCnpj: " +pessoa[i].getCnpj());
        }
        
        for(int i=0;i<Empresa.length;i++){
            Empresa[i] = new PessoaJuridica();
            Empresa[i].setNome(JOptionPane.showInputDialog("Informe Nome Empresa:"));
            Empresa[i].setCnpj(Long.parseLong(JOptionPane.showInputDialog("Informe CNPJ:")));
        }

    }
}
