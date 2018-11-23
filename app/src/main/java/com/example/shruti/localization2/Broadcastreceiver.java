package com.example.shruti.localization2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.Locale;

public class Broadcastreceiver extends BroadcastReceiver{


    @Override
    public void onReceive(Context context, Intent intent) {
        String locale= Locale.getDefault().getCountry();
        Toast.makeText(context,"change"+locale,Toast.LENGTH_SHORT).show();
    }
}
