package com.example.uts_ppapb

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_ppapb.databinding.ActivityMainBinding
import com.example.uts_ppapb.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val username =intent.getStringExtra("EXTRA_NAME")

        val intentMainActivity =
            Intent(this@SecondActivity, MainActivity::class.java)
            intentMainActivity.putExtra("EXTRA_NAME", username)
        }
    }
}

