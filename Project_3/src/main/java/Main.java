/**
 * Created by louie on 4/14/2017.
 */
public class Main
{
    public static void main( String[] args ) {
        Shape circle1=new Circle(10,new BlackCircle());
        Shape circle2=new Circle(20,new WhiteCircle());
        circle1.draw();
        circle2.draw();
    }
}