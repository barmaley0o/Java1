public class Zadacha3 {
    public static void main (String[] args) {
        int[] array = {1,4,51,28,11};

        int first = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = first;

        System.out.println(array[0]+array[array.length-3]);
    }
}
