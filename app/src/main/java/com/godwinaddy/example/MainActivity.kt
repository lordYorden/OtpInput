package com.godwinaddy.example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.godwinaddy.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.otpInput.onInputFinishedListener {
            Log.d("Input Finished", it)
        }

        binding.otpInput.focusOtpInput()
        // binding.otpInput.setHint("!#$%@")
        binding.otpInput.setStrokeWidth(5)
        // binding.otpInput.setStrokeColor(ContextCompat.getColor(this, R.color.colorAccent))
        // binding.otpInput.isCursorVisible = false
    }

}