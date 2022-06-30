package projekt.pet
import android.os.Build
import android.os.Bundle
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import projekt.pet.databinding.ActivityRecipeBinding

class RecipeActivity: AppCompatActivity(){
    val viewModel by viewModels<RecipeViewModel>()
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}