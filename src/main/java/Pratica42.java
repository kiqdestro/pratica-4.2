import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Pratica42 {
    public static void main (String [] args){
        double areaX;
        double areaY;
        double perimetroX;
        double perimetroY;
        
        Circulo c = new Circulo (8);
        Elipse e = new Elipse (6, 9);
        
        areaX = c.getArea();
        perimetroX = c.getPerimetro();
        areaY = e.getArea();
        perimetroY = e.getPerimetro();       
        
        System.out.println("Área do circulo: " + areaX+"\n"+"Área da elipse: " + areaY
        +"\n"+ "Perimetro do circulo: " + perimetroX +"\n"+ "Perimetro da elipse: " + perimetroY);
    }
}
