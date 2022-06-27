package projekt.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import projekt.pet.databinding.ActivityMainBinding

import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this@MainActivity,JerkyActivity::class.java)
            startActivity(intent)
        }





    }

}