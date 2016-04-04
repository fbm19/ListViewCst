package com.example.fatma.listviewcst;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by FATMA on 02/04/2016.
 */
public class BluetoothDev {


    public ArrayList<BluetoothDevice> getDevices(  BluetoothAdapter bluetoothAdapter) {
        ArrayList<BluetoothDevice> arrayListBluetooth = new ArrayList<BluetoothDevice>();




                Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
// If there are paired devices
                if (pairedDevices.size() > 0) {
                    // Loop through paired devices
                    for (BluetoothDevice device : pairedDevices) {
                        // Add the name and address to an array adapter to show in a ListView
                        arrayListBluetooth.add(device );
                    }
                }




            return arrayListBluetooth;
        }

    }
