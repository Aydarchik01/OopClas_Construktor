public class Rectangle {
    int sale;
    int left;
    int right;
    int floor;

    public Rectangle(int sale, int left, int right, int floor) {
        this.sale = sale;
        this.left = left;
        this.right = right;
        this.floor = floor;
    }


    @Override
    public String toString() {
        return "Rectangle\n" +
                "sale: " + sale + "\n" +
                "left: " + left + "\n" +
                "right: " + right + "\n" +
                "floor: " + floor + "\n";
    }
}
