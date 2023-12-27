import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) throws TriangleException {
//        Triangle triangle = new Triangle(2,3,4);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        try {
            Triangle triangle = new Triangle(a,3,4);
        }catch (TriangleException e){
            System.out.println(e.getMessage());
        }
        int b;
        System.out.print("Nhap: ");
        while (true) {
            try {
                b = Integer.parseInt(scanner.nextLine());
                System.out.println(b);
                break;
            } catch (NumberFormatException e) {
                System.out.print("nhập số đi mày: ");
            }
        }
    }
}
