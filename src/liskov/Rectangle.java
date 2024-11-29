package liskov;

 public class Rectangle implements  Shape{
     private int width;
     private int height;
     public Rectangle(int width, int height){
         this.height=height;
         this.width=width;
     }

     @Override
     public int getArea() {
         return width * height;
     }
 }
