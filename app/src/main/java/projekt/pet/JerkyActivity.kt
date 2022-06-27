package projekt.pet

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
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

        val jerky = jerky("Маринад для джерок (г/кг)",90.0,42.0,
                    16.0,40.0, 5.0,2.0,20.0,8.0,
            14.0,3.3,0.6)

        binding.render(jerky)

        val x = binding.editTextNumberDecimal.text.toString()
        val y = x.toBigDecimal().setScale(2, RoundingMode.DOWN).toDouble()

        binding.editTextNumberDecimal.setOnKeyListener(object: View.OnKeyListener{
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                if (event?.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER){
                    binding.render(jerky.copy(soySauce = 90.0*y,sriracha = 42.0*y,
                        lemonJuice = 16.0*y,sunflowerOil = 40.0*y,garlic = 5.0*y,ginger = 2.0*y,
                    paprika = 20.0*y,sugar = 8.0*y,nitriteSalt = 14.0*y,blackPepper = 3.3*y,sharpPepper = 0.6*y))
                    
                    return true
                }
                return false
            }
        })

    }

    private fun ActivityJerkyBinding.render(jerky: jerky){
        spices.text = jerky.toString()
    }
}