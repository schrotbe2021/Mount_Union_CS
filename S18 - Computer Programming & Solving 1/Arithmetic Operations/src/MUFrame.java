/* CSC xxx Project/Lab # x
 * Samantha Student
 * Today's Date
 *
 * Project Description:
 *
 * Acknowledgements:
 * 
 */

import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class MUFrame extends javax.swing.JFrame {

    private Integer totalGoalsTot, totalAssistsCum, count, total, gpTotal, min, max;
    private Double goalsAverage;
    // declare private data here
    
    
    
    
    
    
    
    
    // constructor method
    public MUFrame() {
        initComponents();
        count = 0;
        totalGoalsTot = 0;
        totalAssistsCum = 0;
        gpTotal = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        
        
        
        
        
        
    } // end of constructor
    
    // declare other methods here
    
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingPanel = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        editNameLabel = new javax.swing.JLabel();
        gamesPlayedLabel = new javax.swing.JLabel();
        gamesPlayedTextField = new javax.swing.JTextField();
        goalsLabel = new javax.swing.JLabel();
        goalsTextField = new javax.swing.JTextField();
        assistsTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        processDataButton = new javax.swing.JButton();
        displayStatsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editNameLabel.setText("Name:");

        gamesPlayedLabel.setText("Games Played:");

        goalsLabel.setText("Goals:");

        jLabel1.setText("Assists:");

        jLabel3.setText("NHL Player");

        processDataButton.setText("Process Form Data");
        processDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processDataButtonActionPerformed(evt);
            }
        });

        displayStatsButton.setText("Display Numeric Stats");
        displayStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStatsButtonActionPerformed(evt);
            }
        });

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawingPanelLayout.createSequentialGroup()
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drawingPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(drawingPanelLayout.createSequentialGroup()
                                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gamesPlayedLabel)
                                    .addComponent(jLabel1)
                                    .addComponent(editNameLabel)
                                    .addComponent(goalsLabel))
                                .addGap(18, 18, 18)
                                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gamesPlayedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(goalsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(assistsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(drawingPanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(processDataButton)
                                .addGap(50, 50, 50)
                                .addComponent(displayStatsButton))))
                    .addGroup(drawingPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawingPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamesPlayedLabel)
                    .addComponent(gamesPlayedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goalsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goalsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assistsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(62, 62, 62)
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayStatsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(processDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processDataButtonActionPerformed
        
         String namePlayer, nameGoalie, goals, assists, gamesPlayed;
       
        namePlayer = nameTextField.getText();
        goals = goalsTextField.getText();
        assists = assistsTextField.getText();
        gamesPlayed = gamesPlayedTextField.getText();     
        
        
        String goalsInput = goalsTextField.getText();
        Integer goalsScored = Integer.parseInt(goalsInput);
        
        Integer assistsDealt = Integer.parseInt(assists);
        Integer gamesPlayedNum = Integer.parseInt(gamesPlayed);
               
        
            
            outputArea.append(namePlayer + " had " + goals + " goals and " + assistsDealt + " assists in " + gamesPlayedNum + " games played in the 2018 season.\n\n");

        
        
    }//GEN-LAST:event_processDataButtonActionPerformed

    private void displayStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayStatsButtonActionPerformed
        String namePlayer, goals, assists, gamesPlayed;
        Integer count;
        
        namePlayer = nameTextField.getText();
      
        goals = goalsTextField.getText();
        
        String goalsInput = goalsTextField.getText();
        Integer goalsScored = Integer.parseInt(goalsInput);
        
        totalGoalsTot = totalGoalsTot + goalsScored;
        outputArea.append("     So far there have been " + totalGoalsTot + " goals scored this year in the NHL.\n\n");
        
        assists = assistsTextField.getText();
        String assistsInput = assistsTextField.getText();
        Integer assistsGiven = Integer.parseInt(assistsInput);
        
        
        totalAssistsCum = totalAssistsCum + assistsGiven;
        outputArea.append("     So far there have been " + totalAssistsCum + " assists this year in the NHL.\n\n");
        
        gamesPlayed = gamesPlayedTextField.getText();
        String gamesPlayedNum = gamesPlayedTextField.getText();
        Integer gsNum = Integer.parseInt(gamesPlayedNum);
        
        gpTotal = gpTotal + gsNum;
        
        DecimalFormat avg = new DecimalFormat("#.000");
        goalsAverage = 1.0 * totalGoalsTot / gpTotal;
       
        outputArea.append("     The avergae goals scored per games this year is " + avg.format(goalsAverage) + " among players.\n\n");
        
                
        if(goalsScored < min){
            min = goalsScored;
        }
        outputArea.append("     The lowest number of goals this season was " + min + " goals.\n\n");
        
        if(goalsScored > max){
            max = goalsScored;
        }
        outputArea.append("     The highest number of goals scored this season was " + max + " goals.\n\n");
        
        

        
       
               
        
        
        
        
    }//GEN-LAST:event_displayStatsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MUFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assistsTextField;
    private javax.swing.JButton displayStatsButton;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JLabel editNameLabel;
    private javax.swing.JLabel gamesPlayedLabel;
    private javax.swing.JTextField gamesPlayedTextField;
    private javax.swing.JLabel goalsLabel;
    private javax.swing.JTextField goalsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton processDataButton;
    // End of variables declaration//GEN-END:variables
}
