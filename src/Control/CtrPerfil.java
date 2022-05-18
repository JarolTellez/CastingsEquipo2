/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaces.IDatos;
import ObjetoNegocio.Perfil;

/**
 *
 * @author Dianey Elisa Velasquez Busani
 */
public class CtrPerfil {
    IDatos fabricaDatos ;

    public CtrPerfil(IDatos fabricaDatos) {
        this.fabricaDatos = fabricaDatos;
    }
    
    public void registrarPerfil(Perfil perfil){
        fabricaDatos.guardarPerfil(perfil);
    }
    
    
    
}
