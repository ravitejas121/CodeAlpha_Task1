 
import java.util.Scanner;

public class Stock{
static Scanner s=new Scanner(System.in);
static int balance=20000;
static int appqty=0;
static int samqty=0;
static int vivqty=0;
public static void market(){
System.out.println("_____Market Data______\n ");
System.out.println("Apple : 5120\n ");
System.out.println("Samsung : 3150\n ");
System.out.println("Vivo : 2340 \n");
System.out.println("\n");
}
public static void profile(){
 
System.out.println("___Profile___");
 
String name="Mahesh";
System.out.println("\nNAME :"+name);
System.out.println("\nBalance:"+balance);
System.out.println("\nOwned Shares are:");
if(appqty==0 &&samqty==0 &&vivqty==0){
System.out.println("No Shares bought");
}
  if(appqty>0){
System.out.println("Apple shares:"+appqty);
}
  if(samqty>0){
System.out.println("Samsung shares:"+samqty);
}
  if(vivqty>0){
System.out.println("vivo shares:"+vivqty);
}
System.out.println("\n");

}
public static void buystock(){
System.out.println("___BUY___");
System.out.println("choose share to buy:\n 1.Apple:5120\n2.Samsung:3150\n3.vivo:2340\n :");
int buyop=s.nextInt();
System.out.println("enter how many shares want to buy:");
int qty=s.nextInt();
switch(buyop){
case 1:
if(balance>=(qty*5120)){
balance=balance-(qty*5120);
appqty+=qty;
System.out.println("Sucessfully bought"+qty+" Apple share\n");
System.out.println("updated balance:"+balance);System.out.println("\n");}
else{
System.out.println("Insufficent balance\n");}
break;
case 2:
if(balance>=(qty*3150)){
balance=balance-(qty*3150);
samqty+=qty;
System.out.println("Sucessfully bought"+qty+" Samsung share\n");
System.out.println("updated balance:"+balance);System.out.println("\n");
}
else{
System.out.println("Insufficent balance\n");
}
break;
 

case 3:
if(balance>=(qty*2340)){

balance=balance-(qty*2340);
vivqty+=qty;
System.out.println("Sucessfully bought "+qty+" Vivo share\n");
System.out.println("updated balance:"+balance);System.out.println("\n");
}else{
System.out.println("Insufficent balance\n");
}

break;

default:System.out.println("enter valid option!\n");
break;
}}

public static void sellstock(){
System.out.println("___Selling___");
System.out.println("\n1choose stock to sell:\n1.apple\n2.samsung\n3.vivo:");
int sellop=s.nextInt();
switch(sellop){
case 1:
if(appqty>0){
System.out.println("enter no of stocks to sell:");
int sellqty=s.nextInt();

if(sellqty<=appqty){
balance+=(sellqty*5120);
appqty-=sellqty;
System.out.println("Sucessfully Sold" +sellqty +" Stock\n");
System.out.println("Updated balance is:"+balance);}
else{
System.out.println("Not enough stocks to sell");
}}
else{
System.out.println("No stocks to sell!");
}
break;
case 2:
if(samqty>0){System.out.println("enter no of stocks to sell:");
int sellqty=s.nextInt();

if(sellqty<=samqty){
balance+=(sellqty*3150);
samqty-=sellqty;
System.out.println("Sucessfully Sold"+sellqty +" Stock");
System.out.println("Updated balance is:"+balance);}
else{
System.out.println("Not enough stocks to sell");
}}
else{
System.out.println("No stocks to sell!");
}
break;
case 3:
System.out.println("enter no of stocks to sell:");
int sellqty=s.nextInt();

if(vivqty>0){
if(sellqty<=vivqty){

balance+=(sellqty*2340);
vivqty-=sellqty;
System.out.println("Sucessfully Sold"+sellqty + " Stock\n");
System.out.println("Updated balance is:"+balance);
}else{
System.out.println("Not enough stocks to sell");
}}else{
System.out.println("No stocks to sell!");
}
break;
}           
}
 
public static void main(String[] args){
int op;
do{
System.out.println("0.exit\n1.market data\n2.profile\n3.buy stock\n4.sell stock\nenter opition:");
 op=s.nextInt();
switch(op){
case 0:System.out.println("Sucessfully Exited!");
break;
case 1:market();
break;
case 2:profile();
break;
case 3:buystock();
break;
case 4:sellstock();
break;
default:System.out.println("enter valid opition");
} 
}while(op!=0);
}}