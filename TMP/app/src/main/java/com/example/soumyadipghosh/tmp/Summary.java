package com.example.soumyadipghosh.tmp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
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

import info.hoang8f.widget.FButton;

import static android.R.attr.button;
import static android.R.attr.name;
import static android.R.id.message;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static com.example.soumyadipghosh.tmp.R.drawable.c;
import static com.example.soumyadipghosh.tmp.R.layout.activity_summary;

public class Summary extends AppCompatActivity {

    List<String> addArray ;
    ListView show;
    ArrayAdapter<String> adapter;
    FButton PlaceOrder;
    FButton Clr;
    int Total=0;
    int i=0;
    String wordSet;
    int TotalCost=0;
    Intent intent = null, chooser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Toast.makeText(Summary.this, "Previously Placed Order!!",Toast.LENGTH_LONG).show();

        addArray = new ArrayList<String>();

        show = (ListView)findViewById(R.id.OrderList);


            PlaceOrder = (FButton)findViewById(R.id.PlaceOrder);
            PlaceOrder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(addArray.size()<1){
                        Toast.makeText(Summary.this, "Nothing to Order!!",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Intent i = new Intent(Summary.this, OrderPlaced.class);
                        startActivity(i);
                        String xtra = "Total :" + Integer.toString(Total);
                        StringBuilder builder = new StringBuilder();
                        for (String s : addArray) {
                            builder.append(s);
                            builder.append("\n");
                        }
                        builder.append(xtra);
                        intent = new Intent(Intent.ACTION_SEND);
                        intent.setData(Uri.parse("mailto:"));
                        String[] to = {"soumyadipghosh220114@gmail.com", "anubhav.paul@st.niituniversity.in"};
                        intent.putExtra(Intent.EXTRA_EMAIL, to);
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Orders Placed By the Student.");
                        intent.putExtra(Intent.EXTRA_TEXT, builder.toString());
                        intent.setType("message/rfc822");
                        chooser = Intent.createChooser(intent, "Send Email");
                        startActivity(chooser);
                        addArray.clear();
                        show.setAdapter(adapter);
                        Toast.makeText(Summary.this, "Placing Order. Please Wait", Toast.LENGTH_LONG).show();
                        Total = 0;
                        TextView tv = (TextView) findViewById(R.id.Tot);
                        tv.setText("Rs:" + Integer.toString(Total));
                    }

                }
            });


            Clr = (FButton) findViewById(R.id.ClearOrder);
            Clr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addArray.clear();
                    show.setAdapter(adapter);
                    Total = 0;
                    SharedPreferences setColdCoffee = getSharedPreferences("COLDCOFFEE",0);
                    setColdCoffee.edit().clear().apply();
                    SharedPreferences setChocolateShake = getSharedPreferences("CHOCOLATESHAKE",0);
                    setChocolateShake.edit().clear().apply();
                    SharedPreferences setBMilk = getSharedPreferences("BOURNVITAMILK",0);
                    setBMilk.edit().clear().apply();
                    SharedPreferences setMilk = getSharedPreferences("MILK",0);
                    setMilk.edit().clear().apply();
                    SharedPreferences SETALOOVEGROLL = getSharedPreferences("ALOOVEGROLL",0);
                    SETALOOVEGROLL.edit().clear().apply();
                    SharedPreferences setPaneerPasandaRoll = getSharedPreferences("PAANERPASANDAROLL",0);
                    setPaneerPasandaRoll.edit().clear().apply();
                    SharedPreferences setEggRoll = getSharedPreferences("EGGROLL",0);
                    setEggRoll.edit().clear().apply();
                    SharedPreferences setCHICKENCREAMROLL = getSharedPreferences("CHICKENCREAMROLL",0);
                    setCHICKENCREAMROLL.edit().clear().apply();
                    SharedPreferences setDECROLL = getSharedPreferences("DECROLL",0);
                    setDECROLL.edit().clear().apply();
                    SharedPreferences setCSKROLL = getSharedPreferences("CSKROLL",0);
                    setCSKROLL.edit().clear().apply();
                    SharedPreferences setCTROLL = getSharedPreferences("CTROLL",0);
                    setCTROLL.edit().clear().apply();
                    SharedPreferences setPM = getSharedPreferences("PM",0);
                    setPM.edit().clear().apply();
                    SharedPreferences setCM = getSharedPreferences("CM",0);
                    setCM.edit().clear().apply();
                    SharedPreferences setCP = getSharedPreferences("CP",0);
                    setCP.edit().clear().apply();
                    SharedPreferences setVMomo = getSharedPreferences("VMomo",0);
                    setVMomo.edit().clear().apply();
                    SharedPreferences setCMomo = getSharedPreferences("CMomo",0);
                    setCMomo.edit().clear().apply();
                    SharedPreferences setSR = getSharedPreferences("SR",0);
                    setSR.edit().clear().apply();
                    SharedPreferences setBO = getSharedPreferences("BO",0);
                    setBO.edit().clear().apply();
                    SharedPreferences setCPB = getSharedPreferences("CPB",0);
                    setCPB.edit().clear().apply();
                    SharedPreferences setDCB = getSharedPreferences("DCB",0);
                    setDCB.edit().clear().apply();
                    SharedPreferences setCC = getSharedPreferences("CC",0);
                    setCC.edit().clear().apply();
                    SharedPreferences setCPopcorn = getSharedPreferences("CPopcorn",0);
                    setCPopcorn.edit().clear().apply();
                    SharedPreferences setCSK = getSharedPreferences("CSK",0);
                    setCSK.edit().clear().apply();
                    SharedPreferences setCShamiKabab = getSharedPreferences("CShamiKabab",0);
                    setCShamiKabab.edit().clear().apply();
                    SharedPreferences setCSandwich = getSharedPreferences("CSandwich",0);
                    setCSandwich.edit().clear().apply();
                    SharedPreferences setCRK = getSharedPreferences("CRK",0);
                    setCRK.edit().clear().apply();
                    TextView tv = (TextView) findViewById(R.id.Tot);
                    tv.setText("Rs:" +Integer.toString(Total));
                    Toast.makeText(Summary.this, "Order Cleared!! Start Ordering.",Toast.LENGTH_LONG).show();
                    i=0;

                }
            });

        SharedPreferences setColdCoffee = getSharedPreferences("COLDCOFFEE",0);
        wordSet = setColdCoffee.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setColdCoffee.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setChocolateShake = getSharedPreferences("CHOCOLATESHAKE",0);
        wordSet = setChocolateShake.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setChocolateShake.getInt("Cost",0);
        Total = Total + TotalCost;


        SharedPreferences setBMilk = getSharedPreferences("BOURNVITAMILK",0);
        wordSet = setBMilk.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setBMilk.getInt("Cost",0);
        Total = Total + TotalCost;


        SharedPreferences setMilk = getSharedPreferences("MILK",0);
        wordSet = setMilk.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setMilk.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences SETALOOVEGROLL = getSharedPreferences("ALOOVEGROLL",0);
        wordSet = SETALOOVEGROLL.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = SETALOOVEGROLL.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setPaneerPasandaRoll = getSharedPreferences("PAANERPASANDAROLL",0);
        wordSet = setPaneerPasandaRoll.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setPaneerPasandaRoll.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setEggRoll = getSharedPreferences("EGGROLL",0);
        wordSet = setEggRoll.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setEggRoll.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCHICKENCREAMROLL = getSharedPreferences("CHICKENCREAMROLL",0);
        wordSet = setCHICKENCREAMROLL.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCHICKENCREAMROLL.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setDECROLL = getSharedPreferences("DECROLL",0);
        wordSet = setDECROLL.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setDECROLL.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCSKROLL = getSharedPreferences("CSKROLL",0);
        wordSet = setCSKROLL.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCSKROLL.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCTROLL = getSharedPreferences("CTROLL",0);
        wordSet = setCTROLL.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCTROLL.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setPM = getSharedPreferences("PM",0);
        wordSet = setPM.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setPM.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCM = getSharedPreferences("CM",0);
        wordSet = setCM.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCM.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCP = getSharedPreferences("CP",0);
        wordSet = setCP.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCP.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setVMomo = getSharedPreferences("VMomo",0);
        wordSet = setVMomo.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setVMomo.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCMomo = getSharedPreferences("CMomo",0);
        wordSet = setCMomo.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCMomo.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setSR = getSharedPreferences("SR",0);
        wordSet = setSR.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setSR.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setBO = getSharedPreferences("BO",0);
        wordSet = setBO.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setBO.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCPB = getSharedPreferences("CPB",0);
        wordSet = setCPB.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCPB.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setDCB = getSharedPreferences("DCB",0);
        wordSet = setDCB.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setDCB.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCC = getSharedPreferences("CC",0);
        wordSet = setCC.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCC.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCPopcorn = getSharedPreferences("CPopcorn",0);
        wordSet = setCPopcorn.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCPopcorn.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCSK = getSharedPreferences("CSK",0);
        wordSet = setCSK.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCSK.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCRK = getSharedPreferences("CRK",0);
        wordSet = setCRK.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCRK.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCShamiKabab = getSharedPreferences("CShamiKabab",0);
        wordSet = setCShamiKabab.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCShamiKabab.getInt("Cost",0);
        Total = Total + TotalCost;

        SharedPreferences setCSandwich = getSharedPreferences("CSandwich",0);
        wordSet = setCSandwich.getString("Detail","");
        addArray.add(wordSet);
        TotalCost = setCSandwich.getInt("Cost",0);
        Total = Total + TotalCost;

                String t = "Total Amount: Rs."+ Integer.toString(Total);
                TextView tv = (TextView) findViewById(R.id.Tot);
                tv.setText(t);
                Total = 0;



                adapter = new ArrayAdapter<String>(Summary.this,android.R.layout.simple_list_item_1,addArray);
                show.setAdapter(adapter);





            }



}












