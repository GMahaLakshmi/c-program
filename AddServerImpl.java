import java.rmi.*;
import java.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject
implements AddServerIntf {
Public AddServerImpl()throws RemoteException{
}
public double add(double d1,double d2)throws RemoteException{
return d1+d2;
}
}
