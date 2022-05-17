/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import ObjetoNegocio.Casting;
import ObjetoNegocio.Cliente;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author Jarol
 */
public class CastingDAO  extends BaseDAO implements CRUD<Casting> {
private MongoCollection<Casting> coleccionCastings;

public CastingDAO()
{
        coleccionCastings= super.basedatos.getCollection("casting",Casting.class);
    
}

@Override
    public void guardar(Casting casting) {
          coleccionCastings.insertOne(casting);
    }

    @Override
    public void EliminarPorId(ObjectId id) {
      
    }

    @Override
    public void actualizar(Casting entidad, ObjectId id) {
       
    }

    @Override
    public Casting buscarPorId(ObjectId id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Casting> consultarTodos() {
          ArrayList<Casting> c= new ArrayList<>();
        coleccionCastings.find().into(c);
        return c;
    }
    
    public Casting buscarCastingNombre(String nombre)
    {
        return coleccionCastings.find(eq("nombre", nombre)).first();
                
    }
}
