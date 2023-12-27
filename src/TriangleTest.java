public class TriangleTest {
    public static void main(String[] args) throws TriangleException {
//        Triangle triangle = new Triangle(2,3,4);
        try {
            Triangle triangle = new Triangle(-4,3,4);
        }catch (TriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
