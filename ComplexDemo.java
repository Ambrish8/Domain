class Complex {
    double real, imaginary;

    // Constructor to accept a complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to display a complex number
    public void displayNumber() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }

    // Method to find the sum of two complex numbers
    public Complex add(Complex num) {
        double realSum = this.real + num.real;
        double imaginarySum = this.imaginary + num.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    // Method to find the product of two complex numbers
    public Complex multiply(Complex num) {
        double realProduct = this.real * num.real - this.imaginary * num.imaginary;
        double imaginaryProduct = this.real * num.imaginary + this.imaginary * num.real;
        return new Complex(realProduct, imaginaryProduct);
    }
}

class ComplexDemo {
    public static void main(String args[]) {
	System.out.println("AMBRISH KALIA 2230143");
        Complex num1 = new Complex(3, 4);
        Complex num2 = new Complex(1, 2);

        num1.displayNumber();
        num2.displayNumber();

        Complex sum = num1.add(num2);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");

        Complex product = num1.multiply(num2);
        System.out.println("Product: " + product.real + " + " + product.imaginary + "i");
    }
}