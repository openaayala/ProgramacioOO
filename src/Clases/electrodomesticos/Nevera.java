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
public class Nevera extends Electrodomestico {
     
    private int pies;
    private int niveles;

    public Nevera() {
    }

    
     public Nevera(int pies, int niveles, String marca, String modelo, String descripcion, int cantidad, double precio, String codigo) {
        super(marca, modelo, descripcion, cantidad, precio, codigo);
        this.pies = pies;
        this.niveles = niveles;
    }
 
    
   
    public int getPies() {
        return pies;
    }

    public void setPies(int pies) {
        this.pies = pies;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }
@Override
public  double calculapreciofinal()
    {
        double x;
        x=this.precio*1.12;
    
        return x*this.getCantidad();
    }
@Override
   public Nevera ingresar_datos()
   {
       int ps;
        int niv;
    
        String mar;
        String mod;
        String descrip;
        int cant;
        double prec;
        String cod;
        Scanner TECLADO = new Scanner(System.in);
    
        
        System.out.println("INGRESE DATOS DE NEVERA");
        System.out.println(" ");
        System.out.println("ALTURA EN PIES");
        ps = TECLADO.nextInt();
        System.out.println("NIVELES");
        niv = TECLADO.nextInt();
        TECLADO.nextLine();
        System.out.println("MARCA");
        mar = TECLADO.nextLine();
        System.out.println("MODELO");
        mod = TECLADO.nextLine();    
        System.out.println("CANTIDAD");
        cant = TECLADO.nextInt();
        System.out.println("PRECIO");
        prec = TECLADO.nextDouble();
        TECLADO.nextLine();
        
        
        Nevera objN = new Nevera(ps,niv,mar,mod,"Nevera",cant,prec,"002");
        return objN;
   }
}
