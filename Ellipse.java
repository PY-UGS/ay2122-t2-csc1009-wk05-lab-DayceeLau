public class Wk05Q2Ellipse extends Shape{

    public Wk05Q2Ellipse(Double dim1, Double dim2){
        super(dim1, dim2);
    }
    
    public  Double area(){
        System.out.println("Inside Area for Ellipse.");
        return PI * dim1 * dim2;
    }
}
