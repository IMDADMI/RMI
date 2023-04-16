package com.admi.rmi2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
//        this method list all the methods in the registery
        System.out.println(Arrays.toString(registry.list()));
        Operations calculator = (Operations) registry.lookup("ops1");

//        when we use the Naming class we use the pre-defined port means, we don't have to create the Registery class
//      Operations calculator = (Operations) Naming.lookup("ops");
        System.out.println("the addition is : "+calculator.doWhiteBlack(1,5));

    }
}
