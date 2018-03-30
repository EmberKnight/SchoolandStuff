package JavaBasics;

public class Mainboard {

    int ramSlots;
    int pciSlots;
    int usbPorts;

    public Mainboard(int ramSlots, int pciSlots, int usbPorts) {
        setRamSlots(ramSlots);
        setPciSlots(pciSlots);
        setUsbPorts(usbPorts);
    }

    //-------------------------------------------------------------------------------------------------

    public int getRamSlots() {
        return this.ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getPciSlots() {
        return this.pciSlots;
    }

    public void setPciSlots(int pciSlots) {
        this.pciSlots = pciSlots;
    }

    public int getUsbPorts() {
        return this.usbPorts;
    }

    public void setUsbPorts(int usbPorts) {
        this.usbPorts = usbPorts;
    }

    //--------------------------------------------------------------------------------------------------------


}
