package com.company;

public class Phone extends  Device {
    Double screenSize;
public enum OperationSystem{
    ANDROID, WINDOWS, iOS;
}
double screenSize;
OperationSystem operationSystem;

    @Override
    public void turnON() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("widzę jabłko");
    }
}
