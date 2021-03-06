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
import org.bson.types.ObjectId;

/**
 *
 * @author Jarol
 */
public class CtrlCastings {

    IDatos fabricaDatos;

    public CtrlCastings() {
        fabricaDatos = new FachadaDatos();
    }

//    public void guardarPresencial(Presencial casting) {
//        fabricaDatos.guardarCasting(casting);
//    }
//
//    public void guardarOnline(Online casting) {
//        fabricaDatos.guardarCasting(casting);
//    }
    public Casting buscarCastingNombre(String nombre) {
        return fabricaDatos.buscarCastingNombre(nombre);
    }

//    public List<Presencial> consultarTodosCasting() {
//        return fabricaDatos.consultarTodosCastings();
//    }
//public List <Presencial> consultarTodosCasting(String nombre,ObjectId  codigo,Date fecha)
//    {
//        return fabricaDatos.consultarTodosCasting(nombre, codigo, fecha);
//    }
//    
    public List<Casting> consultarTodosCasting(String nombre, ObjectId codigo, Date fecha) {

        return fabricaDatos.consultarTodosCasting(nombre, codigo, fecha);
    }

}
