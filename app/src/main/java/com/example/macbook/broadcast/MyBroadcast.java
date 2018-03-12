package com.example.macbook.broadcast;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by MAcBook on 20/02/2018.
 */

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

            NotificationCompat.Builder builder = new NotificationCompat.Builder (context);
            builder.setContentTitle("this is title")
                    .setContentText("Text")
                    .setSmallIcon(R.mipmap.ic_launcher);

            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(1, builder.build());


    }
}
