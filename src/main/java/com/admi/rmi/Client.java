package com.admi.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
        Echo greetMethod = (Echo) registry.lookup("greet");
        greetMethod.greeting("ADMI ZAKARYAE");
        System.out.println(greetMethod.calculator(31,4));

    }
}
