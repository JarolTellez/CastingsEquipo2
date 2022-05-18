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
     public List<Perfil> consultarTodosPerfiles();
     public List<Presencial> consultarTodosCasting();
     public List<Presencial> consultarTodosCasting(String nombre,ObjectId  codigo,Date fecha);
     public Fase consultarFaseFecha();
     public void agregarFase();
     public void eliminarFase();
     public void guardarCasting(Presencial Casting);
     public void guardarPerfil(Perfil perfil);
     public Cliente consultarPorNombre(String nombre);
     public Casting consultarCastingNombre(String nombre);
     public void registrarAgente(Agente agente);
}
