package com.fernando.personal;


import com.google.gson.JsonObject;

import javax.swing.*;
import java.io.IOException;

/**
 *
 * @author smari
 */
public class WeatherGUI extends javax.swing.JFrame {

    private static String JsonObj;

    public WeatherGUI(String forecast) throws IOException {
        this.JsonObj = forecast;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws IOException {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather Channel");
        setPreferredSize(new java.awt.Dimension(500, 650));
        setResizable(false);
        getContentPane().setLayout(null);
        infoSet IS = new infoSet(JsonObj);

        jLabel1.setPreferredSize(new java.awt.Dimension(125, 125));
        getContentPane().add(jLabel1);
        jLabel1.setIcon(new ImageIcon(IS.setIcon()));
        jLabel1.setBounds(10, 10, 180, 150);

        jLabel2.setText(IS.setTime());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 10, 280, 50);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(80, 200, 340, 10);

        jLabel3.setText(IS.setMaxTemp(0));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 70, 100, 80);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(320, 70, 20, 90);
        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setText(IS.setMinTemp(0));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 70, 110, 80);

        jButton1.setText("More");
        jButton1.setToolTipText("");
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 590, 110, 30);

        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(80, 350, 350, 10);
        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel5);
        jLabel5.setIcon(new ImageIcon(IS.miniSet("precipProb")));

        jLabel5.setBounds(20, 210, 70, 60);

        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel6);
        jLabel6.setIcon(new ImageIcon(IS.miniSet("pressure")));

        jLabel6.setBounds(20, 280, 70, 50);

        jLabel7.setText(IS.setPrecipProb());
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 230, 130, 20);

        jLabel8.setText(IS.setPressure());
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 290, 130, 20);

        jLabel9.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel9);
        jLabel9.setIcon(new ImageIcon(IS.miniSet("wind")));

        jLabel9.setBounds(250, 220, 70, 50);

        jLabel10.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel10);
        jLabel10.setIcon(new ImageIcon(IS.miniSet("humidity")));

        jLabel10.setBounds(250, 280, 50, 50);

        jLabel11.setText(IS.setWindSpeed());
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 230, 150, 20);

        jLabel12.setText(IS.setHumidity());
        getContentPane().add(jLabel12);
        jLabel12.setBounds(320, 290, 150, 20);

        jLabel13.setPreferredSize(new java.awt.Dimension(75, 75));
        getContentPane().add(jLabel13);
        jLabel13.setIcon(new ImageIcon(IS.miniDay(1)));

        jLabel13.setBounds(30, 380, 100, 80);

        jLabel14.setPreferredSize(new java.awt.Dimension(75, 75));
        getContentPane().add(jLabel14);
        jLabel14.setIcon(new ImageIcon(IS.miniDay(2)));

        jLabel14.setBounds(30, 500, 100, 80);

        jLabel15.setPreferredSize(new java.awt.Dimension(75, 75));
        getContentPane().add(jLabel15);
        jLabel15.setIcon(new ImageIcon(IS.miniDay(3)));

        jLabel15.setBounds(260, 380, 90, 80);

        jLabel16.setPreferredSize(new java.awt.Dimension(75, 75));
        getContentPane().add(jLabel16);
        jLabel16.setIcon(new ImageIcon(IS.miniDay(4)));

        jLabel16.setBounds(260, 490, 100, 100);

        jLabel17.setText(IS.setMaxTemp(1));
        getContentPane().add(jLabel17);
        jLabel17.setBounds(120, 400, 80, 20);

        jLabel18.setText(IS.setMinTemp(1));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(120, 420, 80, 20);

        jLabel19.setText(IS.setMaxTemp(3));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(120, 500, 80, 20);

        jLabel20.setText(IS.setMinTemp(3));
        getContentPane().add(jLabel20);
        jLabel20.setBounds(120, 520, 80, 20);

        jLabel21.setText(IS.setMaxTemp(2));
        getContentPane().add(jLabel21);
        jLabel21.setBounds(360, 400, 90, 20);

        jLabel22.setText(IS.setMinTemp(2));
        getContentPane().add(jLabel22);
        jLabel22.setBounds(360, 420, 90, 20);

        jLabel23.setText(IS.setMaxTemp(4));
        getContentPane().add(jLabel23);
        jLabel23.setBounds(370, 500, 80, 20);

        jLabel24.setText(IS.setMinTemp(4));
        getContentPane().add(jLabel24);
        jLabel24.setBounds(370, 520, 70, 20);

        jLabel26.setText(IS.setSum());
        getContentPane().add(jLabel26);
        jLabel26.setBounds(210, 150, 230, 40);

        jButton2.setText("New Location");
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 590, 140, 30);

        jLabel25.setIcon(new ImageIcon(IS.setBackground()));
        jLabel25.setText("jLabel25");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 0, 500, 650);

        getAccessibleContext().setAccessibleName("Weather Channel ");

        pack();
    }// </editor-fold>


    public static void run() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WeatherGUI(JsonObj).setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration
}

