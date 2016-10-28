/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

/**
 *
 * @author Usuario
 */
public class CurvaCubica extends Forma{
    private Point2D pControl1;
    private Point2D pControl2;
    private boolean setPControl1;
    private boolean setPControl2;
    
    public CurvaCubica(){
        s=new CubicCurve2D.Double();
        setPControl1=false;
        setPControl2=false;
    }
    
    public CurvaCubica(Point2D p1,Point2D pc,Point2D p2){
        /*double x1,y1,x2,y2,pcx,pcy;
        
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
        setPControl=false;*/
    }
    
     public void setPuntoInicio(Point2D p){
         if(setPControl1==false && setPControl2==false){
             pini=p;
             pfin=pini;
             pControl1=pini;
             pControl2=pini;
             ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pini);
         }
         else if(setPControl1 && setPControl2==false){
             pControl1=p;
             pControl2=pControl1;
            ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pfin);
         }
         else if(setPControl2){
             pControl2=p;
             ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pfin);
         }
     }
     
     public void setPuntoFinal(Point2D p){
         if(setPControl1==false && setPControl2==false){
             pfin=p;
             pControl1=pini;
             pControl2=pini;
             ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pfin);
             setPControl1=true;
         }
         else if(setPControl1 && setPControl2==false){
             pControl1=p;
             pControl2=pControl1;
             ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pfin);
            setPControl2=true;   
         }
         else if(setPControl2){
             pControl2=p;
             ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pfin);
             setPControl1=false;
             setPControl2=false;
         }
     }
     
     public void setForma(Point2D p){
         if(setPControl1==false && setPControl2==false){
             pfin=p;
             pControl1=pini;
             pControl2=pini;
             ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pfin);
         }
         else if(setPControl1 && setPControl2==false){
             pControl1=p;
             pControl2=pControl1;
             ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pfin);  
         }
         else if(setPControl2){
             pControl2=p;
             ((CubicCurve2D)s).setCurve(pini,pControl1,pControl2,pfin);
         }
     }
}
