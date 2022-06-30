package projekt.pet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import projekt.pet.databinding.ActivityJerkyAktivityBinding
import projekt.pet.databinding.ActivitySausageBinding

class SausageActivity : AppCompatActivity() {
    val viewModel = SausageViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySausageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.spices.text = viewModel.data.toString()
    }
}