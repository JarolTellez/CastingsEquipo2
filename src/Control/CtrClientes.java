/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Interfaces.IDatos;
import Interfaces.ILogica;
import Interfaces.Implementacion.FabricaDatos;
import Interfaces.Implementacion.FachadaDatos;
import ObjetoNegocio.Cliente;
import java.util.List;

/**
 *
 * @author acedo,tellez,busani
 */
public class CtrClientes{
    
    IDatos fabricaDatos ;
    
    public CtrClientes()
    {
        fabricaDatos = new FachadaDatos();
    }

           
  
    public void Registrar(Cliente cliente) {
         fabricaDatos.guardarCliente(cliente);
    }
    
    public List<Cliente> consultarTodos()
    {
        return fabricaDatos.consultarTodosClientes();
    }
    
     public Cliente buscarClienteNombre(String nombre)
    {
        return (Cliente) fabricaDatos.buscarClienteNombre(nombre);
    }
}
