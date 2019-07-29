/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.FacturaDetalle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edwin
 */
public class GestionProductos {
     private List<FacturaDetalle> registros;
     public GestionProductos(List<FacturaDetalle> registros){
         super();
		this.registros = registros; 
     }
   public GestionProductos(){
       registros =new ArrayList<FacturaDetalle>();
   }
 public void IngresarProductos(){
     
 }
 
    public List<FacturaDetalle> getProductos(){
		return registros;
		
	}
    
}
