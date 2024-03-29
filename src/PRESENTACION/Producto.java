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
public class Producto extends javax.swing.JInternalFrame {
    Conexion cc = new Conexion();
    Connection conectando = cc.getConexion();
    /**
     * Creates new form Celulares
     */
    public Producto() {
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

        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcelulares = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtstock = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        txtmarca.setBorder(null);
        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });

        txtmodelo.setBorder(null);

        txtprecio.setBorder(null);

        txtnombre.setBorder(null);
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        tbcelulares.setModel(new javax.swing.table.DefaultTableModel(
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
        tbcelulares.setGridColor(new java.awt.Color(177, 201, 248));
        tbcelulares.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tbcelulares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcelularesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcelulares);

        btnagregar.setBackground(new java.awt.Color(12, 192, 223));
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setBackground(new java.awt.Color(12, 192, 223));
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(12, 192, 223));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(12, 192, 223));
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txtstock.setBorder(null);

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        txtdescripcion.setBorder(null);
        jScrollPane2.setViewportView(txtdescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmodelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtprecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        AgregarCelular();
        mostrarDatos();
        Limpiar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        modificarCelular();
        Limpiar();
        mostrarDatos();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        eliminarCelular();
        mostrarDatos();
        Limpiar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tbcelularesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcelularesMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada=tbcelulares.rowAtPoint(evt.getPoint());
        
        txtnombre.setText(tbcelulares.getValueAt(filaSeleccionada,1).toString());
        txtmarca.setText(tbcelulares.getValueAt(filaSeleccionada,2).toString());
        txtmodelo.setText(tbcelulares.getValueAt(filaSeleccionada,3).toString());
        txtprecio.setText(tbcelulares.getValueAt(filaSeleccionada,4).toString());
        txtdescripcion.setText(tbcelulares.getValueAt(filaSeleccionada,5).toString());
        txtstock.setText(tbcelulares.getValueAt(filaSeleccionada, 6).toString());
        
    }//GEN-LAST:event_tbcelularesMouseClicked

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed
        public void AgregarCelular(){
            // Validar que todos los campos estén completos
        if (txtnombre.getText().isEmpty() || txtmarca.getText().isEmpty() || 
            txtmodelo.getText().isEmpty() ||
                txtdescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos antes de agregar un nuevo celular.");
            return; // No continuar con la inserción si falta información
        }
        //Transacción
        try{
            PreparedStatement pst=conectando.prepareStatement("insert into Producto values(?,?,?,?,?,?)");
        
            pst.setString(1, txtnombre.getText());
            pst.setString(2, txtmarca.getText());
            pst.setString(3, txtmodelo.getText());
            pst.setDouble(4, Double.parseDouble(txtprecio.getText()));
            pst.setString(5, txtdescripcion.getText());
            pst.setInt(6,Integer.parseInt(txtstock.getText()));
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
        public void Limpiar(){
        txtnombre.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtprecio.setText("");
        txtdescripcion.setText("");
        txtstock.setText("");
        
    }
        public void mostrarDatos(){
        String[] titulos={"Id", "Nombre","Marca","Modelo","Precio","Descripcion","Stock"};
        String[] registros=new String[7];
        
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        //TRANSACCION
        try{
            Statement st=conectando.createStatement();
            ResultSet resultado=st.executeQuery("select * from Producto");
            
            while(resultado.next()){
                registros[0]=resultado.getString("id_producto");
                registros[1]=resultado.getString("nombre");
                registros[2]=resultado.getString("marca");
                registros[3]=resultado.getString("modelo");
                registros[4]=resultado.getString("precio");
                registros[5]=resultado.getString("descripcion");
                registros[6]=resultado.getString("stock");
                
                modelo.addRow(registros);
                
            }
            tbcelulares.setModel(modelo);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
        public void modificarCelular(){
     // transaccion
     try {
         int filaSeleccionada = tbcelulares.getSelectedRow();
         String dao = (String)tbcelulares.getValueAt(filaSeleccionada, 0).toString();
         PreparedStatement pst = conectando.prepareStatement("update Producto set nombre=?,"
                 + "marca=?, modelo=?,precio=? , descripcion=?, stock=? where id_producto=?");
            pst.setString(1, txtnombre.getText());
            pst.setString(2, txtmarca.getText());
            pst.setString(3, txtmodelo.getText());
            pst.setDouble(4, Double.parseDouble(txtprecio.getText()));
            pst.setString(5, txtdescripcion.getText());
            pst.setInt(6,Integer.parseInt(txtstock.getText()));
            pst.setString(7, dao);
            pst.execute();
         JOptionPane.showMessageDialog(null, "Se modifico correctamente");
     } catch  (SQLException ex){
         JOptionPane.showMessageDialog(null,ex.toString());

     
     }
 }
         public void eliminarCelular(){
     int filaSeleccionada = tbcelulares.getSelectedRow();
     try{
         String SQL="delete from Producto where id_producto="+tbcelulares.getValueAt(filaSeleccionada,0);
         Statement st = conectando.createStatement();
         int n = st.executeUpdate(SQL);
         if(n>0){
             JOptionPane.showMessageDialog(null, "Producto eliminado");
         }
     }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex.toString());
         
     }
 } 
         public class ImagenFondo extends JPanel{
        @Override
        public void paint(Graphics g){
            ImageIcon imagen=new ImageIcon(getClass().getResource("/IMG/productos.png"));
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbcelulares;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
