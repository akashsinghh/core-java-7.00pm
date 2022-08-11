package method;

public class Books {
    String name;
    int page;
    String writername;

    public void readBooks(){
        System.out.println("this read access");
    }
    public void writeBooks(){
        System.out.println("this is write a fxn");
    }

    public static void main(String[] args) {
        Books obj=new Books();
        obj.readBooks();
        obj.writeBooks();
    }
}
