/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class Venda {
    private double precoDaVenda;
    private LocalDateTime dataHora;
    private String codigoIdentificacao;

    public Venda() {
    }

    public Venda(double precoDaVenda, LocalDateTime dataHora, String codigoIdentificacao) {
        this.precoDaVenda = precoDaVenda;
        this.dataHora = dataHora;
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public double getPrecoDaVenda() {
        return precoDaVenda;
    }

    public void setPrecoDaVenda(double precoDaVenda) {
        this.precoDaVenda = precoDaVenda;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public void setCodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.precoDaVenda) ^ (Double.doubleToLongBits(this.precoDaVenda) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.dataHora);
        hash = 43 * hash + Objects.hashCode(this.codigoIdentificacao);
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
        final Venda other = (Venda) obj;
        if (Double.doubleToLongBits(this.precoDaVenda) != Double.doubleToLongBits(other.precoDaVenda)) {
            return false;
        }
        if (!Objects.equals(this.codigoIdentificacao, other.codigoIdentificacao)) {
            return false;
        }
        if (!Objects.equals(this.dataHora, other.dataHora)) {
            return false;
        }
        return true;
    }
    
    
    
}
