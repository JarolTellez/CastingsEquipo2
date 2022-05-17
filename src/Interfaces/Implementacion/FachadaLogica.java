/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Implementacion;

import Control.*;
import Interfaces.ILogica;
import ObjetoNegocio.*;
import java.util.List;


/**
 *
 * @author Jarol
 */
public class FachadaLogica implements ILogica {
    
    CtrClientes controlClientes= new CtrClientes();
    CtrlCastings controlCastings= new CtrlCastings();



   
    @Override
    public void registrarCliente(Cliente cliente) {
        try
        {
        if(controlClientes.buscarClienteNombre(cliente.getNombre())==null)
        {
       controlClientes.Registrar(cliente);
       
       
        }else
        {
            throw new RuntimeException("Cliente Existente");
           // return new Exception("Cliente Existente");
        }
       
        
        }catch(RuntimeException ex)
        {
               throw new RuntimeException(ex.getMessage());
        }
        
      
        
    }

    @Override
    public Cliente consultarPorNombre(String nombre) {
        return controlClientes.buscarClienteNombre(nombre);
    }

    @Override
    public List<Cliente> consultarTodosClientes() {
      
        return controlClientes.consultarTodos();
    }

    @Override
    public List<Agente> consultarTodosAgentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Casting> consultarTodosCasting() {
        return controlCastings.consultarTodosCasting();
    }

    @Override
    public Fase consultarFaseFecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarFase() {
      
    }

    @Override
    public void eliminarFase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarCasting(Casting casting) {
        try
        {
            if(controlCastings.buscarCastingNombre(casting.getNombre())==null)
            {
                       controlCastings.guardar(casting);
            }else
            {
                throw new RuntimeException("Casting existente");
            }
        }catch(RuntimeException ex)
        {
             throw new RuntimeException(ex.getMessage());
        }
       
    }
    

    @Override
    public void guardarPerfil(Perfil pefil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
   
  
    
}
