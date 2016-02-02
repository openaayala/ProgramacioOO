/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.ArrayList;
import Clases.electrodomesticos.*;

/**
 *
 * @author PENA
 */
public class Bodega implements Stock{
   
    @Override
    public ArrayList crear_stock()
    {
    Cocina objc = new Cocina();
    Nevera objn = new Nevera();
    Tv objt = new Tv();
    ArrayList stock = new ArrayList();
    //Datos de cocina
    objc.setCantidad(230);
    objc.setDescripcion("Cocina");
    objc.setCodigo("001");
    //Datos de nevera
    objn.setCantidad(340);
    objn.setDescripcion("Nevera");
    objn.setCodigo("002");
    //Datos de tv
    objt.setCantidad(435);
    objt.setDescripcion("Tv");
    objt.setCodigo("003");
    stock.add(objc);
    stock.add(objn);
    stock.add(objt);  
 
    return stock;
    }
  
    
    
    
}
