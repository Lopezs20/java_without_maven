package graphicObjects;

public abstract class GraphicObject {
    private int x,y;
    
    void move(int xa, int ya){
        System.out.println("Moving to X:" + xa + "\nMoving to Y: " + ya);
    }

    abstract void draw();
    abstract void resize();
    // abstract void render();
}