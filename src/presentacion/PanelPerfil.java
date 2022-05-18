/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import Interfaces.ILogica;
import static Interfaces.Implementacion.FabricaLogica.dameInstancia;
import ObjetoNegocio.Estado;
import ObjetoNegocio.Perfil;
import ObjetoNegocio.RangoAltura;
import ObjetoNegocio.RangoEdad;
import ObjetoNegocio.Casting;
import ObjetoNegocio.Cliente;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;
import static presentacion.FrmPrincipal.panelPrincipal;

/**
 *
 * @author Jarol
 */
public class PanelPerfil extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarPerfil
     */
    ILogica logica;
    ObjectId id;

    public PanelPerfil() {
        initComponents();
        logica = dameInstancia();
        llenarTabla();
        llenarComboBoxes();
    }

    public void desplegarPanel() {

        this.setSize(1090, 590);// tamano del panel
        this.setLocation(5, 5);// posicion dentro del panel principal
        llenarComboBoxes();

        panelPrincipal.removeAll();
        panelPrincipal.add(this, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();

    }

    public void recuperarDatos(String nombreCliente, String nombreAgente, String tipoCasting, ObjectId id) {

        Casting casting = logica.consultarCastingId(id);
        this.id = id;
        txtNombreCliente.setText(nombreCliente);
        txtNombreAgente.setText(nombreAgente);
        txtTipoCasting.setText(casting.getTipo());
        llenarTabla();
    }

    public void limpiarCampos() {
        txtNombreCliente.setText("");
        txtNombreAgente.setText("");
        txtSexo.setText("");
        txtColorPelo.setText("");
        txtColorOjos.setText("");
        cbbExperiencia.setSelectedIndex(-1);
        txtTipoCasting.setText("");
        grupoEspecialidad.clearSelection();
        cbbExperiencia.setSelectedIndex(-1);
        comboBoxEdad.setSelectedIndex(-1);
        comboBoxAltura.setSelectedIndex(-1);
        comboBoxEstado.setSelectedItem(-1);
    }

    public void llenarComboBoxes() {
        //ALTURA
        comboBoxAltura.removeAllItems();
        comboBoxAltura.setModel(new DefaultComboBoxModel(RangoAltura.values()));

        //EDAD
        comboBoxEdad.removeAllItems();
        comboBoxEdad.setModel(new DefaultComboBoxModel(RangoEdad.values()));

        //Estados
        comboBoxEstado.removeAllItems();
        comboBoxEstado.setModel(new DefaultComboBoxModel(Estado.values()));
    }

    public void llenarTabla() {
        List<Perfil> list = new ArrayList<>();
        if (id != null) {
            list = logica.consultarCastingPerfilesIdCasting(id);
        }

        //logica.consultarTodosPerfiles();
        DefaultTableModel model = (DefaultTableModel) tblPerfiles.getModel();

        int rowCount = model.getRowCount();

        for (int m = rowCount - 1; m >= 0; m--) {
            model.removeRow(m);
        }

        Object rowData[] = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getSexo();
            rowData[2] = list.get(i).getColorPelo();
            rowData[3] = list.get(i).getColorOjos();
            rowData[4] = list.get(i).isExperiencia();
            rowData[5] = list.get(i).getEstado();
            rowData[6] = list.get(i).getEspecialidad();
            rowData[7] = list.get(i).getRangoEdad();
            rowData[8] = list.get(i).getRangoAltura();

            model.addRow(rowData);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEspecialidad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtColorOjos = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtColorPelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbbExperiencia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboBoxEdad = new javax.swing.JComboBox<>();
        comboBoxAltura = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerfiles = new javax.swing.JTable();
        btnRegistrarPerfil = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        especialidadModelo = new javax.swing.JRadioButton();
        especialidadActor = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtNombreAgente = new javax.swing.JTextField();
        txtTipoCasting = new javax.swing.JTextField();
        comboBoxEstado = new javax.swing.JComboBox<>();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setText("Sexo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel4.setText("Color pelo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel5.setText("Color ojos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel6.setText("Requiere Experiencia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 40));

        txtColorOjos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorOjosKeyTyped(evt);
            }
        });
        jPanel1.add(txtColorOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, -1));

        txtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSexoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 190, -1));

        txtColorPelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorPeloKeyTyped(evt);
            }
        });
        jPanel1.add(txtColorPelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 190, -1));

        jLabel7.setText("Estado:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        cbbExperiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jPanel1.add(cbbExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, -1));

        jLabel8.setText("Especialidad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel9.setText("Rango edad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel10.setText("Rango altura:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        jPanel1.add(comboBoxEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 140, -1));
        jPanel1.add(comboBoxAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 140, -1));

        tblPerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sexo", "Color pelo", "Color Ojos", "Experiencia", "Estado", "Especialidad", "Rango edad", "Rango altura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerfiles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 710, 190));

        btnRegistrarPerfil.setText("Registrar");
        btnRegistrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        grupoEspecialidad.add(especialidadModelo);
        especialidadModelo.setText("Modelo");
        jPanel1.add(especialidadModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        grupoEspecialidad.add(especialidadActor);
        especialidadActor.setText("Actor");
        jPanel1.add(especialidadActor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Perfiles");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Datos Casting seleccionado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        jLabel13.setText("Nombre cliente:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        jLabel14.setText("Nombre agente:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        jLabel15.setText("TipoCasting");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 70, 20));

        txtNombreCliente.setEditable(false);
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 210, -1));

        txtNombreAgente.setEditable(false);
        jPanel1.add(txtNombreAgente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 210, -1));

        txtTipoCasting.setEditable(false);
        jPanel1.add(txtTipoCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 150, -1));

        jPanel1.add(comboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPerfilActionPerformed
        RegistrarPerfil();
    }//GEN-LAST:event_btnRegistrarPerfilActionPerformed

    private void txtSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyTyped
        soloTexto(evt);
    }//GEN-LAST:event_txtSexoKeyTyped

    private void txtColorPeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorPeloKeyTyped
          soloTexto(evt);
    }//GEN-LAST:event_txtColorPeloKeyTyped

    private void txtColorOjosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorOjosKeyTyped
        soloTexto(evt);
    }//GEN-LAST:event_txtColorOjosKeyTyped
         public void soloNumeros(java.awt.event.KeyEvent evt)
    {
         char car = evt.getKeyChar();
        if( Character.isDigit(car) ){

}else{
evt.consume();
getToolkit().beep();
}
    }
      
       public void soloTexto(java.awt.event.KeyEvent evt)
    {
         char car = evt.getKeyChar();
        if(Character.isLetter(car)|| car==' ' ){

}else{
evt.consume();
getToolkit().beep();
}
    }
       
     
    
    
    
    private void RegistrarPerfil() {
        String colorOjos = txtColorOjos.getText();
        String colorPelo = txtColorPelo.getText();
        String Sexo = txtSexo.getText();

        Boolean experiencia = null;
        if (cbbExperiencia.getSelectedItem().equals("Si")) {
            experiencia = true;
        } else {
            experiencia = false;
        }

        String altura = (String) comboBoxAltura.getSelectedItem().toString();
        String Estado = (String) comboBoxEstado.getSelectedItem().toString();
        String edad = (String) comboBoxEdad.getSelectedItem().toString();
        String especialidad = null;
        if (especialidadActor.isSelected()) {
            especialidad = especialidadActor.getText();
        } else if (especialidadModelo.isSelected()) {
            especialidad = especialidadModelo.getText();
        }

        Casting casting = logica.consultarCastingId(this.id);

        Perfil perfil = new Perfil(
                new ObjectId(),
                Estado,
                Sexo,
                colorPelo,
                colorOjos,
                experiencia,
                especialidad,
                edad,
                altura,
                casting.getId());

        casting.getPerfiles().add(perfil);

        Cliente cliente = logica.consultarClienteId(casting.getClienteId());
        List<Casting> castings = cliente.getCastings();
        for (Casting cas : castings) {
            if (cas.getId().equals(casting.getId())) {
                int i = castings.indexOf(cas);
                castings.set(i, casting);
            }
        }

        logica.guardarPerfilconIdDeCasting(perfil, this.id);

        mostrarMensajeExito(perfil);

    }

    public void mostrarMensajeExito(Perfil perfil) {
        JOptionPane.showMessageDialog(this, "Registrado con exito casting:" + perfil.getId().toString());
        llenarTabla();
        //llenarTabla((ArrayList<Casting>) logica.consularTodosCasting());
    }

    public void mostrarError(Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarPerfil;
    private javax.swing.JComboBox<Object> cbbExperiencia;
    private javax.swing.JComboBox<String> comboBoxAltura;
    private javax.swing.JComboBox<String> comboBoxEdad;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JRadioButton especialidadActor;
    private javax.swing.JRadioButton especialidadModelo;
    private javax.swing.ButtonGroup grupoEspecialidad;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerfiles;
    private javax.swing.JTextField txtColorOjos;
    private javax.swing.JTextField txtColorPelo;
    private javax.swing.JTextField txtNombreAgente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTipoCasting;
    // End of variables declaration//GEN-END:variables

}
