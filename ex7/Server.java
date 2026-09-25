
package ex7;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

class Server {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject = new ServerImple();

            // Start RMI Registry
            LocateRegistry.createRegistry(1099);

            // Bind remote object
            Naming.rebind(
                "rmi://localhost:1099/MyRemoteObject",
                remoteObject
            );

            System.out.println("RMI Server is running...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}