

package Login;

import Conexion.Conexion;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class Sistema extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idcodigo;
  
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        Consultar();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        cbomarca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtdescuento = new javax.swing.JTextField();
        txtpromedio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rbsala = new javax.swing.JRadioButton();
        rbdormitorio = new javax.swing.JRadioButton();
        rbcocina = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnreporte = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VENTAS DECOHOGAR S.A", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Codigo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre Articulo");

        txtid.setEditable(false);
        txtid.setEnabled(false);

        date.setDateFormatString("yyyy/MM/dd");

        cbomarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:" }));
        cbomarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbomarcaMouseClicked(evt);
            }
        });
        cbomarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbomarcaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cantidad Articulo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Precio articulo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Descuento Articulo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Promedio de Venta");

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        txtpromedio.setEditable(false);
        txtpromedio.setEnabled(false);
        txtpromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpromedioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Fecha");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tipo Articulo");

        rbsala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbsala.setForeground(new java.awt.Color(0, 0, 0));
        rbsala.setText("Sala");
        rbsala.setToolTipText("");
        rbsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsalaActionPerformed(evt);
            }
        });

        rbdormitorio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbdormitorio.setForeground(new java.awt.Color(0, 0, 0));
        rbdormitorio.setText("Dormitorio");
        rbdormitorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdormitorioActionPerformed(evt);
            }
        });

        rbcocina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbcocina.setForeground(new java.awt.Color(0, 0, 0));
        rbcocina.setText("Cocina");
        rbcocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcocinaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Marca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel14)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbdormitorio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbcocina, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbsala, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cbomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(rbsala))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(rbcocina)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbdormitorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(204, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTROLADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        btnagregar.setBackground(new java.awt.Color(153, 153, 153));
        btnagregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(0, 0, 0));
        btnagregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\OneDrive\\Documentos\\NetBeansProjects\\CrudNotaX\\src\\main\\java\\Imagenes\\boton-agregar.png")); // NOI18N
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setBackground(new java.awt.Color(153, 153, 153));
        btnmodificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(0, 0, 0));
        btnmodificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\OneDrive\\Documentos\\NetBeansProjects\\CrudNotaX\\src\\main\\java\\Imagenes\\mejoramiento.png")); // NOI18N
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(153, 153, 153));
        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(0, 0, 0));
        btneliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\OneDrive\\Documentos\\NetBeansProjects\\CrudNotaX\\src\\main\\java\\Imagenes\\marca-x.png")); // NOI18N
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(153, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnlimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\OneDrive\\Documentos\\NetBeansProjects\\CrudNotaX\\src\\main\\java\\Imagenes\\limpieza-de-datos.png")); // NOI18N
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnreporte.setBackground(new java.awt.Color(153, 153, 153));
        btnreporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnreporte.setForeground(new java.awt.Color(0, 0, 0));
        btnreporte.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\OneDrive\\Documentos\\NetBeansProjects\\CrudNotaX\\src\\main\\java\\Imagenes\\consulta.png")); // NOI18N
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(153, 153, 153));
        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(0, 0, 0));
        btnsalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\OneDrive\\Documentos\\NetBeansProjects\\CrudNotaX\\src\\main\\java\\Imagenes\\cerrar-sesion.png")); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnagregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA DE DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Fecha", "Nombre Articulo", "Tipo Articulo", "Marca", "Cantidad Articulos", "Precio del Articulo", "Descuento Articulo", "Subtotal"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbomarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbomarcaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbomarcaMouseClicked

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        Agregar();
        Consultar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        Modificar();
        Consultar();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
         Eliminar();
         Consultar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
      
       Reporte();
    }//GEN-LAST:event_btnreporteActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
     
        int fila = Table.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila ");
        } else {
            if (SwingUtilities.isRightMouseButton(evt)) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    idcodigo = Integer.parseInt(Table.getValueAt(fila, 0).toString());
                }
            } else {
                String fecha = Table.getValueAt(fila, 1).toString();
                String nombre = Table.getValueAt(fila, 2).toString();
                String tipo = Table.getValueAt(fila, 3).toString();
                String marca = Table.getValueAt(fila, 4).toString();
                double cantidad = Double.parseDouble(Table.getValueAt(fila, 5).toString());
                double precio = Double.parseDouble(Table.getValueAt(fila, 6).toString());
                double descuento = Double.parseDouble(Table.getValueAt(fila, 7).toString());
                double total = Double.parseDouble(Table.getValueAt(fila, 8).toString());

                java.util.Date fecha2;
                try {
                    SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd");
                    fecha2 = sdfInput.parse(fecha);
                    date.setDate(fecha2);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Error al convertir la fecha: " + e.getMessage());
                }
                txtnombre.setText(nombre);

                if (tipo.equals("Sala")) {
                    rbsala.setSelected(true);
                    llenarComboBoxMarcas("Sala");
                } else if (tipo.equals("Dormitorio")) {
                    rbdormitorio.setSelected(true);
                    llenarComboBoxMarcas("Dormitorio");
                } else if (tipo.equals("Cocina")) {
                    rbcocina.setSelected(true);
                    llenarComboBoxMarcas("Cocina");
                }

                cbomarca.setSelectedItem(marca);

                txtcantidad.setText("" + cantidad);
                txtprecio.setText("" + precio);
                txtdescuento.setText("" + descuento);
                txtpromedio.setText("" + total);
            }
        }
    }//GEN-LAST:event_TableMouseClicked

    private void cbomarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbomarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbomarcaActionPerformed

    private void rbsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsalaActionPerformed
        // TODO add your handling code here:
        if (rbsala.isSelected()) {
            cbomarca.removeAllItems();
            cbomarca.addItem("Seleccione:");
            cbomarca.addItem("Kalimba");
            cbomarca.addItem("Gala");
            cbomarca.addItem("Linea Italiana");
            cbomarca.addItem("Blasco");
            cbomarca.addItem("Sancal");
            cbomarca.addItem("Treku");
        } else {
            cbomarca.removeAllItems();
        }

    }//GEN-LAST:event_rbsalaActionPerformed

    private void rbdormitorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdormitorioActionPerformed
        // TODO add your handling code here:
        if (rbdormitorio.isSelected()) {
            cbomarca.removeAllItems();
            cbomarca.addItem("Seleccione:");
            cbomarca.addItem("The Needo");
            cbomarca.addItem("Santa Living");
            cbomarca.addItem("dE.LENZO");
            cbomarca.addItem("Mango Home");
            cbomarca.addItem("Happyfriday");
            cbomarca.addItem("Comfivo");
        } else {
            cbomarca.removeAllItems();
        }
    }//GEN-LAST:event_rbdormitorioActionPerformed

    private void rbcocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcocinaActionPerformed
        // TODO add your handling code here:
        if (rbcocina.isSelected()) {
            cbomarca.removeAllItems();
            cbomarca.addItem("Seleccione:");
            cbomarca.addItem("Inoxibar");
            cbomarca.addItem("KitchedAid");
            cbomarca.addItem("Monix");
            cbomarca.addItem("Philips");
            cbomarca.addItem("Versa");
            cbomarca.addItem("Princess");
        } else {
            cbomarca.removeAllItems();
        }
    }//GEN-LAST:event_rbcocinaActionPerformed

    private void txtpromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpromedioActionPerformed

   public void Consultar() {
        String sql = "select * from ventas";
        try {
            conect = con.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] datos = new Object[10];
            modelo = (DefaultTableModel) Table.getModel();

            modelo.setRowCount(0);

            while (rs.next()) {
                datos[0] = rs.getInt("Id");
                datos[1] = rs.getDate("Fecha");
                datos[2] = rs.getString("Nombre");
                datos[3] = rs.getString("Tipo");
                datos[4] = rs.getString("Marca");
                datos[5] = rs.getDouble("Cantidad");
                datos[6] = rs.getDouble("Precio");
                datos[7] = rs.getDouble("Descuento");
                datos[8] = rs.getDouble("Subtotal");
                modelo.addRow(datos);
            }
            Table.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    void Agregar() {
        DecimalFormat df = new DecimalFormat("#.##");
        String nombre = txtnombre.getText();
        String tipo = "";
        String marca = "";
        Double cantidad = Double.parseDouble(txtcantidad.getText());
        Double precio = Double.parseDouble(txtprecio.getText());
        Double descuento = Double.parseDouble(txtdescuento.getText());
        String marcaSeleccionada = cbomarca.getSelectedItem().toString();
        String fecha = ((JTextField) date.getDateEditor().getUiComponent()).getText();

        if (rbsala.isSelected()) {
            tipo = "Sala";
            marca = marcaSeleccionada;
        } else if (rbdormitorio.isSelected()) {
            tipo = "Dormitorio";
            marca = marcaSeleccionada;
        } else if (rbcocina.isSelected()) {
            tipo = "Cocina";
            marca = marcaSeleccionada;
        }

        try {
            if (nombre.isEmpty() || tipo.isEmpty() || marca.isEmpty() || cantidad.isNaN() || precio.isNaN() || descuento.isNaN() || cbomarca.getSelectedItem().equals("Seleccione:")) {
                JOptionPane.showMessageDialog(null, "¡¡¡ Por favor, complete todos los campos !!!");
            } else {
                double subtotal = Double.parseDouble(df.format((cantidad * precio) - descuento));

                String sql = "INSERT INTO ventas(Fecha, Nombre, Tipo, Marca, Cantidad, Precio, Descuento, SubTotal) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = con.getConnection().prepareStatement(sql);
                statement.setString(1, fecha);
                statement.setString(2, nombre);
                statement.setString(3, tipo);
                statement.setString(4, marca);
                statement.setDouble(5, cantidad);
                statement.setDouble(6, precio);
                statement.setDouble(7, descuento);
                statement.setDouble(8, subtotal);
                statement.executeUpdate();

                JOptionPane.showMessageDialog(null, "¡¡¡ Los registros se ingresaron correctamente !!!");
                LimpiarTabla();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos para las notas.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar registros: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    void Eliminar() {
        int fila = Table.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "¡Seleccione una fila para eliminar!");
                return;
            }

            int idCodigo = Integer.parseInt(Table.getValueAt(fila, 0).toString());
            String sql = "DELETE FROM ventas WHERE Id = ?";

            PreparedStatement statement = con.getConnection().prepareStatement(sql);
            statement.setInt(1, idCodigo);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "¡Se eliminó correctamente el dato!");
            Limpiar();
            LimpiarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la fila: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    void Modificar() {
        try {
            int fila = Table.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para modificar");
                return;
            }

            int idCodigo = Integer.parseInt(Table.getValueAt(fila, 0).toString());
            String fecha = ((JTextField) date.getDateEditor().getUiComponent()).getText();
            String nombre = txtnombre.getText();
            String tipo = "";
            String marca = "";
            Double cantidad = Double.parseDouble(txtcantidad.getText());
            Double precio = Double.parseDouble(txtprecio.getText());
            Double descuento = Double.parseDouble(txtdescuento.getText());
            String marcaSeleccionada = cbomarca.getSelectedItem().toString();

            if (rbsala.isSelected()) {
                tipo = "Sala";
                marca = marcaSeleccionada;
            } else if (rbdormitorio.isSelected()) {
                tipo = "Dormitorio";
                marca = marcaSeleccionada;
            } else if (rbcocina.isSelected()) {
                tipo = "Cocina";
                marca = marcaSeleccionada;
            }

            if (nombre.isEmpty() || tipo.isEmpty() || marca.isEmpty() || cantidad.isNaN() || precio.isNaN() || descuento.isNaN() || cbomarca.getSelectedItem().equals("Seleccione:")) {
                JOptionPane.showMessageDialog(null, "¡¡¡ Por favor, complete todos los campos !!!");
                return;
            }

            double subtotal = cantidad * precio - descuento;

            String sql = "UPDATE ventas SET Fecha=?, Nombre=?, Tipo=?, Marca=?, Cantidad=?, Precio=?, Descuento=?, Subtotal=? WHERE Id=?";

            PreparedStatement statement = con.getConnection().prepareStatement(sql);
            statement.setString(1, fecha);
            statement.setString(2, nombre);
            statement.setString(3, tipo);
            statement.setString(4, marca);
            statement.setDouble(5, cantidad);
            statement.setDouble(6, precio);
            statement.setDouble(7, descuento);
            statement.setDouble(8, subtotal);
            statement.setInt(9, idCodigo);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡¡¡ Los registros se modificaron correctamente !!!");
            LimpiarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos para las notas.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los registros: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error desconocido: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void llenarComboBoxMarcas(String tipo) {
        cbomarca.removeAllItems();
        cbomarca.addItem("Seleccione:");

        if (tipo.equals("Sala")) {
            cbomarca.addItem("Kalimba");
            cbomarca.addItem("Gala");
            cbomarca.addItem("Linea Italiana");
            cbomarca.addItem("Blasco");
            cbomarca.addItem("Sancal");
            cbomarca.addItem("Treku");
        } else if (tipo.equals("Dormitorio")) {
            cbomarca.addItem("The Needo");
            cbomarca.addItem("Santa Living");
            cbomarca.addItem("dE.LENZO");
            cbomarca.addItem("Mango Home");
            cbomarca.addItem("Happyfriday");
            cbomarca.addItem("Comfivo");
        } else if (tipo.equals("Cocina")) {
            cbomarca.addItem("Inoxibar");
            cbomarca.addItem("KitchedAid");
            cbomarca.addItem("Monix");
            cbomarca.addItem("Philips");
            cbomarca.addItem("Versa");
            cbomarca.addItem("Princess");
        }
    }
    
    void Reporte() {

        String fechaAct = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            fechaAct = sdf.format(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }

        double sumaSubtotales = 0.0;
        try {
            String sqlSumaSubtotales = "SELECT SUM(SubTotal) AS Total FROM ventas";
            PreparedStatement statementSumaSubtotales = con.getConnection().prepareStatement(sqlSumaSubtotales);
            ResultSet resultSetSumaSubtotales = statementSumaSubtotales.executeQuery();
            if (resultSetSumaSubtotales.next()) {
                sumaSubtotales = resultSetSumaSubtotales.getDouble("Total");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la suma de subtotales: " + e.getMessage());
        }

        ArrayList<String> tiposArticulos = new ArrayList<>();
        try {
            String sqlTiposArticulos = "SELECT DISTINCT Tipo FROM ventas";
            PreparedStatement statementTiposArticulos = con.getConnection().prepareStatement(sqlTiposArticulos);
            ResultSet resultSetTiposArticulos = statementTiposArticulos.executeQuery();
            while (resultSetTiposArticulos.next()) {
                tiposArticulos.add(resultSetTiposArticulos.getString("Tipo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los tipos de artículos: " + e.getMessage());
        }

        int totalArticulosVendidos = 0;
        try {
            String sqlTotalArticulos = "SELECT SUM(Cantidad) AS Total FROM ventas";
            PreparedStatement statementTotalArticulos = con.getConnection().prepareStatement(sqlTotalArticulos);
            ResultSet resultSetTotalArticulos = statementTotalArticulos.executeQuery();
            if (resultSetTotalArticulos.next()) {
                totalArticulosVendidos = resultSetTotalArticulos.getInt("Total");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el total de artículos vendidos: " + e.getMessage());
        }

        String tipoMasVendido = "";
        try {
            String sqlTipoMasVendido = "SELECT Tipo FROM ventas GROUP BY Tipo ORDER BY SUM(Cantidad) DESC LIMIT 1";
            PreparedStatement statementTipoMasVendido = con.getConnection().prepareStatement(sqlTipoMasVendido);
            ResultSet resultSetTipoMasVendido = statementTipoMasVendido.executeQuery();
            if (resultSetTipoMasVendido.next()) {
                tipoMasVendido = resultSetTipoMasVendido.getString("Tipo");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el tipo de artículo más vendido: " + e.getMessage());
        }

        String tipoMenosVendido = "";
        try {
            String sqlTipoMenosVendido = "SELECT Tipo FROM ventas GROUP BY Tipo ORDER BY SUM(Cantidad) ASC LIMIT 1";
            PreparedStatement statementTipoMenosVendido = con.getConnection().prepareStatement(sqlTipoMenosVendido);
            ResultSet resultSetTipoMenosVendido = statementTipoMenosVendido.executeQuery();
            if (resultSetTipoMenosVendido.next()) {
                tipoMenosVendido = resultSetTipoMenosVendido.getString("Tipo");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el tipo de artículo menos vendido: " + e.getMessage());
        }

        String reporte = "Fecha y hora del Reporte: " + fechaAct + "\n";
        reporte += "Total de la Venta: " + sumaSubtotales + "\n";
        reporte += "Tipos de artículos vendidos: " + tiposArticulos.toString() + "\n";
        reporte += "Totalidad de artículos vendidos: " + totalArticulosVendidos + "\n";
        reporte += "Tipo de artículo Más vendido: " + tipoMasVendido + "\n";
        reporte += "Tipo de artículo Menos vendido: " + tipoMenosVendido + "\n";

        JOptionPane.showMessageDialog(null, reporte, "Reporte de Ventas", JOptionPane.INFORMATION_MESSAGE);
    }
    
    void LimpiarTabla() {
        int rowCount = modelo.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            modelo.removeRow(0);
        }
    }
    
    void Limpiar() {
        txtnombre.setText("");
        txtcantidad.setText("");
        txtprecio.setText("");
        txtdescuento.setText("");
        cbomarca.setSelectedIndex(0);
        date.setDate(null);
        rbsala.setSelected(false);
        rbdormitorio.setSelected(false);
        rbcocina.setSelected(false);
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnreporte;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbomarca;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbcocina;
    private javax.swing.JRadioButton rbdormitorio;
    private javax.swing.JRadioButton rbsala;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtpromedio;
    // End of variables declaration//GEN-END:variables
}
