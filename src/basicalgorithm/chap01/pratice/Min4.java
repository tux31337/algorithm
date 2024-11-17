package basicalgorithm.chap01.pratice;

public class Min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;

        if(b < min) {
            min = b;
        }
        
        if(c < min) {
            min = c;
        }

        if(d < min) {
            min = d;
        }

        return  min;
    }
    public static void main(String[] args) {
        int min = min4(5, -10, 5, -30);
        System.out.println("min = " + min);
    }
}
