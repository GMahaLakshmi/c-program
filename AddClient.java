import java.rmi.*;
public class AddClient{
public static void main(String args[]){
try{
String addServerURL="rmi://"+args[0]+"/AddServer";
AddServerIntf addServerIntf=(AddServerIntf) NamingLookup(addServer URL);
System.out.println("The First number is:"+args[1]);
double d1=Double.valueOf(args[1]).doubleValue();
System.out.println("The Second number is:"+args[2]);
double d1=Double.valueOf(args[2]).doubleValue();
System.out.println("The Sum is:"+addServerIntf.add(d1,d2));
}
catch(Exception e){
System.out.println("Exception:"+e);
}
}
}