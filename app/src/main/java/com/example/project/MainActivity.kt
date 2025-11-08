package com.example.project

import UserInfo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityMainBinding
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val randomCardNum = (1..3).random()

        binding.btnFortune.setOnClickListener {
            val user = UserInfo(
                name = binding.edtName.text.toString(),
                cardNum = randomCardNum
//                birthMonth = binding.spnMonth.selectedItem.toString(),
//                mood = binding.spnMood.selectedItem.toString(),
//                favoriteColor = "blue"
            )
            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("extra_user", user)
            }
            startActivity(intent)
        }
    }
}
