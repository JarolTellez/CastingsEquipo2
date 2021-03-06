/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import Interfaces.ILogica;
import static Interfaces.Implementacion.FabricaLogica.dameInstancia;
import ObjetoNegocio.Agente;
import ObjetoNegocio.Casting;
import ObjetoNegocio.Cliente;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;
import static presentacion.FrmPrincipal.panelPrincipal;

/**
 *
 * @author Jarol
 */
public class PanelTablaCasting extends javax.swing.JPanel {

    PanelPerfil perfil = new PanelPerfil();
    ILogica logica;
    String nombreCliente = null, nombreAgente = null, tipoCasting = null;
    ObjectId idCasting;

    /**
     * Creates new form TablaCastings
     */
    public PanelTablaCasting() {
        initComponents();
        this.idCasting = null;
        logica = dameInstancia();
        llenarTabla((ArrayList<Casting>) logica.consularTodosCasting());
    }

    public JPanel desplegarPanel() {
        this.idCasting = null;
        this.setSize(1090, 590);// tamano del panel
        this.setLocation(5, 5);// posicion dentro del panel principal
        llenarTabla((ArrayList<Casting>) logica.consularTodosCasting());
        mostrarListas();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCastings = new javax.swing.JTable();
        btnRegistrarPerfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboBoxClientes = new javax.swing.JComboBox<Object>();
        jLabel2 = new javax.swing.JLabel();

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tblCastings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripci??n", "Fecha contrataci??n", "Coste", "Tipo casting", " Numero personas", "Cliente", "Agente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCastings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCastingsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCastings);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 930, 320));

        btnRegistrarPerfil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarPerfil.setText("Registrar Perfil");
        btnRegistrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPerfilActionPerformed(evt);
            }
        });
        fondo.add(btnRegistrarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 140, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Castings");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        comboBoxClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxClientesItemStateChanged(evt);
            }
        });
        fondo.add(comboBoxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, 30));

        jLabel2.setText("Cliente:");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPerfilActionPerformed

        if (this.idCasting != null) {
            try {
//            casting.verificaDatos(nombreCliente, nombreAgente, tipoCasting);
                perfil.desplegarPanel();
                perfil.recuperarDatos(nombreCliente, nombreAgente, tipoCasting, idCasting);

            } catch (RuntimeException ex) {
                mostrarError(ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un casting al que asignarle un perfil", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarPerfilActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tblCastingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCastingsMouseClicked

        DefaultTableModel model = (DefaultTableModel) tblCastings.getModel();
        idCasting = (ObjectId) model.getValueAt(tblCastings.getSelectedRow(), 0);
        nombreCliente = model.getValueAt(tblCastings.getSelectedRow(), 7).toString();
        nombreAgente = model.getValueAt(tblCastings.getSelectedRow(), 8).toString();
        tipoCasting = model.getValueAt(tblCastings.getSelectedRow(), 6).toString();

    }//GEN-LAST:event_tblCastingsMouseClicked

    private void comboBoxClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxClientesItemStateChanged
        CambiarListaSegunClienteSeleccionadoEnElPanel();
    }//GEN-LAST:event_comboBoxClientesItemStateChanged

    private void CambiarListaSegunClienteSeleccionadoEnElPanel() {
        Object SelectedObject = comboBoxClientes.getSelectedItem();
        if (SelectedObject != null) {
            if (SelectedObject.getClass() == String.class) {
                llenarTabla((ArrayList<Casting>) logica.consularTodosCasting());
                return;
            }
        }//Muevele cuando lleges te ando viendo
        
        Cliente cliente = (Cliente) SelectedObject;
        if (cliente != null) {

            List<Casting> castings = logica.consultarCastingCliente(cliente.getId());
            llenarTabla(castings);
        }
    }

    public void mostrarError(Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarListas() {

        List<Cliente> clientes = logica.consultarTodosClientes();

        comboBoxClientes.removeAllItems();
        for (int i = 0; i < clientes.size(); i++) {
            comboBoxClientes.addItem(logica.consultarTodosClientes().get(i));

        }
        comboBoxClientes.addItem("Todos");
        ArrayList<Casting> castings = (ArrayList<Casting>) logica.consularTodosCasting();
        llenarTabla(castings);

    }

    public void llenarTabla(List<Casting> lista) {

        List<Casting> list = lista;
        DefaultTableModel model = (DefaultTableModel) tblCastings.getModel();

        int rowCount = model.getRowCount();

        for (int m = rowCount - 1; m >= 0; m--) {
            model.removeRow(m);
        }

        Object rowData[] = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            Casting casting = (Casting) list.get(i);
            Cliente cliente = logica.consultarPorID(casting.getClienteId());
            if (casting.getTipo().equals("Presencial")) {
                Casting presencial = (Casting) list.get(i);
                rowData[0] = presencial.getId();
                rowData[1] = presencial.getNombre();
                rowData[2] = presencial.getDescripcion();
                rowData[3] = presencial.getFecha_contratacion();
                rowData[4] = presencial.getCoste();
                rowData[5] = presencial.getTipo();
                rowData[6] = presencial.getNumPersonas();
                rowData[7] = cliente.getNombre();
                rowData[8] = presencial.getAgente().getNombre();

                model.addRow(rowData);

            } else {
                Casting online = (Casting) list.get(i);
                rowData[0] = online.getId();
                rowData[1] = online.getNombre();
                rowData[2] = online.getDescripcion();
                rowData[3] = online.getFecha_contratacion();
                rowData[4] = online.getCoste();
                rowData[5] = online.getTipo();
                rowData[6] = "";
                rowData[7] = cliente.getNombre();
                rowData[8] = "";
                model.addRow(rowData);
            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarPerfil;
    private javax.swing.JComboBox<Object> comboBoxClientes;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCastings;
    // End of variables declaration//GEN-END:variables
}
