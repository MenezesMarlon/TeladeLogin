package br.com.menezesmarlon.teladelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.menezesmarlon.teladelogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonLogin.setOnClickListener() {
            val user = binding.editUser.text.toString().trim()
            val passwd = binding.editPassword.text.toString().trim()

            if (user.isNullOrBlank() || passwd.isNullOrBlank()) {
                Toast.makeText(this, "Preencha os campos acima!", Toast.LENGTH_SHORT).show()

            } else if (user == "admin" && passwd == "admin") {
                Toast.makeText(this, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Login ou senha incorretos", Toast.LENGTH_SHORT).show()
            }

        }


    }
}


