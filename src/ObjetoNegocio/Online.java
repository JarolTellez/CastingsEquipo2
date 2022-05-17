/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetoNegocio;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author acedo
 */
public class Online extends Casting{

    public Online(String nombre, String descripcion, Date fecha_contratacion, Float coste, Cliente cliente, String tipo, List<Perfil> perfiles, List<Candidato> candidatos) {
        super(nombre, descripcion, fecha_contratacion, coste, cliente, tipo, perfiles, candidatos);
    }
    
    public Online()
    {}

     public void validarDatos(Online casting)
    {
      
          if(casting.getCliente() ==null)
        {
            throw new RuntimeException("Seleccione un cliente");
        }else if(casting.getCoste().toString().trim().length()==0||casting.getNombre().trim().length()==0||casting.getDescripcion().trim().length()==0)
        {
            throw new RuntimeException("Datos incompletos");
        }else if(casting.getCoste().toString().matches("[+-]?\\d*(\\.\\d+)?")==false)
        {
              throw new RuntimeException("Coste no numerico");
        } 
    }
  
   
}
