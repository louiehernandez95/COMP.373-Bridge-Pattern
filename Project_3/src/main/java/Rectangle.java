/**
 * Created by louie on 4/18/2017.
 */
public class Rectangle extends Shape {

    private double x1,x2,y1,y2;

    public Rectangle(Drawing d,double x_intercept1,double y_intercept1,double x_intercept2,double y_intercept2)
    {
        super(d);
        x1=x_intercept1;
        x2=x_intercept2;
        y1=y_intercept1;
        y2=y_intercept2;
    }

    public void draw()
    {
        drawRectangle(x1,y1,x2,y1);
        drawRectangle(x2,y1,x2,y2);
        drawRectangle(x1,y2,x1,y2);
        drawRectangle(x1,y2,x1,y1);
    }
}

