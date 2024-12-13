import java.util.Scanner;
class Triangle {
    double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void displaySides() {
        System.out.println("Triangle Sides: " + a + ", " + b + ", " + c);
    }

    public String findTriangleType() {
        if (a == b && b == c) {
            return "Equilateral Triangle";
        } else if (a == b || b == c || a == c) {
            return "Isosceles Triangle";
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
            return "Right-Angled Triangle";
        } else {
            return "Scalene Triangle";
        }
    }
}

class TriangleDemo {
    public static void main(String args[]) {
System.out.println("AMBRISH KALIA 2230143");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter Side c: ");
        double c = scanner.nextDouble();

        Triangle triangle = new Triangle(a, b, c);
        triangle.displaySides();
        System.out.println("Triangle Type: " + triangle.findTriangleType());
    }
}