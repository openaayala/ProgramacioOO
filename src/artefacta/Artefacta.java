/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefacta;

import Clases.electrodomesticos.*;
import Clases.electrodomesticos.Electrodomestico;
import java.util.ArrayList;
import Datos.Bodega;
import java.util.Scanner;

/**
 *
 * @author PENA
 */
public class Artefacta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int op=0, cont =0;
       int resp=0;
       int [] cantidad= new int [100];
       int [] opciones = new int[100];
       boolean validar = true;
        Scanner in = new Scanner(System.in);
        
        Cocina objc = new Cocina();
        Nevera objn = new Nevera();
        Tv objt = new Tv();
        ArrayList stock = new ArrayList();
        Bodega objb = new Bodega();
        stock = objb.crear_stock();
        
        ArrayList venta = new ArrayList();
       do{ 
        while(validar==true)
            {
          ptr(" ");
          ptr("Menu"); 
          ptr("Sistema de ventas de electrodomestico");
          ptr("[1] Cocina");
          ptr("[2] Nevera");
          ptr("[3] Tv");
          ptr("Elija una opcion de compra: ");         
          op= in.nextInt();
          in.nextLine();
          if (op > 0 && op < 4) validar = false;
          else ptr("Error: Ingrese un valor valido del 1 al 3");
            }
         opciones[cont]=op;
         cont++;
        validar = true;
        if(op==1)
        {
            venta.add(objc.ingresar_datos());
        }
        else if(op==2)
        {
            venta.add(objn.ingresar_datos());
        }
        else 
        {
            venta.add(objt.ingresar_datos());
        }
        
        ptr("Si desea continuar digite 1: ");
        resp = in.nextInt();
        }while(resp == 1);
        ptr(" ");
        ptr("Ventas");
         for(int i=0; i<venta.size();i++)
        {
            Electrodomestico e ;
            e = (Electrodomestico)venta.get(i);
            ptr(" ");
            System.out.print(e.getCantidad()+" ");
            System.out.print(e.getDescripcion()+" ");
            cantidad[i] = e.getCantidad();
            System.out.print(e.calculapreciofinal()+"$ ");
        }
         //AQUI SE REBAJA DE STOCK LA CANTIDAD DE LA VENTA
         for(int i=0; i<stock.size();i++)
        {
            Electrodomestico el ;
            if(opciones[i]==1)
            {
                el = (Electrodomestico)stock.get(0);     
                if(cantidad[i]>el.getCantidad())
                {
                    System.out.println("Venta no realizada stock insuficiente cocina");
                }
                else
                el.setCantidad( el.getCantidad()- cantidad[i]);
            }
            else if(opciones[i]==2)
            {
                el = (Electrodomestico)stock.get(1);     
                if(cantidad[i]>el.getCantidad())
                {
                    System.out.print("Venta no realizada stock insuficiente nevera");
                }
                else
                {
                el.setCantidad(el.getCantidad()- cantidad[i]); 
                }
            }
            else 
            {
                el = (Electrodomestico)stock.get(2); 
                if(cantidad[i]>el.getCantidad())
                {
                    System.out.print("Venta no realizada stock insuficiente tv");
                }
                else
                {
                el.setCantidad(el.getCantidad()- cantidad[i]);
                }
            }  
            
        }
        ptr(" ");
        ptr("Stock de electrodomesticos");
        for(int i=0; i<stock.size();i++)
        {
            Electrodomestico el ;
            el = (Electrodomestico)stock.get(i);
            System.out.print(el.getCantidad()+" ");
            System.out.print(el.getDescripcion()+" ");
            System.out.println(el.getCodigo());
        }
        
        
    }
    
     public static void ptr(String s)
    {
        System.out.println(s);
    }
    
}
