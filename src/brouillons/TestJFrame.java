/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brouillons;
/*
import brouillons.VerticalLabelUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
/*
/**
 *
 * @author majdi
 */
/*public class TestJFrame extends JFrame {
 private JTabbedPane pane;
    /**
     * Creates new form TestJFrame
     */
   /* public TestJFrame() {
        initComponents();
         //http://www.camick.com/java/source/VerticalLabelUI.java
    VerticalLabelUI ui = new VerticalLabelUI();

    pane = new JTabbedPane();
    //pane.setUI(new MyUI());
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    getContentPane().add(pane, BorderLayout.CENTER);
    setSize(400, 300);
    setLocationRelativeTo(null);

    pane.addTab("tab1", new JLabel("<html><div align = \"left\"><font color=red>Test</font></div></html>"));
    pane.addTab("tab2", new JLabel("Test2"));

    JLabel[] tabLabels = new JLabel[2];
    tabLabels[0] = new JLabel("<html><font color=red>Test");
    tabLabels[1] = new JLabel("<html><p style = \"text-align:left\"><font color=red>Test Test</font></p></html>");
    int height = 0;
    for (JLabel tabLabel : tabLabels) {
      tabLabel.setUI(ui);
      height = Math.max(height, tabLabel.getPreferredSize().height);
    }
    System.out.println(height);
    for (int i = 0; i < tabLabels.length; i++) {
      //tabLabels.setPreferredSize(new Dimension(tabLabels[i].getPreferredSize().width, height));

pane.setTabComponentAt(i, tabLabels[i]);
*/
//}
        
        
        
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
/*
 
 import darrylbu.plaf.vertical.VerticalLabelUI;
import java.awt.*;
import javax.swing.*;

public class TestJFrame extends JFrame {

  private JTabbedPane pane;

  public TestJFrame() {
    //http://www.camick.com/java/source/VerticalLabelUI.java
    VerticalLabelUI ui = new VerticalLabelUI();

    pane = new JTabbedPane();
    //pane.setUI(new MyUI());
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    getContentPane().add(pane, BorderLayout.CENTER);
    setSize(400, 300);
    setLocationRelativeTo(null);

    pane.addTab("tab1", new JLabel("<html><div align = \"left\"><font color=red>Test</font></div></html>"));
    pane.addTab("tab2", new JLabel("Test2"));

    JLabel[] tabLabels = new JLabel[2];
    tabLabels[0] = new JLabel("<html><font color=red>Test");
    tabLabels[1] = new JLabel("<html><p style = \"text-align:left\"><font color=red>Test Test</font></p></html>");
    int height = 0;
    for (JLabel tabLabel : tabLabels) {
      tabLabel.setUI(ui);
      height = Math.max(height, tabLabel.getPreferredSize().height);
    }
    System.out.println(height);
    for (int i = 0; i < tabLabels.length; i++) {
      tabLabels.setPreferredSize(new Dimension(tabLabels[i].getPreferredSize().width, height));

pane.setTabComponentAt(i, tabLabels[i]);

}

}



public static void main(String args[]) {

EventQueue.invokeLater(new Runnable() {



public void run() {

new TestJFrame().setVisible(true);

}

});

}

}

 
 
 
 
 */