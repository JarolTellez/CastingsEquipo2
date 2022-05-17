/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import Interfaces.ILogica;
import static Interfaces.Implementacion.FabricaLogica.dameInstancia;
import ObjetoNegocio.*;
import java.awt.BorderLayout;
import java.awt.MenuComponent;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static presentacion.FrmPrincipal.panelPrincipal;

/**
 *
 * @author Jarol
 */
public class PanelCasting extends javax.swing.JPanel { 
  SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 DecimalFormat formatoD = new DecimalFormat("#.00");
 List<Fase>fasesAgregadas;
 
 Fase fase= new Fase();

     
    /**
     * Creates new form RegistrarCasting
     */
       ILogica logica;
    public PanelCasting() {
        initComponents();
           logica=dameInstancia();
           datePickerFecha.setDateToToday();
    }
    
    public JPanel despliegaPanel()
    {
      
      this.setSize(1800, 700);// tamano del panel
        this.setLocation(5,5);// posicion dentro del panel principal
    mostrarListas();
     llenarTabla();
       
       
       return this;
    }
    
    
    public void mostrarListas()
    {
        comboBoxClientes.removeAllItems();
         for(int i=0; i< logica.consultarTodosClientes().size();i++)
        {
               comboBoxClientes.addItem(logica.consultarTodosClientes().get(i).getNombre());
        }
        
         
    }
 
    
    public int muestraPregunta()
    {
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        return resp;
    }
    
    
      public void llenarTabla()
    {
          List<Casting> list=logica.consultarTodosCasting();
        DefaultTableModel model= (DefaultTableModel) tblCastings.getModel();
 
        int rowCount = model.getRowCount();
        
        for(int m=rowCount-1;m>=0;m--)
        {
           model.removeRow(m);
        }
        
        Object rowData[]=new Object[7];
        for(int i=0; i<list.size();i++){
            rowData[0]=list.get(i).getId();
            rowData[1]=list.get(i).getNombre();
            rowData[2]=list.get(i).getDescripcion();
            rowData[3]=list.get(i).getFecha_contratacion();
             rowData[4]=list.get(i).getCoste();
              rowData[5]=list.get(i).getTipo();
               rowData[6]=list.get(i).getCliente();
            model.addRow(rowData);
        }
        
        }
      
      /**
       * Obtiene las fases del comboBox para mandarlas al momento de agregar
       * @throws ParseException 
       */
      public void obtenerFases() throws ParseException
      {    
                fasesAgregadas= new ArrayList();
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd"); 
          if(comboBoxFases!=null)
          {
    
      
          for(int i=0;i<comboBoxFases.countComponents();i++)
          { 
            
              fasesAgregadas.add(new Fase(date.parse(comboBoxFases.getItemAt(i))));
          }
          }
      }

    
    
         public void mostrarError(RuntimeException ex)
    {
       
        JOptionPane.showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
       
        
    }
    
    /**
     * Muestra mensaje de exito y busca el cliente para obtener el id con el que se registro para mostrarlo en el mensaje
     * @param cliente 
     */
     public void mostrarMensajeExito(Casting casting)
    {
  
        JOptionPane.showMessageDialog(this, "Registrado con exito Cliente:" );
       
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxClientes = new javax.swing.JComboBox<>();
        comboBoxAgentes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tipoPresencial = new javax.swing.JRadioButton();
        tipoEnLinea = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarFase = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        comboBoxFases = new javax.swing.JComboBox<>();
        btnEliminarFase = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCastings = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtCoste = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnRegistrarCasting = new javax.swing.JButton();
        datePickerFecha = new com.github.lgooddatepicker.components.DatePicker();
        jLabel10 = new javax.swing.JLabel();
        txtNumeroPersonas = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        fondo.setMinimumSize(new java.awt.Dimension(1050, 512));
        fondo.setPreferredSize(new java.awt.Dimension(1090, 590));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cliente:");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel2.setText("Agente:");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, 20));
        fondo.add(comboBoxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, -1));

        comboBoxAgentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fondo.add(comboBoxAgentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jLabel3.setText("Tipo de Casting:");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        grupo1.add(tipoPresencial);
        tipoPresencial.setText("Presencial");
        tipoPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPresencialActionPerformed(evt);
            }
        });
        fondo.add(tipoPresencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        grupo1.add(tipoEnLinea);
        tipoEnLinea.setText("En linea");
        fondo.add(tipoEnLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel4.setText("Nombre:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel5.setText("Descripción:");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 20));

        jLabel6.setText("Coste:");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Fases");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabel8.setText("Fecha fase:");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        btnAgregarFase.setText("Agregar");
        btnAgregarFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFaseActionPerformed(evt);
            }
        });
        fondo.add(btnAgregarFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jLabel9.setText("Fases agregadas:");
        fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        comboBoxFases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFasesActionPerformed(evt);
            }
        });
        fondo.add(comboBoxFases, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 160, -1));

        btnEliminarFase.setText("Eliminar");
        btnEliminarFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFaseActionPerformed(evt);
            }
        });
        fondo.add(btnEliminarFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(453, 404));

        tblCastings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción", "Fecha", "Coste", "Tipo", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCastings);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 660, 330));
        fondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 200, -1));
        fondo.add(txtCoste, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 170, 60));

        btnRegistrarCasting.setText("Registrar Casting");
        btnRegistrarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCastingActionPerformed(evt);
            }
        });
        fondo.add(btnRegistrarCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 140, 40));
        fondo.add(datePickerFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        jLabel10.setText("Num Personas:");
        fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        fondo.add(txtNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 90, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCastingActionPerformed
 String tipo=null;

    List<Perfil> p= new ArrayList();
     List<Candidato> c= new ArrayList();
     Agente agente= new Agente("RDGD","JHF","JAROL","HFHF");
    
        

    if(tipoEnLinea.isSelected())
    {
        tipo=tipoEnLinea.getText();
        Online castingOnline= new Online();
        
         try
         {
             castingOnline.setTipo(tipo);
         castingOnline.setCandidatos(c);
         castingOnline.setCliente(logica.consultarPorNombre(comboBoxClientes.getSelectedItem().toString()));
         castingOnline.setCoste(Float.parseFloat(txtCoste.getText()));
         castingOnline.setDescripcion(txtDescripcion.getText());
         castingOnline.setFecha_contratacion(new Date());
         castingOnline.setNombre(txtNombre.getText());
         castingOnline.setPerfiles(p);
         
         castingOnline.validarDatos(castingOnline);
         logica.guardarCasting(castingOnline);
         }catch(RuntimeException e)
         {
             mostrarError(e);
         } 
        
    }else if(tipoPresencial.isSelected())
    {
      Presencial  castingPresencial= new Presencial();
      
   
      try {
          obtenerFases();
      } catch (ParseException ex) {
          Logger.getLogger(PanelCasting.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        tipo=tipoPresencial.getText();
        castingPresencial.setNumPersonas( Integer.parseInt( txtNumeroPersonas.getText()));
           try
         {
         castingPresencial.setTipo(tipo);
         castingPresencial.setCandidatos(c);
         castingPresencial.setCliente(logica.consultarPorNombre(comboBoxClientes.getSelectedItem().toString()));
         castingPresencial.setCoste(Float.parseFloat(txtCoste.getText()));
         castingPresencial.setDescripcion(txtDescripcion.getText());
         castingPresencial.setFase(fasesAgregadas);
         castingPresencial.setFecha_contratacion(new Date());
         castingPresencial.setNombre(txtNombre.getText());
         castingPresencial.setPerfiles(p);
         castingPresencial.setAgente(agente);
         castingPresencial.setNumPersonas(Integer.parseInt(txtNumeroPersonas.getText()));

         
         castingPresencial.validarDatos(castingPresencial);
         logica.guardarCasting(castingPresencial);
         llenarTabla();
         limpiarCampos();
         }catch(RuntimeException e)
         {
             mostrarError(e);
         } 
          
    }
    
    }//GEN-LAST:event_btnRegistrarCastingActionPerformed

    private void comboBoxFasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFasesActionPerformed

    private void tipoPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPresencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoPresencialActionPerformed

    private void btnAgregarFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFaseActionPerformed
   
        
        try
        {
       //     fasesAgregadas= new ArrayList();
      
        String  fech = datePickerFecha.getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date  f = null;
      try {
          f = date.parse(fech);
   
     
          // para verificar que la fecha no sea menor a la actual
  
          fase.verificaDatos(f);
     
          fase.setFechaInicio(f);
          fase.setPruebaIndividual(new PruebaIndividual());
          comboBoxFases.addItem(fech);
        //  fasesAgregadas.add(fase);
       
         // mostrarListaFases();
      } catch (ParseException ex) {
          Logger.getLogger(PanelCasting.class.getName()).log(Level.SEVERE, null, ex);
      }
        }catch(RuntimeException ex)
        {
            mostrarError(ex);
        }
  
        
    }//GEN-LAST:event_btnAgregarFaseActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         
     limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    public void limpiarCampos()
    {
          txtNombre.setText("");
        txtCoste.setText("");
        txtDescripcion.setText("");
        txtNumeroPersonas.setText("");
        grupo1.clearSelection();
        datePickerFecha.setDateToToday();
        comboBoxFases.removeAllItems();
    }
    private void btnEliminarFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFaseActionPerformed
        if(muestraPregunta()==0)
        {
          
            comboBoxFases.removeItem(comboBoxFases.getSelectedItem());
            
        }
        
        
    }//GEN-LAST:event_btnEliminarFaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFase;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarFase;
    private javax.swing.JButton btnRegistrarCasting;
    private javax.swing.JComboBox<String> comboBoxAgentes;
    private javax.swing.JComboBox<String> comboBoxClientes;
    private javax.swing.JComboBox<String> comboBoxFases;
    private com.github.lgooddatepicker.components.DatePicker datePickerFecha;
    private javax.swing.JPanel fondo;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCastings;
    private javax.swing.JRadioButton tipoEnLinea;
    private javax.swing.JRadioButton tipoPresencial;
    private javax.swing.JTextField txtCoste;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroPersonas;
    // End of variables declaration//GEN-END:variables
}
