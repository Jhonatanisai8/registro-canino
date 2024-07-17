package com.mycompany.Peluqueria_Canina.Igu;

import java.awt.Color;

public class rellenarDatos extends javax.swing.JPanel {

    boolean isEdition = false;
    //  com.mycompany.models.Books bookEdition;

    public rellenarDatos() {
        initComponents();
        estilosIniciales();
    }

    /*public rellenarDatos(com.mycompany.models.Books book) {
        initComponents();
        isEdition = true;
        bookEdition = book;
        InitStyles();
    }*/
    private void estilosIniciales() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        txtNCliente.putClientProperty("JTextField.placeholderText", "Ingrese el Nº de Cliente");
        txtNombrePerro.putClientProperty("JTextField.placeholderText", "Ingrese el Nombre del Perro");
        txtRaza.putClientProperty("JTextField.placeholderText", "Ingrese la Raza del Perro");
        txtColor.putClientProperty("JTextField.placeholderText", "Ingrese el Color del Perro");
        txtNombreDueño.putClientProperty("JTextField.placeholderText", "Ingrese el Dueño del Perro");
        txtCelDueño.putClientProperty("JTextField.placeholderText", "Ingrese el Cel. del Dueño");
//        if (isEdition) {
//            title.setText("Editar Libro");
//            button.setText("Guardar");
//
//            if (bookEdition != null) {
//                titleTxt.setText(bookEdition.getTitle());
//                dateTxt.setText(bookEdition.getDate());
//                authorTxt.setText(bookEdition.getAuthor());
//                catTxt.setText(bookEdition.getCategory());
//                edTxt.setText(bookEdition.getEdit());
//                langTxt.setText(bookEdition.getLang());
//                pagsTxt.setText(bookEdition.getPages());
//                descTxt.setText(bookEdition.getDescription());
//                stockTxt.setText(bookEdition.getStock() + "");
//                dispTxt.setText(bookEdition.getAvailable() + "");
//                ejemTxt.setText(bookEdition.getEjemplares());
//            }
//        }
    }

    private void limpiarCampos() {
        String m = "";
        txtCelDueño.setText(m);
        txtColor.setText(m);
        txtNCliente.setText(m);
        txtNombrePerro.setText(m);
        txtRaza.setText(m);
        txtNombreDueño.setText(m);
        //para los combo box
        cbxAlergico.setSelectedIndex(0);
        cbxAtencionEspecial.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        txtNCliente = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        txtNombrePerro = new javax.swing.JTextField();
        authorLbl = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        catLbl = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        edLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        langLbl = new javax.swing.JLabel();
        pagsLbl = new javax.swing.JLabel();
        txtNombreDueño = new javax.swing.JTextField();
        descLbl = new javax.swing.JLabel();
        txtCelDueño = new javax.swing.JTextField();
        stockLbl = new javax.swing.JLabel();
        btnSubir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        cbxAlergico = new javax.swing.JComboBox<>();
        cbxAtencionEspecial = new javax.swing.JComboBox<>();
        btnSubir1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huella.png"))); // NOI18N
        title.setText("Registro De Datos:");

        titleLbl.setText("Cliente Nº");

        dateLbl.setText("Nombre");

        authorLbl.setText("Raza");

        catLbl.setText("Color");

        edLbl.setText("Alérgico");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        langLbl.setText("Atención Especial");

        pagsLbl.setText("Nombre Del Dueño");

        txtNombreDueño.setToolTipText("");

        descLbl.setText("Cel. Dueño");

        txtCelDueño.setToolTipText("");

        stockLbl.setText("Observaciones");
        stockLbl.setToolTipText("");

        btnSubir.setBackground(new java.awt.Color(18, 90, 173));
        btnSubir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSubir.setForeground(new java.awt.Color(255, 255, 255));
        btnSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar.png"))); // NOI18N
        btnSubir.setText("Subir");
        btnSubir.setBorderPainted(false);
        btnSubir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        cbxAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        cbxAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        btnSubir1.setBackground(new java.awt.Color(18, 90, 173));
        btnSubir1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSubir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSubir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/herramienta-de-borrador.png"))); // NOI18N
        btnSubir1.setText("Limpiar");
        btnSubir1.setBorderPainted(false);
        btnSubir1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSubir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColor)
                                    .addComponent(txtRaza)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(233, 233, 233))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(213, 213, 213))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(234, 234, 234))
                                    .addComponent(txtNCliente)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(161, 161, 161))
                                    .addComponent(txtNombrePerro)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(227, 227, 227)))
                                .addGap(68, 68, 68))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(cbxAlergico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(288, 288, 288)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(langLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(300, 300, 300))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(295, 295, 295))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(278, 278, 278))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addComponent(stockLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(319, 319, 319))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelDueño, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreDueño, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSubir1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(130, 130, 130))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(cbxAtencionEspecial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(344, 344, 344))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(493, 493, 493))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(langLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubir1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombrePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        /*        String mtitle = titleTxt.getText();
        String date = dateTxt.getText();
        String author = authorTxt.getText();
        String cat = catTxt.getText();
        String ed = edTxt.getText();
        String lang = langTxt.getText();
        String pags = pagsTxt.getText();
        String desc = descTxt.getText();
        String stock = stockTxt.getText();
        String disp = dispTxt.getText();
        String ejem = ejemTxt.getText();

        // Validaciones para los campos
        if (mtitle.isEmpty() || date.isEmpty() || author.isEmpty() || cat.isEmpty() || ed.isEmpty()
                || lang.isEmpty() || pags.isEmpty() || desc.isEmpty() || stock.isEmpty() || disp.isEmpty() || ejem.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            titleTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(stock) || !Utils.isNumeric(disp)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Stock y Disponibles deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            titleTxt.requestFocus();
            return;
        }

        com.mycompany.models.Books book = isEdition ? bookEdition : new com.mycompany.models.Books();
        book.setTitle(mtitle);
        book.setDate(date);
        book.setAuthor(author);
        book.setCategory(cat);
        book.setEdit(ed);
        book.setLang(lang);
        book.setPages(pags);
        book.setDescription(desc);
        book.setEjemplares(ejem);
        book.setStock(Integer.parseInt(stock));
        book.setAvailable(Integer.parseInt(disp));

        try {
            DAOBooks dao = new DAOBooksImpl();

            if (!isEdition) {
                dao.registrar(book);
            } else {
                dao.modificar(book);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Libro " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                titleTxt.setText("");
                dateTxt.setText("");
                authorTxt.setText("");
                catTxt.setText("");
                edTxt.setText("");
                langTxt.setText("");
                pagsTxt.setText("");
                descTxt.setText("");
                stockTxt.setText("");
                dispTxt.setText("");
                ejemTxt.setText("");
            }
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
         */
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnSubir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubir1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnSubir1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLbl;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnSubir;
    private javax.swing.JButton btnSubir1;
    private javax.swing.JLabel catLbl;
    private javax.swing.JComboBox<String> cbxAlergico;
    private javax.swing.JComboBox<String> cbxAtencionEspecial;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel descLbl;
    private javax.swing.JLabel edLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel langLbl;
    private javax.swing.JLabel pagsLbl;
    private javax.swing.JLabel stockLbl;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField txtCelDueño;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNCliente;
    private javax.swing.JTextField txtNombreDueño;
    private javax.swing.JTextField txtNombrePerro;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
