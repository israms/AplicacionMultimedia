/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Usuario
 */
public class RectanguloRedondeado extends Forma{
    private double anchoArc;
    private double altoArc;
    
    public RectanguloRedondeado(){
        s=new RoundRectangle2D.Double();
        anchoArc=30;
        altoArc=30;
    }
    
    public void setPuntoInicio(Point2D p){
        pini=p;
        pfin=pini;
        ((RoundRectangle2D.Double)s).setRoundRect(pini.getX(),pini.getY(),0,0,anchoArc,altoArc);
    }
    
    public void setPuntoFinal(Point2D p){
        double x1,y1,x2,y2;
        
        pfin=p;
        x1=pini.getX();
        y1=pini.getY();
        x2=pfin.getX();
        y2=pfin.getY();
        ((RoundRectangle2D.Double)s).setRoundRect(Math.min(x1,x2),Math.min(y1, y2),Math.abs(x2-x1),Math.abs(y2-y1),anchoArc,altoArc);
    }
    
    public void setForma(Point2D p){
        double x1,y1,x2,y2;
        
        pfin=p;
        x1=pini.getX();
        y1=pini.getY();
        x2=pfin.getX();
        y2=pfin.getY();
        ((RoundRectangle2D.Double)s).setRoundRect(Math.min(x1,x2),Math.min(y1, y2),Math.abs(x2-x1),Math.abs(y2-y1),anchoArc,altoArc);
    }
}
