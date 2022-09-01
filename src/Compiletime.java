public class Compiletime {
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public int add(double x,int y){
        return (int)x+y;
    }

    public static void main(String[] args) {
        Compiletime obj=new Compiletime();
        System.out.println(obj.add(5,4));
        System.out.println(obj.add(8,8,6));
        System.out.println( obj.add(53,66));;

    }
}
