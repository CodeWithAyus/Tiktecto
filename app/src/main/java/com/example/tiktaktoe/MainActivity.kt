package com.example.tiktaktoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var count=0
    private var flag=0
    private lateinit var btn1:Button
    private lateinit var btn2:Button
    private lateinit var btn3:Button
    private lateinit var btn4:Button
    private lateinit var btn5:Button
    private lateinit var btn6:Button
    private lateinit var btn7:Button
    private lateinit var btn8:Button
    private lateinit var btn9:Button


    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         btn1=findViewById<Button>(R.id.btn1)
         btn2=findViewById<Button>(R.id.btn2)
         btn3=findViewById<Button>(R.id.btn3)
         btn4=findViewById<Button>(R.id.btn4)
         btn5=findViewById<Button>(R.id.btn5)
         btn6=findViewById<Button>(R.id.btn6)
         btn7=findViewById<Button>(R.id.btn7)
         btn8=findViewById<Button>(R.id.btn8)
        btn9=findViewById<Button>(R.id.btn9)
        val restart=findViewById<Button>(R.id.restart)
    restart.setOnClickListener {
        newgame()
    }
    }
    fun check(view:View){
        var currentButton = view as Button
        if (currentButton.text.toString() == ""){
        count++

        if (flag==0){
            currentButton.text="X"
            currentButton.textSize=40f
            currentButton.setPadding(0,0,0,0)
            flag=1
        }else{
            currentButton.text="O"
            currentButton.textSize=40f
            currentButton.setPadding(0,0,0,0)
            flag=0
        }
        //checking the condition only after 4 moves
        if (count>4) {

            val b1 = btn1.text.toString()
            val b2 = btn2.text.toString()
            val b3 = btn3.text.toString()
            val b4 = btn4.text.toString()
            val b5 = btn5.text.toString()
            val b6 = btn6.text.toString()
            val b7 = btn7.text.toString()
            val b8 = btn8.text.toString()
            val b9 = btn9.text.toString()
            val winner = "The Winner is:- "
            val drown="This match has drown"

            if (b1 == b2 && b2 == b3 && b1.isNotEmpty()) {
                Toast.makeText(this, "$winner $b1", Toast.LENGTH_SHORT).show()
                newgame()
            } else if (b4 == b5 && b5 == b6 && b4.isNotEmpty()) {
                Toast.makeText(this, "$winner $b4", Toast.LENGTH_SHORT).show()
                newgame()


            } else if (b7 == b8 && b8 == b9 && b7.isNotEmpty()) {
                Toast.makeText(this, "$winner $b7", Toast.LENGTH_SHORT).show()
                newgame()


            } else if (b1 == b4 && b4 == b7 && b1.isNotEmpty()) {
                Toast.makeText(this, "$winner $b1", Toast.LENGTH_SHORT).show()
                newgame()


            } else if (b2 == b5 && b5 == b8 && b2.isNotEmpty()) {
                Toast.makeText(this, "$winner $b2", Toast.LENGTH_SHORT).show()
                newgame()


            } else if (b3 == b6 && b6 == b9 && b3.isNotEmpty()) {

                Toast.makeText(this, "$winner $b3", Toast.LENGTH_SHORT).show()
                newgame()

            } else if (b1 == b5 && b5 == b9 && b1.isNotEmpty()) {
                Toast.makeText(this, "$winner $b1", Toast.LENGTH_SHORT).show()
                newgame()


            } else if (b3 == b5 && b5 == b7 && b3.isNotEmpty()) {
                Toast.makeText(this, "$winner $b3", Toast.LENGTH_SHORT).show()
                newgame()
            }else if (count==9){
                Toast.makeText(this, "$drown", Toast.LENGTH_SHORT).show()
          newgame()
            }

        }

        }



    }
    fun newgame(){
        btn1.text=""
        btn2.text=""
        btn3.text=""
        btn4.text=""
        btn5.text=""
        btn6.text=""
        btn7.text=""
        btn8.text=""
        btn9.text=""
        flag=0
        count=0
    }
}
