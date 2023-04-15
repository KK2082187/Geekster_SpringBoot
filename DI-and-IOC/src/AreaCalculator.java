public class AreaCalculator {
    Shapes genricShapes;
    public AreaCalculator(Shapes genericShapes){
        this.genricShapes = genericShapes;
    }
    void printArea(){
        genricShapes.getArea();
    }
}
