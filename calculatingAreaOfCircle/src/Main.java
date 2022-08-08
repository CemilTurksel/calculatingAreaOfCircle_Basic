import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int r;
        double pi = 3.14;
        double centerAngle;
        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        r = scanner.nextInt();

        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println("Area equals: " + area);
        System.out.println("Perimeter equals: " + perimeter);

        System.out.println("Enter center angle measure: ");
        a = scanner.nextInt();

        centerAngle = (pi * (r*r) * a) / 360;
        System.out.println("Circle center area: " + centerAngle);

    }
}
