public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(toMilesPerHour(110));
        printMegaByteAndKiloBytes(3000);
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

    //Exercise 2
    public static void printMegaByteAndKiloBytes(int kilobytes){
        int megabytes=kilobytes/1024;
        int kilobytes2= kilobytes%1024;
        System.out.printf(kilobytes+ " KB = " + megabytes + "MB + "+ kilobytes2 + "KB");
    }




}
