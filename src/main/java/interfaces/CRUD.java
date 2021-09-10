/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface CRUD<T> {
    
    public boolean cadastrar(T entidade);
    public boolean editar(T entidade);
    public boolean remover(T entidade);
    public ArrayList<T> listar();
    
}
