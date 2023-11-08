/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Turma753Senac.Model;

/**
 *
 * @author joelmir
 */
public class Compras {
     private String Fornecedores;
    private String Produto;
    private float ValorProduto;
    private String DescricaoProduto;

    public String getFornecedores() {
        return Fornecedores;
    }

    public void setFornecedores(String Fornecedores) {
        this.Fornecedores = Fornecedores;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public float getValorProduto() {
        return ValorProduto;
    }

    public void setValorProduto(float ValorProduto) {
        this.ValorProduto = ValorProduto;
    }

    public String getDescricaoProduto() {
        return DescricaoProduto;
    }

    public void setDescricaoProduto(String DescricaoProduto) {
        this.DescricaoProduto = DescricaoProduto;
    }
}
