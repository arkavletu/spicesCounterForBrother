package projekt.pet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import projekt.pet.databinding.ActivityJerkyBinding
import projekt.pet.databinding.ActivityJerkyBinding.inflate

class JerkyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityJerkyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jerky = jerky("Маринад для джерок (г/кг)",90.0,42.0,
                    16.0,40.0, 5.0,2.0,20.0,8.0,
            14.0,3.3,0.6)

        binding.render(jerky)

    }

    private fun ActivityJerkyBinding.render(jerky: jerky){
        spices.text = jerky.toString()
    }
}