public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double a = 123.37484;
        byte b = 127;

        int[] array = new int[]{14, 8, 3, 195, 52};
        int c = array[array.length-1];
        array [array.length-1] = array[0];
        array[0] = c;
        System.out.println(array[0] + (array.length-2));
    }
}