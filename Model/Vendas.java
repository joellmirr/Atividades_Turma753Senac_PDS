/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Turma753Senac.Model;

/**
 *
 * @author joelmir
 */
public class Vendas {
    private String Cliente;
    private String Produto;
    private float ValorProduto;
    private String DescricaoProduto;

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
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
