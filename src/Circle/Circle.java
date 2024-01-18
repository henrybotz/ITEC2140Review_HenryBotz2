package Circle;

public class Circle {
    private double radius;

    public Circle()
    {
        radius = 0;
    }

    public Circle(double ls)
    {
        radius = ls;
    }


    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double newRadiusOfCircle)
    {
        radius =  newRadiusOfCircle;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;

    }

    public double getDiameter()
    {
        return radius * 2;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    public String toString()
    {
        return "Radius: " + radius + "," + " Area: " + getArea() + "," +  " Diameter: " + getDiameter() + "," + " Circumference: " + getCircumference();

    }
}
