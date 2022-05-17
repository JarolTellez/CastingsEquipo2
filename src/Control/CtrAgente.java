/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaces.IDatos;
import Interfaces.Implementacion.FachadaDatos;
import ObjetoNegocio.Agente;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Christian Daniel Acedo Chaidez // ID: 00000228373
 */
public class CtrAgente{

      IDatos fabricaDatos ;
    
    public CtrAgente()
    {
        fabricaDatos = new FachadaDatos();
    }
    
    public void Registrar(Agente agente) {
         fabricaDatos.guardarAgente(agente);
    }
    
    public List<Agente> consultarTodos()
    {
        return fabricaDatos.consultarTodosAgentes();
    }
    
     public Agente buscarAgenteNombre(String nombre)
    {
        return fabricaDatos.buscarAgenteNombre(nombre);
    }
}
