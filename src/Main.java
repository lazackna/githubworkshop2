public class Main {

    public static void main(String[] args) {
	    double a = 18.5;
	    double b = 88.8;
	    double r = sum(a,b);

        System.out.println(a + " + " + b + " = " + r);

        double r2 = subtract(a, b);
        System.out.println(a + " * " + b + " = " + r2);
    }

    public static double sum (double a, double b) {
        return  a * b;
    }

    public static double subtract (double a, double b) {
        return  a - b;
    }
}
