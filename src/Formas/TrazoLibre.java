/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

/**
 *
 * @author Usuario
 */
public class TrazoLibre extends Forma{
    
    public TrazoLibre(){
        s=new GeneralPath(GeneralPath.WIND_EVEN_ODD);
    }
    
    public void setPuntoInicio(Point2D p){
        pini=p;
        ((GeneralPath)s).moveTo(pini.getX(),pini.getY());
    }
    
    public void setPuntoFinal(Point2D p){
        pfin=p;
        ((GeneralPath)s).lineTo(pfin.getX(),pfin.getY());
    }
    
    public void setForma(Point2D p){
        pfin=p;
        ((GeneralPath)s).lineTo(pfin.getX(),pfin.getY());
    }
}
