package projekt.pet

data class Sausage(val name: String = "Sausages"):AbstractRecipe() {
    val spices = "spices for sausages"

    override fun toString(): String {
        return spices
    }
}