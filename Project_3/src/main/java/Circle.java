/**
 * Created by louie on 4/17/2017.
 */
public class Circle extends Shape
{
    private double x,y,r;

    public Circle(Drawing d,double x_intercept,double y_intercept,double radius)
    {
        super(d);
        x=x_intercept;
        y=y_intercept;
        r=radius;
    }

    public void draw()
    {
        drawCircle(x,y,r);
    }
}