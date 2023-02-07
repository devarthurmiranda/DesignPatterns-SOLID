package Structural.Adapter;

public class MicroUsbCable implements CableInterface {

    public void connectToUsb() {
        System.out.println("MicroUsbCable is not compatible with UsbEntry");
    }
    
}
