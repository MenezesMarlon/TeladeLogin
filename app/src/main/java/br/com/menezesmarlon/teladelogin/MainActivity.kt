package br.com.menezesmarlon.teladelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.menezesmarlon.teladelogin.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}