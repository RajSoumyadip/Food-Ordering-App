package com.example.soumyadipghosh.tmp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.button;
import static android.R.attr.order;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.os.Build.VERSION_CODES.M;
import static com.example.soumyadipghosh.tmp.R.drawable.c;
import static com.example.soumyadipghosh.tmp.R.id.Tot;

public class HotAndCold extends AppCompatActivity {
    Button OrderColdCofee;
    Button OrderChocolateShake;
    Button OrderBournvitaMilk;
    Button OrderMilk;
    FloatingActionButton button;
    List<String> word ;
    int TotalPriceHotAndCold=0;

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_and_cold);

        word = new ArrayList<>();

        OrderColdCofee = (Button)findViewById(R.id.buyColdCoffee);
        OrderChocolateShake = (Button)findViewById(R.id.buyChocolateShake);
        OrderBournvitaMilk = (Button) findViewById(R.id.buyHotBournvitaMilk);
        OrderMilk = (Button) findViewById(R.id.buyHotPlainMilk);
        OrderColdCofee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name= "Cold Coffee";
                String Quantity = String.valueOf(countColdCoffee);
                int q = Integer.parseInt(Quantity);
                int tc = q*30;
                TotalPriceHotAndCold = TotalPriceHotAndCold + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setColdCoffee = getSharedPreferences("COLDCOFFEE",0);
                SharedPreferences.Editor editorsetColdCoffee = setColdCoffee.edit();
                editorsetColdCoffee.putString("Detail",temp);
                editorsetColdCoffee.putInt("Cost",tc);
                editorsetColdCoffee.commit();
                word.add(i++,temp);

            }
        });

        OrderChocolateShake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chocolate Shake";
                String Quantity = String.valueOf(countChocolateShake);
                int q = Integer.parseInt(Quantity);
                int tc = q*40;
                TotalPriceHotAndCold = TotalPriceHotAndCold + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t  "+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setChocolateShake = getSharedPreferences("CHOCOLATESHAKE",0);
                SharedPreferences.Editor editorsetChocolateShake = setChocolateShake.edit();
                editorsetChocolateShake.putString("Detail",temp);
                editorsetChocolateShake.putInt("Cost",tc);
                editorsetChocolateShake.commit();
                word.add(i++,temp);

            }
        });

        OrderBournvitaMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Hot Bournviya Milk";
                String Quantity = String.valueOf(countBournvitaMilk);
                int q = Integer.parseInt(Quantity);
                int tc = q*30;
                TotalPriceHotAndCold = TotalPriceHotAndCold + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t  "+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setBMilk = getSharedPreferences("BOURNVITAMILK",0);
                SharedPreferences.Editor editorsetBMilk = setBMilk.edit();
                editorsetBMilk.putString("Detail",temp);
                editorsetBMilk.putInt("Cost",tc);
                editorsetBMilk.commit();
                word.add(i++,temp);

            }
        });

        OrderMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Hot Milk";
                String Quantity = String.valueOf(countMilk);
                int q = Integer.parseInt(Quantity);
                int tc = q*20;
                TotalPriceHotAndCold = TotalPriceHotAndCold + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t  "+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setMilk = getSharedPreferences("MILK",0);
                SharedPreferences.Editor editorsetMilk = setMilk.edit();
                editorsetMilk.putString("Detail",temp);
                editorsetMilk.putInt("Cost",tc);
                editorsetMilk.commit();
                word.add(i++,temp);

            }
        });
        button = (FloatingActionButton) findViewById(R.id.fabHotAndCold);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HotAndCold.this,Summary.class);
                startActivity(i);


            }
        });


    }

    int countColdCoffee=1;
    byte countChocolateShake=1;
    byte countBournvitaMilk=1;
    byte countMilk=1;

    public void IncrementColdCoffee(View view) {
        countColdCoffee++;
        TextView DispCount=(TextView) findViewById(R.id.ColdCoffeeQtyView);
        DispCount.setText(""+ countColdCoffee);

    }

    public void DecrementColdCoffee(View view) {
        if (countColdCoffee > 1) {
            countColdCoffee--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ColdCoffeeQtyView);
        DispCount.setText(""+ countColdCoffee);
        }


    public void IncrementChocolateShake(View view) {

        countChocolateShake++;
        TextView DispCount=(TextView) findViewById(R.id.ChocolateShakeQtyView);
        DispCount.setText(""+ countChocolateShake);
    }

    public void DecrementChocolateShake(View view) {
        if (countChocolateShake > 1)
        {
            countChocolateShake--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChocolateShakeQtyView);
        DispCount.setText(""+ countChocolateShake);
    }

    public void IncrementBournvitaMilk(View view) {

        countBournvitaMilk++;
        TextView DispCount=(TextView) findViewById(R.id.HotBournvitaMilkQtyView);
        DispCount.setText(""+ countBournvitaMilk);

    }

    public void DecrementBournvitaMilk(View view) {

        if (countBournvitaMilk > 1)
        {
            countBournvitaMilk--;
        }
        TextView DispCount=(TextView) findViewById(R.id.HotBournvitaMilkQtyView);
        DispCount.setText(""+ countBournvitaMilk);
    }

    public void IncrementMilk(View view) {

        countMilk++;
        TextView DispCount=(TextView) findViewById(R.id.HotPlainMilkQtyView);
        DispCount.setText(""+ countMilk);
    }

    public void DecrementMilk(View view) {
        if (countMilk > 1)
        {
            countMilk--;
        }
        TextView DispCount=(TextView) findViewById(R.id.HotPlainMilkQtyView);
        DispCount.setText(""+ countMilk);
    }



}


