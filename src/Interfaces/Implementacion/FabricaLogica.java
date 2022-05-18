/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Implementacion;

import Interfaces.ILogica;
import ObjetoNegocio.Cliente;

/**
 *
 * @author Jarol
 */
public class FabricaLogica  {

    private static ILogica logica;

 
    
 
    public static ILogica dameInstancia()

    {
         if(logica == null){
            logica= new FachadaLogica();
        }
      return logica;
    }
    
   
    
   
    
 
    
    
}
