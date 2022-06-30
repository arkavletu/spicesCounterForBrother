package projekt.pet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class RecipeRepoImpl: Recipe {
    override val data: LiveData<List<AbstractRecipe>> = MutableLiveData(
        List(2) { index ->
            Jerky()
            Sausage()
        }
    )

    private val recipes get() = checkNotNull(data.value) { "no nullable" }

}