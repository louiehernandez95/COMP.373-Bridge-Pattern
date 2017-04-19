/**
 * Created by louie on 4/14/2017.
 */
public class Main
{
    public static void main( String[] args ) {
        Shape shape1,shape2;
        Drawing drawing;

        drawing=new Time_2_Draw();
        shape1=new Rectangle(drawing,1,1,2,2);
        drawing=new Time_2_Draw();
        shape2=new Circle(drawing,2,2,3);

        shape1.draw();
        System.out.println("***Rectangle drawn***\n");
        shape2.draw();
        System.out.println("***Circle drawn***");
    }
}