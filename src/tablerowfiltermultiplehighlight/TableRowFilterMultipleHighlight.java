/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablerowfiltermultiplehighlight;

import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rodrigo
 */
public class TableRowFilterMultipleHighlight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (info.getName().equals("Windows")) {
                    //if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir sistema, motivo:\n" + ex.getMessage(), "Erro ao incializar", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormTableSearch().setVisible(true);
        });
    }
    
}
