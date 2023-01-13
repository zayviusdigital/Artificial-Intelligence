package com.zayviusdigital.artificialintelligence.dialog;

import android.app.Activity;
import android.app.ProgressDialog;

public class DialogWait {
    private final  Activity activity;
    private ProgressDialog pd;

    public DialogWait(Activity myActivity) {
        activity = myActivity;
    }

    public void show(String tittle){
        ProgressDialog progressDialog = new ProgressDialog(activity);
        pd = progressDialog;
        progressDialog.setMessage(tittle);//"Please wait...."
        pd.setCanceledOnTouchOutside(false);
        pd.setCancelable(false);
        pd.show();
    }

    public void dismiss(){
        if (!(pd ==null)){
            pd.dismiss();
        }
    }
}
