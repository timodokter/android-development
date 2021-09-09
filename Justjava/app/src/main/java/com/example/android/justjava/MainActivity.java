package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 1;
    int priceOfOrder;
//    String priceMessage;
    boolean addWhippedCream = false;
    boolean addChocolate = false;
    String givenName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String createOrderSummary(int quantity) {
        priceOfOrder = calculatePrice(quantity, calculateBasePrice(addWhippedCream, addChocolate));
        String orderSummary = "Name: " + givenName;
        orderSummary += "\nAdd whipped cream: " + addWhippedCream;
        orderSummary += "\nAdd chocolate: " + addChocolate;
        orderSummary += "\nQuantity: " + quantity;
        orderSummary += "\nTotal: $" + priceOfOrder;
        orderSummary += "\nThank you!";
        return orderSummary;
    }

    /**
     * Calculates the price of the order.
     *
     * @param quantity is the number of cups of coffee ordered
     */
    private int calculatePrice(int quantity, int pricePerCup) {
        int price = quantity * pricePerCup;
        return price;
    }

    /* This method is called when the order button is clicked.*/
    public void submitOrder(View view) {
//        priceMessage = "Total: $" + calculatePrice(quantity, 5) + "\nThank you!";
        checkForToppings();
        getName();
        displayMessage(createOrderSummary(quantity));
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have more than 100 coffees", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 1) {
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /* This method displays the given quantity value on the screen.*/
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    /*this method checks the whippedcream checkbox*/
    private void checkForToppings() {
        //whippedcream
        CheckBox addWhippedCreamBox = (CheckBox) findViewById(R.id.whippedcream_checkbox);
        addWhippedCream = addWhippedCreamBox.isChecked();
        //chocolate
        CheckBox addChocolateBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        addChocolate = addChocolateBox.isChecked();
    }

    /*this method calculates the price*/
    public int calculateBasePrice(boolean addWhippedCream, boolean addChocolate) {
        int basePrice = 5;

        if (addWhippedCream) {
            basePrice += 1;
        }

        if (addChocolate) {
            basePrice += 2;
        }

        return basePrice;
    }

    /*this method gets the name that is inputted */
    private void getName() {
        EditText nameEditText = (EditText) findViewById((R.id.name_input));
        givenName = nameEditText.getText().toString();
    }
}