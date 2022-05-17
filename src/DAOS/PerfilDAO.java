/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import ObjetoNegocio.Casting;
import ObjetoNegocio.Cliente;
import ObjetoNegocio.Perfil;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

/**
 *
 * @author Jarol
 */

public class PerfilDAO extends BaseDAO implements CRUD<Perfil>{

    @Override
    public void guardar(Perfil entidad) {
       try {
             super.coleccionPerfil.insertOne(entidad);
        } catch (Error e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void EliminarPorId(ObjectId id) {
      super.coleccionPerfil.deleteOne(eq("_id", id));
    }

    @Override
    public void actualizar(Perfil entidad, ObjectId id) {
       String estado = entidad.getEstado();
        String sexo = entidad.getSexo();
        String colorPelo= entidad.getColorPelo();
        String colorOjos= entidad.getColorPelo();
        String especialidad = entidad.getEspecialidad();
        String rangoEdad = entidad.getRangoEdad();
        String rangoAltura= entidad.getRangoAltura();

        super.coleccionClientes.updateOne(
                eq("_id", id),
                combine(set("estado", estado),
                        set("sexo", sexo),
                        set("colorPelo", colorPelo),
                        set("colorOjos", colorOjos),
                        set("especialidad", especialidad),
                        set("rangoEdad", rangoEdad),
                        set("rangoAltura",rangoAltura)) // DATOS A ACTUALIZAR  
        );
    }

    @Override
    public Perfil buscarPorId(ObjectId id) {
             Perfil perfil = super.coleccionPerfil.find(eq("_id", id)).first();
        return perfil;
    }

    @Override
    public ArrayList<Perfil> consultarTodos() {
          ArrayList<Perfil> UsuariosEncontradosArrayList = new ArrayList<>();
        super.coleccionPerfil.find().into(UsuariosEncontradosArrayList);
        return UsuariosEncontradosArrayList;
    }

   
    
}
