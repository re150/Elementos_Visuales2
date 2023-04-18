package com.example.elemenosvisuales2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater  //permite cambiar el xml en un objeo programable
        inflater.inflate(R.menu.activity_main_menu, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return  when(item.itemId){
           R.id.new_game -> true
           R.id.help -> true
            else -> super.onOptionsItemSelected(item)
        }

    }

}