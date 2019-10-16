package Tasks;

public class Loops {
    public int getSum(int x)
    {
        if(x<=0)
            return 0;
        else {
            int sum = 0;
            for(int i = 1; i <= x;i++)
                sum+=i;
            return sum;
        }
    }

    public int getAmountOnSegment(int startPosition, int finishPosition, int step) {
        int sum = 0;
        for (; startPosition <= finishPosition; startPosition += step) {
            if (startPosition <= 2)
                sum -= startPosition;
            else
                sum += startPosition;
        }
        return sum;
    }

    public long getSumOfSquaresOfFirstHundredNumbers(){
        long sum = 0;
        for(int i = 1; i <= 100;i++){
            sum+=Math.pow(i,2);
        }
        return sum;
    }
    public double getMultiplyOfSquaresOfSecondHundredNumbers(){
        double sum = 1;
        for(int i = 1; i <= 200;i++){
            sum*=Math.pow(i,2);
        }
        return sum;
    }
    public float getSumOfRow(double e){
        float sum = 0;
        int n = -10;
        while (n<=10) {
            if (Math.abs(n) >= e)
                sum += 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            System.out.println(sum);
            n++;
        }
        return sum;
    }
}
