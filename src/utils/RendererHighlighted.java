/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RendererHighlighted extends DefaultTableCellRenderer {

//    private JTextField searchField;
    List<String> tokens = null;

//    public RendererHighlighted(JTextField searchField) {
//        this.searchField = searchField;
//    }
    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        JLabel original = (JLabel) c;
        LabelHighlighted label = new LabelHighlighted();
        
        label.setFont(original.getFont());
        label.setText(original.getText());
        label.setBackground(original.getBackground());
        label.setForeground(original.getForeground());
        label.setHorizontalTextPosition(original.getHorizontalTextPosition());
        
//        List<String> tokens = split(String.valueOf(searchField.getText().toLowerCase()));
        
        switch (column) {
            case 5: 
                label.setHorizontalAlignment(JLabel.RIGHT);
                break;
            case 6: 
                label.setHorizontalAlignment(JLabel.RIGHT);
                break;
            case 7: 
                label.setHorizontalAlignment(JLabel.RIGHT);
                break;
            default: 
                label.setHorizontalAlignment(JLabel.LEFT);
                break;
        }
        
        // tabela zebrada
        if (row % 2 == 0) {
            label.setForeground(new Color(56, 56, 56));
            label.setBackground(new Color(247, 247, 247));
        } else {
            label.setForeground(new Color(56, 56, 56));
            label.setBackground(new Color(237, 237, 237));
        }
        
        if (isSelected) {
            label.setForeground(new Color(255, 255, 255));
            label.setBackground(new Color(51, 153, 255));
        }
        
        if (tokens != null) {
            label.highlightText(tokens);
        }
        return label;
    }

//    public List<String> split(String str) {
//        List<String> tokens = new ArrayList<>();
//        StringTokenizer tok = new StringTokenizer(str);
//        while (tok.hasMoreTokens()) {
//            String token = tok.nextToken().trim();
//            if (token.length() > 0) {
//                tokens.add(token);
//            }
//        }
//        return tokens;
//    }
}
