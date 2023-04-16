package com.admi.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLOutput;

public class RegistrationServer {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {

        EchoImpl echo = new EchoImpl();
        Echo echo1 = (Echo) UnicastRemoteObject.exportObject(echo,0);
        System.out.println("Waiting ...");
        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        registry.bind("greet",echo1);

    }
}
