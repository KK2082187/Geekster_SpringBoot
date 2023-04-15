public class Triangle implements Shapes{
 private int height;
 private int base;
 public Triangle(int height,int base){
     this.height = height;
     this.base = base;
 }
 public int getHeight(){
     return height;
 }
 public int getBase(){
     return base;
 }
 public void setHeight(int height){
     this.height = height;
 }
    public void setBase(int base){
        this.base = base;
    }
    @Override
    public  void getArea(){
        System.out.println(0.5*height*base);
    }
}
