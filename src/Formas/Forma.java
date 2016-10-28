/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import Atributos.EstiloLinea;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Shape;
import java.awt.geom.Point2D;

/**
 *
 * @author Usuario
 */
public abstract class Forma{
    protected Shape s;
    protected Point2D pini;
    protected Point2D pfin;
    protected EstiloLinea trazo=new EstiloLinea();
    protected Color colorTrazo;
    protected Color colorRelleno;
    protected GradientPaint gradiente;
    protected int dirGradiente;
    protected int tipoRelleno;
    protected AlphaComposite transparencia=AlphaComposite.getInstance(AlphaComposite.SRC,1.0f);
    
    
    public abstract void setPuntoInicio(Point2D p);
    
    public abstract void setPuntoFinal(Point2D p);
    
    public abstract void setForma(Point2D p);
    
    public Shape getShape(){
        return s;
    }
    
    public Point2D getPuntoInicio(){
        return pini;
    }
    
    public Point2D getPuntoFinal(){
        return pfin;
    }
    
    public void setGrosor(float valor){
        trazo.setGrosor(valor);
    }
    
    public void setEstiloFinal(int valor){
        trazo.setEstiloFinal(valor);
    }
    
    public void setEstiloUnion(int valor){
        trazo.setEstiloUnion(valor);
    }
    
    public void setMiterLimit(float valor){
        trazo.setMiterLimit(valor);
    }
    
    public void setPunteo(float punteo[]){
        trazo.setPunteo(punteo);
    }
    
    public void setFasePunteo(float valor){
        trazo.setFasePunteo(valor);
    }
    
    public void setEstiloLinea(){
        
    }
    
    public BasicStroke getEstiloLinea(){
        return (trazo.getbasicStroke());
    }
    
    public void setAtributosForma(Color frente,Color fondo,int tipo,int direccion,GradientPaint g,AlphaComposite trans){
        colorTrazo=frente;
        colorRelleno=fondo;
        tipoRelleno=tipo;
        dirGradiente=direccion;
        gradiente=g;
        transparencia=trans;
    }
    
    public void setColorTrazo(Color c){
        colorTrazo=c;
        if(tipoRelleno==2){
            calcularGradiente();
        }
    }
    
    public void setColorRelleno(Color c){
        colorRelleno=c;
        if(tipoRelleno==2){
            calcularGradiente();
        }
    }
    
    public void setTransparencia(AlphaComposite trans){
        transparencia=trans;
    }
    
    public void setGradiente(GradientPaint g){
        gradiente=g;
    }
    
    public void setDireccionGradiente(int valor){
        dirGradiente=valor;
        if(tipoRelleno==2){
            calcularGradiente();
        }
    }
    
    public void setTipoRelleno(int valor){
        tipoRelleno=valor;
        if(tipoRelleno==2){
            calcularGradiente();
        }
    }
    
    public Color getColorTrazo(){
        return colorTrazo;
    }
    
    public Color getColorRelleno(){
        return colorRelleno;
    }
    
    public int getTipoRelleno(){
        return tipoRelleno;
    }
    
    public int getDirGradiente(){
        return dirGradiente;
    }
    
    public GradientPaint getGradiente(){
        return gradiente;
    }
    
    public AlphaComposite getTransparencia(){
        return transparencia;
    }
    
    private void calcularGradiente(){
               // Calcular nuevo gradiente
               float x1=0.0f;
               float y1=0.0f;
               float x2=0.0f;
               float y2=0.0f;
               if(dirGradiente==0){ // Gradiente horizontal
                   x1=Double.valueOf(pini.getX()).floatValue();
                   y1=Double.valueOf(pini.getY()).floatValue();
                   x2=Double.valueOf(pfin.getX()).floatValue();
                   y2=Double.valueOf(pini.getY()).floatValue();
               }
               else if(dirGradiente==1){ // Gradiente vertical
                   x1=Double.valueOf(pini.getX()).floatValue();
                   y1=Double.valueOf(pini.getY()).floatValue();
                   x2=Double.valueOf(pini.getX()).floatValue();
                   y2=Double.valueOf(pfin.getY()).floatValue();
               }
               else if(dirGradiente==2){
                   x1=Double.valueOf(pini.getX()).floatValue();
                   y1=Double.valueOf(pini.getY()).floatValue();
                   x2=Double.valueOf(pfin.getX()).floatValue();
                   y2=Double.valueOf(pfin.getY()).floatValue();
               }
               else if(dirGradiente==3){
                   x1=Double.valueOf(pini.getX()).floatValue();
                   y1=Double.valueOf(pfin.getY()).floatValue();
                   x2=Double.valueOf(pfin.getX()).floatValue();
                   y2=Double.valueOf(pini.getY()).floatValue();
               }
               gradiente=new GradientPaint(x1,y1,colorTrazo,x2,y2,colorRelleno);
    }
}
