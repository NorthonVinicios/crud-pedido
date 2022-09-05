/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.view;

import com.lanchonete.classes.Produto;
import com.lanchonete.dao.PedidoDao;
import com.lanchonete.db.Connect;
import com.lanchonete.model.ModelPesquisa;
import com.lanchonete.model.ModelProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CrudPedido extends javax.swing.JDialog {

    PedidoDao daoPedido = new PedidoDao();
    Connect banco = new Connect();
    public ModelPesquisa modelPesquisa;
    public ModelProdutos modelProduto;

    public CrudPedido(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
    }

    public void carregaPesquisa(List<Produto> lista) {
        modelPesquisa.setProdutos(lista);
        jTablePesquisa.setModel(modelPesquisa);
    }
    public void carregaProdutos(List<Produto> lista) {
        modelProduto.setProdutos(lista);
        jTableProdutos.setModel(modelProduto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBGravar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jTCdPedido = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTDsAmbiente = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jTDataPedido = new javax.swing.JTextField();
        jBIncluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBConsultar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jLLegenda = new javax.swing.JLabel();
        jTCdCliente = new javax.swing.JTextField();
        jTDsCliente = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBGravar.setText("Gravar");
        jBGravar.setEnabled(false);
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });
        jBGravar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBGravarKeyPressed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.setEnabled(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jBCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCancelarKeyPressed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        jBSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBSairKeyPressed(evt);
            }
        });

        jTCdPedido.setToolTipText("Código do Cliente");
        jTCdPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "*Pedido"));
        jTCdPedido.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTCdPedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCdPedidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCdPedidoFocusLost(evt);
            }
        });
        jTCdPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCdPedidoActionPerformed(evt);
            }
        });
        jTCdPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCdPedidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCdPedidoKeyTyped(evt);
            }
        });

        jTDsAmbiente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Produto"));
        jTDsAmbiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDsAmbienteKeyPressed(evt);
            }
        });

        jBPesquisar.setMnemonic('A');
        jBPesquisar.setToolTipText("Gravar");
        jBPesquisar.setEnabled(false);
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTablePesquisaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePesquisa);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Produtos do Pedido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableProdutosKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTDsAmbiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDsAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTDataPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data-Hora"));
        jTDataPedido.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTDataPedido.setEnabled(false);
        jTDataPedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDataPedidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDataPedidoFocusLost(evt);
            }
        });
        jTDataPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDataPedidoKeyPressed(evt);
            }
        });

        jBIncluir.setMnemonic('N');
        jBIncluir.setText("Novo");
        jBIncluir.setToolTipText("Novo Pedido");
        jBIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncluirActionPerformed(evt);
            }
        });
        jBIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBIncluirKeyPressed(evt);
            }
        });

        jBAlterar.setMnemonic('A');
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });
        jBAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAlterarKeyPressed(evt);
            }
        });

        jBConsultar.setMnemonic('C');
        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        jBConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBConsultarKeyPressed(evt);
            }
        });

        jBExcluir.setMnemonic('E');
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });
        jBExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBExcluirKeyPressed(evt);
            }
        });

        jLLegenda.setText("                     ");

        jTCdCliente.setToolTipText("Código do Cliente");
        jTCdCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "*Código"));
        jTCdCliente.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTCdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCdClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCdClienteFocusLost(evt);
            }
        });
        jTCdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCdClienteActionPerformed(evt);
            }
        });
        jTCdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCdClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCdClienteKeyTyped(evt);
            }
        });

        jTDsCliente.setToolTipText("Cliente");
        jTDsCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente"));
        jTDsCliente.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTDsCliente.setEnabled(false);
        jTDsCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDsClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDsClienteFocusLost(evt);
            }
        });
        jTDsCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDsClienteKeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - PIX", "2 -  CARTÃO", "3 - DINHEIRO " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLLegenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBGravar)
                                .addGap(6, 6, 6)
                                .addComponent(jBCancelar)
                                .addGap(6, 6, 6)
                                .addComponent(jBSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCdCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTDataPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed


    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGravarKeyPressed

    }//GEN-LAST:event_jBGravarKeyPressed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCancelarKeyPressed

    }//GEN-LAST:event_jBCancelarKeyPressed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed

    }//GEN-LAST:event_jBSairActionPerformed

    private void jBSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSairKeyPressed
        dispose();
    }//GEN-LAST:event_jBSairKeyPressed

    private void jTCdPedidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCdPedidoFocusGained

    }//GEN-LAST:event_jTCdPedidoFocusGained

    private void jTCdPedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCdPedidoFocusLost

    }//GEN-LAST:event_jTCdPedidoFocusLost

    private void jTCdPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCdPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCdPedidoActionPerformed

    private void jTCdPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCdPedidoKeyPressed

    }//GEN-LAST:event_jTCdPedidoKeyPressed

    private void jTCdPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCdPedidoKeyTyped

    }//GEN-LAST:event_jTCdPedidoKeyTyped

    private void jTDsAmbienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDsAmbienteKeyPressed

    }//GEN-LAST:event_jTDsAmbienteKeyPressed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed

    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jTablePesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePesquisaKeyPressed

    }//GEN-LAST:event_jTablePesquisaKeyPressed

    private void jTDataPedidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDataPedidoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDataPedidoFocusGained

    private void jTDataPedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDataPedidoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDataPedidoFocusLost

    private void jTDataPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDataPedidoKeyPressed

    }//GEN-LAST:event_jTDataPedidoKeyPressed

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
        jTCdPedido.setEnabled(false);
        jTCdPedido.setText("" + banco.ultimoPedido());
        jTDataPedido.setText(banco.getHoras());

        jTCdCliente.grabFocus();
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBIncluirKeyPressed

    }//GEN-LAST:event_jBIncluirKeyPressed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed

    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAlterarKeyPressed

    }//GEN-LAST:event_jBAlterarKeyPressed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed

    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBConsultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBConsultarKeyPressed

    }//GEN-LAST:event_jBConsultarKeyPressed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBExcluirKeyPressed

    }//GEN-LAST:event_jBExcluirKeyPressed

    private void jTCdClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCdClienteFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCdClienteFocusGained

    private void jTCdClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCdClienteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCdClienteFocusLost

    private void jTCdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCdClienteActionPerformed

    private void jTCdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCdClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCdClienteKeyPressed

    private void jTCdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCdClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCdClienteKeyTyped

    private void jTDsClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDsClienteFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDsClienteFocusGained

    private void jTDsClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDsClienteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDsClienteFocusLost

    private void jTDsClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDsClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDsClienteKeyPressed

    private void jTableProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableProdutosKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLLegenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTCdCliente;
    private javax.swing.JTextField jTCdPedido;
    private javax.swing.JTextField jTDataPedido;
    private javax.swing.JTextField jTDsAmbiente;
    private javax.swing.JTextField jTDsCliente;
    private javax.swing.JTable jTablePesquisa;
    private javax.swing.JTable jTableProdutos;
    // End of variables declaration//GEN-END:variables
}
