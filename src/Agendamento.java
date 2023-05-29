
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Agendamento extends javax.swing.JFrame {
    TelaConsulta consulta = new TelaConsulta();
    TelaFinalizarConsulta finalizar = new TelaFinalizarConsulta();
   
    /**
     * Creates new form Agendamento
     */
    public Agendamento() {
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

        agendamentoPanel = new javax.swing.JPanel();
        welcomeLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dadosTbl = new javax.swing.JTable();
        novaConsultaBtn = new javax.swing.JButton();
        excluirConsultaBtn = new javax.swing.JButton();
        finalizarConsultaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        welcomeLbl.setText("Boas vinda ao sistema de agendamento");

        dadosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Já era Paciente?", "Consulta Realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dadosTbl);

        novaConsultaBtn.setText("Nova Consulta");
        novaConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaConsultaBtnActionPerformed(evt);
            }
        });

        excluirConsultaBtn.setText("Excluir Consulta");
        excluirConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirConsultaBtnActionPerformed(evt);
            }
        });

        finalizarConsultaBtn.setText("Finalizar Consulta");
        finalizarConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarConsultaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agendamentoPanelLayout = new javax.swing.GroupLayout(agendamentoPanel);
        agendamentoPanel.setLayout(agendamentoPanelLayout);
        agendamentoPanelLayout.setHorizontalGroup(
            agendamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendamentoPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(agendamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agendamentoPanelLayout.createSequentialGroup()
                        .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(agendamentoPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(novaConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excluirConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(finalizarConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        agendamentoPanelLayout.setVerticalGroup(
            agendamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendamentoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(agendamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizarConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agendamentoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agendamentoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novaConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaConsultaBtnActionPerformed
        consulta.setVisible(true);
        
    }//GEN-LAST:event_novaConsultaBtnActionPerformed

    private void finalizarConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarConsultaBtnActionPerformed
        
        finalizar.setVisible(true);
    }//GEN-LAST:event_finalizarConsultaBtnActionPerformed

    private void excluirConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirConsultaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirConsultaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agendamentoPanel;
    private static javax.swing.JTable dadosTbl;
    private javax.swing.JButton excluirConsultaBtn;
    private javax.swing.JButton finalizarConsultaBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novaConsultaBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
        
   private static final String[] tableColumns = {"Paciente", "CPF", "Telefone","Data","Já era paciente?","Consulta Realizada"};
   static DefaultTableModel tableModel = new  DefaultTableModel(tableColumns, 0);
   private static List<Consulta> listaConsulta = ListaConsulta.listar();
    
    public static void atualizar(){
         if(!listaConsulta.isEmpty()){
            
            Consulta consulta;
            
            tableModel = new DefaultTableModel(tableColumns, 0);
            
            for(int i = 0; i < listaConsulta.size(); i++){
                
                consulta = listaConsulta.get(i);
                
                String[] linha = {consulta.getPaciente(), consulta.getCpf(), consulta.getTelefone(), consulta.getData(), consulta.getJaEraPaciente(), consulta.getConsultaRealizada()};
                
                tableModel.addRow(linha);
                
            }
        
            dadosTbl.setModel(tableModel);
    }else{
           tableModel = new DefaultTableModel(tableColumns, 0);
            dadosTbl.setModel(tableModel);
        
         }
         
         
     
}
    

}
