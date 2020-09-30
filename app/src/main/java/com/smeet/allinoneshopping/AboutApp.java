package com.smeet.allinoneshopping;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class AboutApp extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("About this Application")
                .setMessage("V1.0.0\n" +
                        "Instantly use Amazon, Flipkart, Snapdeal, Shopclues, Myntra & more top Indian shopping sites. Checkout Daily Deals, Coupon codes and Handpicked Deals & Offers from top Shopping Sites with new All in One Shopping app - The best favorite Shopping app 2020\n\n" +
                        "This app does not collect any personal data, # Simply no additional permissions required. So don't worry about your data, It's 100% safe.\n\n" +
                        "Please rate and share the App\n" )
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}