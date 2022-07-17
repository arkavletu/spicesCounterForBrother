package projekt.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import projekt.pet.databinding.ActivityMainBinding

import android.os.Bundle
import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {
    val viewModel by viewModels<RecipeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this@MainActivity,JerkyAktivity::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this@MainActivity,SausageActivity::class.java)
            startActivity(intent)
        }



    }

}