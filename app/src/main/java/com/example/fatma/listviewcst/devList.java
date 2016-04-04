package com.example.fatma.listviewcst;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FATMA on 02/04/2016.
 */
public class devList extends ArrayAdapter<BluetoothDevice>{
    Context context;
    int resource;


    public devList(Context context, int resource, List<BluetoothDevice> bluetoothDev) {
        super(context, resource, bluetoothDev);
        this.context=context;
        this.resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflater charge le contenu d un fichier ds une vue
        LayoutInflater inflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        //false pour dire non pas attaché au root
        View view =inflater.inflate(resource,parent,false);
        TextView devName= (TextView) view.findViewById(R.id.devName);
        TextView devMac= (TextView) view.findViewById(R.id.devMac);

        devName.setText( getItem(position).getName());
        devMac.setText(getItem(position).getAddress());

        return view;
    }
}
