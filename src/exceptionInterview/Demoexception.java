package exceptionInterview;

public class Demoexception {
    public  int div(int a,int b){


        try{
            return a/b;

        }catch (Exception e){
            System.out.println( "Exception occured: "+e);
            return 0;

        }

    }public  void  array(){
        int arr[]={1,2,3,4,50};

        try{System.out.println(arr[2]);

        }catch (Exception e){
            System.out.println("they shoeing the error like this is the outbound");
        }
    }

    public static void main(String[] args) {
        Demoexception obj=new Demoexception();
        int divde=obj.div(8,0);
        System.out.println(divde);
        obj.array();
    }
}
