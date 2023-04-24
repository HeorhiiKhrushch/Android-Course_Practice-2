package com.example.practice2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label = findViewById<TextView>(R.id.label)
        label.text = getString(R.string.changed_main_label)

//        label.visibility = View.GONE
// or       label.isVisible = false
//        label.setOnClickListener {
//            val intent = Intent(this, ThirdActivity::class.java)
//            startActivity(intent)
//        }

        supportFragmentManager.commit {
            add<MainFragment>(R.id.fragment_container)
            setReorderingAllowed(true)
            addToBackStack(MainFragment::class.java.name)
        }
    }
}