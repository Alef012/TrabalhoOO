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
public class Filial {
    private String estado;
    private String cidade;
    private int numDeFuncionarios;
    private String codigoFilial;

    public Filial() {
    }

    public Filial(String estado, String cidade, int numDeFuncionarios, String codigoFilial) {
        this.estado = estado;
        this.cidade = cidade;
        this.numDeFuncionarios = numDeFuncionarios;
        this.codigoFilial = codigoFilial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumDeFuncionarios() {
        return numDeFuncionarios;
    }

    public void setNumDeFuncionarios(int numDeFuncionarios) {
        this.numDeFuncionarios = numDeFuncionarios;
    }

    public String getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(String codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Filial other = (Filial) obj;
        if (this.numDeFuncionarios != other.numDeFuncionarios) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.codigoFilial, other.codigoFilial)) {
            return false;
        }
        return true;
    }
    
    
}
