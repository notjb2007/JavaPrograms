public class method_over {
    int add(int x, int y){
        return x+y;
    }
    int add(int x, int y, int z){
        return x + y + z;
    }
    public static void main(String[] args) {
        method_over mo = new method_over();
        int r = mo.add(5,6);
        System.out.println(r);

        int r1 = mo.add(5,6,7);
        System.out.println(r1);
    }
}
