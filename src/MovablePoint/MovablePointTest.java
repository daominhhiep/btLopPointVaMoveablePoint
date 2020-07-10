package MovablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(1.5f, 1.5f, 1.5f, 3f);
        System.out.println(movablePoint);
        for (int i = 0; i < 5; i++) {
            movablePoint.move(movablePoint);
            System.out.println(movablePoint);
        }
    }
}
