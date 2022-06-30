package projekt.pet

import androidx.lifecycle.ViewModel

class SausageViewModel: ViewModel() {
    val repo: Recipe = RecipeRepoImpl()
    val data = repo.data.value!![1]




}