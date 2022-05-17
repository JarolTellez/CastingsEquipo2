/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Implementacion;

import DAOS.*;
import Interfaces.IDatos;
import ObjetoNegocio.Agente;
import ObjetoNegocio.Casting;
import ObjetoNegocio.Cliente;
import ObjetoNegocio.Fase;
import ObjetoNegocio.Perfil;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ElisaVelasquez
 */
public class FachadaDatos implements IDatos {

    ClienteDAO clienteDao = new ClienteDAO();
    CastingDAO castingDAO = new CastingDAO();
    PerfilDAO perfilDAO= new PerfilDAO();
    
    
    public void FachadaDatos()
    {}

 

    @Override
    public Cliente buscarClienteNombre(String nombre) {
      Cliente clientes = clienteDao.buscarPorNombre(nombre);
    
        return clientes;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        
            clienteDao.guardar(cliente);
          
    
            
        
    }

    @Override
    public List<Cliente> consultarTodosClientes() {
            try {
            return clienteDao.consultarTodos();
          
        } catch (RuntimeException e) {
            
            throw new RuntimeException("Error al consultar los clientes");
        }
    }

    @Override
    public List<Agente> consultarTodosAgentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Casting> consultarTodosCastings() {
     return  castingDAO.consultarTodos();
    }

    @Override
    public Fase buscarFaseFecha(Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Casting buscarCastingNombre(String nombre) {
        return castingDAO.buscarCastingNombre(nombre);
    }

    @Override
    public Perfil buscarPerfilCasting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarCasting(Casting casting) {
       
        castingDAO.guardar(casting);
       
       
    }

    @Override
    public void guardarPerfil(Perfil perfil) {
        perfilDAO.guardar(perfil);
    }

    @Override
    public Cliente buscarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 

}
