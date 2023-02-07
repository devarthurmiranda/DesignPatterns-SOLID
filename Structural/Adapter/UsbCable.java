package Structural.Adapter;

public class UsbCable implements CableInterface {

    public void connectToUsb() {
        System.out.println("UsbCable connected to UsbEntry");
    }
    
}
