/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import interfaces.CRUD;
import java.util.ArrayList;
import models.Cliente;

/**
 *
 * @author USER
 */
public class repositorioDeClientes implements CRUD<Cliente>{
    
    private static ArrayList<Cliente> listaDeClientes;

    public repositorioDeClientes() {
        this.listaDeClientes= new ArrayList<Cliente>();
    }

    @Override
    public boolean cadastrar(Cliente cliente) {
        listaDeClientes.add(cliente);
        return true;
    }

    @Override
    public boolean editar(Cliente cliente) {
        listaDeClientes.remove(cliente);
        return true;
    }

    @Override
    public boolean remover(Cliente cliente) {
        listaDeClientes.remove(cliente);
        return true;
    }

    @Override
    public ArrayList listar() {
        return this.listaDeClientes;
    }
    
}
