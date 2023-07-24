package Seminar6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Laptop {
    private String model;
    private String oc;
    private String colour;
    private String ram;
       
    public Laptop(String model, String oc, String colour, String ram) {
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
     
    public int getRam() {
        return this.ram;
    }
     
    public void setRam(String colour) {
        this.ram = ram;
    }
    
    @Override
    public String toString() {
        return "Модель: " + getModel() + ", операционная система: " + getOC() + ", цвет: " + getColour() + ", оперативная память " + getRam();
    }



    static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<Integer, Object> meanings) {
        Set<Laptop> res = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean ok = true;

            for (Map.Entry<Integer, Object> entry : meanings.entrySet()) {
                int meaning = entry.getKey();
                Object val = entry.getValue();

                switch (meaning) {
                    case 1:
                        if (!laptop.getOC().equals(val)) {
                            ok = false;
                        }
                        break;

                    case 2:
                        if (!laptop.getModel().equals(val)) {
                            ok = false;
                        }
                        break;

                    case 3:
                        if (!laptop.getColour().equals(val)) {
                            ok = false;
                        }
                        break;

                    case 4:
                        if (!laptop.getRam().equals(val)) {
                            ok = false;
                        }
                        break;
                }
    

            if (ok) {
                res.add(laptop);
            }
        }

        return res;
    }
    
    }
}






