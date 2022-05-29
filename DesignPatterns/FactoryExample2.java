package DesignPatterns;

interface Shape{
    void draw();
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Cirle Draw method");
    }
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle Draw method");
    }
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square Draw method");
    }
}
 class ShapeFactory{
    public Shape getShape(String type) {
       if(type.equalsIgnoreCase("CIRCLE"))
           return new Circle();
        if(type.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        if(type.equalsIgnoreCase("Square"))
            return new Square();
        else
            return null;
    }
}


public class FactoryExample2 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SquarE");
        shape3.draw();
    }
}
