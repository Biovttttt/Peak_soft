package home_work_26;

public class  Box <T> {
    private static Object Box;

    public Box(Object box) {
        this.Box=box;

    }

    public static void setBox(Object box) {
        Box = box;
    }
    public T generic(){
       return (T) Box;
    }
}
