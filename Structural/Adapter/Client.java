package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        UsbCable usbCable = new UsbCable();
        MicroUsbCable microUsbCable = new MicroUsbCable();
        UsbCableAdapter usbCableAdapter = new UsbCableAdapter();
        usbCable.connectToUsb();
        microUsbCable.connectToUsb();
        usbCableAdapter.connectToUsb(microUsbCable);
    }
}
