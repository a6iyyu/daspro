public class Dragon {
    int x, y, width, height;
    public Dragon(int x1, int y1, int w, int h) {
        x = x1;
        y = y1;
        width = w;
        height = h;
    }
    void moveLeft() {
        if (x > 0) {
            x = x - 1;
        }
        PrintPosition();
        DetectCollision();
    }
    void moveRight() {
        if (x < width) {
            x = x + 1;
        }
        PrintPosition();
        DetectCollision();
    }
    void moveUp() {
        if (y > 0) {
            y = y - 1;
        }
        PrintPosition();
        DetectCollision();
    }
    void moveDown() {
        if (y < height) {
            y = y + 1;
        }
        PrintPosition();
        DetectCollision();
    }
    void PrintPosition() {
        System.out.printf("(%d, %d)\n", x, y);
    }
    void DetectCollision() {
        if (x <= 0 || y <= 0 || x >= width || y >= height)
            ;
        System.out.println("GAME OVER");
    }
    public static void main(String[] args) {
        Dragon d = new Dragon(9, 10, 25, 20);
        d.PrintPosition();
        d.moveLeft();
        d.moveUp();
        d.moveLeft();
    }
}