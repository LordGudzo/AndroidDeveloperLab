package classes

fun main() {

    val dish1: Dish = Dish(
        id = 1,
        name = "Яичница",
        category = "Завтраки",
        ingredients = listOf("яйцо", "помидор", "соль", "перец"),
    )

    val dish2: Dish = Dish(
        id = 2,
        name = "Суп лапша",
        category = "Обеды",
        ingredients = listOf("вода", "курица", "вермишель", "соль", "перец"),
    )

    println("Действия для блюда Яичница")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()
    println()

    println("Действия для блюда Куриный суп")
    dish2.addToFavorites()
    println(dish2.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)


    ///////////////////////////

    val ingredient1 = Ingredient("Картошка", 100, 1)
    val ingredient2 = Ingredient("Морковь", 50, 1, true)

}