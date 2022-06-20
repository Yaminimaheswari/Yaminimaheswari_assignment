package Com.Spring;

import org.springframework.stereotype.Component;

@Component
public class phone {
	
	    long number;

	    public phone(long number) {
	        this.number = number;
	    }


	    @Override
	    public String toString() {
	        return "phone{" +
	                "number=" + number +
	                '}';
	    }
}


