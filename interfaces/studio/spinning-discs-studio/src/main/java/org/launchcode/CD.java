package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String title){
        super(500,300,title);
    }

    @Override
    public void spinDisc(){
        System.out.println("A CD Spins at a rate of "+this.getSpinSpeedInRPM()+" rpm");
    }

    @Override
    public void storeData(String data){
        this.writeData(data);
    }

    @Override
    public boolean isFull(){
        return this.readData().length() >= this.getStorageCapacityInMB();
    }
}
