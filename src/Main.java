public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(toMilesPerHour(110));

    }


    //Exercise 1
    public static int toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0)
        {
            return -1;
        }
        else{
            double miles= kilometersPerHour*0.62137;
            return (int) miles;
        }
    }




}
