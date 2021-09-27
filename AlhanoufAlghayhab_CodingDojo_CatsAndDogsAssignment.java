package com.example.catsanddogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    cats[] cat =

            { new cats("Lili", 5),
    new cats("Meep", 3),
     new cats("Patchy", 2),
     new cats("Furball", 7),
     new cats("Snowball", 6),};




dogs[] dog =
        { new dogs("Rufus",10),
          new dogs("Fred",2),
          new dogs("Spot",11),
          new dogs("tuffy",12),
          new dogs("mecky",8),
        };
cats catt;
dogs dogss;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for(cats catt: cat)

        {

            catt.printcats();
            for(dogs dogss: dog)
            {

                if (dogss.age>catt.age)
                {
                    dogss.printcats();

                }


            }



        }




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}