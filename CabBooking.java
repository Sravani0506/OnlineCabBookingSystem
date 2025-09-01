import java.util.*;
class Cab{
int cabid;
String drivername;
float rateperkm;
 Cab(int cabid, String drivername,float rateperkm){
this.cabid=cabid;
this.drivername=drivername;
this.rateperkm=rateperkm;
}
public void output(){
System.out.println(cabid+" "+drivername+" "+rateperkm);
}
}
class Booking{
String customername;
String pickup;
String drop;
float distance;
float fare;
Cab cab;
Booking(String customername,String pickup,String drop,float distance,Cab cab){
this.customername=customername;
this.pickup=pickup;
this.drop=drop;
this.distance=distance;
this.cab=cab;
this.fare=distance*cab.rateperkm;
}
public void output1(){
System.out.println(customername+" "+pickup+" "+drop+" "+distance+" "+fare+" "+cab.drivername);
}
}
class CabBooking{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
ArrayList<Cab> cabs=new ArrayList<>();
ArrayList<Booking> bookings=new ArrayList<>();
cabs.add(new Cab(1,"suresh",20));
cabs.add(new Cab(2,"praveen",20));
cabs.add(new Cab(3,"siva",20));
cabs.add(new Cab(4,"rahul",20));
cabs.add(new Cab(5,"sravan",20));
System.out.println("1.cab details");
System.out.println("2.book cab");
System.out.println("3.view bookings");
System.out.println("4.exit");
int choice=sc.nextInt();
sc.nextLine();
switch(choice){
case 1:
System.out.println("available cabs");
for(Cab c:cabs){
c.output();
}
break;
case 2:
System.out.println("enter customer name");
String customername=sc.nextLine();
System.out.println("enter pickup");
String pickup=sc.nextLine();
System.out.println("enter drop");
String drop=sc.nextLine();
System.out.println("enter distance");
float distance=sc.nextFloat();
Cab selectedCab=cabs.get(0);
Booking b=new Booking(customername,pickup,drop,distance,selectedCab);
bookings.add(b);
System.out.println("booking conformed");
b.output1();
break;
case 3:
System.out.println("all bookings");
for(Booking b1:bookings){
b1.output1();
}
break;
case 4:
System.out.println("exit");
break;
default:
System.out.println("invalid choice");
}
}
}


