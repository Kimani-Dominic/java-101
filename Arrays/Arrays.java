package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        for(int i=0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        
        for(int i=0; i < intArray.length; i++) {
            System.out.println( intArray[i] );
        }
    }
}
