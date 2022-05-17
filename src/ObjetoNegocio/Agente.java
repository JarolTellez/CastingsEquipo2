/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoNegocio;

/**
 *
 * @author Jarol
 */
public class Agente {
    int numeroEmpleado;
    String RFC,CURP,nombre,direccion;

     public Agente(int numeroEmpleado, String RFC, String CURP, String nombre, String direccion) {
        this.numeroEmpleado = numeroEmpleado;
        this.RFC = RFC;
        this.CURP = CURP;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Agente(String RFC, String CURP, String nombre, String direccion) {
        this.RFC = RFC;
        this.CURP = CURP;
        this.nombre = nombre;
        this.direccion = direccion;
    }
     
     public Agente()
     {}
    
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    
    @Override
    public String toString() {
        return "Agente{" + "numeroEmpleado=" + numeroEmpleado + ", RFC=" + RFC + ", CURP=" + CURP + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }

   
    
    
}
