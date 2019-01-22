/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.sistema.listagem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rplorcamento.conexao.rplorcamentoConexao;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoTelaListaMateriais extends javax.swing.JFrame {

    /**
     * Creates new form rplorcamentoTelaListaCliente
     */
    public rplorcamentoTelaListaMateriais() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_descricao_materiais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jText_comprador_materiais = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jText_cod_prod_fornecedor_materiais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JCbx_cod_materiais = new javax.swing.JTextField();
        jText_fornecedor_materiais = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de Materiais");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("RELATÓRIO DE IMPRESSÃO");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pesquise por:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descrição");

        jText_descricao_materiais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_descricao_materiaisKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Comprador");

        jText_comprador_materiais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_comprador_materiaisKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cód. Prd. For.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Código:");

        jText_cod_prod_fornecedor_materiais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_cod_prod_fornecedor_materiaisKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Fornecedor:");

        JCbx_cod_materiais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JCbx_cod_materiaisKeyPressed(evt);
            }
        });

        jText_fornecedor_materiais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_fornecedor_materiaisKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JCbx_cod_materiais))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jText_descricao_materiais)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jText_comprador_materiais)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_cod_prod_fornecedor_materiais))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jText_fornecedor_materiais)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_descricao_materiais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_comprador_materiais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_cod_prod_fornecedor_materiais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCbx_cod_materiais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_fornecedor_materiais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Nome", "Chegada", "Unid. Medida", "QTD.", "VL. UNIT.", "VL. Total", "VL. DESC.", "VL. IMP", "VL. Final", "VL. Venda", "Fornecedor", "COD. PROD. FOR.", "Nº. NF", "VENC. NF", "Saida PROD.", "VENC. PROD.", "Comprador", "Entregador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu13.setText("Arquivo");

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem31.setText("Fechar Tela");
        jMenu13.add(jMenuItem31);

        jMenuBar7.add(jMenu13);

        jMenu14.setText("Editor");

        jMenuItem32.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem32.setText("Salvar");
        jMenu14.add(jMenuItem32);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem33.setText("Atualizar");
        jMenu14.add(jMenuItem33);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem34.setText("Excluir");
        jMenu14.add(jMenuItem34);

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem35.setText("Listar");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem35);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem36.setText("Imprimir");
        jMenu14.add(jMenuItem36);

        jMenuItem37.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem37.setText("Atualizar Tela");
        jMenu14.add(jMenuItem37);

        jMenuBar7.add(jMenu14);

        jMenu15.setText("Ajuda");

        jMenuItem38.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem38.setText("Contato do desenvolvedor");
        jMenu15.add(jMenuItem38);

        jMenuBar7.add(jMenu15);

        setJMenuBar(jMenuBar7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        CarregarTela();

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void JCbx_cod_materiaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCbx_cod_materiaisKeyPressed

        ExibirCodigoMateriais();

// TODO add your handling code here:
    }//GEN-LAST:event_JCbx_cod_materiaisKeyPressed

    private void jText_descricao_materiaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_descricao_materiaisKeyPressed

        ExibirDescricaoMateriais();

// TODO add your handling code here:
    }//GEN-LAST:event_jText_descricao_materiaisKeyPressed

    private void jText_comprador_materiaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_comprador_materiaisKeyPressed

        ExibirCompradorMateriais();

// TODO add your handling code here:
    }//GEN-LAST:event_jText_comprador_materiaisKeyPressed

    private void jText_cod_prod_fornecedor_materiaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_cod_prod_fornecedor_materiaisKeyPressed

        ExibirCodProdForMateriais();

// TODO add your handling code here:
    }//GEN-LAST:event_jText_cod_prod_fornecedor_materiaisKeyPressed

    private void jText_fornecedor_materiaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_fornecedor_materiaisKeyPressed

        ExibirFornecedorMateriais();

