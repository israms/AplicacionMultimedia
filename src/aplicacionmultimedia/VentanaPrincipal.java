/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaPrincipal.java
 *
 * Created on 02-ene-2012, 17:53:18
 */
package aplicacionmultimedia;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author israms
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private VentanaHerramientas vh;
    private VentanaImagen vi;
    private VentanaAtributos va;
    private VentanaImagen viActiva;
    private VentanaOpImagenes vOp;
    private VentanaSonidoVideo vRep;
    
    /** Creates new form VentanaPrincipal */
    public VentanaPrincipal() {
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/aplicacionmultimedia/iconos/icono.png")).getImage());
        //setIconImage(icono.getImage());
        vh=new VentanaHerramientas(this);
        this.escritorio.add(vh);
        vh.setLocation(0, 5);
        vh.setVisible(true);
        vi=new VentanaImagen(this);
        viActiva=vi;
        this.escritorio.add(vi);
        vi.setLocation(225, 5);
        vi.setTitle("Nuevo lienzo");
        vi.setVisible(true);
        va=new VentanaAtributos(this);
        this.escritorio.add(va);
        va.setLocation(730, 5);
        va.setVisible(true);
        vOp=new VentanaOpImagenes(this);
        this.escritorio.add(vOp);
        vOp.setLocation(750, 320);
        vOp.setVisible(true);
    }
    
    public void desactivarOpcionGuardar(){
        guardarItem.setEnabled(false);
    }
    
    public void activarOpcionGuardar(){
        guardarItem.setEnabled(true);
    }
    
    public void setEditarForma(boolean b){
        vi.setEditarForma(b);
    }
    
    public void setVentanaImagenActiva(VentanaImagen vi){
        viActiva=vi;
    }
    
    public VentanaImagen getVentanaImagenActiva(){
        return viActiva;
    }
    
    public void setForma(String valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setForma(valor);
            }
        }
    }
    
    public void setRelleno(int valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setRelleno(valor);
            }
        }
    }
    
    public void setDirGradiente(int valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setDirGradiente(valor);
            }
        }
    }
    
    public void setTransparencia(float valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setTransparencia(valor);
            }
        }
    }
    
    public void setFuenteTexto(String cad){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setFuenteTexto(cad);
            }
        }
    }
    
    public void setEstiloTexto(int valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setEstiloTexto(valor);
            }
        }
    }
    
    public void setTamTexto(int valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setTamTexto(valor);
            }
        }
    }
    
    
    public void setGrosor(float valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setGrosor(valor);
            }
        }
    }
    
    public void setEstiloFinal(int valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setEstiloFinal(valor);
            }
        }
    }
    
    public void setEstiloUnion(int valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setEstiloUnion(valor);
            }
        }
    }
    
    public void setMiterLimit(float valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setMiterLimit(valor);
            }
        }
    }
    
    public void setPunteo(float punteo[]){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setPunteo(punteo);
            }
        }
    }
    
    public void setFasePunteo(float valor){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setFasePunteo(valor);
            }
        }
    }
    
    public void setColorTrazo(Color c){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setColorTrazo(c);
            }
        }
    }
    
    public void setColorRelleno(Color c){
        JInternalFrame[] ventanas=escritorio.getAllFrames();
        for(int i=0;i<ventanas.length;i++){
            if(ventanas[i] instanceof VentanaImagen){
                ((VentanaImagen)ventanas[i]).setColorRelleno(c);
            }
        }
    }
    
    public VentanaImagen getVentanaImagen(){
        return vi;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        nuevoItem = new javax.swing.JMenuItem();
        abrirItem = new javax.swing.JMenuItem();
        guardarItem = new javax.swing.JMenuItem();
        separadorItem = new javax.swing.JPopupMenu.Separator();
        salirItem = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        infoItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación Multiventana");
        setMinimumSize(new java.awt.Dimension(1200, 700));

        escritorio.setBackground(new java.awt.Color(204, 204, 255));
        escritorio.setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("Archivo");

        nuevoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionmultimedia/iconos/nuevo.png"))); // NOI18N
        nuevoItem.setText("Nuevo");
        nuevoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoItemActionPerformed(evt);
            }
        });
        menuArchivo.add(nuevoItem);

        abrirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionmultimedia/iconos/abrir.png"))); // NOI18N
        abrirItem.setText("Abrir");
        abrirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirItemActionPerformed(evt);
            }
        });
        menuArchivo.add(abrirItem);

        guardarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionmultimedia/iconos/guardar.png"))); // NOI18N
        guardarItem.setText("Guardar");
        guardarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarItemActionPerformed(evt);
            }
        });
        menuArchivo.add(guardarItem);
        menuArchivo.add(separadorItem);

        salirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacionmultimedia/iconos/salir.png"))); // NOI18N
        salirItem.setText("Salir");
        salirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirItemActionPerformed(evt);
            }
        });
        menuArchivo.add(salirItem);

        barraMenu.add(menuArchivo);

        menuVer.setText("Ver");
        barraMenu.add(menuVer);

        menuAyuda.setText("Ayuda");
        menuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaActionPerformed(evt);
            }
        });

        infoItem.setText("Acerca de..");
        infoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoItemActionPerformed(evt);
            }
        });
        menuAyuda.add(infoItem);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void nuevoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoItemActionPerformed
    vi=new VentanaImagen(this);
    this.escritorio.add(vi);
    vi.setTitle("Nuevo lienzo");
    vi.setVisible(true);
}//GEN-LAST:event_nuevoItemActionPerformed

