
public class RectangleArea {

    // Function to find area
    public static int findArea(int length, int breadth) {
        int area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        int result = findArea(5, 4);   // calling the function
        System.out.println("Area of rectangle is: " + result);
    }
}
