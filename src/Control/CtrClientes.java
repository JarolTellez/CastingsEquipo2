/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Interfaces.IDatos;
import Interfaces.ILogica;
import Interfaces.Implementacion.FabricaDatos;
import Interfaces.Implementacion.FachadaDatos;
import ObjetoNegocio.Casting;
import ObjetoNegocio.Cliente;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author acedo,tellez,busani
 */
public class CtrClientes {

    IDatos fabricaDatos;

    public CtrClientes() {
        fabricaDatos = new FachadaDatos();
    }

    public void Registrar(Cliente cliente) {
        fabricaDatos.guardarCliente(cliente);
    }

    public List<Cliente> consultarTodos() {
        return fabricaDatos.consultarTodosClientes();
    }

    public Cliente buscarClienteNombre(String nombre) {
        return (Cliente) fabricaDatos.buscarClienteNombre(nombre);
    }

    public void ActualizarCliente(Object Casting, Cliente cliente) {

        fabricaDatos.ActualizarCliene(Casting, cliente);
    }

    public Cliente buscarClienteporId(ObjectId id) {
        return fabricaDatos.buscarClienteporId(id);
    }

    public List<Casting> consultarTodosCastings() {
        return fabricaDatos.consultarTodosCastings();
    }

    public void actualizarCliente(Cliente cliente) {
        fabricaDatos.actualizarCliente(cliente);
    }

    public List<Casting> consultarCastingCliente(ObjectId id) {
        return fabricaDatos.consultarCastingCliente(id);
    }
    
   public Cliente consultarPorCastingNombre(String nombreCasting) {
        return fabricaDatos.consultarPorCastingNombre(nombreCasting);
    }
}
