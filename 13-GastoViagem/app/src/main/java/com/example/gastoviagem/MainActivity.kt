package com.example.gastoviagem

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binding usado para ter acesso aos elementos da tela
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Relaciona o evento de clique ao botão, implementando o médodo de View.OnClickListener
        binding.buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        // Identifica o botão e chama o método de calcular
        // A classe R contém todos os recursos
        if (view.id == R.id.button_calculate) {
            calculate()
        }
    }

    /**
     * Verifica se todos os campos estão preenchidos
     */
    private fun isValid(): Boolean {
        return (binding.editDistance.text.toString() != ""
                && binding.editPrice.text.toString() != ""
                && binding.editAutonomy.text.toString() != ""
                && binding.editAutonomy.text.toString().toFloat() != 0f)
    }

    /**
     * Realica o cálculo do total gasto
     */
    private fun calculate() {

        if (isValid()) {
            val distance = binding.editDistance.text.toString().toFloat()
            val price = binding.editPrice.text.toString().toFloat()
            val autonomy = binding.editAutonomy.text.toString().toFloat()

            val totalValue = (distance * price) / autonomy

            binding.textTotalValue.text = "R$ ${"%.2f".format(totalValue)}"
        } else {
            // Exibe o "alert" na tela
            Toast.makeText(this, R.string.validation_fill_all_fields, Toast.LENGTH_SHORT).show()
        }

    }
}