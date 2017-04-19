/**
 * Created by louie on 4/17/2017.
 */
public abstract class Shape
{
    protected Drawing drawing;

    public abstract void draw();

    public Shape(Drawing dr)
    {
        drawing = dr;
    }

    protected void drawRectangle(double x1,double y1,double x2,double y2)
    {
        drawing.drawRectangle(x1,y1,x2,y2);
    }

    protected void drawCircle(double x,double y,double radius)
    {
        drawing.drawCircle(x,y,radius);
    }

}