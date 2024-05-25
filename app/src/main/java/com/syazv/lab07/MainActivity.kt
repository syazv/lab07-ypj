package com.syazv.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.syazv.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.scheduleBtn.setOnClickListener {
            val intent = Intent(this,ConfirmActivity::class.java)
            // Yang kiri ibarat fail name (key) kanan adalah data yang hendak dihantar
            // kanan adalah data yang nak dihantar -> text entered by user in nameEditText

            // Item yang dihantar oleh putExtra ialah Bundle
            // Method yang dihantar ke page lain ialah putExtra
            intent.putExtra("name", binding.nameEditText.text.toString())
            intent.putExtra("address", binding.addressEditText.text.toString())
            intent.putExtra("city", binding.cityEditText.text.toString())
            intent.putExtra("postcode", binding.postcodeEditText.text.toString())
            intent.putExtra("state", binding.stateEditText.text.toString())
            intent.putExtra("country", binding.countryEditText.text.toString())
            startActivity(intent)
        }

    }
}