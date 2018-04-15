/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.ComandaDao;
import dao.DaoGeneric;
import dao.PedidoDao;
import dao.ProdutoDao;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Comanda;
import modelo.Funcionario;
import modelo.Pedido;
import modelo.Produto;

/**
 *
 * @author fernanda
 */
public class TelaCadastroPedido extends javax.swing.JFrame {
    
    private ProdutoDao dao;
    private final Funcionario funcionario;
    private ComandaDao daoComanda;
    private DaoGeneric <Pedido> daoPedido;
    /**
     * Creates new form TelaCadastroPedido
     */
    public TelaCadastroPedido(Funcionario funcionario) {
        this.funcionario = funcionario;
        try {
            daoPedido = new PedidoDao();
            dao = new ProdutoDao();
            daoComanda = new ComandaDao();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na leitura do arquivo");
            this.dispose();
        }
        initComponents();
        
    }
    
    public List<Produto> getProdutos(){
        List <Produto> produtos = null;
        
        try {
            dao = new ProdutoDao();
            produtos = dao.listar();
            return dao.listar();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na leitura dos dados");
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada");
            this.dispose();
        }
        return produtos;
        
        
    }
    
    public List<Comanda> getComandas(){
        List <Comanda> comandas = null;
        
        try {
            daoComanda = new ComandaDao();
            comandas = daoComanda.listar();
            return daoComanda.listar();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na leitura dos dados");
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada");
            this.dispose();
        }
        return comandas;
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/fernanda/NetBeansProjects/Projeto/imagens/pedido.png")); // NOI18N

        jComboBox1.setModel(new DefaultComboBoxModel(getProdutos().toArray()));
        jComboBox1.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("COMANDA:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("PRODUTO:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("QUANTIDADE:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("OBSERVAÇÃO:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("STATUS:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jTextField1.setText("ID");

        jTextField2.setText("Observação");

        jComboBox2.setModel(new DefaultComboBoxModel(getComandas().toArray()));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REALIZADO", "ENTREGUE" }));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("ATUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("LISTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("EXCLUIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(239, 239, 239))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jSpinner1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(12, 12, 12)
                        .addComponent(jButton5)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3, jButton4, jButton5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(87, 87, 87))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jComboBox2, jComboBox3, jSpinner1, jTextField1, jTextField2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton3, jButton4, jButton5});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = jTextField1.getText();
        String obs = jTextField2.getText();
        int quantidade = (int) jSpinner1.getValue();
        String status = (String) jComboBox3.getSelectedItem();
        String cIndex = String.valueOf(jComboBox1.getSelectedIndex() + 1);       
        String pIndex = String.valueOf(jComboBox2.getSelectedIndex() + 1);
        Comanda comanda;
        Produto produto;
        try {
            comanda = daoComanda.buscar(cIndex);
            produto = dao.buscar(pIndex);
            
            Pedido pedido = new Pedido(id, obs, status, quantidade, produto, 
                    this.funcionario, comanda);
            System.out.println(pedido.getComanda());
            if (daoPedido.buscar(id)== null) {
                if(daoPedido.salvar(pedido)){
                    comanda.realizarPedido(pedido);
                    JOptionPane.showMessageDialog(null, "Pedido salvo com sucesso");
                    TelaCadastroPedido cadastroPedido = new TelaCadastroPedido(funcionario);
                    cadastroPedido.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao salvar");
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Pedido já existe");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na leitura dos dados");
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada");
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id = jTextField1.getText();
        Pedido p;
        try {
            p = daoPedido.buscar(id);
            System.out.println(p);
            if(p != null){
                System.out.println(p.getComanda());
                System.out.println(p.getProduto());
                jTextField1.setText(p.getId());
                jTextField2.setText(p.getObservacao());
                jComboBox3.setSelectedItem(p.getStatus());
                jSpinner1.setValue(p.getQuantidade());
                jComboBox1.setSelectedItem(p.getComanda());
                jComboBox2.setSelectedItem(p.getProduto());
//                System.out.println(p.getProduto());
//                System.out.println(p.getComanda());
            } else {
                JOptionPane.showMessageDialog(null, "Pedido não encontrado");
            }
         } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na leitura dos dados");
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada");
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String id = jTextField1.getText();
        try {
            Pedido p = daoPedido.buscar(id);
            if(p != null){
                if(daoPedido.deletar(p)){
                    JOptionPane.showMessageDialog(null, "Pedido excluído com sucesso");
                    TelaCadastroPedido cadastroPedido = new TelaCadastroPedido(funcionario);
                    cadastroPedido.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao excluir");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Comanda não encontrada");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na leitura dos dados");
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada");
            this.dispose();
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id = jTextField1.getText();
        String obs = jTextField2.getText();
        int quantidade = (int) jSpinner1.getValue();
        String status = (String) jComboBox3.getSelectedItem();
        String cIndex = String.valueOf(jComboBox1.getSelectedIndex() + 1);       
        String pIndex = String.valueOf(jComboBox2.getSelectedIndex() + 1);
        Comanda comanda;
        Produto produto;
        try {
            comanda = daoComanda.buscar(cIndex);
            produto = dao.buscar(pIndex);
            
            Pedido pedido = new Pedido(id, obs, status, quantidade, produto, 
                    this.funcionario, comanda);
            
            if(daoPedido.atualizar(pedido)){
                JOptionPane.showMessageDialog(null, "Pedido atualizado com sucesso");
                TelaCadastroPedido cadastroPedido = new TelaCadastroPedido(funcionario);
                cadastroPedido.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao atualizar");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na leitura dos dados");
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada");
            this.dispose();
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        List<Pedido> pedidos;
        try {
            pedidos = daoPedido.listar();
            TelaListarPedidos listar = new TelaListarPedidos(pedidos);
            listar.setVisible(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na leitura dos dados");
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada");
            this.dispose();
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
