public class ClosestNumber {
    static int closestNumber(int N , int M) {
        // code here
        int distance = N / M;

        if(N<M)
        return 0;
        
        if(distance == 0)
            return M;
        else if(distance > 0)
            return distance * M;
        else
            return (distance-1) * M;
        
    }
    public static void main(String[] args) {
        // System.out.println(closestNumber(-15, 6));
        System.out.println(closestNumber(3103,27891));
        // System.out.println(closestNumber(2, 3));
    }
}
