package com.admi.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Echo extends Remote {
String greeting(String msg) throws RemoteException;
Integer calculator(int a,int b) throws RemoteException;
}