// TODO add your handling code here:
    }//GEN-LAST:event_jText_fornecedor_materiaisKeyPressed

    public void CarregarTela() {
        try {
            Connection conn = rplorcamentoConexao.GeraConexao();

            String sql = "SELECT * FROM bd_rplorcamento.materiais";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {

//                    String dataFormatada_ = format_.format(rs.getString("nascimento"));
                modelo.addRow(
                        new Object[]{
                            rs.getString("id"),//codigo
                            rs.getString("descricao"),//descrição
                            rs.getString("nome_abreviado"),//nome
                            format_.format(rs.getDate("chegada")),//chegada
                            rs.getString("unid_medida"),//unidade de medida
                            rs.getString("quantidade"),//quantidade
                            rs.getString("vl_unitario"),//vl unitario
                            rs.getString("vl_total"),//vl total
                            rs.getString("vl_desconto"),//vl desconto
                            rs.getString("vl_imposto"),//vl impostos
                            rs.getString("vl_final"),//vl final
                            rs.getString("vl_venda"),//vl venda
                            rs.getString("fornecedor"),//fornecedor
                            rs.getString("cod_produto_fornecedor"),//cod produto fornecedor
                            rs.getString("numero_NF"),//numero NF
                            format_.format(rs.getDate("vencimento_NF")),//vencimento NF
                            format_.format(rs.getDate("saida_prod")),//saida do produto
                            format_.format(rs.getDate("vencimento_prod")),//vencimento produto
                            rs.getString("comprador"),//comprador
                            rs.getString("responsavel_entrega")//entregador
                        }
                );

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao tentar conectar com o banco de dados: " + e);
        }
    }

    public void ExibirCodigoMateriais() {

        String buscarNome = (String) JCbx_cod_materiais.getText();

        try {

            if (!buscarNome.equals("")) {

                Connection conn = rplorcamentoConexao.GeraConexao();

                String sql = "SELECT * FROM bd_rplorcamento.materiais WHERE id = ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, buscarNome);

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),//codigo
                                rs.getString("descricao"),//descrição
                                rs.getString("nome_abreviado"),//nome
                                format_.format(rs.getDate("chegada")),//chegada
                                rs.getString("unid_medida"),//unidade de medida
                                rs.getString("quantidade"),//quantidade
                                rs.getString("vl_unitario"),//vl unitario
                                rs.getString("vl_total"),//vl total
                                rs.getString("vl_desconto"),//vl desconto
                                rs.getString("vl_imposto"),//vl impostos
                                rs.getString("vl_final"),//vl final
                                rs.getString("vl_venda"),//vl venda
                                rs.getString("fornecedor"),//fornecedor
                                rs.getString("cod_produto_fornecedor"),//cod produto fornecedor
                                rs.getString("numero_NF"),//numero NF
                                format_.format(rs.getDate("vencimento_NF")),//vencimento NF
                                format_.format(rs.getDate("saida_prod")),//saida do produto
                                format_.format(rs.getDate("vencimento_prod")),//vencimento produto
                                rs.getString("comprador"),//comprador
                                rs.getString("responsavel_entrega")//entregador

                            }
                    );

                }

            } else {
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ExibirDescricaoMateriais() {

        String buscarNome = (String) jText_descricao_materiais.getText();

        try {

            if (!buscarNome.equalsIgnoreCase("")) {

                Connection conn = rplorcamentoConexao.GeraConexao();

                String sql = "SELECT * FROM bd_rplorcamento.materiais WHERE descricao LIKE ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, "%" + buscarNome + "%");

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),//codigo
                                rs.getString("descricao"),//descrição
                                rs.getString("nome_abreviado"),//nome
                                format_.format(rs.getDate("chegada")),//chegada
                                rs.getString("unid_medida"),//unidade de medida
                                rs.getString("quantidade"),//quantidade
                                rs.getString("vl_unitario"),//vl unitario
                                rs.getString("vl_total"),//vl total
                                rs.getString("vl_desconto"),//vl desconto
                                rs.getString("vl_imposto"),//vl impostos
                                rs.getString("vl_final"),//vl final
                                rs.getString("vl_venda"),//vl venda
                                rs.getString("fornecedor"),//fornecedor
                                rs.getString("cod_produto_fornecedor"),//cod produto fornecedor
                                rs.getString("numero_NF"),//numero NF
                                format_.format(rs.getDate("vencimento_NF")),//vencimento NF
                                format_.format(rs.getDate("saida_prod")),//saida do produto
                                format_.format(rs.getDate("vencimento_prod")),//vencimento produto
                                rs.getString("comprador"),//comprador
                                rs.getString("responsavel_entrega")//entregador
                            }
                    );

                }

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ExibirCompradorMateriais() {

        String buscarNome = (String) jText_comprador_materiais.getText();

        try {

            if (!buscarNome.equalsIgnoreCase("")) {

                Connection conn = rplorcamentoConexao.GeraConexao();

                String sql = "SELECT * FROM bd_rplorcamento.materiais WHERE comprador LIKE ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, "%" + buscarNome + "%");

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),//codigo
                                rs.getString("descricao"),//descrição
                                rs.getString("nome_abreviado"),//nome
                                format_.format(rs.getDate("chegada")),//chegada
                                rs.getString("unid_medida"),//unidade de medida
                                rs.getString("quantidade"),//quantidade
                                rs.getString("vl_unitario"),//vl unitario
                                rs.getString("vl_total"),//vl total
                                rs.getString("vl_desconto"),//vl desconto
                                rs.getString("vl_imposto"),//vl impostos
                                rs.getString("vl_final"),//vl final
                                rs.getString("vl_venda"),//vl venda
                                rs.getString("fornecedor"),//fornecedor
                                rs.getString("cod_produto_fornecedor"),//cod produto fornecedor
                                rs.getString("numero_NF"),//numero NF
                                format_.format(rs.getDate("vencimento_NF")),//vencimento NF
                                format_.format(rs.getDate("saida_prod")),//saida do produto
                                format_.format(rs.getDate("vencimento_prod")),//vencimento produto
                                rs.getString("comprador"),//comprador
                                rs.getString("responsavel_entrega")//entregador
                            }
                    );

                }

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ExibirCodProdForMateriais() {

        String buscarNome = (String) jText_cod_prod_fornecedor_materiais.getText();

        try {

            if (!buscarNome.equalsIgnoreCase("")) {

                Connection conn = rplorcamentoConexao.GeraConexao();

                String sql = "SELECT * FROM bd_rplorcamento.materiais WHERE cod_produto_fornecedor LIKE ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, "%" + buscarNome + "%");

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),//codigo
                                rs.getString("descricao"),//descrição
                                rs.getString("nome_abreviado"),//nome
                                format_.format(rs.getDate("chegada")),//chegada
                                rs.getString("unid_medida"),//unidade de medida
                                rs.getString("quantidade"),//quantidade
                                rs.getString("vl_unitario"),//vl unitario
                                rs.getString("vl_total"),//vl total
                                rs.getString("vl_desconto"),//vl desconto
                                rs.getString("vl_imposto"),//vl impostos
                                rs.getString("vl_final"),//vl final
                                rs.getString("vl_venda"),//vl venda
                                rs.getString("fornecedor"),//fornecedor
                                rs.getString("cod_produto_fornecedor"),//cod produto fornecedor
                                rs.getString("numero_NF"),//numero NF
                                format_.format(rs.getDate("vencimento_NF")),//vencimento NF
                                format_.format(rs.getDate("saida_prod")),//saida do produto
                                format_.format(rs.getDate("vencimento_prod")),//vencimento produto
                                rs.getString("comprador"),//comprador
                                rs.getString("responsavel_entrega")//entregador

                            }
                    );

                }

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ExibirFornecedorMateriais() {

        String buscarNome = (String) jText_fornecedor_materiais.getText();

        try {

            if (!buscarNome.equalsIgnoreCase("")) {

                Connection conn = rplorcamentoConexao.GeraConexao();

                String sql = "SELECT * FROM bd_rplorcamento.materiais WHERE fornecedor LIKE ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, "%" + buscarNome + "%");

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),//codigo
                                rs.getString("descricao"),//descrição
                                rs.getString("nome_abreviado"),//nome
                                format_.format(rs.getDate("chegada")),//chegada
                                rs.getString("unid_medida"),//unidade de medida
                                rs.getString("quantidade"),//quantidade
                                rs.getString("vl_unitario"),//vl unitario
                                rs.getString("vl_total"),//vl total
                                rs.getString("vl_desconto"),//vl desconto
                                rs.getString("vl_imposto"),//vl impostos
                                rs.getString("vl_final"),//vl final
                                rs.getString("vl_venda"),//vl venda
                                rs.getString("fornecedor"),//fornecedor
                                rs.getString("cod_produto_fornecedor"),//cod produto fornecedor
                                rs.getString("numero_NF"),//numero NF
                                format_.format(rs.getDate("vencimento_NF")),//vencimento NF
                                format_.format(rs.getDate("saida_prod")),//saida do produto
                                format_.format(rs.getDate("vencimento_prod")),//vencimento produto
                                rs.getString("comprador"),//comprador
                                rs.getString("responsavel_entrega")//entregador

                            }
                    );

                }

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(rplorcamentoTelaListaMateriais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rplorcamentoTelaListaMateriais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rplorcamentoTelaListaMateriais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rplorcamentoTelaListaMateriais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rplorcamentoTelaListaMateriais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JCbx_cod_materiais;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jText_cod_prod_fornecedor_materiais;
    private javax.swing.JTextField jText_comprador_materiais;
    private javax.swing.JTextField jText_descricao_materiais;
    private javax.swing.JTextField jText_fornecedor_materiais;
    // End of variables declaration//GEN-END:variables

    SimpleDateFormat format_ = new SimpleDateFormat("dd/MM/yyyy");

}
