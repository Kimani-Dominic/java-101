package Variables;

public class Maths {
    public static void main(String[] args) {
        double resultDbl3 = 0D;
        System.out.println("resultDbl3 = " + resultDbl3);
        
        for(int i=0; i<100; i++){
            resultDbl3 += 0.01D;
        }

        int result = 100 * 100 / 5 + 200 * 3 / 2;
        double ceil = Math.ceil(34.345);

        System.out.println("resultDbl3 = " + resultDbl3);
        System.out.println(result);
        System.out.println(ceil);        
    }
}
