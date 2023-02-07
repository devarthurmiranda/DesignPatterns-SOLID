package Structural.Adapter;

public class UsbCableAdapter {

    public UsbCableAdapter() {
    }

    public void connectToUsb(CableInterface cable) {
        System.out.println(cable + " connected to UsbEntry!");
    }

}
