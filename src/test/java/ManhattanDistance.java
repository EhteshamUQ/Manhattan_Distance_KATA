import java.lang.reflect.*;

public class ManhattanDistance {

   public static int manhattanDistance(Point p1, Point p2){
        int sum = 0;
        try {
            Class<? extends Point> c = p1.getClass();
            Class<? extends Point> c2 = p2.getClass();
            Field[] fieldsP1 = c.getDeclaredFields();
            Field[] fieldsP2 = c2.getDeclaredFields();

            for(int i = 0; i < fieldsP1.length ; i++){
               fieldsP1[i].setAccessible(true);
               fieldsP2[i].setAccessible(true);

               int val1 = (Integer) fieldsP1[i].get(p1);
               int val2 = (Integer) fieldsP2[i].get(p2);;

            sum += Math.abs(val2 - val1);
            }
        return sum;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
}
