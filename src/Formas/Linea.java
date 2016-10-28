/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

/*import Formas.Forma;
import java.awt.Shape;*/
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Usuario
 */
public class Linea extends Forma{
    
    public Linea(){
        s=new Line2D.Double();   
    }

    public Linea(Point2D p1, Point2D p2){
        pini=p1;
        pfin=p2;
        s=new Line2D.Double(pini,pfin);
    }
    
    public void setPuntoInicio(Point2D p){
        pini=p;
        ((Line2D.Double)s).setLine(pini,pini);
    }
    
    public void setPuntoFinal(Point2D p){
        pfin=p;
        ((Line2D.Double)s).setLine(pini,pfin);
    }
    
    public void setForma(Point2D p){
        pfin=p;
       ((Line2D.Double)s).setLine(pini,pfin);    
    }
    
    
    
}
