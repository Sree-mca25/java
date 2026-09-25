
package ex7;

import java.rmi.Naming;

class Client {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject =
                (MyRemoteInterface) Naming.lookup(
                    "rmi://localhost:1099/MyRemoteObject"
                );

            String result =
                remoteObject.sendMessage("Hello from RMI Client!");

            System.out.println("Server Response: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}