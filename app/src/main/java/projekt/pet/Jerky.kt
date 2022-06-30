package projekt.pet

data class Jerky(val name: String = "Jerky"):AbstractRecipe() {
    val spices = "spices for jerky"

    override fun toString(): String {
        return spices
    }
}