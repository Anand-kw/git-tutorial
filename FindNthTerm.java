public class FindNthTerm {
    static int findNthTerm(int N) {
        // code here
        int a = 1;
        int result = a+(N-1)*(N-1);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findNthTerm(2));
        
    }
}
