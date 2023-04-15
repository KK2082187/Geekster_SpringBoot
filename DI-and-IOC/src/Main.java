public class Main {
    public static void main(String[] args) {
    Triangle t1 = new Triangle(2,1);
    Square s1 = new Square(10);
    AreaCalculator ac = new AreaCalculator((s1));
    ac.printArea();

    }
}