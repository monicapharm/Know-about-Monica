package edu.uw.liuqingm.knowaboutmonica

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var mTextMessage: TextView? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_skill -> {
                mTextMessage!!.setText(R.string.skills)
                mTextMessage!!.setMovementMethod(ScrollingMovementMethod())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_education -> {
                mTextMessage!!.setText(R.string.education)
                mTextMessage!!.setMovementMethod(ScrollingMovementMethod())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_work -> {
                mTextMessage!!.setText(R.string.work)
                mTextMessage!!.setMovementMethod(ScrollingMovementMethod())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextMessage = findViewById<View>(R.id.message) as TextView?
        val navigation = findViewById<View>(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val image = findViewById<ImageView>(R.id.image)
        image.setOnClickListener{
            Toast.makeText(this@MainActivity, "See more projects!", Toast.LENGTH_LONG).show()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
