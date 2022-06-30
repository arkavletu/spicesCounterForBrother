package projekt.pet

import androidx.lifecycle.LiveData

interface Recipe {
    val data: LiveData<List<AbstractRecipe>>
}