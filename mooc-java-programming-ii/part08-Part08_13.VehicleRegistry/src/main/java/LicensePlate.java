
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof LicensePlate)){
            return false;
        }
        LicensePlate lp = (LicensePlate) o;
        if (lp.country.equals(this.country) &&
                lp.liNumber.equals(this.liNumber)) {
            return true;
        }
        return false;
    }
    
    public int hashCode() {
        return new StringBuilder().append(country).append(liNumber).toString().hashCode();
    }

}
