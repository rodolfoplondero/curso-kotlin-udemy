package com.example.motivation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.buttonSave.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save) {
            handleSave()

        }
    }

    private fun handleSave() {
        val name = binding.editName.text.toString()
        if (name != "") {

            // Salva o nome no SharedPreferences
            SecurityPreferences(this).storeString("USER_NAME", name)

            // Inicia nova activity
            startActivity(Intent(this, MainActivity::class.java))

            // Finaliza a activity atual
            finish()
        } else {
            Toast.makeText(
                this,
                R.string.validation_mandatory_name,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}