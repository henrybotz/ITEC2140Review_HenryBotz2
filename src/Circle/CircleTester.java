package Circle;
public class CircleTester
{

    public static void main(String[] args){
        Circle circle0 = new Circle();

        Circle circle1= new Circle(3);

        Circle circle2 = new Circle(2);

        Circle circle3 = new Circle(6);

        System.out.println(circle0);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        circle0.setRadius(3.9);

        System.out.println(circle0);

        }

}
