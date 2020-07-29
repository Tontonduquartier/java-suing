/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import class_ispg.connexiondata;
import class_ispg.gerer_fenetre;
import gui.persoGUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class tb_employers extends javax.swing.JInternalFrame {

    /**
     * Creates new form tb_employers
     */
    public tb_employers() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        play_table();
    }
    int row=-1;
    public void play_table(){
        
     Object colonne[]={"Numero matricule","Nom","Prenom","Sexe","Date de naissance","Nationalité","Colline/Qartier","Zone","Commune","Province",
       "Nom du Banque","Numero Bancaire","Poste","Type de contrat","Date Embauché"};
    
    DefaultTableModel df=new DefaultTableModel();
    table_per.setModel(df);

        df.setColumnIdentifiers(colonne);
        ResultSet rs = connexiondata.extraireData("select *from personel");
        try {
            while(rs.next()){
                String matr=rs.getString("n_matricule");
                String nom=rs.getString("nom");
                String prenom=rs.getString("prenom");
                String sex=rs.getString("sexe");
                String naissance=rs.getString("date_naissance");
                String national=rs.getString("nationalite");
                String coll=rs.getString("col_naissance");
                String quartier=rs.getString("zone");
                String com=rs.getString("commune");
                String prov=rs.getString("province");
                String bank=rs.getString("banque");
                String num_comp=rs.getString("n_compte");
                String pos=rs.getString("poste");
                String typ_contrat=rs.getString("typecontrat");
                String date_emb=rs.getString("date_embaucher");
                Object line[]={matr,nom,prenom,sex,naissance,national,coll,quartier,com,prov,bank,num_comp,pos,typ_contrat,date_emb};
                df.addRow(line);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(persoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_per = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_ms_excel_30px.png"))); // NOI18N
        jLabel1.setText("Fichier Excel");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_print_25px.png"))); // NOI18N
        jLabel5.setText("Imprimer");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_delete_25px.png"))); // NOI18N
        jLabel6.setText("Supprimer");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jScrollPane2.setBorder(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 400));

        table_per.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table_per.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_per);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1603, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
gerer_fenetre.export(table_per,".xls");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
row=table_per.getSelectedRow();
if(row>=0){
    String str=table_per.getValueAt(row,14 ).toString();
    if(JOptionPane.showConfirmDialog(this,"êtes-vous sûr!")==JOptionPane.OK_OPTION)
    {
        connexiondata.modifierDB("delete from personel where date_embaucher='"+str+"'");
        JOptionPane.showMessageDialog(this, "Succès","",JOptionPane.INFORMATION_MESSAGE);
        play_table();
        
    }else
    {
        JOptionPane.showMessageDialog(this, "L'opération non confirmé","",JOptionPane.INFORMATION_MESSAGE);
    }
}else
{
 JOptionPane.showMessageDialog(this, "Séléctionner une ligne","",JOptionPane.WARNING_MESSAGE);
   
}
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
gerer_fenetre.ImprimerLaTable(table_per);        // TODO add your handling code here:
   
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_per;
    // End of variables declaration//GEN-END:variables

}
