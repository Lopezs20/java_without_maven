package graphicObjects;

import java.util.RandomAccess;
import java.util.concurrent.RecursiveTask;

public class App {
    public static void main(String[] args){
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();
        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }
}
