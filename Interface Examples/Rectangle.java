public class Rectangle implements Relatable {
    public int width = 0;
    public int height = 0;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width*height;
    }

    public int isLargerThan(Relatable other) {
        Rectangle otherRect = (Rectangle)other;
        if (this.getArea() < otherRect.getArea()) {
            return -1;
        } else if (this.getArea() > otherRect.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}