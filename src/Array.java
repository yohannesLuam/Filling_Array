public class Array {
    public static void main(String[] args) {
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++ ){

            num[i] = 9-i;
        }

        for (int a:num) {
            System.out.println("array" + a + "=" + num[a]);
        }
    }
}
