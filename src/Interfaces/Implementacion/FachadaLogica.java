/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Implementacion;

import Control.*;
import Interfaces.ILogica;
import ObjetoNegocio.*;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Jarol
 */
public class FachadaLogica implements ILogica {

    CtrPerfil ctrPerfil = new CtrPerfil();
    CtrClientes controlClientes = new CtrClientes();
    CtrlCastings controlCastings = new CtrlCastings();
    CtrAgente controlAgente = new CtrAgente();

    @Override
    public void registrarCliente(Cliente cliente) {
        try {
            if (controlClientes.buscarClienteNombre(cliente.getNombre()) == null) {
                controlClientes.Registrar(cliente);

            } else {
                throw new RuntimeException("Cliente Existente");
                // return new Exception("Cliente Existente");
            }

        } catch (RuntimeException ex) {
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
        return controlAgente.consultarTodos();
    }

//    @Override
//    public List<Presencial> consultarTodosCasting() {
//        return controlCastings.consultarTodosCasting();
//    }
    @Override
    public Fase consultarFaseFecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarFase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarPerfil(Perfil pefil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Casting consultarCastingNombre(String nombre) {
        try {
            return controlCastings.buscarCastingNombre(nombre);

        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public void registrarAgente(Agente agente) {
        try {
            if (controlAgente.buscarAgenteNombre(agente.getNombre()) == null) {
                controlAgente.Registrar(agente);
            } else {
                throw new RuntimeException("Agente Existente");
                // return new Exception("Agente Existente");
            }

        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public void guardarCasting(Object Casting, Cliente cliente) {
            Casting castin = (Casting) Casting;
        if(controlClientes.consultarPorCastingNombre(castin.getNombre())==null)
        {
        controlClientes.ActualizarCliente(Casting, cliente);
        }else
        {
            throw new RuntimeException("Casting existente");
        }

    }

    @Override
    public Cliente consultarPorID(ObjectId id) {
        return controlClientes.buscarClienteporId(id);

    }

    @Override
    public List<Casting> consularTodosCasting() {
        return controlClientes.consultarTodosCastings();

    }

    @Override
    public List<Perfil> consultarTodosPerfiles() {
        return ctrPerfil.consultarTodos();

    }

    @Override
    public Casting consultarCastingId(ObjectId id) {

        return ctrPerfil.consultarCastingId(id);
    }

    @Override
    public void agregarFase(Fase fase) {

    }

    @Override
    public void agregarPerfil(Perfil perfil) {
        ctrPerfil.registrarPerfil(perfil);
    }

    @Override
    public Cliente consultarClienteId(ObjectId id) {
        return controlClientes.buscarClienteporId(id);

    }

    @Override
    public List<Perfil> consultarCastingPerfilesIdCasting(ObjectId id) {
        return ctrPerfil.consultarCastingPorIdCasting(id);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        controlClientes.actualizarCliente(cliente);
    }

    @Override
    public List<Casting> consultarCastingCliente(ObjectId id) {
        return controlClientes.consultarCastingCliente(id);
    }

    @Override
    public List<Casting> consultarTodosCasting(String nombre, ObjectId codigo, Date fecha) {
        if (controlCastings.consultarTodosCasting(nombre, codigo, fecha).size() < 1) {
            throw new RuntimeException("Casting no existente");
        } else {
            return (List<Casting>) controlCastings.consultarTodosCasting(nombre, codigo, fecha);
        }

    }

    @Override
    public void guardarPerfilconIdDeCasting(Perfil perfil, ObjectId id) {
    ctrPerfil.guardarPerfilconIdDeCasting(perfil,id);
    }

    @Override
    public boolean existenClientes() {
        
        return controlClientes.existenClientes();
     }

   

    

}
