package Point;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(1.2f, 3.5f);
        System.out.println(point);

        float[] arr = point.getXY();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}