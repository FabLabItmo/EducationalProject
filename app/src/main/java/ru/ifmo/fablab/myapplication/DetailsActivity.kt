package ru.ifmo.fablab.myapplication

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ru.ifmo.fablab.myapplication.databinding.ActivityDetailsBinding

/**
 * Created by mlebedev on 09/12/2017.
 */
class DetailsActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityDetailsBinding  = DataBindingUtil.setContentView(this,R.layout.activity_details)
        binding.url = intent.extras.getString("URL")
    }
}