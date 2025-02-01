import java.util.Scanner; 
class general
{
    
     
     int room,dinner,breakfast,lunch,d,n;
    
   
    void getdata()
    {
    Scanner obj = new Scanner(System.in);
    System.out.println("would you like to enter our hotel? Press Y for yes and N for No. ");
    
    String choice = obj.nextLine();
  
    
  
    if(choice.equals("y") || choice.equals("Y"))
    {
        System.out.println("\t\tWelcome to hotel Shiva.");
        
       
       System.out.println("\nPrices for rooms:\nLuxury= RS.2000 per day and 1800 per night\nExclusive= RS.1500 per day 1200 per night\nNormal=RS.1000 per day 800 per night");
       Scanner obj1 = new Scanner(System.in);
       System.out.println("\nNumber of people: ");
       int person=obj1.nextInt();
       System.out.println("\nenter no. of rooms needed: ");
       int room=obj1.nextInt();
       System.out.println("\nWhich type of room would you prefer. Press 1 for luxury 2 for exclusive and 3 for normal: ");
       int type=obj1.nextInt();
       switch(type)

       {
           case 1:
           {
               System.out.println("\n\n\t\tWelcome to luxury facilities");
               System.out.println("\nMENU:-\nbreakfast = RS.200\nLunch= RS.300\nDinner= RS.300");
               System.out.println("\nno of breakfast,lunch and dinner you want: ");
               Scanner obj2 = new Scanner(System.in);
               System.out.println("breakfast: ");
               int breakfast=obj2.nextInt();
               System.out.println("lunch: ");
               int lunch=obj2.nextInt();
               System.out.println("dinner: ");
               int dinner=obj2.nextInt();
               System.out.println("\nno of days and nights you want to stay: ");
               System.out.println("days: ");
               int d=obj2.nextInt();;
               System.out.println("nights: ");
               int n=obj2.nextInt();;
          System.out.println("\nprices of room services RS.150 per room");
          System.out.println("Total bill:");
           int a = room*((2000*d)+(1800*n));
           int b = 200*breakfast*person;
           int c = 300*lunch*person;
           int e = 300*dinner*person;
           System.out.println("No of rooms: "+a);
           System.out.println("Brakfast: "+b);
           System.out.println("lunch: "+c);
            System.out.println("dinner: "+e);
           System.out.println("total= "+(a+b+c+e+150*room));
           break;
               
           }
           case 2:
           {
              System.out.println("\n\n\t\tWelcome to exclusive facilities");
               System.out.println("\nMENU:-\nbreakfast = RS.150\nLunch= RS.200\nDinner= RS.200");
               System.out.println("\nno of breakfast,lunch and dinner you want: ");
               Scanner obj3 = new Scanner(System.in);
               System.out.println("breakfast: ");
               int breakfast=obj3.nextInt();
               System.out.println("lunch: ");
               int lunch=obj3.nextInt();
               System.out.println("dinner: ");
               int dinner=obj3.nextInt();
               System.out.println("\nno of days and nights you want to stay: ");
               System.out.println("days: ");
               int d=obj3.nextInt();;
               System.out.println("nights: ");
               int n=obj3.nextInt();;
          System.out.println("\nprices of room services RS.100 per room");
          System.out.println("Total bill:");
           int a1 = room*((1500*d)+(1200*n));
           int b1 = 150*breakfast*person;
           int c1 = 200*lunch*person;
           int e1 = 200*dinner*person;
           System.out.println("No of rooms: "+a1);
           System.out.println("Brakfast: "+b1);
           System.out.println("lunch: "+c1);
            System.out.println("dinner: "+e1);
           System.out.println("total= "+(a1+b1+c1+e1+100*room));
           break;
           }
           case 3:
           {
              System.out.println("\n\n\t\tWelcome to normal facilities");
               System.out.println("\nMENU:-\nbreakfast = RS.80\nLunch= RS.150\nDinner= RS.150");
               System.out.println("\nno of breakfast,lunch and dinner you want: ");
               Scanner obj3 = new Scanner(System.in);
               System.out.println("breakfast: ");
               int breakfast=obj3.nextInt();
               System.out.println("lunch: ");
               int lunch=obj3.nextInt();
               System.out.println("dinner: ");
               int dinner=obj3.nextInt();
               System.out.println("\nno of days and nights you want to stay: ");
               System.out.println("days: ");
               int d=obj3.nextInt();;
               System.out.println("nights: ");
               int n=obj3.nextInt();;
               System.out.println("\nprices of room services RS.60 per room");
               System.out.println("Total bill:");
               int a2 = room*((2000*d)+(1800*n));
               int b2 = 200*breakfast*person;
               int c2 = 300*lunch*person;
               int e2 = 300*dinner*person;
               System.out.println("No of rooms: "+a2);
               System.out.println("Brakfast: "+b2);
               System.out.println("lunch: "+c2);
               System.out.println("dinner: "+e2);
               System.out.println("total= "+(a2+b2+c2+e2+60*room));
               break;
           }
           
       }
       
    }
    else 
    {
        System.out.println("Thankyou for visiting our hotel");
    }
   
    }
};

class Hotel
{ 
    public static void main(String args[])
    {
      general r= new general();
      r.getdata();

    }
}