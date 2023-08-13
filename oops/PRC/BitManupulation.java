public class BitManupulation {
    public static void main(String[] args) {
        int a = 10;
        int mask = 1 << 1;
        System.out.println(a & ~(1 << 1));
    }
}
