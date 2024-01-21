/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package PRESENTACION;

import DATOS.Conexion;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class Empleado extends javax.swing.JInternalFrame {
    Conexion cc=new Conexion();
    Connection conectando=cc.getConexion();
    /**
     * Creates new form Empleado
     */
    public Empleado() {
        this.setContentPane(new ImagenFondo());
        initComponents();
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnagregar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbempleados = new javax.swing.JTable();
        txtapellido = new javax.swing.JTextField();
        cboCargo = new javax.swing.JComboBox<>();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btnagregar.setBackground(new java.awt.Color(12, 192, 223));
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        txtnombre.setBorder(null);

        tbempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbempleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbempleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbempleados);

        txtapellido.setBorder(null);
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        cboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente de Tienda", "Vendedor Senior", "Vendedor Junior", "Recepcionista", "Técnico de Reparación", "Asistente de Ventas" }));
        cboCargo.setBorder(null);

        btnmodificar.setBackground(new java.awt.Color(12, 192, 223));
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(12, 192, 223));
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(12, 192, 223));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtapellido)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(cboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        InsertarEmpleado();
        mostrarDatos();
        Limpiar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        modificarEmpleado();
        mostrarDatos();
        Limpiar();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        eliminarEmpleado();
        mostrarDatos();
        Limpiar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void tbempleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbempleadosMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada=tbempleados.rowAtPoint(evt.getPoint());
        txtnombre.setText(tbempleados.getValueAt(filaSeleccionada,1).toString());
        txtapellido.setText(tbempleados.getValueAt(filaSeleccionada,2).toString());
        cboCargo.setSelectedItem(tbempleados.getValueAt(filaSeleccionada, 3));

        
        
    }//GEN-LAST:event_tbempleadosMouseClicked

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed
 public void InsertarEmpleado(){
      // Validar que todos los campos estén completos
        if (txtnombre.getText().isEmpty() || txtapellido.getText().isEmpty() || 
            cboCargo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos antes de agregar un empleado.");
            return; // No continuar con la inserción si falta información
        }
        //Transacción
        try{
            PreparedStatement pst=conectando.prepareStatement("insert into empleado values(?,?,?)");
            pst.setString(1, txtnombre.getText());
            pst.setString(2, txtapellido.getText());
            pst.setString(3, cboCargo.getSelectedItem().toString());
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public void Limpiar(){
        txtnombre.setText("");
        txtapellido.setText("");
        cboCargo.setSelectedItem(null);

        
    }
     public void mostrarDatos(){
        String[] titulos={"Codigo","Nombre","Apellido","Cargo"};
        String[] registros=new String[4];
        
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        //TRANSACCION
        try{
            Statement st=conectando.createStatement();
            ResultSet resultado=st.executeQuery("select * from empleado");
            
            while(resultado.next()){
                registros[0]=resultado.getString("id_empleado");
                registros[1]=resultado.getString("nombre");
                registros[2]=resultado.getString("apellido");
                registros[3]=resultado.getString("cargo");
                
                
                modelo.addRow(registros);
                
            }
            tbempleados.setModel(modelo);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
     public void modificarEmpleado(){
     // transaccion
     try {
         int filaSeleccionada = tbempleados.getSelectedRow();
         String dao = (String)tbempleados.getValueAt(filaSeleccionada, 0).toString();
         PreparedStatement pst = conectando.prepareStatement("update empleado set nombre=?,"
                 + "apellido=?, cargo=? where id_empleado=?");
            pst.setString(1, txtnombre.getText());
            pst.setString(2, txtapellido.getText());
            int seleccion= cboCargo.getSelectedIndex();
            pst.setString(3, cboCargo.getItemAt(seleccion));
            pst.setString(4, dao);
            pst.execute();
         JOptionPane.showMessageDialog(null, "Se modifico correctamente");
     } catch  (SQLException ex){
         JOptionPane.showMessageDialog(null,ex.toString());

     
     }
 }
     public void eliminarEmpleado(){
     int filaSeleccionada = tbempleados.getSelectedRow();
     try{
         String SQL="delete from empleado where id_empleado="+tbempleados.getValueAt(filaSeleccionada,0);
         Statement st = conectando.createStatement();
         int n = st.executeUpdate(SQL);
         if(n>0){
             JOptionPane.showMessageDialog(null, "Empleado Despedido");
         }
     }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex.toString());
         
     }
 } 
     public class ImagenFondo extends JPanel{
        @Override
        public void paint(Graphics g){
            ImageIcon imagen=new ImageIcon(getClass().getResource("/IMG/empleados.png"));
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbempleados;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}