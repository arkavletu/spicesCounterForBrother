package projekt.pet

data class jerky (
    val name: String,
    val soySauce: Double,
    val sriracha: Double,
    val lemonJuice: Double,
    val sunflowerOil: Double,
    val garlic: Double,
    val ginger: Double,
    val paprika: Double,
    val sugar: Double,
    val nitriteSalt: Double,
    val blackPepper: Double,
    val sharpPepper: Double
    ){

    override fun toString(): String {
        return "$name\nСоевый соус - $soySauce\nШрирача - $sriracha\nЛимонный сок - $lemonJuice\n" +
                "Подсолнечное масло - $sunflowerOil\nЧеснок - $garlic\nИмбирь - $ginger\n" +
                "Паприка - $paprika\nСахар - $sugar\nНитритная соль - $nitriteSalt\nЧ.Перец - $blackPepper" +
                "\nК.Перец - $sharpPepper"
    }

}