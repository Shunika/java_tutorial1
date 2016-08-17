package ru.stqa.sandbox;

public class hello_world {


    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("anastasiya");

        Square s = new Square(5);

        Rectangle r= new Rectangle(4,6);

        System.out.println( "Площадь квадрата со стороной " + s.l+ "="+ area(s) );
        System.out.println(" Площадь прямоугольника  со сторонами" + r.a + "и" + r.b +"=" + area(r));
    }
        public static void hello (String somebody)
        {
            System.out.println("Hello,"+ somebody + "!");}
    public static double area (Square s )
    {return s.l*s.l;
    }

    public static double area (Rectangle r){
    return r.a*r.b;
}
    public static double distance(Point p1, Point p2)
}


