/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetoNegocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author acedo
 */
public class Casting {

    private ObjectId id;
    private String nombre;
    private String descripcion;
    private Date fecha_contratacion;
    private Float coste;
    private Cliente cliente;
    private String tipo;
    private List<Perfil> perfiles;
    private List<Candidato> candidatos;

    public Casting() {
    }

    public Casting(ObjectId id,String nombre, String descripcion, Date fecha_contratacion, Float coste, List<Perfil> perfiles, List<Candidato> candidatos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_contratacion = fecha_contratacion;
        this.coste = coste;
        this.perfiles = perfiles;
        this.candidatos = candidatos;
    }

    public Casting(String nombre, String descripcion, Date fecha_contratacion, Float coste, Cliente cliente, String tipo, List<Perfil> perfiles, List<Candidato> candidatos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_contratacion = fecha_contratacion;
        this.coste = coste;
        this.cliente = cliente;
        this.tipo = tipo;
        this.perfiles = perfiles;
        this.candidatos = candidatos;
    }

    public Casting(ObjectId id, String nombre, String descripcion, Date fecha_contratacion, Float coste, Cliente cliente, String tipo, List<Perfil> perfiles, List<Candidato> candidatos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_contratacion = fecha_contratacion;
        this.coste = coste;
        this.cliente = cliente;
        this.tipo = tipo;
        this.perfiles = perfiles;
        this.candidatos = candidatos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(Date fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public Float getCoste() {
        return coste;
    }

    public void setCoste(Float coste) {
        this.coste = coste;
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
    
   

    /**
     * Verifica si una fecha es mayor a la actual
     * @param fecha fecha a comprobar
     * @return false si no es mayor a la actual, true de lo contrario
     * @throws ParseException 
     */
    
      public void verificaDatos(Date fecha) throws ParseException
    {
          
     Date fechaactual = new Date();
SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
fecha=date.parse(fecha.toString());

 //comprueba si una fecha es menor a la actual  
if(fecha.before(fechaactual)){
       throw new RuntimeException("Fecha pasada");
}
    
    }
      
      public void verificaDatos(String cliente,String agente,String tipo)
      {
          if(cliente==null||agente==null||tipo==null)
          {
                 throw new RuntimeException("No se ha seleccionado casting");
          }
      }
    @Override
    public String toString() {
        return "Casting{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_contratacion=" + fecha_contratacion + ", coste=" + coste + ", perfiles=" + perfiles + ", candidatos=" + candidatos + '}';
    }

}
