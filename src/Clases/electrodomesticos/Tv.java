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
public class Tv extends Electrodomestico{
    
   private double pulgadas;
   private String tecnologia;

    public Tv() {
    }
   
       public Tv(double pulgadas, String tecnologia, String marca, String modelo, String descripcion, int cantidad, double precio, String codigo) {
        super(marca, modelo, descripcion, cantidad, precio, codigo);
        this.pulgadas = pulgadas;
        this.tecnologia = tecnologia;
    }

     
    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
 @Override
    public  double calculapreciofinal()
    {
        double x;
        x=this.precio*1.12;
    
        return x*this.getCantidad();
    }
    
    @Override
    public Tv ingresar_datos()
    {
        double pulg;
        String tecn;

        String mar;
        String mod;
        String descrip;
        int cant;
        double prec;
        String cod;
        Scanner TECLADO = new Scanner(System.in);
        
        System.out.println("INGRESE DATOS DE TV");
        System.out.println("PULGADAS");
        pulg = TECLADO.nextInt();
        TECLADO.nextLine();
        System.out.println("TECNOLOGIA");
        tecn = TECLADO.nextLine();
        System.out.println("MARCA");
        mar = TECLADO.nextLine();
        System.out.println("MODELO");
        mod = TECLADO.nextLine();        
        System.out.println("CANTIDAD");
        cant = TECLADO.nextInt();
        System.out.println("PRECIO");
        prec = TECLADO.nextDouble();
        TECLADO.nextLine();
     
        
        Tv objT = new Tv(pulg,tecn,mar,mod,"Tv",cant,prec,"003");
        return objT;
    }
}
