package rvt;

public class Chapter_50 {
    public static void main(String[] args) {
        Box box = new Box(2.5,5.0,6.0);
        System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

        System.out.println( "length: " + box.length + " height: " + box. height +
                         "width:  " + box.width )  ;
    }
    

    public static class Box {
        
        double volume;
        double area;
        double width, height, length;
        public Box(double width, double height, double length) {
            volume = width * height * length;
            area = width * length;

            width = this.width;
            height = this.height;
            length = this.length;
        }
        public Box(double side){

        }
        public double volume(){
            return volume;
        }
        public double area(){
            return area;
        }
    }
    

    
    

    
}
