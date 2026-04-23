class Point {
    int x, y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p1 = new Point();          // default
        Point p2 = new Point(10, 20);    // parameterized
        Point p3 = new Point(p2);        // copy

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("Parameterized Constructor:");
        p2.display();

        System.out.println("Copy Constructor:");
        p3.display();
    }
}