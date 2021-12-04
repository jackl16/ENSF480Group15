//Decorator.java

package GUI;


public abstract class Decorator implements aComponent{
    protected Component cmp;
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public Decorator(Component c, int x, int y, int width, int height){
        cmp= c;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public abstract void draw(Graphics g);

}