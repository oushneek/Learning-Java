package assignment_05;

class Shape {

    int area;

    public void color() {
        System.out.println("Class Shape has a color and its area is " + area + " square unit.");
    }
}

class Circle extends Shape {

}

class Square extends Shape {

    int a;

    @Override
    public void color() {
        System.out.println("Square has a color and its area is " + area + " square unit.");
    }

    public void length() {
        System.out.println("Length of the square  = " + a);
    }

}

public class OverRidingExample {

    public static void main(String[] args) {

        Shape i = new Shape();
        Circle j = new Circle();
        Square k = new Square();

//       Shape l = new Circle();
//       Shape m = new Square();
        i.area = 20;
        i.color();

        j.area = 10;
        j.color();

        k.a = 5;
        k.area = 25;
        k.color();
        k.length();

//       l.area= 30;
//       l.color();
//       
//      // m.a = 4;
//       m.area=16;
//       m.color();
//      // m.length();     
    }
}
