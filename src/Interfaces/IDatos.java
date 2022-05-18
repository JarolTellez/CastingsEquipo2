/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import ObjetoNegocio.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acedo
 */
public interface IDatos {
    public Cliente buscarClienteNombre(String nombre);    
    
    public void guardarCliente(Cliente cliente);
    
     public List<Cliente> consultarTodosClientes();
     public List<Perfil> consultarTodosPerfiles();
     public List<Agente> consultarTodosAgentes();
     public List<Presencial> consultarTodosCastings();
     public List<Presencial> consultarTodosCasting(String nombre,String codigo,Date fecha);
     public Fase buscarFaseFecha(Date fecha);
     public Casting buscarCastingNombre(String nombre);
     public Perfil buscarPerfilCasting();
     public void guardarCasting(Presencial casting);
     public void guardarPerfil(Perfil perfil);
     
    
    public Cliente buscarCliente(Cliente cliente);
    
      public Agente buscarAgenteNombre(String nombre);

   

    public void guardarAgente(Agente agente);
    
    
}
