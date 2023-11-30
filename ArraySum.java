class ArraySum{
    long seriesSum(int n) {
        int a = 1; //  first index
        int d = 1; // common diffrence
        
        double distance = (n/2.0);
        double result = distance *(2*a +((n-1)*d)); // AP formula
        // if n = 1
        // n/2 = .5
        // 2a = 2
        // (n-1) = 0
        // 
        // 0.5 * 2 = 1
        System.out.println(result);
        return (long)result ;
    }
    public static void main(String[] args) {
        ArraySum sum = new ArraySum();
        sum.seriesSum(1);
    }
}