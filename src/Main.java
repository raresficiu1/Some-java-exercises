import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(toMilesPerHour(110));
        printMegaByteAndKiloBytes(3000);
        System.out.println(shouldWakeUp(true,22));
        System.out.println(isLeapYear(2000));
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
        System.out.println(kilobytes+ " KB = " + megabytes + "MB + "+ kilobytes2 + "KB");
    }

    //Exercise 3

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if (hourOfDay>0 && hourOfDay<23) {

            if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
                return true;
            } else {
                return false;
            }
        }
        else
        {
            return false;
        }

    }

    //Exercise 4
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return true;
                }
            }
            else
            {
                return false;
            }

        }
        else{
            return false;
        }
    }




}
