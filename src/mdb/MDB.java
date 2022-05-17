/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mdb;

import DAOS.ClienteDAO;
import ObjetoNegocio.Adulto;
import ObjetoNegocio.Candidato;
import ObjetoNegocio.Casting;
import ObjetoNegocio.Cliente;
import ObjetoNegocio.Fase;
import ObjetoNegocio.Online;
import ObjetoNegocio.Perfil;
import ObjetoNegocio.Presencial;
import ObjetoNegocio.PruebaIndividual;
import ObjetoNegocio.*;
import java.util.ArrayList;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author acedo
 */
public class MDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONEXION A BASE DE DATOS A TRAVEZ DE CLIENTE DAO
        ClienteDAO clienteDAO = new ClienteDAO();

        //PERFILES Y CANDIDATOS VACIOS
        ArrayList<Perfil> perfiles = new ArrayList<>();
        ArrayList<Candidato> candidatos = new ArrayList<>();

        //LISTA DE castings
        ArrayList<Casting> castings = new ArrayList<>();

        Cliente cliente = new Cliente(null,
                "Cinemex",
                "300 Y PARIS",
                "32",
                "Dany acedo",
                TipoActividad.CINE.toString(),
                castings);

        //AGREGAMOS A CLIENTE SIN NADA
       // clienteDAO.agregar(cliente);
        
        Representante representante = new Representante(new ObjectId(), "FRCQWEQEQ", "DASDASD", "Representante", 64415151, "Direccion");
        
        /*
        Candidato candidato =  new Adulto("RFC1231", new ObjectId(), "Daniel", 654654, new Date(),"CURP", representante);
        candidatos.add(candidato);
        PruebaIndividual pruebaIndividual =new PruebaIndividual(new ObjectId(),
                5,
                new Date(),
                "Sala de reuniones", 
                "Descripcion de la prueba individual",
                true, 
                candidato.getId());
                Fase fase = new Fase(new ObjectId(), 1, new Date(),pruebaIndividual);
        //PRUEBA OBJETO CASTING DE PRUEBA SIN ID
        Casting castingPresencial = new Presencial(
                3,
                fase, 
                new ObjectId(), 
                "Casting Presencial",
                "Esta es la descripcion de castingPresencial",
                new Date(),
                4.5f,
                perfiles,
                candidatos);
        Casting castingOnline = new Online(
                new ObjectId(),
                "Casting Online",
                "Descripcion online casting", 
                new Date(), 
                23.2f,
                perfiles,
                candidatos);
        */
        
////        Casting casting = new Casting(new ObjectId(),
////                "Nombre Prueba para casting",
////                "Descripcion Prueba para casting",
////                new Date(),
////                150.5f,
////                perfiles,
////                candidatos);
////        Casting casting2 = new Casting(new ObjectId(),
////                "2 2Nombre Prueba para casting",
////                "2 Descripcion Prueba para casting",
////                new Date(),
////                250.5f,
////                perfiles,
////                candidatos);
////    
/*
        Perfil perfil = new Perfil(new ObjectId(),
                "Sonora", 
                "Hombre", 
                "Rojo",
                "Verde", 
                true,
                "MODELO",
                new RangoEdad(new ObjectId(), 12, 33),
                new RangoAltura(new ObjectId(),1.4f,5.6f));
        perfiles.add(perfil);
        castingPresencial.setPerfiles(perfiles);
        castingOnline.setPerfiles(perfiles);
        //casting2.setPerfiles(perfiles);
        */
        
        /*
        castings.add(castingPresencial);
        castings.add(castingOnline);    
        //castings.add(casting2);
        
        
        //AGREGAMOS LISTA DE CASTINGS A CLIENTE
        cliente.setCastings(castings);
        //ACTIALIZAMOS A CLIENTE
        clienteDAO.actualizar(cliente, cliente.getId());
        
        
        
        
        */
        
        
        
        
        
        
        
        
//        
//        
//        //BUSCA DE PRUEBA
//        Cliente clienteBuscado = clienteDAO.buscarPorId(cliente.getId());
//
//        //-****************-*-*-***-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
//        for (Casting c : clienteBuscado.getCastings()) {
//            System.out.println(c.toString());
//        }
        
       

    }

}
