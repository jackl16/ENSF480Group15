//Button.java

package GUI;
import java.awt.Graphics;
import java.awt.*;

public class aButton implements aComponent{
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected String text;

    public aButton(int x, int y, int width, int height, String text){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.text=text;
    }

    @Override
    public void draw(Graphics g){
        Button x= new Button(text);

        g.add(x);
        
    }
}