/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablerowfiltermultiplehighlight;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import utils.RendererHighlighted;
import utils.RequestFocusListener;

/**
 *
 * @author Rodrigo
 */
public class FormTableSearch extends javax.swing.JFrame {

    private static final Point point = new Point();
    List<Integer> list = new ArrayList<>();

    /**
     * Creates new form FormTableSearch
     */
    public FormTableSearch() {
        initComponents();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                point.x = e.getX();
                point.y = e.getY();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point p = getLocation();
                setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
            }
        });

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });

        jtfSearch.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFrame = new javax.swing.JPanel();
        jpNorth = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlClose = new javax.swing.JLabel();
        jlMinimize = new javax.swing.JLabel();
        jpCenter = new javax.swing.JPanel();
        jtfSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcbID = new javax.swing.JCheckBox();
        jcbNAME = new javax.swing.JCheckBox();
        jcbADDRESS = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Table Filter Highlight Words");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpFrame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 167, 167), 2, true));
        jpFrame.setLayout(new java.awt.BorderLayout());

        jpNorth.setBackground(new java.awt.Color(245, 245, 245));
        jpNorth.setPreferredSize(new java.awt.Dimension(664, 35));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(164, 164, 164));
        jLabel2.setText("Table Filter Highlight Words");

        jlClose.setBackground(new java.awt.Color(235, 235, 235));
        jlClose.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jlClose.setForeground(new java.awt.Color(145, 145, 145));
        jlClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlClose.setText("x");
        jlClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlClose.setFocusable(false);
        jlClose.setOpaque(true);
        jlClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCloseMouseExited(evt);
            }
        });

        jlMinimize.setBackground(new java.awt.Color(235, 235, 235));
        jlMinimize.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jlMinimize.setForeground(new java.awt.Color(145, 145, 145));
        jlMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMinimize.setText("_");
        jlMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMinimize.setFocusable(false);
        jlMinimize.setOpaque(true);
        jlMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpNorthLayout = new javax.swing.GroupLayout(jpNorth);
        jpNorth.setLayout(jpNorthLayout);
        jpNorthLayout.setHorizontalGroup(
            jpNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNorthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(jlMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpNorthLayout.setVerticalGroup(
            jpNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNorthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpNorthLayout.createSequentialGroup()
                .addGroup(jpNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpFrame.add(jpNorth, java.awt.BorderLayout.NORTH);

        jpCenter.setBackground(new java.awt.Color(236, 236, 236));

        jtfSearch.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtfSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Advanced search:");

        jcbID.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcbID.setSelected(true);
        jcbID.setText("ID");
        jcbID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbID.setFocusPainted(false);
        jcbID.setFocusable(false);
        jcbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIDActionPerformed(evt);
            }
        });

        jcbNAME.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcbNAME.setSelected(true);
        jcbNAME.setText("NAME");
        jcbNAME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbNAME.setFocusPainted(false);
        jcbNAME.setFocusable(false);
        jcbNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNAMEActionPerformed(evt);
            }
        });

        jcbADDRESS.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcbADDRESS.setSelected(true);
        jcbADDRESS.setText("ADDRESS");
        jcbADDRESS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbADDRESS.setFocusPainted(false);
        jcbADDRESS.setFocusable(false);
        jcbADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbADDRESSActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTable1.setBackground(new java.awt.Color(245, 245, 245));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23651", "ANDERSON", "62 Oak Valley St. Chevy Chase, MD 20815"},
                {"2655656", "LUCAS", "755 Mayfair Rd. Hillsborough, NJ 08844"},
                {"32322", "ANDREW", "997 Amerige Ave. Piscataway, NJ 08854"},
                {"43213332", "JAMES", "236 Jackson Dr. Pikesville, MD 21208"},
                {"498", "FELIPE", "9872 Brickell Street Leominster, MA 01453"},
                {"984", "JONAS", "85 E. 1st Ave. West Fargo, ND 58078"},
                {"9846546", "LUCY", "108 Hill Field St. Strongsville, OH 44136"},
                {"98654", "ANDERSON", "8928 Livingston St. Poughkeepsie, NY 12601"},
                {"654", "ROSE", "491 South Carriage Drive Beltsville, MD 20705"},
                {"698984984", "BATMAN", "197 Old York Avenue West Lafayette, IN 47906"}
            },
            new String [] {
                "ID", "NAME", "ADDRESS"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        javax.swing.GroupLayout jpCenterLayout = new javax.swing.GroupLayout(jpCenter);
        jpCenter.setLayout(jpCenterLayout);
        jpCenterLayout.setHorizontalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCenterLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbID)
                        .addGap(18, 18, 18)
                        .addComponent(jcbNAME)
                        .addGap(18, 18, 18)
                        .addComponent(jcbADDRESS))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCenterLayout.setVerticalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCenterLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbID)
                    .addComponent(jcbNAME)
                    .addComponent(jcbADDRESS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jpFrame.add(jpCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlCloseMouseClicked

    private void jlMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizeMouseClicked
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jlMinimizeMouseClicked

    private void jlCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseExited
        jlClose.setBackground(new Color(235, 235, 235));
        jlClose.setForeground(new Color(145, 145, 145));
    }//GEN-LAST:event_jlCloseMouseExited

    private void jlCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseEntered
        jlClose.setForeground(new Color(235, 235, 235));
        jlClose.setBackground(new Color(235, 91, 91));
    }//GEN-LAST:event_jlCloseMouseEntered

    private void jlMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizeMouseExited
        jlMinimize.setBackground(new Color(235, 235, 235));
        jlMinimize.setForeground(new Color(145, 145, 145));
    }//GEN-LAST:event_jlMinimizeMouseExited

    private void jlMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizeMouseEntered
        jlMinimize.setForeground(new Color(235, 235, 235));
        jlMinimize.setBackground(new Color(145, 145, 145));
    }//GEN-LAST:event_jlMinimizeMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SwingUtilities.invokeLater(() -> {
            try {
                jtfSearch.addAncestorListener(new RequestFocusListener());

                RowSorter<? extends TableModel> rs = jTable1.getRowSorter();

                if (rs == null) {
                    jTable1.setAutoCreateRowSorter(true);
                    rs = jTable1.getRowSorter();
                }

                TableRowSorter<DefaultTableModel> rowSorter = (TableRowSorter<DefaultTableModel>) rs;

                if (rowSorter == null) {
                    throw new RuntimeException("Cannot find appropriate rowSorter: " + rs);
                }

                RendererHighlighted renderer = new RendererHighlighted();

                jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        update(e);
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        update(e);
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        update(e);
                    }

                    private void update(DocumentEvent e) {
                        // clean memory
                        list.clear();

                        if (jcbID.isSelected()) {
                            list.add(0);
                        }
                        if (jcbNAME.isSelected()) {
                            list.add(1);
                        }
                        if (jcbADDRESS.isSelected()) {
                            list.add(2);
                        }

                        String text = jtfSearch.getText().trim();
                        if (text.length() == 0) {
                            rowSorter.setRowFilter(null);
                            renderer.setTokens(null);
                        } else {
                            final List<String> tokens = split(text.toLowerCase());
                            renderer.setTokens(tokens);
                            rowSorter.setRowFilter(makeRowFilter(tokens, list.toArray(new Integer[0])));
                        }
                    }
                });
                jTable1.setDefaultRenderer(Object.class, renderer);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }//GEN-LAST:event_formWindowOpened

    private void jcbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIDActionPerformed

    }//GEN-LAST:event_jcbIDActionPerformed

    private void jcbNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNAMEActionPerformed

    }//GEN-LAST:event_jcbNAMEActionPerformed

    private void jcbADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbADDRESSActionPerformed

    }//GEN-LAST:event_jcbADDRESSActionPerformed

    public RowFilter<TableModel, Integer> makeRowFilter(final List<String> tokens, final Integer... cols) {

        return new RowFilter<TableModel, Integer>() {

            @Override
            public boolean include(RowFilter.Entry<? extends TableModel, ? extends Integer> en) {

                for (String tok : tokens) {
                    for (int i = 0; i < cols.length; ++i) {
                        String val = en.getStringValue(cols[i]).toLowerCase();
                        if (val.contains(tok)) {
                            break;
                        } else if (i == cols.length - 1) {
                            return false;
                        }
                    }
                }
                return true;
            }

        };

    }

    public List<String> split(String str) {
        List<String> tokens = new ArrayList<>();
        StringTokenizer tok = new StringTokenizer(str);
        while (tok.hasMoreTokens()) {
            String token = tok.nextToken().trim();
            if (token.length() > 0) {
                tokens.add(token);
            }
        }
        return tokens;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox jcbADDRESS;
    private javax.swing.JCheckBox jcbID;
    private javax.swing.JCheckBox jcbNAME;
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlMinimize;
    private javax.swing.JPanel jpCenter;
    private javax.swing.JPanel jpFrame;
    private javax.swing.JPanel jpNorth;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
