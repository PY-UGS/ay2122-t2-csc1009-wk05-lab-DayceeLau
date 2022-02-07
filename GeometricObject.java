import java.util.Date;

public class GeometricObject {

    private String color;
    private Boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    //Color
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //Fill
    public Boolean getFilled(){
        return this.filled;
    }
    public void setFilled(){
        this.filled = filled;
    }

    //Date
    public Date getDateCreated(){
        return this.dateCreated;
    }

    public String toString(){
        String representation = " created on " + this.dateCreated + " color: " + this.color + " and filled: " + this.filled;
        return representation;
    }
}
