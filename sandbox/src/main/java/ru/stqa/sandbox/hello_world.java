package ru.stqa.sandbox;

public class hello_world {


    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("anastasiya");

        Square s = new Square(5);

        Rectangle r = new Rectangle(4, 6);

        Point p1= new Point(2,3);


        Point p2= new Point (6,8);



        System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

        System.out.println(" Площадь прямоугольника  со сторонами" + r.a + "и" + r.b + "=" + r.area());
        System.out.println(" Рассстояние между точками" + p1.x+","+p1.y + " и " + p2.x+","+ p2.y + "=" + p1.distance());
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody + "!");
    }



}


