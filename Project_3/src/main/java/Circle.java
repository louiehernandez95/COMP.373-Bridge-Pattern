/**
 * Created by louie on 4/17/2017.
 */
public class Circle extends Shape {
    int radius;
    Circle(int radius,DrawAPI draw){
        super(draw);
        this.radius=radius;
    }

    @Override
    public void draw() {
        draw.drawShape(radius);
    }
}