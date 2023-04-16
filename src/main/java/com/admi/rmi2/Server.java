package com.admi.rmi2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        Operations ops1 = new Calculator();
        Operations ops2 = new Calculator();
        Operations ops3 = new Calculator();

        registry.rebind("ops1",ops1);
        registry.rebind("ops2",ops2);
        registry.rebind("ops3",ops3);

    }
}
