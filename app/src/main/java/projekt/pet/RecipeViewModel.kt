package projekt.pet

import androidx.lifecycle.ViewModel

class RecipeViewModel: ViewModel() {
    val repo: Recipe = RecipeRepoImpl()
    val data by repo::data


}