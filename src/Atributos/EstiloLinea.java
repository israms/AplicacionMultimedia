/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

import java.awt.BasicStroke;

/**
 *
 * @author Usuario
 */
public class EstiloLinea{
    private BasicStroke sk;
    private float grosor;
    private int estiloFinal;
    private int estiloUnion;
    private float miterLimit;
    private float[] punteo;
    private float fasePunteo;
    
    public EstiloLinea(){
        grosor=3.0f;
        sk=new BasicStroke(grosor);
        estiloFinal=sk.getEndCap();
        estiloUnion=sk.getLineJoin();
        miterLimit=sk.getMiterLimit();
        punteo=sk.getDashArray();
        fasePunteo=sk.getDashPhase();
    }
    
    public void setGrosor(float valor){
        grosor=valor;
        sk=new BasicStroke(grosor,estiloFinal,estiloUnion,miterLimit,punteo,fasePunteo);
    }
    
    public void setEstiloFinal(int valor){
        estiloFinal=valor;
        sk=new BasicStroke(grosor,estiloFinal,estiloUnion,miterLimit,punteo,fasePunteo);
    }
    
    public void setEstiloUnion(int valor){
        estiloUnion=valor;
        sk=new BasicStroke(grosor,estiloFinal,estiloUnion,miterLimit,punteo,fasePunteo);
    }
    
    public void setMiterLimit(float valor){
        miterLimit=valor;
        sk=new BasicStroke(grosor,estiloFinal,estiloUnion,miterLimit,punteo,fasePunteo);
    }
    
    public void setPunteo(float punteo[]){
        this.punteo=punteo;
        sk=new BasicStroke(grosor,estiloFinal,estiloUnion,miterLimit,punteo,fasePunteo);
    }
    
    public void setFasePunteo(float valor){
        fasePunteo=valor;
        sk=new BasicStroke(grosor,estiloFinal,estiloUnion,miterLimit,punteo,fasePunteo);
    }
    
    public BasicStroke getbasicStroke(){
        return sk;
    }
    
    public float getGrosor(){
        return grosor;
    }
    
    public int getEstiloFinal(){
        return estiloFinal;
    }
    
    public int getEstiloUnion(){
        return estiloUnion;
    }
    
    public float getMiterLimit(){
        return miterLimit;
    }
    
    public float[] getPunteo(){
        return punteo;
    }
    
    public float getFasePunteo(){
        return fasePunteo;
    }
}
