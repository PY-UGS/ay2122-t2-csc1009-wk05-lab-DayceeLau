public class Wk05Q2Main {
    public static void main(String[] args) {
        Wk05Q2Rectangle r = new Wk05Q2Rectangle(9.0, 5.0);
        Wk05Q2Triangle t = new Wk05Q2Triangle(10.0, 8.0);
        Wk05Q2Circle c = new Wk05Q2Circle(5.0, 5.0);
        Wk05Q2Ellipse e = new Wk05Q2Ellipse(7.0, 7.0);
        Wk05Q2Square s = new Wk05Q2Square(6.0, 6.0);

        Shape figref; 
        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = c;
        System.out.println("Area is " + figref.area());
        
        figref = e;
        System.out.println("Area is " + figref.area());

        figref = s;
        System.out.println("Area is " + figref.area());

        System.exit(0); //Terminate current process
    }
}
