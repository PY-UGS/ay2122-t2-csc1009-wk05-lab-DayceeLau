import java.lang.Math;

public class CircleFromSimpleGeometricObject extends GeometricObject
{
    private Double radius;

    public CircleFromSimpleGeometricObject(){
       super(); //Reference var used to refer to parent class(Ge0metricObject) constructors 
    }
    public CircleFromSimpleGeometricObject(Double radius){
        super();
        this.radius = radius;
    }
    //From parent class(GeometricObject -> color and filled)
    public CircleFromSimpleGeometricObject(Double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    //Radius
    public Double getRadius(){
        return this.radius;
    }
    public void setRadius(Double radius){
        this.radius = radius;
    }

    //Area
    public Double getArea(){
        Double aOfC = Math.PI * this.radius * this.radius;
        return aOfC;
    }

    //Perimeter
    public Double getPerimeter(){
        Double pOfC = this.radius * 2.0 * Math.PI;
        return pOfC;
    }

    //Diameter
    public Double getDiameter(){
        Double dOfC = this.radius * 2.0;
        return dOfC;
    }

    //Circle output
    public void printCircle(){
        String representation = super.toString() + "and radius: " + this.radius;
        System.out.print(representation);
    }


}
