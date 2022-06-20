public class Point {

    private final int x;
    private final int y;

    Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public static int manhattanDistance(Point p1 , Point p2){
        return Math.abs(p1.x - p2.x) + Math.abs(p2.y - p1.y);
    }

}
