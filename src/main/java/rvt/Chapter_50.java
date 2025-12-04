package rvt;

public class Chapter_50 {
    public static void main(String[] args) {
        // Making default box width=2.5, height=5.0, lenght=6.0(part 1 and 2)
        Box box = new Box(2.5,5.0,6.0);
        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
        System.out.println( "length: " + box.length + " height: " + box.height +
        " width: " + box.width);
        System.out.println( "topArea: "  + box.topArea());

        // Making an oldBox with original box parameters(part 3)
        System.out.println("\noldBox");
        Box oldBox = new Box(box);
        System.out.println( "Area: "  + oldBox.area() + " volume: " + oldBox.volume() );
        System.out.println( "length: " + oldBox.length + " height: " + oldBox.height +
        " width: " + oldBox.width);
        System.out.println( "topArea: "  + oldBox.topArea());

        // Changing size of original box(test if program can change the original box)
        System.out.println("\nChanging box");
        box = new Box(5.0, 2.0, 1.0);
        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
        System.out.println( "length: " + box.length + " height: " + box.height +
        " width: " + box.width);
        System.out.println( "topArea: "  + box.topArea());

        // Making oldBox smaller(part 4)
        System.out.println("\nMaking smaller box");
        System.out.println( "Area: "  + box.smallerBox(oldBox).area() + " volume: " + box.smallerBox(oldBox).volume() );
        System.out.println( "length: " + box.smallerBox(oldBox).length + " height: " + box.smallerBox(oldBox).height +
        " width: " + box.smallerBox(oldBox).width);
        System.out.println( "topArea: "  + box.smallerBox(oldBox).topArea());
        
        // Checking if insideBox fits in outsideBox(part 5 test 1)
        System.out.println("\nMaking an outsideBox and insideBox and checking if it fits in it");
        Box insideBox = new Box(2.0, 4.0, 5.0); 
        Box outsideBox = new Box(3.0, 5.0, 6.0);
        System.out.print("Box 1 nests in Box 2?: ");
        System.out.println(insideBox.nests(outsideBox));

        // Checking if tooWideBox fits in smallOuterBox (part 5 test 2)
        Box tooWideBox = new Box(5.0, 2.0, 1.0);
        Box smallOuterBox = new Box(4.0, 3.0, 2.0);
        System.out.print("Box 3 nests in Box 4?: ");
        System.out.println(tooWideBox.nests(smallOuterBox));
    }
    

    public static class Box {
        
        private double faceArea, topArea, sideArea;
        double volume;
        public double width, height, length;
        private boolean fitsLength, fitsWidth, fitsHeight = false;
        public Box(double width, double height, double length) {
            volume = width * height * length;
            

            faceArea = width * height;
            topArea = width * length;
            sideArea = length * height;

            this.width = width;
            this.height = height;
            this.length = length;
        }

        public Box( Box oldBox ) {
            this.width = oldBox.width;
            this.height = oldBox.height;
            this.length = oldBox.length;

            volume = width * height * length;
            

            faceArea = width * height;
            topArea = width * length;
            sideArea = length * height;
        }

        public boolean nests( Box outsideBox) {

            if (this.length <= outsideBox.length){
                fitsLength = true;
            }
            if (this.width <= outsideBox.width){
                fitsWidth = true;
            }
            if (this.height <= outsideBox.height){
                fitsHeight = true;
            }

            return fitsLength && fitsWidth && fitsHeight;
        }
        public Box biggerBox( Box oldBox ){
        return new Box( 1.25*oldBox.width, 1.25*oldBox.height,1.25*oldBox.length);
        }

        public Box smallerBox( Box oldBox ){
        return new Box( 0.75*oldBox.width, 0.75*oldBox.height,0.75*oldBox.length);
        }

        public Box(double side){

        }

        public double volume(){
            return volume;
        }

        double area(){
            return 2 * (faceArea() + topArea() + sideArea());
        }

        private double faceArea(){
            return faceArea;
        }
        private double topArea(){
            return topArea;
        }
        private double sideArea(){
            return sideArea;
        }

    }
}
