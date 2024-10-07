public class Main {
    public static void main(String[] args) {
        int a=0, b=0, i=1;
        a = a+(++i);
        System.out.println("'a' vale: " + a);
        b = b+(i++);
        System.out.println("'b' vale: " + b);
        System.out.println("'i' vale: " + i);
    }
}
