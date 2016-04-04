package com.example.fatma.listviewcst;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    BluetoothDev bluetoothDev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        }

    @Override
    protected void onStart() {
        super.onStart();

        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            Toast t = new Toast(this);
               t.setText("Sorry your phone do not support Bluetooth");
           t.show();
        } else {
            if (!bluetoothAdapter.isEnabled()) {
                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBtIntent,1);}
        bluetoothDev=new BluetoothDev();
        listView=(ListView)findViewById(R.id.listView);

        devList listeDev=new devList(this,R.layout.item,bluetoothDev.getDevices(bluetoothAdapter));
        listView.setAdapter(listeDev);}
    }
}
