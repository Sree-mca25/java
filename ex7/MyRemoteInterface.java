package ex7;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface MyRemoteInterface extends Remote {

    String sayHello() throws RemoteException;

    String sendMessage(String message)
            throws RemoteException;
}