/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import Formas.Forma;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends Forma{
    
    public Rectangulo(){
        s=new Rectangle2D.Double();
    }
    
    public void setPuntoInicio(Point2D p){
        pini=p;
        pfin=pini;
        ((Rectangle2D.Double)s).setRect(pini.getX(),pini.getY(),0,0);
    }
    
    public void setPuntoFinal(Point2D p){
        double x1,y1,x2,y2;
        
        pfin=p;
        x1=pini.getX();
        y1=pini.getY();
        x2=pfin.getX();
        y2=pfin.getY();
        ((Rectangle2D.Double)s).setRect(Math.min(x1,x2),Math.min(y1, y2),Math.abs(x2-x1),Math.abs(y2-y1));
    }
    
    public void setForma(Point2D p){
        double x1,y1,x2,y2;
        
        pfin=p;
        x1=pini.getX();
        y1=pini.getY();
        x2=pfin.getX();
        y2=pfin.getY();
        ((Rectangle2D.Double)s).setRect(Math.min(x1,x2),Math.min(y1, y2),Math.abs(x2-x1),Math.abs(y2-y1));
    }
   
}
