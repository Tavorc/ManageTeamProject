package com.tavor.todoorg;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;


public class CustomDialog{

    Context context;
    String title;
    String msg;
    DialogInterface.OnClickListener event;

    public CustomDialog(Context context,String title,String msg,DialogInterface.OnClickListener event) {
        this.title=title;
        this.msg=msg;
        this.context=context;
        this.event=event;
    }

    public void showDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        alertDialog.create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(msg);
        alertDialog.setNeutralButton("Ok", event);
        alertDialog.show();

    }
}