private void abrirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirItemActionPerformed
    BufferedImage img;
    JFileChooser dlg=new JFileChooser();
    int resp=dlg.showOpenDialog(this);
    if(resp==JFileChooser.APPROVE_OPTION){
        try{
            File f=dlg.getSelectedFile();
            String nombre=f.getName();
            if(esImagen(nombre)){
               img=ImageIO.read(f);
               vi=new VentanaImagen(this);
               escritorio.add(vi);
               vi.getLienzoImagen().setImage(img);
               vi.setTitle(nombre);
               vi.setVisible(true);
            }
            else if(esSonido(nombre) || esVideo(nombre)){
               vRep=new VentanaSonidoVideo(this);
               escritorio.add(vRep);
               vRep.setTitle(nombre);
               vRep.setVisible(true);
               vRep.iniciaReproduccion(f.getAbsolutePath());
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error al abrir el archivo");
        }
    }
}//GEN-LAST:event_abrirItemActionPerformed

private void guardarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarItemActionPerformed
    if(viActiva!=null){
        BufferedImage img=(viActiva.getLienzoImagen()).getImageView();
        JFileChooser dlg=new JFileChooser();

        int resp=dlg.showSaveDialog(this);
        if(resp==JFileChooser.APPROVE_OPTION){
            try{
                File f=dlg.getSelectedFile();
                ImageIO.write(img,"jpg",f);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Error al guardar el archivo");
            }
        }
    }
}//GEN-LAST:event_guardarItemActionPerformed

private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
  System.exit(0);
}//GEN-LAST:event_salirItemActionPerformed

private void infoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoItemActionPerformed
    JOptionPane.showMessageDialog(this, "Israel Murillo Sánchez\nPráctica SM11/12\nVersión final");
}//GEN-LAST:event_infoItemActionPerformed

private void menuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAyudaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_menuAyudaActionPerformed

public LienzoImagen getPanelDibujo(){
    return vi.getPanelDibujo();
}

private boolean esImagen(String nombre){
    if(nombre.endsWith("jpg") || nombre.endsWith("JPG")){
        return true;
    }
    else if(nombre.endsWith("jpeg") || nombre.endsWith("JPEG")){
        return true;
    }
    else if(nombre.endsWith("gif") || nombre.endsWith("GIF")){
        return true;
    }
    else if(nombre.endsWith("png") || nombre.endsWith("PNG")){
        return true;
    }
    else{
        return false;
    }
}

private boolean esVideo(String nombre){
    if(nombre.endsWith("avi") || nombre.endsWith("AVI")){
        return true;
    }
    else if(nombre.endsWith("mov") || nombre.endsWith("MOV")){
        return true;
    }
    else if(nombre.endsWith("mpeg") || nombre.endsWith("MPEG")){
        return true;
    }
    else{
        return false;
    }
}

private boolean esSonido(String nombre){
    if(nombre.endsWith("mp3") || nombre.endsWith("MP3")){
        return true;
    }
    else if(nombre.endsWith("midi") || nombre.endsWith("MIDI")){
        return true;
    }
    else if(nombre.endsWith("mid") || nombre.endsWith("MID")){
        return true;
    }
    else if(nombre.endsWith("wav") || nombre.endsWith("WAV")){
        return true;
    }
    else if(nombre.endsWith("wave") || nombre.endsWith("WAVE")){
        return true;
    }
    else if(nombre.endsWith("aiff") || nombre.endsWith("AIFF")){
        return true;
    }
    else if(nombre.endsWith("au") || nombre.endsWith("AU")){
        return true;
    }
    else if(nombre.endsWith("rmf") || nombre.endsWith("RMF")){
        return true;
    }
    else{
        return false;
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirItem;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem guardarItem;
    private javax.swing.JMenuItem infoItem;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuVer;
    private javax.swing.JMenuItem nuevoItem;
    private javax.swing.JMenuItem salirItem;
    private javax.swing.JPopupMenu.Separator separadorItem;
    // End of variables declaration//GEN-END:variables
}
