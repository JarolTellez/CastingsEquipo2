/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JPanel;

/**
 *
 * @author Jarol
 */
public class BuscarCasting extends javax.swing.JPanel {

    /**
     * Creates new form BuscarCasting
     */
    public BuscarCasting() {
        initComponents();
    }

    
    public JPanel despliegaPanel()
    {
           this.setSize(1800, 700);// tamano del panel
        this.setLocation(5,5);// posicion dentro del panel principal
        
       return this;
    }

            /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setText("Código:");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel3.setText("Fecha contratación:");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));
        fondo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, -1));
        fondo.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 170, -1));
        fondo.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 190, -1));

        jLabel4.setText("código:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel5.setText("Nombre:");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel6.setText("Descripción:");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel7.setText("Fecha contratación:");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel8.setText("Coste:");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        jButton1.setText("Buscar");
        fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jLabel9.setText("Numero personas:");
        fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, 20));
        fondo.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 210, -1));
        fondo.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 210, -1));
        fondo.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 140, -1));
        fondo.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 210, -1));
        fondo.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 210, -1));
        fondo.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}