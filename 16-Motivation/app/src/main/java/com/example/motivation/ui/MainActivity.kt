package com.example.motivation.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.motivation.R
import com.example.motivation.databinding.ActivityMainBinding
import com.example.motivation.infra.MotivationConstants
import com.example.motivation.infra.SecurityPreferences

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var categoryId = MotivationConstants.FILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Esconder a barra de navegação
        supportActionBar?.hide()

        handleUserName()
        handleFilter(R.id.image_ic_all_inclusive)

        // Eventos
        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageIcAllInclusive.setOnClickListener(this)
        binding.imageIcHappy.setOnClickListener(this)
        binding.imageIcSunny.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            var s = ""
        } else if (view.id in listOf(
                R.id.image_ic_all_inclusive,
                R.id.image_ic_happy,
                R.id.image_ic_sunny
            )
        ) {
            handleFilter(view.id)
        }
    }

    private fun handleFilter(id: Int) {
        binding.imageIcAllInclusive.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple))
        binding.imageIcSunny.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple))
        binding.imageIcHappy.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple))

        when (id) {
            R.id.image_ic_all_inclusive -> {
                binding.imageIcAllInclusive.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryId = MotivationConstants.FILTER.ALL
            }
            R.id.image_ic_happy -> {
                binding.imageIcHappy.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryId = MotivationConstants.FILTER.HAPPY
            }
            R.id.image_ic_sunny -> {
                binding.imageIcSunny.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryId = MotivationConstants.FILTER.SUNNY
            }
        }
    }


    private fun handleUserName() {
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textOla.text = "Olá, ${name}!"
    }
}