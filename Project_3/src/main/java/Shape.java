/**
 * Created by louie on 4/17/2017.
 */
public abstract class Shape{
    DrawAPI draw;
    Shape(DrawAPI draw){
        this.draw=draw;
    }
    public abstract void draw();
}