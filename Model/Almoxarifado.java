/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Turma753Senac.Model;

/**
 *
 * @author joelmir
 */
public class Almoxarifado {
    private String NomeProduto;
    private String CodigoProduto;
    private String DescricaoProduto;
    private int QuatidadeEstoque;

    public int getQuatidadeEstoque() {
        return QuatidadeEstoque;
    }

    public void setQuatidadeEstoque(int QuatidadeEstoque) {
        this.QuatidadeEstoque = QuatidadeEstoque;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(String CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }

    public String getDescricaoProduto() {
        return DescricaoProduto;
    }

    public void setDescricaoProduto(String DescricaoProduto) {
        this.DescricaoProduto = DescricaoProduto;
    }
}
