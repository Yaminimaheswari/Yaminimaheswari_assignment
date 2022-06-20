package Com.Spring;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jmx.export.annotation.ManagedResource;

public class human {
	String name;

    phone p;

    
    gender g;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public gender getG() {
        return g;
    }
    public void setG(gender g) {
        this.g = g;
    }

    public phone getP() {
        return p;
    }
    @Required
    public void setP(phone p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "human{" +
                "name='" + name + '\'' +
                ", p=" + p +
                ", g=" + g +
                '}';
    }

}
