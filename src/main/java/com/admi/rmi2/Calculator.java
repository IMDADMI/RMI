package com.admi.rmi2;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements Operations {

    protected Calculator() throws RemoteException {
        super();
    }


    @Override
    public int doWhiteBlack(int a, int b) {
        return a+b+100;
    }
}
