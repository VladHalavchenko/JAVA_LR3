public class Main {
    public static void main(String[] args) {
        long l;
        boolean b;
        float f;
        short s = 1200;

        f = s;
        l = (long)(Math.random() * 200 - 100);
        System.out.println("random: " + l);
        s = (short)l;
        l= (long)f;

        System.out.println("f: " + f);
        System.out.println("l: " + l);
        System.out.println("s: " + s);

        double y = Math.log(s) + Math.log(1) / Math.log(f) - Math.asin(l);
        System.out.println("Значення y: " + y);
    }
}