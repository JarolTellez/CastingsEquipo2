/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaces.IDatos;
import Interfaces.Implementacion.FachadaDatos;
import ObjetoNegocio.Perfil;
import java.util.List;

/**
 *
 * @author Dianey Elisa Velasquez Busani
 */
public class CtrPerfil {
    IDatos fabricaDatos ;

    public CtrPerfil() {
        this.fabricaDatos = new FachadaDatos();
    }
    
    public void registrarPerfil(Perfil perfil){
        fabricaDatos.guardarPerfil(perfil);
    }
    
    public List<Perfil> consultarTodos(){
        return fabricaDatos.consultarTodosPerfiles();
    }
    
}
