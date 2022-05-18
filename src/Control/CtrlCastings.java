/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaces.IDatos;
import Interfaces.Implementacion.FachadaDatos;
import ObjetoNegocio.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jarol
 */
public class CtrlCastings {
      IDatos fabricaDatos ;
      
      public CtrlCastings()
      {
          fabricaDatos = new FachadaDatos();
      }
      
    
    public void guardar(Presencial casting)
    {
        fabricaDatos.guardarCasting(casting);
    }
    
    public Casting buscarCastingNombre(String nombre)
    {
        return fabricaDatos.buscarCastingNombre(nombre);
    }
    
    

    public List <Presencial> consultarTodosCasting()
    {
        return fabricaDatos.consultarTodosCastings();
    }
    
    
     public List <Presencial> consultarTodosCasting(String nombre,String codigo,Date fecha)
    {
        return fabricaDatos.consultarTodosCasting(nombre, codigo, fecha);
    }
}
