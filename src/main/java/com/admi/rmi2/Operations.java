package com.admi.rmi2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Operations extends Remote {
    int doWhiteBlack(int a,int b) throws RemoteException;
}
