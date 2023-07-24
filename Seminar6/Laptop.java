package Seminar6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Laptop {
    private String model;
    private String oc;
    private String colour;
    private Integer ram;
       
    public Laptop(String model, String oc, String colour, Integer ram) {
        this.model = model;
        this.oc = oc;
        this.colour = colour;
        this.ram = ram;
    }
     
    public Laptop() {

    }

    public void setModel(String model) {
        this.model = model;
    }
     
    public String getModel() {
        return this.model;
    }
     
    public String getOC() {
        return this.oc;
    }
     
    public void setOC(String oc) {
        this.oc = oc;
    }
     
    public String getColour() {
        return this.colour;
    }
     
    public void setColour(String colour) {
        this.colour = colour;
    }
     
    public Integer getRam() {
        return this.ram;
    }
     
    public void setRam(String colour) {
        this.ram = ram;
    }
    
    @Override
    public String toString() {
        return "Модель: " + getModel() + ", операционная система: " + getOC() + ", цвет: " + getColour() + ", оперативная память " + getRam();
    }




    
}






