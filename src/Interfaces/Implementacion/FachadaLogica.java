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

/**
 *
 * @author Jarol
 */
public class FachadaLogica implements ILogica {

    CtrClientes controlClientes = new CtrClientes();
    CtrlCastings controlCastings = new CtrlCastings();
    CtrAgente controlAgente = new CtrAgente();
    CtrPerfil controlPerfil = new CtrPerfil();

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
    public List<Perfil> consultarTodosPerfiles() {

        return controlPerfil.consultarTodos();
    }

    @Override
    public List<Agente> consultarTodosAgentes() {
        return controlAgente.consultarTodos();
    }

    @Override
    public List<Presencial> consultarTodosCasting() {
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
    public void guardarCasting(Presencial casting) {
        try {
            if (controlCastings.buscarCastingNombre(casting.getNombre()) == null) {
                controlCastings.guardar(casting);
            } else {
                throw new RuntimeException("Casting existente");
            }
        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }

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
    public List<Presencial> consultarTodosCasting(String nombre, String codigo, Date fecha) {
        if (controlCastings.consultarTodosCasting(nombre, codigo, fecha).size() < 1) {
            throw new RuntimeException("Casting no existente");
        } else {
            return controlCastings.consultarTodosCasting(nombre, codigo, fecha);
        }
    }

}
