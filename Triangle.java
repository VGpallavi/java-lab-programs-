package javaact;

class Triangle 
{
    double side1;
    double side2;
    double side3;
    Triangle() 
    {
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }
    Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double calculatePerimeter() 
    {
        return side1 + side2 + side3;
    }
    double calculateArea() 
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) 
    {
        Triangle triangle = new Triangle(4, 6, 7);
        double perimeter = triangle.calculatePerimeter();
        System.out.println("Perimeter of the triangle: " + perimeter);
        double area = triangle.calculateArea();
        System.out.println("Area of the triangle: " + area);
    }
}
