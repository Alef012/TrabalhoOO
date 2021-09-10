/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author USER
 */
public interface Registro<T> {
    public boolean adicionar(T entidade);
    public boolean remover(T entidade);
    
}
