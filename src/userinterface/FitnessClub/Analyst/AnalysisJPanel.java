/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FitnessClub.Analyst;

import Business.Course.Course;
import Business.Enterprise.FitnessClubEnterprise;
import Business.Enterprise.OnlineSalesEnterprise;
import Business.Organization.Organization;
import Business.Sales.OnlineSales;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import Business.WorkQueue.CourseRequest;
import Business.WorkQueue.OnlineSalesQueue;
import Business.WorkQueue.OnlineSalesRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author luliu
 */
public class AnalysisJPanel extends javax.swing.JPanel {

    private FitnessClubEnterprise fitenterprise;
    private JPanel container;
    private OnlineSalesEnterprise salesenterprise;

    /**
     * Creates new form AnalysisJPanel
     */
    public AnalysisJPanel(JPanel container, FitnessClubEnterprise fitenterprise, OnlineSalesEnterprise salesenterprise) {
        initComponents();
        this.container = container;
        this.fitenterprise = fitenterprise;
        this.salesenterprise = salesenterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popCourseButton = new javax.swing.JButton();
        popTrainerButton = new javax.swing.JButton();
        popItemButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        popCourseButton.setBackground(new java.awt.Color(255, 255, 255));
        popCourseButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        popCourseButton.setForeground(new java.awt.Color(215, 145, 54));
        popCourseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/健身 (1).png"))); // NOI18N
        popCourseButton.setText("top 5 popular Course");
        popCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popCourseButtonActionPerformed(evt);
            }
        });

        popTrainerButton.setBackground(new java.awt.Color(255, 255, 255));
        popTrainerButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        popTrainerButton.setForeground(new java.awt.Color(215, 145, 54));
        popTrainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/健身房.png"))); // NOI18N
        popTrainerButton.setText("top 5 active Customer");
        popTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popTrainerButtonActionPerformed(evt);
            }
        });

        popItemButton.setBackground(new java.awt.Color(255, 255, 255));
        popItemButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        popItemButton.setForeground(new java.awt.Color(215, 145, 54));
        popItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/购物车.png"))); // NOI18N
        popItemButton.setText("top 5 popular Item");
        popItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popItemButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(215, 145, 54));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/数据.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Higher Grades");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("better Analyse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(popTrainerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(popItemButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(popCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(popCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(popTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(popItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void popCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popCourseButtonActionPerformed
        // TODO add your handling code here:
     HashMap<String, Integer> courseRank = new HashMap();

        for (Course course : fitenterprise.getCourseDirectory().getCourseList()) {
            courseRank.put(course.getCourseName(), 0);
        }

        for (CourseRequest courseRequest : fitenterprise.getCourseQueue().getCourseRequestList()) {
            Course course = courseRequest.getCourse();
            int count = 0;
            if (courseRank.containsKey(course.getCourseName())) {
                count = courseRank.get(course.getCourseName());
                count++;
                courseRank.put(course.getCourseName(), count);

            }
        }

        ArrayList<Map.Entry<String, Integer>> rankList = new ArrayList(courseRank.entrySet());

        Collections.sort(rankList, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue() + o2.getValue();
            }
        });

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < 5; i++) {
            dataset.setValue(rankList.get(i).getValue(), "a", rankList.get(i).getKey());
        }
        JFreeChart chart = ChartFactory.createBarChart("Course selected", "Course Name", "Number", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) p.getRenderer();
        renderer.setSeriesPaint(0, new Color(215,145,54));
        p.setRangeGridlinePaint(Color.black);
        ChartFrame chartFrame = new ChartFrame("Most popular courses", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(800, 600);
        chart.getTitle().setPaint(new Color(215,145,54));
    }//GEN-LAST:event_popCourseButtonActionPerformed

    private void popTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popTrainerButtonActionPerformed
        // TODO add your handling code here:

        HashMap<String, Integer> trainerRank = new HashMap();

        for (Organization organization : fitenterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getName().equals("Trainer Organization")) {
                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                    trainerRank.put(ua.getPerson().getName(), 0);
                }
            }
        }
        
        for (AppointmentRequest appRequest : fitenterprise.getAppointmentQueue().getAppointmentRequestList()) {
            int count = 0;
//            if(appRequest==null)System.out.println("111111111111111");
//            if(appRequest.getReceiver()==null)System.out.println("22222222222222222");
//            if(appRequest.getReceiver().getPerson()==null)System.out.println("33333");
//            if(appRequest.getReceiver().getPerson().getName()==null)System.out.println("4444444444");
            if (trainerRank.containsKey(appRequest.getSender().getPerson().getName())) {
                count = trainerRank.get(appRequest.getSender().getPerson().getName());
            }
            count++;
            trainerRank.put(appRequest.getSender().getPerson().getName(), count);
        }
        System.out.println(trainerRank);
        
        ArrayList<Map.Entry<String, Integer>> rankList = new ArrayList(trainerRank.entrySet());

        Collections.sort(rankList, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue() + o2.getValue();
            }
        });

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < 5; i++) {
            dataset.setValue(rankList.get(i).getValue(), "a", rankList.get(i).getKey());
        }
        JFreeChart chart = ChartFactory.createBarChart("Active Customer", "Customer Name", "Number", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) p.getRenderer();
        renderer.setSeriesPaint(0, new Color(215,145,54));
        ChartFrame chartFrame = new ChartFrame("Most Active Customer", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(800, 600);
        chartFrame.setBackground(Color.white);
//        chart.getPlot().setBackgroundPaint(paint);
        
        

    }//GEN-LAST:event_popTrainerButtonActionPerformed

    private void popItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popItemButtonActionPerformed
        // TODO add your handling code here:
        HashMap<String, Integer> itemRank = new HashMap();
        OnlineSalesQueue osq = new OnlineSalesQueue();

        for (Organization organization : fitenterprise.getOrganizationDirectory().getOrganizationList()) 
            
            if (organization.getName().equals("Customer Organization")) 
                for (UserAccount us : organization.getUserAccountDirectory().getUserAccountList()) 
                    for (OnlineSalesRequest salesRequest : us.getOnlineSalesQueue().getOnlinesalesRequestList()) 
                        osq.getOnlinesalesRequestList().add(salesRequest);

        for (OnlineSalesRequest salesRequest : osq.getOnlinesalesRequestList()) 
            for (OnlineSales item : salesRequest.getItemOrder().keySet()){
                int count = 0;
                if (itemRank.containsKey(item.getItemname())) 
                    count = itemRank.get(item.getItemname());
                
                count = count + salesRequest.getItemOrder().get(item);
                itemRank.put(item.getItemname(), count);
        }
            
        ArrayList<Map.Entry<String, Integer>> rankList = new ArrayList(itemRank.entrySet());

        Collections.sort(rankList, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue() + o2.getValue();
            }
        });

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < 5; i++) {
            dataset.setValue(rankList.get(i).getValue(), "a", rankList.get(i).getKey());
        }
        JFreeChart chart = ChartFactory.createBarChart("Item Order", "Item Name", "Number", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) p.getRenderer();
        renderer.setSeriesPaint(0, new Color(215,145,54));
        p.setRangeGridlinePaint(Color.black);
        ChartFrame chartFrame = new ChartFrame("Most popular items", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(800, 600);
    }//GEN-LAST:event_popItemButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton popCourseButton;
    private javax.swing.JButton popItemButton;
    private javax.swing.JButton popTrainerButton;
    // End of variables declaration//GEN-END:variables
}
