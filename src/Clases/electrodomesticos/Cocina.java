/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.electrodomesticos;

import java.util.Scanner;

/**
 *
 * @author PENA
 */
public class Cocina extends Electrodomestico{
    
      public Cocina() {
    }

    

 
    private int hornillas;
    private boolean horno;
    private String sistema;
      
    public Cocina(int hornillas, boolean horno, String sistema, String marca, String modelo, String descripcion, int cantidad, double precio, String codigo) {
        super(marca, modelo, descripcion, cantidad, precio, codigo);
        this.hornillas = hornillas;
        this.horno = horno;
        this.sistema = sistema;
    }

    public int getHornillas() {
        return hornillas;
    }

    public void setHornillas(int hornillas) {
        this.hornillas = hornillas;
    }

    public boolean getHorno() {
        return horno;
    }

    public void setHorno(boolean horno) {
        this.horno = horno;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    @Override
    public  double calculapreciofinal()
    {
        double x;
        x=this.precio+(this.precio*0);
        return x*this.getCantidad();
    }
   @Override 
    public Cocina ingresar_datos()
   {
       
       
    int hornlls;
    boolean horn=true,validar =true;
    String sist;
    String horno;
    String mar;
    String mod;
    String descrip;
    int cant;
    double prec;
    String cod;
    Scanner TECLADO = new Scanner(System.in);
    
        System.out.println("INGRESE DATOS DE COCINA");
        System.out.println(" ");
        System.out.println("CANTIDAD DE HORNILLAS");
        hornlls = TECLADO.nextInt();
        TECLADO.nextLine();
        while(validar==true)
        {
        System.out.println("TIENE HORNO SI O NO");
        horno = TECLADO.nextLine();
        
        if("si".equals(horno) || "SI".equals(horno))
        {
            validar =false; 
            horn =true;
            
        }
        else if("no".equals(horno)||"NO".equals(horno)) { validar= false; horn=false;}
        else {System.out.println("ESCRIBA SI O NO");}
        }
        validar =true;
        
        
        System.out.println("SISTEMA DE COCINA");
        sist = TECLADO.next();
        System.out.println("MARCA");
        mar = TECLADO.next();
        TECLADO.nextLine();
        System.out.println("MODELO");
        mod = TECLADO.nextLine();
       
        System.out.println("CANTIDAD");
        cant = TECLADO.nextInt();
        System.out.println("PRECIO");
        prec = TECLADO.nextDouble();
        TECLADO.nextLine();
        
        Cocina objc = new Cocina(hornlls,horn,sist,mar,mod,"Cocina",cant,prec,"001");
         return objc;
        }   
 
}
