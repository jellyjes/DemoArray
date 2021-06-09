package sg.edu.rp.c346.id20047778.demoarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
//    String[] fruits;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.TextView);
//        fruits = new String[3];
//        fruits[0]= "apple";
//        fruits[1]= "banana";
//        fruits[2]= "cherry";
        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add(fruits.size()-1,"cherry");
        fruits.add("durian");

        String text = "Fruits \n=====\n";

//        for (int i = 0; i < fruits.length; i++){
//            text += fruits[i] + "\n";
//        }

        for (int i = 0; i < fruits.size(); i++){
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);
    }
}