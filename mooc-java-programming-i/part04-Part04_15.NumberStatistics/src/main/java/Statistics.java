
public class Statistics {
    private int count;
    private int sum;
    

    public Statistics() {
        // initialize the variable numberCount here
        count = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        count ++;
        sum += number;
    }

    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if (count > 0){
            return sum * 1.0 / count;
        }
        return 0;
    }
}
