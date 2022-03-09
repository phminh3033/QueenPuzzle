package queen8;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Interface extends JFrame {
    
    // singleton parttern dùng để quản lý form và class:
    private static Interface instance;
    public static Interface Instance() {
        if (instance == null) {
            instance = new Interface();
        }
        return instance;
    }
    
    private BA ba = new BA();
    int numQueen = 4, btnID;
    int stt = 0;
    int dem = 1;
    int[] Queen = new int[100];
    static int board[] = new int[10000];
    
    
    public Interface() {
        initComponents();
        drawBoard(0);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_chessboard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        b_check = new javax.swing.JButton();
        sp_numQ = new javax.swing.JSpinner();
        b_quit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_numQueen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_dataa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Queen Puzzle");

        p_chessboard.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout p_chessboardLayout = new javax.swing.GroupLayout(p_chessboard);
        p_chessboard.setLayout(p_chessboardLayout);
        p_chessboardLayout.setHorizontalGroup(
            p_chessboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        p_chessboardLayout.setVerticalGroup(
            p_chessboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        b_check.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_check.setText("Check");
        b_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_checkActionPerformed(evt);
            }
        });

        sp_numQ.setModel(new javax.swing.SpinnerNumberModel(4, 4, 8, 1));
        sp_numQ.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_numQStateChanged(evt);
            }
        });

        b_quit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_quit.setText("Quit");
        b_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Chọn số Queen:");

        lb_numQueen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_numQueen.setText("4 x 4 = 16");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kích thước bàn cờ:");

        tb_dataa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Các trường hợp:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_dataa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_dataaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_dataa);
        if (tb_dataa.getColumnModel().getColumnCount() > 0) {
            tb_dataa.getColumnModel().getColumn(0).setResizable(false);
        }
        tb_dataa.getAccessibleContext().setAccessibleParent(tb_dataa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_numQueen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sp_numQ, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b_check, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sp_numQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lb_numQueen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_check, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_chessboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_chessboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_checkActionPerformed
        stt=1;
        removeJtable();       
        ba.Instance().startBA(numQueen);
        long dem = ba.Instance().dem;
        ba.Instance().resetC();
        
        String s = "";
        int count = 1;
        
        for(int i = 1; i < dem; i++){
            s = s + "(" + count + "," + String.valueOf(board[i]) + ")";
            count++;
            
            if(i%numQueen==0){
                insertJtable(s);
                s = "";
                count = 1;
            }
            
        }
    }//GEN-LAST:event_b_checkActionPerformed

    void receiveQ8(int[] result, int index){
        for(int i = 1; i <= index; i++){
            board[dem] = result[i];
            dem++;
        }
    }
    
    void insertJtable(String s){
        DefaultTableModel model = (DefaultTableModel) tb_dataa.getModel();
        model.addRow(new Object[]{s});
    }
    
    void removeJtable(){
        while(tb_dataa.getRowCount() > 0)
        {
            ((DefaultTableModel)tb_dataa.getModel()).removeRow(0);
        }
        tb_dataa.removeAll();
        ((DefaultTableModel)tb_dataa.getModel()).setNumRows(0);
        DefaultTableModel tm = (DefaultTableModel) tb_dataa.getModel();
        tm.setRowCount(0);
    }
    
    void resetdem(){
        dem=1;
    }
    
    private void b_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Do you sure you want to exit?", "⚠ Warning!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        else this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_b_quitActionPerformed

    void drawBoard(int stt) {
        p_chessboard.removeAll();
        int Q8Loca = 1;
        int count = 0;
        int x = 0, y = 0;
        int width = 520;
        int height = 520;

        for (int i = 0; i < numQueen; i++) {
            for (int j = 0; j < numQueen; j++) {
                Button btn = new Button("(" + (i+1) + "," + (j+1) + ")");
                btn.setSize(width/numQueen, height/numQueen);
                btn.setLocation(9+x, 9+y);
                y = y + (width/numQueen);
                
                count++;
                int ID = count;
                switch(stt){
                    case 1:
                        if(ID == Queen[Q8Loca]){
                            btn.setBackground(Color.red);
                            Q8Loca++;
                        }
                        break;
                    case 0:
                        break;
                    default:
                }
                p_chessboard.add(btn);
            }
            x = x+(height/numQueen);
            y = 0;
        }
    }
    
    private void sp_numQStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_numQStateChanged
        numQueen = Integer.valueOf(sp_numQ.getValue().toString());
        lb_numQueen.setText(numQueen + " x " + numQueen + " = " + numQueen * numQueen);
        p_chessboard.removeAll();
        drawBoard(0);
    }//GEN-LAST:event_sp_numQStateChanged

    private void tb_dataaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dataaMouseClicked
        int row = tb_dataa.getSelectedRow();
        for(int i = 1; i <= numQueen; i++){
            Queen[i] = (i-1)*numQueen + board[row*numQueen+i];
        }
        
        drawBoard(stt);
    }//GEN-LAST:event_tb_dataaMouseClicked


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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_check;
    private javax.swing.JButton b_quit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_numQueen;
    private javax.swing.JPanel p_chessboard;
    private javax.swing.JSpinner sp_numQ;
    private javax.swing.JTable tb_dataa;
    // End of variables declaration//GEN-END:variables
}
