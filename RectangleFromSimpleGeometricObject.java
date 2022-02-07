public class RectangleFromSimpleGeometricObject extends GeometricObject {
    private Double width, height;

    public RectangleFromSimpleGeometricObject(){
        super();
    }
    public RectangleFromSimpleGeometricObject(Double width, Double height){
        super();
        this.width = width;
        this.height = height;
    }
    //From parent class(GeometricObject -> color and filled)
    public RectangleFromSimpleGeometricObject(Double width, Double height, String color, Boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    //Width
    public Double getWidth(){
        return this.width;
    }
    public void setWidth(Double width){
        this.width = width;
    }

    //Height
    public Double getHeight(){
        return this.height;
    }
    public void setHeight(Double height){
        this.height = height;
    }

    //Area
    public Double getArea(){
        Double aOfR = this.height * this.width;
        return aOfR;
    }

    //Perimeter
    public Double getPerimeter(){
        Double pOfR = (this.height * 2.0) + (this.width * 2.0);
        return pOfR; 
    }
}
