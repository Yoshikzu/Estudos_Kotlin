package br.com.kotlin.motivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.kotlin.motivation.MotivationConstants
import br.com.kotlin.motivation.R
import br.com.kotlin.motivation.SecurityPreferences
import br.com.kotlin.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Esconder a Barra de Navegação
        supportActionBar?.hide()

        handleUserName()
        binding.buttonNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View){
        if(view.id == R.id.button_new_phrase){

        }
    }

    private fun handleUserName(){
        //Shared Preferences é case sensitive
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textUserName.text = "Olá $name!"
    }
}