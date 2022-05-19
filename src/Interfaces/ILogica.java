/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import ObjetoNegocio.*;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author acedo
 */
public interface ILogica {

    public void registrarCliente(Cliente cliente);

    public List<Agente> consultarTodosAgentes();

    public List<Cliente> consultarTodosClientes();
//     public List<Presencial> consultarTodosCasting();

    public Fase consultarFaseFecha();

    public void agregarFase(Fase fase);

    public void eliminarFase();

    public void guardarCasting(Object Casting, Cliente cliente);
//     public void guardarCastingPresencial(Presencial Casting);
//     public void guardarCastingOnline(Online Casting);

    public void guardarPerfil(Perfil perfil);

    public Cliente consultarPorNombre(String nombre);

    public Casting consultarCastingNombre(String nombre);

    public void registrarAgente(Agente agente);

    public Cliente consultarPorID(ObjectId id);

    public List<Casting> consularTodosCasting();

    public List<Perfil> consultarTodosPerfiles();

    public Casting consultarCastingId(ObjectId id);

    public void agregarPerfil(Perfil perfil);

    public Cliente consultarClienteId(ObjectId id);

    public List<Perfil> consultarCastingPerfilesIdCasting(ObjectId id);

    public void actualizarCliente(Cliente cliente);

    public List<Casting> consultarCastingCliente(ObjectId id);

    public List<Casting> consultarTodosCasting(String nombre, ObjectId codigo, Date fecha);

    public void guardarPerfilconIdDeCasting(Perfil perfil, ObjectId id);

    public boolean existenClientes();

}
