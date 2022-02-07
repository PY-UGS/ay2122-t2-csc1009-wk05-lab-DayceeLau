public class Wk05Q2Triangle extends Shape{

    public Wk05Q2Triangle (Double dim1, Double dim2){
        super(dim1, dim2);
    }
    public  Double area(){
        System.out.println("Inside Area for Triangle.");
        return (dim1 * dim2)/2;
    }
}
