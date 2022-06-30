package projekt.pet

import androidx.lifecycle.ViewModel

class JerkyViewModel: ViewModel() {
    val repo: Recipe = RecipeRepoImpl()
    val data = repo.data.value!![0]




}