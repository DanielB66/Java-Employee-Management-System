public class Point {
    private double x;    // x-coordinate 
    private double y;    // y-coordinate 
    
    // point initialized from parameters 
    public Point(double x, double y) { 
        this.x = x; 
        this.y = y; 
    } 

    // accessor methods 
    public double getX() { return x; } 
    public double getY() { return y; } 

    // return a string representation of this point 
    public String toString() { 
        return "(" + x + ", " + y + ")"; 
    }  
     
    // compare this point to that point and return true if equal 
    public boolean equals(Point that) { 
        return this.x == that.x && this.y == that.y; 
    } 
     
    // Euclidean distance between this point and that point 
    public double distanceTo(Point that) { 
        double dx = this.x - that.x; 
        double dy = this.y - that.y; 
        return Math.sqrt(dx*dx + dy*dy); 
    } 
}
