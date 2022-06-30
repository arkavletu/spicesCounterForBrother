package projekt.pet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import projekt.pet.databinding.ActivityJerkyAktivityBinding
import projekt.pet.databinding.ActivityRecipeBinding

class JerkyAktivity : AppCompatActivity() {

    val viewModel = JerkyViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityJerkyAktivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.spices.text = viewModel.data.toString()
    }


}