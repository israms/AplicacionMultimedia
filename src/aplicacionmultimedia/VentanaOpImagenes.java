/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaOpImagenes.java
 *
 * Created on 19-feb-2012, 18:33:23
 */
package aplicacionmultimedia;

import java.awt.Graphics2D;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.RescaleOp;
import java.awt.image.ShortLookupTable;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaOpImagenes extends javax.swing.JInternalFrame {
    private VentanaPrincipal creador=null;
    private BufferedImage img, imgDest;
    
    /** Creates new form VentanaOpImagenes */
    public VentanaOpImagenes(VentanaPrincipal vp) {
        creador=vp;
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaBrillo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        sliderBrillo = new javax.swing.JSlider();
        botonNegativo = new javax.swing.JButton();
        botonGrises = new javax.swing.JButton();
        botonEscalado = new javax.swing.JButton();
        botonRotar = new javax.swing.JButton();
        botonFronteras = new javax.swing.JButton();
        botonRealce = new javax.swing.JButton();
        botonAlisamiento = new javax.swing.JButton();
        botonContraste = new javax.swing.JButton();
        botonGamma = new javax.swing.JButton();
        etiquetaEfectos = new javax.swing.JLabel();
        botonInclinar = new javax.swing.JButton();

        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionmultimedia/iconos/icon2.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(400, 320));
        getContentPane().setLayout(null);

        etiquetaBrillo.setText("Ajustar brillo");
        getContentPane().add(etiquetaBrillo);
        etiquetaBrillo.setBounds(30, 10, 120, 14);
        getContentPane().add(separador);
        separador.setBounds(0, 70, 400, 10);

        sliderBrillo.setMinimum(-100);
        sliderBrillo.setValue(0);
        sliderBrillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderBrilloMouseReleased(evt);
            }
        });
        sliderBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBrilloStateChanged(evt);
            }
        });
        getContentPane().add(sliderBrillo);
        sliderBrillo.setBounds(80, 30, 200, 23);

        botonNegativo.setText("Negativo");
        botonNegativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNegativoMouseClicked(evt);
            }
        });
        getContentPane().add(botonNegativo);
        botonNegativo.setBounds(30, 110, 160, 23);

        botonGrises.setText("Niveles de grises");
        botonGrises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGrisesMouseClicked(evt);
            }
        });
        getContentPane().add(botonGrises);
        botonGrises.setBounds(30, 140, 160, 23);

        botonEscalado.setText("Escalado");
        botonEscalado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEscaladoMouseClicked(evt);
            }
        });
        getContentPane().add(botonEscalado);
        botonEscalado.setBounds(30, 170, 160, 23);

        botonRotar.setText("Rotar 180º");
        botonRotar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRotarMouseClicked(evt);
            }
        });
        getContentPane().add(botonRotar);
        botonRotar.setBounds(30, 200, 160, 23);

        botonFronteras.setText("Deteccion fronteras");
        botonFronteras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonFronterasMouseClicked(evt);
            }
        });
        getContentPane().add(botonFronteras);
        botonFronteras.setBounds(200, 110, 160, 23);

        botonRealce.setText("Realce");
        botonRealce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRealceMouseClicked(evt);
            }
        });
        getContentPane().add(botonRealce);
        botonRealce.setBounds(200, 140, 160, 23);

        botonAlisamiento.setText("Alisamiento");
        botonAlisamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAlisamientoMouseClicked(evt);
            }
        });
        getContentPane().add(botonAlisamiento);
        botonAlisamiento.setBounds(200, 170, 160, 23);

        botonContraste.setText("Aumentar Contraste");
        botonContraste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonContrasteMouseClicked(evt);
            }
        });
        getContentPane().add(botonContraste);
        botonContraste.setBounds(200, 200, 160, 23);

        botonGamma.setText("Gamma");
        botonGamma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGammaMouseClicked(evt);
            }
        });
        getContentPane().add(botonGamma);
        botonGamma.setBounds(200, 230, 160, 23);

        etiquetaEfectos.setText("Efectos");
        getContentPane().add(etiquetaEfectos);
        etiquetaEfectos.setBounds(30, 80, 60, 14);

        botonInclinar.setText("Inclinar");
        botonInclinar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInclinarMouseClicked(evt);
            }
        });
        getContentPane().add(botonInclinar);
        botonInclinar.setBounds(30, 230, 160, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
private BufferedImage convertir_INT_RGB(BufferedImage img){
    BufferedImage imgSource;
    
    if (img.getType() != BufferedImage.TYPE_INT_RGB){
        imgSource = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = imgSource.createGraphics();
        g2d.drawImage(img, 0, 0, null);
    }else imgSource = img;
    
    return imgSource;
}

private void confirmarEfectoImagen(){
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    
    int opcion=JOptionPane.showConfirmDialog(viActiva,"¿Desea mantener el efecto aplicado?");
    if(opcion==0){
        viActiva.getPanelDibujo().setImage(imgDest);
    }
    else{
        viActiva.getPanelDibujo().setImage(img);
        viActiva.repaint();
    }
}

private void botonNegativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNegativoMouseClicked
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
        
    short ltN[] = new short[256];
    for (int j=0; j<256; j++) {
        ltN[j] = (short)(256-j-1); // Negativo
    }
    ShortLookupTable slt = new ShortLookupTable(0, ltN);
    LookupOp lop = new LookupOp(slt, null);
    imgDest = lop.filter( imgSource , null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonNegativoMouseClicked

private void botonGrisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGrisesMouseClicked
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    ICC_Profile ip = ICC_Profile.getInstance(ColorSpace.CS_GRAY);
    ColorSpace cs = new ICC_ColorSpace(ip);
    ColorConvertOp ccop = new ColorConvertOp(cs,null);
    
    imgDest = ccop.filter(imgSource,null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
    
}//GEN-LAST:event_botonGrisesMouseClicked

private void botonEscaladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEscaladoMouseClicked
    BufferedImage imgSource;

    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    AffineTransform at = AffineTransform.getScaleInstance(1.25,1.25);
    AffineTransformOp atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
    imgDest = atop.filter(imgSource, null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonEscaladoMouseClicked

private void botonRotarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRotarMouseClicked
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(180.0),img.getWidth()/2,img.getHeight()/2);
    AffineTransformOp atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
    imgDest = atop.filter(imgSource, null);
    
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonRotarMouseClicked

private void botonFronterasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFronterasMouseClicked
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    float filtroLaplaciano[] = {1.0f, 1.0f,  1.0f,1.0f, -8.0f, 1.0f,1.0f, 1.0f,  1.0f};
    
    Kernel k = new Kernel(3,3,filtroLaplaciano);
    ConvolveOp cop = new ConvolveOp( k );
    imgDest = cop.filter(imgSource,null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonFronterasMouseClicked

private void botonRealceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRealceMouseClicked
   BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    float filtroRealce[] = {0.0f, -1.0f, 0.0f,-1.0f,  5.0f, -1.0f,0.0f, -1.0f, 0.0f};
    
    Kernel k = new Kernel(3,3,filtroRealce);
    ConvolveOp cop = new ConvolveOp( k );
    imgDest = cop.filter(imgSource,null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonRealceMouseClicked

private void botonAlisamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAlisamientoMouseClicked
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    float filtroMedia[] = {0.1f, 0.1f, 0.1f,0.1f, 0.2f, 0.1f,0.1f, 0.1f, 0.1f};
    
    Kernel k = new Kernel(3,3,filtroMedia);
    ConvolveOp cop = new ConvolveOp( k );
    imgDest = cop.filter(imgSource,null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonAlisamientoMouseClicked

private void botonContrasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonContrasteMouseClicked
    double f=0;
    double K3 = 255.0 / (   1.0 / (  1.0  +  Math.pow( 128.0/255.0 , 2.0)));
    short ltC[] = new short[256];
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    for (int j=0; j<256; j++) {
        if(j==0) ltC[j]=0;
        else{
            f = 1.0 / (1.0 + Math.pow(128.0 / (float) j, 2.0));  // Contraste
            ltC[j] = (short)(K3*f);
        }
    }
    ShortLookupTable slt = new ShortLookupTable(0, ltC);
    LookupOp lop = new LookupOp(slt, null);
    imgDest = lop.filter( imgSource , null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonContrasteMouseClicked

private void botonGammaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGammaMouseClicked
    double K2 = 255.0/Math.pow(255.0,0.40);
    short ltG[] = new short[256];
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    for (int j=0; j<256; j++) {
        ltG[j] = (byte)(K2*Math.pow((double)j,0.40));// Gamma
    }
    ShortLookupTable slt = new ShortLookupTable(0, ltG);
    LookupOp lop = new LookupOp(slt, null);
    imgDest = lop.filter( imgSource , null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonGammaMouseClicked

private void sliderBrilloMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderBrilloMouseReleased
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    
    int opcion=JOptionPane.showConfirmDialog(viActiva,"¿Desea aplicar el brillo ajustado a la imagen de manera permanente?");
    if(opcion==0){
        viActiva.getPanelDibujo().setImage(imgDest);
        //viActiva.repaint();
    }
    else{
        viActiva.getPanelDibujo().setImage(img);
        viActiva.repaint();
        sliderBrillo.setValue(0);
    }
}//GEN-LAST:event_sliderBrilloMouseReleased

private void sliderBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBrilloStateChanged
    float valor=sliderBrillo.getValue();
    
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    RescaleOp rop = new RescaleOp(1.0F,valor,null);
    imgDest = rop.filter(imgSource,null);
    
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
}//GEN-LAST:event_sliderBrilloStateChanged

private void botonInclinarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInclinarMouseClicked
    BufferedImage imgSource;
    
    VentanaImagen viActiva=creador.getVentanaImagenActiva();
    img=viActiva.getPanelDibujo().getImage();
    imgSource=convertir_INT_RGB(img);
    
    AffineTransform at = AffineTransform.getShearInstance(0.5,0.0);
    AffineTransformOp atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
    imgDest = atop.filter(imgSource, null);
    viActiva.getPanelDibujo().setImageView(imgDest);
    viActiva.repaint();
    confirmarEfectoImagen();
}//GEN-LAST:event_botonInclinarMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlisamiento;
    private javax.swing.JButton botonContraste;
    private javax.swing.JButton botonEscalado;
    private javax.swing.JButton botonFronteras;
    private javax.swing.JButton botonGamma;
    private javax.swing.JButton botonGrises;
    private javax.swing.JButton botonInclinar;
    private javax.swing.JButton botonNegativo;
    private javax.swing.JButton botonRealce;
    private javax.swing.JButton botonRotar;
    private javax.swing.JLabel etiquetaBrillo;
    private javax.swing.JLabel etiquetaEfectos;
    private javax.swing.JSeparator separador;
    private javax.swing.JSlider sliderBrillo;
    // End of variables declaration//GEN-END:variables
}
