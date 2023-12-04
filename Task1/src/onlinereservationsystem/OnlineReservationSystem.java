package onlinereservationsystem;
import java.util.*;

public class OnlineReservationSystem {
    private static boolean[] seats=new boolean[50];
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("-------Select the corresponding number for corresponding action------");
            System.out.println(" 1.View Seat Map\n 2.Reserve the Seat\n 3.Cancel Reservation\n 4.Exit");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("SELECT THE OPTION:");
            int option=s.nextInt();
            switch(option)
            {
                case 1:
                    viewSeatMap();
                    break;
                case 2:
                    reserveSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("INVALID OPTION!");
            }
        }
    }
    private static void viewSeatMap()
    {
        System.out.println("\nCURRENT SEAT MAP :");
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i])
            {
                System.out.println("X ");
            }
            else
            {
                System.out.println(i+1+" ");
            }
        }
        System.out.println();
    }
    private static void reserveSeat()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("\nENTER THE SEAT NUMBER BETWEEN 1 TO 50 :");
        int seatNumber=s1.nextInt();
        if(seatNumber<1 || seatNumber>50)
        {
            System.out.println("INVALID SEAT NUMBER!");
        }
        else if(seats[seatNumber-1])
        {
            System.out.println("SEAT ALREADY RESERVED!! ");
        }
        else
        {
            seats[seatNumber-1]=true;
            System.out.println("SEAT RESERVED ");
        }
    }
    private static void cancelReservation()
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("\nENTER THE SEAT NUMBER BETWEEN 1 TO 50 :");
        int seatNumber=s2.nextInt();
        if(seatNumber<1 || seatNumber>50)
        {
            System.out.println("INVALID SEAT NUMBER!");
        }
        else if(!seats[seatNumber-1])
        {
            System.out.println("SEAT NOT RESERVED!!");
        }
        else
        {
            seats[seatNumber-1]=false;
            System.out.println("RESERVATION CANCELLED!!");
        }

    }

}