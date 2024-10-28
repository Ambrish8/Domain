class Box {
    double width;
    double height;
    double depth;

    // compute and return volume
    double getVolume() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo {
    public static void main(String args[]) {
       	 System.out.println("AMBRISH KALIA 2230143");
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // Assign values to mybox1 using instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // Assign values to mybox2 using parameterized method
        mybox2.setDim(5, 10, 15);

        // Get volumes of two boxes
        double vol1 = mybox1.getVolume();
        double vol2 = mybox2.getVolume();

        System.out.println("Volume of mybox1 is " + vol1);
        System.out.println("Volume of mybox2 is " + vol2);
    }
}