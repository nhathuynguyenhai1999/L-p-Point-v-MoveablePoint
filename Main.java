package DesignPointAndSomething;

public class Main {
    public Main(int i, int i1, int i2, int i3) {
    }

    class MovablePoint extends Point {
        private float xSpeed;
        private float ySpeed;

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        // Getter và setter cho xSpeed và ySpeed
        public float getXSpeed() {
            return xSpeed;
        }

        public void setXSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getYSpeed() {
            return ySpeed;
        }

        public void setYSpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        // Phương thức để di chuyển Point theo xSpeed và ySpeed
        public void move() {
            setX(getX() + xSpeed);
            setY(getY() + ySpeed);
        }

        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + getX() +
                    ", y=" + getY() +
                    ", xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }
    }
    public static void main(String[] args){
        Point point = new Point(2, 3);
        System.out.println("Point: " + point);
        
        
      Main moveablePoint  = new Main(5,7,2,3);
        System.out.println("MovablePoint before moving: " + moveablePoint);

        moveablePoint.move();
        System.out.println("MovablePoint after moving: " + moveablePoint);
    }
    private void move() {
    }
}
