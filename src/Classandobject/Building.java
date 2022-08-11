package Classandobject;

public class Building {
    int flat ;
    boolean lift ;
    String flatcolor ;
    //paramertrized constructor

    public Building(int flat, boolean lift, String flatcolor) {
        this.flat = flat;
        this.lift = lift;
        this.flatcolor = flatcolor;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public String getFlatcolor() {
        return flatcolor;
    }

    public void setFlatcolor(String flatcolor) {
        this.flatcolor = flatcolor;
    }


    public static void main(String[] args) {
        Building obj=new Building(23,true,"red");
        System.out.println(obj.flat+ " "+obj.lift+ " "+ obj.flatcolor);
        obj.setFlat(25);
        obj.setLift(false);
        obj.setFlatcolor("blue");
        System.out.println("update data"+obj.getFlat()+" "+obj.getFlatcolor());


    }
}
