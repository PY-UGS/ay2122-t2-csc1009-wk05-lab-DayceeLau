public abstract class Shape {
    protected Double dim1, dim2, PI;

    public Shape(Double dim1, Double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = 3.14;
    }

    public abstract Double area();
}



