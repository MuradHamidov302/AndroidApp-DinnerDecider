package com.murathm.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist= arrayListOf("Hamburger","Hot Dog","Pizza","Cake","PopCorn","Salad")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changebtn.setOnClickListener{
           val random=Random()
            var randomfood=random.nextInt(foodlist.count())
            SelectFoodtext.text=foodlist[randomfood]
        }

        addnewbtn.setOnClickListener{

            val addfood=Newtext.text.toString()
            foodlist.add(addfood)
            Newtext.text.clear()
        }
    }
}
