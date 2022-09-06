/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.view;

import static br.com.agrodados.nxintegracao.view.cadastro.JDCadastroLocal.listaNomeAmbientes;
import br.com.neax.util.NXGeraLog;
import br.com.neax.util.NXUteis;
import com.lanchonete.classes.Pedido;
import com.lanchonete.classes.Produto;
import com.lanchonete.dao.ClienteDao;
import com.lanchonete.dao.PedidoDao;
import com.lanchonete.dao.ProdutoDao;
import com.lanchonete.db.Connect;
import com.lanchonete.model.ModelPesquisa;
import com.lanchonete.model.ModelProdutos;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class CrudPedido extends javax.swing.JDialog {

    PedidoDao daoPedido = new PedidoDao();
    ClienteDao daoCliente = new ClienteDao();
    ProdutoDao daoProduto = new ProdutoDao();
    Connect banco = new Connect();
    public ModelPesquisa modelPesquisa = new ModelPesquisa();
    public ModelProdutos modelProduto = new ModelProdutos();
    private List<Produto> produtos = new ArrayList();

    private AmbienteTableModel modelProd;

    public CrudPedido(java.awt.Frame parent) {
        super(parent, true);
        setModal(true);
        initComponents();

        TableCellRenderer renderer = new EvenOddRenderer();
        jTablePesquisa.setDefaultRenderer(Object.class, renderer);
        jTableProdutos.setDefaultRenderer(Object.class, renderer);

        setLocationRelativeTo(null);

        carregaPesquisa(daoProduto.list());
        carregaProdutos(new ArrayList());
    }
    //git reset /nbprojects/

    public void carregaPesquisa(List<Produto> lista) {
        modelPesquisa.setData(lista);
        jTablePesquisa.setModel(modelPesquisa);
    }

    public void carregaProdutos(List<Produto> lista) {
        modelProduto.setData(lista);
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
        jBListar = new javax.swing.JButton();

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
        jLLegenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TOTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 - PIX", "1 -  CARTÃO", "2 - DINHEIRO " }));

        jBListar.setMnemonic('E');
        jBListar.setText("Listar");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });
        jBListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBListarKeyPressed(evt);
            }
        });

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
                                .addComponent(jLLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCdCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jTDataPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTCdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
        if (jTCdCliente.getText().isEmpty() || daoCliente.clientExists(Integer.valueOf(jTCdCliente.getText().trim()))) {
            JOptionPane.showMessageDialog(this, "Insira um Cliente Valido");
            return;
        }
        if (modelProduto.getProdutos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira um Produto");
            return;
        }
        Pedido pedido = new Pedido();
        pedido.setIdCliente(daoCliente.findById(Integer.valueOf(jTCdCliente.getText().trim())));
        pedido.setDataPedido(banco.getHoras());
        pedido.setDataEntregaProgramada(banco.getHoraMaisQuinze());
        pedido.setDataEntregaEfetivada("");
        pedido.setPreco(Integer.valueOf(jLLegenda.getText().trim()));
        pedido.setProdutoList(modelProduto.getProdutos());
        pedido.setFormaPagamento(jComboBox1.getSelectedIndex());
        daoPedido.save(pedido);

    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGravarKeyPressed

    }//GEN-LAST:event_jBGravarKeyPressed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCancelarKeyPressed

    }//GEN-LAST:event_jBCancelarKeyPressed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
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
        modelPesquisa.setData(daoProduto.findByName(jTDsAmbiente.getText()));
        jTablePesquisa.setModel(modelPesquisa);
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jTablePesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePesquisaKeyPressed

    }//GEN-LAST:event_jTablePesquisaKeyPressed

    private void jTDataPedidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDataPedidoFocusGained

    }//GEN-LAST:event_jTDataPedidoFocusGained

    private void jTDataPedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDataPedidoFocusLost

    }//GEN-LAST:event_jTDataPedidoFocusLost

    private void jTDataPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDataPedidoKeyPressed

    }//GEN-LAST:event_jTDataPedidoKeyPressed

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
        jTCdPedido.setEnabled(false);
        jTCdPedido.setText("" + banco.ultimoPedido());
        jTDataPedido.setText(banco.getHoras());

        jTCdCliente.grabFocus();
        jBGravar.setEnabled(true);
        jBCancelar.setEnabled(true);
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBIncluirKeyPressed

    }//GEN-LAST:event_jBIncluirKeyPressed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        if (jTCdPedido.getText().isEmpty() || daoPedido.pedidoExists(Integer.valueOf(jTCdPedido.getText().trim()))) {
            JOptionPane.showMessageDialog(this, "Insira um Pedido Valido");
            return;
        }
        jTCdPedido.setEnabled(false);
        jTCdCliente.setEnabled(false);
        Pedido ped = daoPedido.findById(Integer.valueOf(jTCdPedido.getText().trim()));
        jTCdCliente.setText(ped.getIdCliente().getIdCliente().toString());
        jTDsCliente.setText(ped.getIdCliente().getNome());
        jTDataPedido.setText(ped.getDataPedido());
        jComboBox1.setSelectedIndex(ped.getFormaPagamento());
        jLLegenda.setText(ped.getPreco().toString());
        produtos.clear();
        produtos = (ped.getProdutoList());
        modelProd.restaurar();

    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAlterarKeyPressed

    }//GEN-LAST:event_jBAlterarKeyPressed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        if (jTCdPedido.getText().isEmpty() || !daoPedido.pedidoExists(Integer.valueOf(jTCdPedido.getText().trim()))) {
            JOptionPane.showMessageDialog(this, "Insira um Pedido Valido");
            return;
        }
        jTCdPedido.setEnabled(true);
        jTCdCliente.setEnabled(false);
        Pedido ped = daoPedido.findById(Integer.valueOf(jTCdPedido.getText().trim()));
        jTCdCliente.setText(ped.getIdCliente().getIdCliente().toString());
        jTDsCliente.setText(ped.getIdCliente().getNome());
        jTDataPedido.setText(ped.getDataPedido());
        jComboBox1.setSelectedIndex(ped.getFormaPagamento());
        jLLegenda.setText(ped.getPreco().toString());
        modelProd.limpar();
        produtos = (ped.getProdutoList());
        modelProd.restaurar();
        jBGravar.setEnabled(false);
        jBExcluir.setEnabled(true);
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBConsultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBConsultarKeyPressed

    }//GEN-LAST:event_jBConsultarKeyPressed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (jTCdPedido.getText().isEmpty() || !daoPedido.pedidoExists(Integer.valueOf(jTCdPedido.getText().trim()))) {
            JOptionPane.showMessageDialog(this, "Insira um Pedido Valido");
            return;
        }
        if (confirma("Confirma exclusão do Registro?", this) == JOptionPane.YES_NO_OPTION) {
            daoPedido.delete(daoPedido.findById(Integer.valueOf(jTCdPedido.getText().trim())));
            JOptionPane.showMessageDialog(this, "Pedido Excluido");
        }


    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBExcluirKeyPressed

    }//GEN-LAST:event_jBExcluirKeyPressed

    private void jTCdClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCdClienteFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCdClienteFocusGained

    private void jTCdClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCdClienteFocusLost
        jTDsCliente.setText(daoCliente.findById(Integer.valueOf(jTCdCliente.getText().trim())).getNome());                                                   // TODO add your handling code here:
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

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        ListarPedidos list = new ListarPedidos(CrudPedido.this);
        list.setVisible(true);
    }//GEN-LAST:event_jBListarActionPerformed

    private void jBListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBListarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBListarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBListar;
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

    class AmbienteTableModel extends AbstractTableModel {

        private String[] colunas = new String[]{
            "Produto", "Preço"};

        public AmbienteTableModel() {
        }

        @Override
        public int getColumnCount() {
            return colunas.length;
        }

        ;
        @Override
        public int getRowCount() {
            return produtos.size();
        }

        ;
        @Override
        public String getColumnName(int columnIndex) {
            return colunas[columnIndex];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return String.class;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Produto d = produtos.get(rowIndex);
            try {
                switch (columnIndex) {
                    case 0:
                        return d.getNomeProduto();
                    case 1:
                        return d.getValor();
                    default:
                        throw new IndexOutOfBoundsException("columnIndex out of bounds");
                }
            } catch (Exception e) {
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            try {
                if (columnIndex == 0 && rowIndex >= 0) {
                    try {
                        produtos.set(rowIndex, (Produto) aValue);
                        //(listaNomeAmbientes.get(rowIndex));
                    } catch (Exception e) {
                    }
                }
                fireTableDataChanged();
            } catch (Exception e) {
            }
        }

        ;

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            if (true) {
                return false;
            } else {
                return true;
            }
        }

        public void addEmbalagem(Produto desc) {
            produtos.add(desc);
            int ultimoIndice = getRowCount() - 1;
//            fireTableRowsInserted(ultimoIndice, ultimoIndice);
        }

        public void removeDesc(Produto prod, int idx) {
            produtos.remove(prod);
            remove(idx);
            fireTableRowsDeleted(idx, idx);
        }

        public void limpar() {
            produtos.clear();
            fireTableDataChanged();
        }

        public void restaurar() {
            fireTableDataChanged();
        }

        public boolean isEmpty() {
            return produtos.isEmpty();
        }
    }

    public int confirma(String titulo) {
        return javax.swing.JOptionPane.showConfirmDialog(
                null, titulo,
                "Confirma", JOptionPane.YES_NO_OPTION);
    }

    public int confirma(String titulo, Component frame) {
        return javax.swing.JOptionPane.showConfirmDialog(
                frame, titulo,
                "Confirma", JOptionPane.YES_NO_OPTION);
    }

    private void adicionarDesc() {
        try {
            String desc = NXUteis.Trim(jTDsAmbiente);
            //(desc);
            if (!listaNomeAmbientes.contains(desc)) {
                listaNomeAmbientes.add(desc);
            }
            modelProd.fireTableDataChanged();

            jTDsAmbiente.setSelectionStart(0);
        } catch (Exception ex) {
            NXGeraLog.gravaErro(ex, this);
        }
    }

    class EvenOddRenderer implements TableCellRenderer {

        public final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
            ((JLabel) renderer).setOpaque(true);
            Color foreground, background;

            Produto rec = modelPesquisa.getProdutos().get(row);

            if (isSelected) {
                foreground = Color.BLACK;
                background = Color.yellow;
            } else {
                if (row % 2 == 0) {
                    foreground = Color.BLACK;
                    background = Color.white;
                } else {
                    foreground = Color.BLACK;
                    background = new java.awt.Color(180, 232, 255);
                }
            }
            if (produtos.contains(rec)) {
                foreground = Color.BLACK;
                background = new java.awt.Color(3, 187, 133);
//                if (column == 5) {
//                    foreground = Color.BLACK;
//                    background = new java.awt.Color(3, 187, 150);
//
//                }
            }

            ((JLabel) renderer).setHorizontalAlignment(JLabel.CENTER);
            ((JLabel) renderer).setHorizontalTextPosition(JLabel.CENTER);
//            if (column == 5 || column == 6 || column == 7) {
//                ((JLabel) renderer).setHorizontalAlignment(JLabel.RIGHT);
//                ((JLabel) renderer).setHorizontalTextPosition(JLabel.RIGHT);
//            }
//            if (column == 1) {
//                ((JLabel) renderer).setHorizontalAlignment(JLabel.LEFT);
//                ((JLabel) renderer).setHorizontalTextPosition(JLabel.LEFT);
//            }
            renderer.setForeground(foreground);
            renderer.setBackground(background);

            return renderer;
        }
    }

}
