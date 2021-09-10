/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class Vendedor extends Pessoa{
    
    private int numeroDeVendas;
    private String codigoVendedor;

    public Vendedor() {
    }

    public Vendedor(int numeroDeVendas, String codigoVendedor, String nome, String cpf, String rg, LocalDate dataNasc) {
        super(nome, cpf, rg, dataNasc);
        this.numeroDeVendas = numeroDeVendas;
        this.codigoVendedor = codigoVendedor;
    }

    public Vendedor(int numeroDeVendas, String codigoVendedor) {
        this.numeroDeVendas = numeroDeVendas;
        this.codigoVendedor = codigoVendedor;
    }

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.numeroDeVendas;
        hash = 71 * hash + Objects.hashCode(this.codigoVendedor);
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
        final Vendedor other = (Vendedor) obj;
        if (this.numeroDeVendas != other.numeroDeVendas) {
            return false;
        }
        if (!Objects.equals(this.codigoVendedor, other.codigoVendedor)) {
            return false;
        }
        return true;
    }
   
    
}
