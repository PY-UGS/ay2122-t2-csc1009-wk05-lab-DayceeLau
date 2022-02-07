public class Wk05Q2Circle extends Shape{
    
    public Wk05Q2Circle(Double dim1, Double dim2){
        super(dim1, dim2);
    }
    public  Double area(){
        System.out.println("Inside Area for Circle.");
        return PI * dim1 * dim2;
    }
}
