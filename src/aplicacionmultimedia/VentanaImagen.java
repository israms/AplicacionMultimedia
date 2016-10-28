/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaImagen.java
 *
 * Created on 09-ene-2012, 13:03:38
 */
package aplicacionmultimedia;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class VentanaImagen extends javax.swing.JInternalFrame {
    private VentanaPrincipal creador=null;
    /** Creates new form VentanaImagen */
    public VentanaImagen(VentanaPrincipal vp) {
        creador=vp;
        initComponents();
    }
    
    public void setForma(String valor){
        panelDibujo.setForma(valor);
    }
    
    public void setRelleno(int valor){
        panelDibujo.setRelleno(valor);
    }
    
    public void setDirGradiente(int valor){
        panelDibujo.setDirGradiente(valor);
    }
    
    public void setTransparencia(float valor){
        panelDibujo.setTransparencia(valor);
    }
    
    public void setFuenteTexto(String cad){
        panelDibujo.setFuenteTexto(cad);
    }
    
    public void setEstiloTexto(int valor){
        panelDibujo.setEstiloTexto(valor);
    }
    
    public void setTamTexto(int valor){
        panelDibujo.setTamTexto(valor);
    }
    
    public void setGrosor(float valor){
        panelDibujo.setGrosor(valor);
        System.out.println("VentanaImagen");
    }
    
    public void setEstiloFinal(int valor){
        panelDibujo.setEstiloFinal(valor);
    }
    
    public void setEstiloUnion(int valor){
        panelDibujo.setEstiloUnion(valor);
    }
    
    public void setMiterLimit(float valor){
        panelDibujo.setMiterLimit(valor);
    }
    
    public void setPunteo(float punteo[]){
        panelDibujo.setPunteo(punteo);
    }
    
    public void setFasePunteo(float valor){
        panelDibujo.setFasePunteo(valor);
    }
    
    public void setLienzoImg(LienzoImagen lienzo){
        panelDibujo=lienzo;
        panelDibujo.setImage(null);
    }
    
    public LienzoImagen getLienzoImagen(){
        return panelDibujo;
    }
    
    public void setColorTrazo(Color c){
        panelDibujo.setColorTrazo(c);
    }
    
    public void setColorRelleno(Color c){
        panelDibujo.setColorRelleno(c);
    }
    
    public LienzoImagen getPanelDibujo(){
        return panelDibujo;
    }
    
    public void setEditarForma(boolean b){
        panelDibujo.setEditarForma(b);
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelScroll = new javax.swing.JScrollPane();
        panelDibujo = new aplicacionmultimedia.LienzoImagen();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionmultimedia/iconos/trazo.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout panelDibujoLayout = new javax.swing.GroupLayout(panelDibujo);
        panelDibujo.setLayout(panelDibujoLayout);
        panelDibujoLayout.setHorizontalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        panelDibujoLayout.setVerticalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        panelScroll.setViewportView(panelDibujo);

        getContentPane().add(panelScroll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    creador.setVentanaImagenActiva(this);
}//GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private aplicacionmultimedia.LienzoImagen panelDibujo;
    private javax.swing.JScrollPane panelScroll;
    // End of variables declaration//GEN-END:variables
}
