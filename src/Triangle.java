public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws TriangleException {
        if (a<=0||b<=0||c<=0){
            throw new TriangleException("có cạnh là số âm");
        }
        if (a+b<=c||a+c<=b||b+c<=a){
            throw new TriangleException("không phải 3 cạnh của tam giác");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
