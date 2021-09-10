/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Objects;

/**
 *
 * @author USER
 */
public class Calcado {
    private String categoria;
    private int tamanho;
    private String modelo;
    private double preco;
    private String cor;
    private String codigoDoProduto;

    public Calcado() {
    }

    public Calcado(String categoria, int tamanho, String modelo, double preco, String cor, String codigoDoProduto) {
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.preco = preco;
        this.cor = cor;
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calcado other = (Calcado) obj;
        if (this.tamanho != other.tamanho) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.codigoDoProduto, other.codigoDoProduto)) {
            return false;
        }
        return true;
    }
    
    
}
