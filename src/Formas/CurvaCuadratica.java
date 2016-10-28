/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

/**
 *
 * @author Usuario
 */
public class CurvaCuadratica extends Forma{
    private Point2D pControl;
    private boolean flagPControl;
    
    public CurvaCuadratica(){
        s=new QuadCurve2D.Double();
        flagPControl=false;
    }
    
    public CurvaCuadratica(Point2D p1,Point2D pc,Point2D p2){
        double x1,y1,x2,y2,pcx,pcy;
        
        pini=p1;
        pfin=p2;
        pControl=pc;
        x1=pini.getX();
        y1=pini.getY();
        x2=pfin.getX();
        y2=pfin.getY();
        pcx=pControl.getX();
        pcy=pControl.getY();
        
        s=new QuadCurve2D.Double(x1,y1,0,0,x2,y2);
        flagPControl=false;
    }
    
    public boolean getflagPControl(){
        return flagPControl;
    }
    
     public void setPuntoInicio(Point2D p){
         if(flagPControl==false){
             pini=p;
             pControl=pini;
             ((QuadCurve2D)s).setCurve(pini.getX(),pini.getY(),pControl.getX(),pControl.getY(),pini.getX(),pini.getY());
         }
         else{
             pControl=p;
            ((QuadCurve2D)s).setCurve(pini.getX(),pini.getY(),pControl.getX(),pControl.getY(),pfin.getX(),pfin.getY());
         }
     }
     
     public void setPuntoFinal(Point2D p){
         if(flagPControl==false){
             pfin=p;
             pControl=pini;
             ((QuadCurve2D)s).setCurve(pini.getX(),pini.getY(),pControl.getX(),pControl.getY(),pfin.getX(),pfin.getY());
             flagPControl=true;
         }
         else{
             pControl=p;
            ((QuadCurve2D)s).setCurve(pini.getX(),pini.getY(),pControl.getX(),pControl.getY(),pfin.getX(),pfin.getY());
            flagPControl=false;
            
         }
     }
     
     public void setForma(Point2D p){
         if(flagPControl==false){
             pfin=p;
             pControl=pini;
             ((QuadCurve2D)s).setCurve(pini.getX(),pini.getY(),pControl.getX(),pControl.getY(),pfin.getX(),pfin.getY());
         }
         else{
             pControl=p;
            ((QuadCurve2D)s).setCurve(pini.getX(),pini.getY(),pControl.getX(),pControl.getY(),pfin.getX(),pfin.getY());
         }
     }
}
