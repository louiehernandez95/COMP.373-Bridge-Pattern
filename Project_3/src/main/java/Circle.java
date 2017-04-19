/**
 * Created by louie on 4/17/2017.
 */
public class Circle extends Shape
{
    private double x,y,r;

    public Circle(Drawing d,double x_intercept1,double y_intercept1,double radius1)
    {
        super(d);
        x=x_intercept1;
        y=y_intercept1;
        r=radius1;
    }

    public void draw()
    {
        drawCircle(x,y,r);
    }
}