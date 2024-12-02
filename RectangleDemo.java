class Rectangle {
    double length;
    double breadth;

    // constructor to initialize rectangle
    Rectangle(double len, double bre) {
        length = len;
        breadth = bre;
    }

    // method to calculate area
    double getArea() {
        return length * breadth;
    }

    // method to calculate perimeter
    double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class RectangleDemo {
    public static void main(String args[]) {
System.out.println("AMBRISH KALIA 2230143");
  // create object of Rectangle
        Rectangle myRect = new Rectangle(10, 20);

        // calculate and print area
        double area = myRect.getArea();
        System.out.println("Area of rectangle is " + area);

        // calculate and print perimeter
        double perimeter = myRect.getPerimeter();
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}