package com.admi.rmi;

import java.rmi.RemoteException;

public class EchoImpl implements Echo {

    protected EchoImpl() throws RemoteException{}


    @Override
    public String greeting(String msg) throws RemoteException {
        return "hello world !! "+msg;
    }

    @Override
    public Integer calculator(int a, int b) throws RemoteException {
        return a+b;
    }
}
