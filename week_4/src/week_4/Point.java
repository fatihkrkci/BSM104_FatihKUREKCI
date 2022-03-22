package week_4;

public class Point {
    private int x;
    private int y;
    
    public Point(int initialX, int initialY){
        setLocation(initialX, initialY);
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public double distanceFromOrigin(){
        return Math.sqrt(x*x + y*y);
    }
    
    public void translate(int dx, int dy){
        setLocation(x+dx, y+dy);
    }
    
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
