//Text.java

package GUI;
import java.awt.Graphics;


public class Text implements aComponent{
    protected int x;
    protected int y;
    protected String text;

    public Text(String s, int x, int y){
        text = s;
        this.x=x;
        this.y=y;
    }

    @Override
    public void draw(Graphics g){
        g.drawString(text,x,y);
        
    }
    
}