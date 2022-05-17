/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import ObjetoNegocio.*;
import java.util.List;

/**
 *
 * @author acedo
 */
public interface ILogica {
    
   
    
    public void registrarCliente(Cliente cliente);
   
    public List<Agente> consultarTodosAgentes();
     public List<Cliente> consultarTodosClientes();
     public List<Casting> consultarTodosCasting();
     public Fase consultarFaseFecha();
     public void agregarFase();
     public void eliminarFase();
     public void guardarCasting(Casting Casting);
     public void guardarPerfil(Perfil perfil);
      public Cliente consultarPorNombre(String nombre);
}
