/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;
import Business.Appointment.Appointment;
import Business.Enterprise.FitnessClubEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author luliu
 */
public class RequestTrainerJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private FitnessClubEnterprise fitenterprise;
    private DateFormat df;
    /**
     * Creates new form RequestTrainerJPanel
     */
    public RequestTrainerJPanel(JPanel container, UserAccount account, FitnessClubEnterprise fitenterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        this.fitenterprise = fitenterprise;
        df = new SimpleDateFormat("yyyy-MM-dd");
        populateComboBox();
    }
    public void populateComboBox() {
        dateComboBox.removeAll();
        for(Date date : fitenterprise.getAppointmentTime().getDateList()){
            dateComboBox.addItem(df.format(date));
        }
        sessionComboBox.removeAll();
        for(String session : fitenterprise.getAppointmentTime().getSessionList()){
            sessionComboBox.addItem(session);
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

        backjButton = new javax.swing.JButton();
        BtnReserve = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        sessionComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        dateComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        backjButton.setBackground(new java.awt.Color(255, 255, 255));
        backjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/返回.png"))); // NOI18N
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        BtnReserve.setBackground(new java.awt.Color(255, 255, 255));
        BtnReserve.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BtnReserve.setForeground(new java.awt.Color(215, 145, 54));
        BtnReserve.setText("Reserve");
        BtnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReserveActionPerformed(evt);
            }
        });

        viewBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(215, 145, 54));
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        sessionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/时间.png"))); // NOI18N

        dateComboBox.setToolTipText("");
        dateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboBoxActionPerformed(evt);
            }
        });
        dateComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateComboBoxKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/日历.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Schedule Your Appointment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(sessionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addGap(227, 227, 227)
                .addComponent(jLabel2)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(437, 437, 437))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(BtnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void dateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboBoxActionPerformed

    private void sessionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionComboBoxActionPerformed

    private void BtnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReserveActionPerformed
        // TODO add your handling code here:
        String dateString = (String) dateComboBox.getSelectedItem();
        Date date = null;
        try {
            date = df.parse(dateString);
        } catch (ParseException ex) {
            Logger.getLogger(RequestTrainerJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        String session = (String) sessionComboBox.getSelectedItem();
        for(AppointmentRequest appointmentRequest : account.getAppointmentQueue().getAppointmentRequestList()){
            if((appointmentRequest.getStatus().equals("Accept") || appointmentRequest.getStatus().equals("Pending")) && appointmentRequest.getAppointment().getDate().equals(date) && appointmentRequest.getAppointment().getSession().equals(session)){
                JOptionPane.showMessageDialog(null, "You already have appointment at that time");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Successfully");
        Appointment appointment = new Appointment(date, session);
        AppointmentRequest appointmentRequest = new AppointmentRequest(appointment);
        appointmentRequest.setSender(account);
        appointmentRequest.setStatus("Pending");
        account.getAppointmentQueue().getAppointmentRequestList().add(appointmentRequest);
        fitenterprise.getAppointmentQueue().getAppointmentRequestList().add(appointmentRequest);
    }//GEN-LAST:event_BtnReserveActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        ViewReservationJPanel requestViewJPanel = new ViewReservationJPanel(container, account, fitenterprise);
        container.add("requestViewJPanel", requestViewJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void dateComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateComboBoxKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboBoxKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReserve;
    private javax.swing.JButton backjButton;
    private javax.swing.JComboBox dateComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox sessionComboBox;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    
}
