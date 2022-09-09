
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money res = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return res;
    }
    
    public Money minus(Money decreaser) {
        if(this.lessThan(decreaser)) {
            return new Money(0, 0);
        }
        int cents;
        int euros;
        if(this.cents < decreaser.cents) {
            cents = 100 - (decreaser.cents - this.cents);
            euros = this.euros - decreaser.euros - 1;
        } else {
            euros = this.euros - decreaser.euros;
            cents = this.cents - decreaser.cents;
        }
        return new Money(euros, cents);
    }
    
    public boolean lessThan(Money compared) {
        if(this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if(this.cents < compared.cents) {
                return true;
            } 
            return false;
        } else {
            return false;
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
