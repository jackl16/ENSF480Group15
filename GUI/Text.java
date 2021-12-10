package GUI;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;  
import java.awt.Graphics;

public class Text implements Component {
    String label;

    int x;
    int y;
    int gridwidth;
    int width;
    int height;
    String text;
    JLabel l;

    public Text(String label, String text, int x, int y, int gridwidth, int width, int height) {
        this.label = label;
        this.text = text;
        this.x = x;
        this.y = y;
        this.gridwidth = gridwidth;
        this.width = width;
        this.height = height;
        l = new JLabel(text);
        l.setBounds(this.x, this.y, this.width, this.height);
    }

    public void setText(String t) {
        this.text = t;
        this.l.setText(this.text);
    }

    public String getLabel() {
        return this.label;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void draw(JPanel p)
    {
        p.add(l);
    }

    public void draw(JPanel p, GridBagConstraints gbc) {
        if (this.gridwidth == 2) {
            gbc.anchor = GridBagConstraints.CENTER;
        }
        if (this.gridwidth == 1) {
            if (this.x == 0) {
                gbc.anchor = GridBagConstraints.LINE_END;
            } else if (this.x == 1) {
                gbc.anchor = GridBagConstraints.LINE_START;
            }
        }

        gbc.gridwidth = this.gridwidth;
        gbc.gridx = this.x;
        gbc.gridy = this.y;
        p.add(l, gbc);
    }
}
