package projekt.pet

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import projekt.pet.databinding.ActivityJerkyBinding
import projekt.pet.databinding.ActivityJerkyBinding.inflate
import java.math.RoundingMode

class JerkyActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityJerkyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val x = binding.editTextNumberDecimal.text.toString()
        val y = x.toBigDecimal().setScale(2, RoundingMode.DOWN).toDouble()

        val jerky = jerky("Маринад для джерок (г)",90.0*y,42.0*y,
                    16.0*y,40.0*y, 5.0*y,2.0*y,20.0*y,8.0*y,
            14.0*y,3.3*y,0.6*y)

        binding.render(jerky)


    }

    private fun ActivityJerkyBinding.render(jerky: jerky){
        spices.text = jerky.toString()
    }
}