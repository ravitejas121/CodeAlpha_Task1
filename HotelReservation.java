 
import java.util.Scanner;
public class HotelReservation{
static boolean[] rooms = new boolean[5];

static Scanner s=new Scanner(System.in);
 
 
public static void  main(String args[]){
int op;
 
do{
System.out.println("\n _____HOTEL MANAGMENT STYSTEM_______");
System.out.println("\n0.exit\n1.Available rooms \n2.book room\n3.checkout");
System.out.println("enter option!:");
  op=s.nextInt();
switch(op){
case 0:System.out.println("Thank You for Visiting!!!");
break;
case 1:availablerooms();
break;
case 2:bookroom();
break;
case 3:checkout();
break;
default:
System.out.println("enter valid Option!!");
break;
}}while(op!=0);
 }

public static void availablerooms(){
System.out.println("\n _____Available Rooms_____\n");
for (int i=0;i<rooms.length;i++){
if(!rooms[i]){         //if room is false
System.out.println("\n Room"+(i+1));
}
}
}

public static void bookroom(){
availablerooms();
System.out.println("\nenter which room:(1,2...)");
int room=s.nextInt();
if(room>1 && room<6){
if(rooms[room-1]== false){
rooms[room-1]=true;
System.out.println("room "+room+" is booked sucessfully");
}
else{
System.out.println("room "+room+" is not available");
}
}

else{
System.out.println("Enter valid room no!!");
}
}
public static void checkout(){
System.out.println("\nenter room no to checkout(1/2/...):");
int ck=s.nextInt();
if(ck>1 && ck<6){
if(rooms[ck-1]==true){
System.out.println("Room "+ ck +" Checkedout Sucessfully!");
rooms[ck-1]=false;
}
else{
System.out.println("The room was not checked in!");
}
}
else{
System.out.println("Enter valid room!!");
}
}


}
