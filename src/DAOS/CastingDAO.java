/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import ObjetoNegocio.Casting;
import ObjetoNegocio.Cliente;
import ObjetoNegocio.Presencial;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.text.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Jarol
 */
public class CastingDAO  extends BaseDAO implements CRUD<Presencial> {
private MongoCollection<Presencial> coleccionCastings;

public CastingDAO()
{
        coleccionCastings= super.basedatos.getCollection("casting",Presencial.class);
    
}

@Override
    public void guardar(Presencial casting) {
          coleccionCastings.insertOne(casting);
    }

    @Override
    public void EliminarPorId(ObjectId id) {
      
    }

    @Override
    public void actualizar(Presencial entidad, ObjectId id) {
       
    }

    @Override
    public Presencial buscarPorId(ObjectId id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Presencial> consultarTodos() {
          ArrayList<Presencial> c= new ArrayList<>();
        coleccionCastings.find().into(c);
     
        return c;
    }
    
    public Casting buscarCastingNombre(String nombre)
    {
        return coleccionCastings.find(eq("nombre", nombre)).first();
                
    }
    

    public ArrayList<Presencial> consultarTodos(String nombre,ObjectId  codigo,Date fecha) throws ParseException {
          ArrayList<Presencial> c= new ArrayList<>();
          
          Bson filter ;
//List< Reservado> list = reservadoRepository.filters(filter, new Document("idreservado", 1));

/*
 db.casting.find({  
 "$expr": {   
 "$and": [    
 { $eq: [{ $year: "$fecha_contratacion" }, { $year: new Date("2022-05-17") }]},
 { $eq: [{ $month: "$fecha_contratacion" }, { $month: new Date("2022-05-17") }]}, 
 { $eq: [{ $dayOfMonth: "$fecha_contratacion" }, { $dayOfMonth: new Date("2022-05-17") }]} 
 ]   } })
*/

           /*
             Object o = com.mongodb.util.JSON.parse("{$expr:{  $and: [  { $eq :  [{ $year: $fecha_contratacion }, { $year: new Date(" + "2022-05-17" + ") }]},{ $eq: [{ $month: $fecha_contratacion},"
                     + " { $month: new Date("+"2022-05-17"+") }]}, { $eq: [{ $dayOfMonth: $fecha_contratacion}, { $dayOfMonth: new Date("+"2022-05-17"+") }]}   ]   } }");
           */
         


       if( codigo==null && fecha==null)
       {
     
        
           filter = Filters.and(Filters.eq("nombre", nombre));
           
              
           coleccionCastings.find(filter).into(c);
        
       }else if( codigo==null &&nombre==null )
       {
       
  /*
            filter=   Filters.expr(Filters.and(   Filters.eq(("year"+ "fecha_contratacion") ,"year"+new Date(2022-05-17)), Filters.eq(("month"+ "fecha_contratacion" ),"month"+new Date(2022-05-17)),
                    Filters.eq(("dayOfMonth"+ "fecha_contratacion"),"dayOfMonth"+new Date(2022-05-17)))  );
  
  
              */
        //    Object o = com.mongodb.util.JSON.parse("{$where: this.fecha_contratacion.toJSON().slice(0, 10) == "+"2022-05-17"+" }");
            filter=Filters.where("this.fecha_contratacion.toJSON().slice(0, 10) == 2022-05-17");
        
        // version 1
    //    db.casting.find({'$where': 'this.fecha_contratacion.toJSON().slice(0, 10) == "2022-05-17"' });
        /*
          filter=   Filters.expr(Filters.and(   Filters.eq("year"+ "fecha_contratacion" ), Filters.eq("year",new Date(2022-05-17)), Filters.eq("month"+ "fecha_contratacion" ), Filters.eq("month",new Date(2022-05-17)),
                    Filters.eq("dayOfMonth"+ "fecha_contratacion" ), Filters.eq("dayOfMonth",new Date(2022-05-17)))  );

*/
          
           coleccionCastings.find(filter).into(c);
       }else if(nombre==null&& fecha==null)
       {
            filter = Filters.and(Filters.eq("_id", codigo));
              
           coleccionCastings.find(filter).into(c);
       }
        else  if(nombre!=null && codigo!=null && fecha!=null)
          {
              filter = Filters.and(Filters.eq("nombre", nombre), Filters.eq("_id", codigo),Filters.eq("fecha_contratacion", fecha));
              
           coleccionCastings.find(filter).into(c);
        
          }else if(nombre!=null&& fecha!=null)
          {
              filter = Filters.and(Filters.eq("nombre", nombre),Filters.eq("fecha_contratacion", fecha));
              
           coleccionCastings.find(filter).into(c);
        
          }else if(nombre!=null && codigo!=null )
          {
              filter = Filters.and(Filters.eq("nombre", nombre),Filters.eq("_id", codigo));
              
           coleccionCastings.find(filter).into(c);
          }else if(codigo!=null && fecha!=null)
          {
               filter = Filters.and(Filters.eq("_id", codigo),Filters.eq("fecha_contratacion", fecha));
              
           coleccionCastings.find(filter).into(c);
          }
              
     
        return c;
    }
    
    
}
