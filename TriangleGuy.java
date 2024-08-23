//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TriangleGuy {
    public static void main(String[] args) {
        double width, height, hypotenuse; //Sides of the triangle
        width = 62;
        height = 86;
        hypotenuse = Math.sqrt(width*width + height*height);

        System.out.println("\n The width of the triangle is:");
        System.out.println(width);
        System.out.println("\n The height of the triangle is:");
        System.out.println(height);
        System.out.println("\n Thus, the length of the triangle's hypotenuse according to the Pythagorean Theorem is:");
        System.out.println(hypotenuse);


    }
}