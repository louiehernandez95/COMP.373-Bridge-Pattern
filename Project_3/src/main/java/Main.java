/**
 * Created by louie on 4/14/2017.
 */
public class Main
{
    public static void main( String[] args ) {
        Shape s1,s2;
        Drawing dp;

        dp=new Drawing1();
        s1=new Rectangle(dp,1,1,2,2);
        dp=new Drawing2();
        s2=new Circle(dp,2,2,3);

        s1.draw();
        System.out.println("***Rectangle drawn***\n");
        s2.draw();
        System.out.println("***Circle drawn***");
    }
}