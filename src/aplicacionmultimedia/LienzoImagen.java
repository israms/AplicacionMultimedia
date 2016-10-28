/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LienzoImagen.java
 *
 * Created on 09-ene-2012, 12:42:02
 */
package aplicacionmultimedia;

import Atributos.EstiloLinea;
import Formas.*;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class LienzoImagen extends javax.swing.JPanel {
    private BufferedImage imgView;
    private BufferedImage img;
    private Graphics2D g2dImg;
    private String forma;
    private int relleno;
    private Forma f,fSeleccionada;
    private String texto;
    private EstiloLinea trazo;
    private Color colorTrazo;
    private Color colorRelleno;
    private GradientPaint gradiente;
    private int dirGradiente;
    private AlphaComposite transparencia;
    private String fuente;
    private int estilo;
    private int tam;
    private boolean puntoControl;
    private boolean puntoControl2;
    private ArrayList vFormas;
    private boolean editarForma;
    Point2D p1=new Point2D.Double(10,10);
    Point2D pc=new Point2D.Double(0,0);
    Point2D pini=new Point2D.Double();
    Point2D pfin=new Point2D.Double();
    
    /** Creates new form LienzoImagen */
    public LienzoImagen() {
        initComponents();
        colorTrazo=Color.black;
        colorRelleno=Color.white;
        dirGradiente=0;
        forma="";
        fuente="Aharoni";
        tam=12;
        estilo=0;
        texto=null;
        puntoControl=false;
        puntoControl2=false;
        trazo=new EstiloLinea();
        vFormas=new ArrayList();
        editarForma=false;
        gradiente=null;
        transparencia = AlphaComposite.getInstance(AlphaComposite.SRC,1.0f);
        imgView=new BufferedImage(600,600,BufferedImage.TYPE_INT_RGB);
        img=imgView;
        g2dImg=imgView.createGraphics();
        g2dImg.setPaint(Color.white);
        g2dImg.fill(new Rectangle2D.Float(0,0,imgView.getWidth(),imgView.getHeight()));
    }
    
    
    private void reDibujarFormas(){
        imgView=img;
        for(int i=0;i<vFormas.size();i++){
           Forma fTemp=(Forma)vFormas.get(i);
           g2dImg.setComposite(fTemp.getTransparencia());
           if(fTemp.getTipoRelleno()==0){
               g2dImg.setPaint(fTemp.getColorTrazo());
               g2dImg.setStroke(fTemp.getEstiloLinea());
               g2dImg.draw(fTemp.getShape());
           }
           else if(fTemp.getTipoRelleno()==1){
               g2dImg.setPaint(fTemp.getColorRelleno());
               g2dImg.fill(fTemp.getShape());
               g2dImg.setPaint(fTemp.getColorTrazo());
               g2dImg.setStroke(fTemp.getEstiloLinea());
               //g2dImg.setComposite(fTemp.getTransparencia());
               g2dImg.draw(fTemp.getShape());
           }
           else if(fTemp.getTipoRelleno()==2){
               g2dImg.setPaint(fTemp.getGradiente());
               g2dImg.fill(fTemp.getShape());
               g2dImg.setPaint(fTemp.getColorTrazo());
               g2dImg.setStroke(fTemp.getEstiloLinea());
               g2dImg.draw(fTemp.getShape());
           }
           //this.repaint();
       }
       this.repaint();
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;

        g2d.drawImage(imgView,0,0,this);
        
        
        if(f!=null){
            System.out.println("Esto no deberia de salir");
            setAtributosDibujo(g2d);
            g2d.draw(f.getShape());
        }
    }
    
    public void setImageView(BufferedImage img){
        this.imgView=img;
        g2dImg=imgView.createGraphics();
    }

    public BufferedImage getImageView(){
        return this.imgView;
    }
    
    public void setImage(BufferedImage img){
        this.img=img;
        g2dImg=img.createGraphics();
        this.setPreferredSize(new Dimension(img.getWidth(),img.getHeight()));
        setImageView(img);
    }
    
    public BufferedImage getImage(){
        return(img);
    }
    
    public void setColorTrazo(Color c){
        colorTrazo=c;
        if(editarForma && fSeleccionada!=null){
            fSeleccionada.setColorTrazo(c);
            reDibujarFormas();
        }
    }
    
    public void setColorRelleno(Color c){
        colorRelleno=c;
        if(editarForma && fSeleccionada!=null){
           fSeleccionada.setColorRelleno(colorRelleno);
           reDibujarFormas();
        }
    }
    
    public void setDirGradiente(int valor){
        dirGradiente=valor;
        if(editarForma && fSeleccionada!=null){
            fSeleccionada.setDireccionGradiente(dirGradiente);
            reDibujarFormas();
        }
    }

    public void setTransparencia(float valor){
        transparencia=AlphaComposite.getInstance(AlphaComposite.SRC_OVER,valor);
        if(editarForma && fSeleccionada!=null){
            fSeleccionada.setTransparencia(transparencia);
            reDibujarFormas();
        }
    }
    
    public void setForma(String forma){
        if(this.forma.equals("CurvaCuadratica") || this.forma.equals("CurvaCubica")){
            if(f!=null){
                g2dImg.draw(f.getShape());
                puntoControl=false;
                puntoControl2=false;
            }
        }
        this.forma=forma;
        editarForma=false;
        f=null;
    }

    public String getForma(){
        return (this.forma);
    }
    
    public void setEditarForma(boolean b){
        editarForma=b;
        f=null;
    }

    public void setRelleno(int valor){
        relleno=valor;
        if(editarForma && fSeleccionada!=null){
           fSeleccionada.setTipoRelleno(relleno);
           reDibujarFormas();
        }
    }
    
    public void setTexto(String cad){
        texto=cad;
    }
    
    public void setFuenteTexto(String cad){
        fuente=cad;
    }
    
    public void setEstiloTexto(int valor){
        estilo=valor;
    }
    
    public void setTamTexto(int valor){
        tam=valor;
    }

    public void setGrosor(float valor){
        if(f!=null){
            f.setGrosor(valor);
        }
        trazo.setGrosor(valor);
        if(editarForma && fSeleccionada!=null){
            fSeleccionada.setGrosor(valor);
            reDibujarFormas();
        }
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
    
    private void setAtributosDibujo(Graphics2D g2d){
           g2d.setClip(new Rectangle2D.Float(0,0,imgView.getWidth(),imgView.getHeight()));
           g2d.setComposite(transparencia);

           if((forma!="CurvaCuadratica") && (forma!="CurvaCubica") && (forma!="TrazoLibre")){
               if(relleno==1){ // Rellenar fondo de la forma con color liso
                   g2d.setPaint(colorRelleno);
                   g2d.fill(f.getShape());

               }
               else if(relleno==2){ // Rellenar fondo de la forma con gradiente
                   float x1=0.0f;
                   float y1=0.0f;
                   float x2=0.0f;
                   float y2=0.0f;
                   if(dirGradiente==0){ // Gradiente horizontal
                       x1=Double.valueOf(f.getPuntoInicio().getX()).floatValue();
                       y1=Double.valueOf(f.getPuntoInicio().getY()).floatValue();
                       x2=Double.valueOf(f.getPuntoFinal().getX()).floatValue();
                       y2=Double.valueOf(f.getPuntoInicio().getY()).floatValue();
                   }
                   else if(dirGradiente==1){ // Gradiente vertical
                       x1=Double.valueOf(f.getPuntoInicio().getX()).floatValue();
                       y1=Double.valueOf(f.getPuntoInicio().getY()).floatValue();
                       x2=Double.valueOf(f.getPuntoInicio().getX()).floatValue();
                       y2=Double.valueOf(f.getPuntoFinal().getY()).floatValue();
                   }
                   else if(dirGradiente==2){
                       x1=Double.valueOf(f.getPuntoInicio().getX()).floatValue();
                       y1=Double.valueOf(f.getPuntoInicio().getY()).floatValue();
                       x2=Double.valueOf(f.getPuntoFinal().getX()).floatValue();
                       y2=Double.valueOf(f.getPuntoFinal().getY()).floatValue();
                   }
                   else if(dirGradiente==3){
                       x1=Double.valueOf(f.getPuntoInicio().getX()).floatValue();
                       y1=Double.valueOf(f.getPuntoFinal().getY()).floatValue();
                       x2=Double.valueOf(f.getPuntoFinal().getX()).floatValue();
                       y2=Double.valueOf(f.getPuntoInicio().getY()).floatValue();
                   }
                   gradiente=new GradientPaint(x1,y1,colorTrazo,x2,y2,colorRelleno);
                   g2d.setPaint(gradiente);
                   g2d.fill(f.getShape());
               }
           }
           g2d.setPaint(colorTrazo);
           g2d.setStroke(f.getEstiloLinea());
           g2d.setComposite(transparencia);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
    pini=evt.getPoint();
    if(!editarForma){
        if(forma=="Linea"){
            f=new Linea();
        }
        else if(forma=="Rectangulo"){
            f=new Rectangulo();
        }
        else if(forma=="RectanguloR"){
            f=new RectanguloRedondeado();
        }
        else if(forma=="Elipse"){
            f=new Elipse();
        }
        else if(forma=="CurvaCuadratica"){
            if(f==null){
                f=new CurvaCuadratica();
            }
        }
        else if(forma=="CurvaCubica"){
            if(f==null){
                f=new CurvaCubica();
            }
        }
        else if(forma=="TrazoLibre"){
            f=new TrazoLibre();
        }
        if(f!=null){
            f.setPuntoInicio(pini);
            f.setGrosor(trazo.getGrosor());
            f.setEstiloFinal(trazo.getEstiloFinal());
            f.setEstiloUnion(trazo.getEstiloUnion());
            f.setMiterLimit(trazo.getMiterLimit());
            f.setPunteo(trazo.getPunteo());
            f.setFasePunteo(trazo.getFasePunteo());
            f.setAtributosForma(colorTrazo,colorRelleno,relleno,dirGradiente,gradiente,transparencia);
        }
    }
    else{ // Modo editar formas
        boolean salir=false;
        int ultima=vFormas.size()-1;
        for(int i=ultima;i>=0 && !salir;i--){
            fSeleccionada=(Forma)vFormas.get(i);
            if(fSeleccionada.getShape().contains(evt.getPoint())){
                salir=true; 
            }
            else{
                fSeleccionada=null;
            }
        }
    }
}//GEN-LAST:event_formMousePressed

private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
    if(f!=null){
        f.setForma(evt.getPoint());
    }
    this.repaint();
}//GEN-LAST:event_formMouseDragged

private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
    
    if(f!=null){
           f.setPuntoFinal(evt.getPoint());
           setAtributosDibujo(g2dImg);
           if(forma=="CurvaCuadratica"){
               if(puntoControl){
                   g2dImg.draw(f.getShape());
                   puntoControl=false;
               }
               else{
                   ((Graphics2D)this.getGraphics()).draw(f.getShape());
                   puntoControl=true;
               }
           }
           else if(forma=="CurvaCubica"){
               if(puntoControl){
                   if(!puntoControl2){
                       ((Graphics2D)this.getGraphics()).draw(f.getShape());
                       puntoControl2=true;
                   }
                   else{
                       g2dImg.draw(f.getShape());
                       puntoControl=false;
                       puntoControl2=false;
                   }
               }
               else{
                   ((Graphics2D)this.getGraphics()).draw(f.getShape());
                   puntoControl=true;
               }
           }
           else{
               g2dImg.draw(f.getShape());
               vFormas.add(f);
               f=null;
           }
    }
    else if(forma.equals("Texto")){
        String cad = JOptionPane.showInternalInputDialog(this,"Introduce texto");
        if(cad!=null){
            texto=cad;
            this.setFont(new Font(texto,estilo,tam));
            g2dImg.setComposite(transparencia);
            g2dImg.setPaint(colorTrazo);
            g2dImg.setFont(this.getFont());
            g2dImg.drawString(texto,Double.valueOf(pini.getX()).floatValue(),Double.valueOf(pini.getY()).floatValue());
        }      
    }
    this.repaint();
}//GEN-LAST:event_formMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
