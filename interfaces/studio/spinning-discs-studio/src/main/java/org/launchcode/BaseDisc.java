package org.launchcode;

import java.util.HashMap;

public abstract class BaseDisc {

    private String discData ="";
    private final HashMap<String, String> discInfo = new HashMap<>();
    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;

    //constructor
    public BaseDisc(int storageCapacityInMB, int spinSpeedInRPM, String title) {
        this.storageCapacityInMB = storageCapacityInMB;
        this.spinSpeedInRPM = spinSpeedInRPM;
        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacityInMB));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeedInRPM));
        this.discInfo.put("Title", title);
    }

    //overload the constructor
//    public BaseDisc(int storageCapacityInMB, int spinSpeedInRPM, String title){
//        this(storageCapacityInMB, spinSpeedInRPM);
//        this.discInfo.put("Title", title);
//    }

    public int getStorageCapacityInMB() {
        return storageCapacityInMB;
    }

    public int getSpinSpeedInRPM() {
        return spinSpeedInRPM;
    }

    public void writeData(String data){
        this.discData += data;
    }

    public String readData(){
        return this.discData;
    }

    public HashMap<String, String> getInfo(){
        return this.discInfo;
    }
}
