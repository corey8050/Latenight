package com.example.shakeapp;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.shakeapp.Database.OrderContract;

public class CartAdapter extends CursorAdapter {


    public CartAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.cartlist, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        // getting theviews

        TextView shakeName, yesLarge, yesTopping, price, quantity;


        shakeName = view.findViewById(R.id.shakeNameinOrderSummary);
        price = view.findViewById(R.id.priceinOrderSummary);
        yesLarge = view.findViewById(R.id.hasLarge);
        yesTopping = view.findViewById(R.id.isSmall);
        quantity = view.findViewById(R.id.quantityinOrderSummary);

        // getting the values by first getting the position of their columns

        int name = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_NAME);
        int priceofshake = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_PRICE);
        int quantityofshake = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_QUANTITY);
        int hasLarge = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_LARGE);
        int isSmall = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_ISSMALL);


        String nameofshake = cursor.getString(name);
        String pricesofshake = cursor.getString(priceofshake);
        String quantitysofshake = cursor.getString(quantityofshake);
        String yeshasLarge = cursor.getString(hasLarge);
        String yesisSmall = cursor.getString(isSmall);



        shakeName.setText(nameofshake);
        price.setText(pricesofshake);
        yesLarge.setText(yeshasLarge);
        yesTopping.setText(yesisSmall);
        quantity.setText(quantitysofshake);





    }
}
