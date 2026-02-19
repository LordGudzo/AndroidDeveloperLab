package classes

class Ingredient(val name: String, val weight: Int, val count: Int) {

    init {
        println("Ингредиент создан")
    }

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean
    ) : this(name, weight, count) {

        isNeedToPrepare = _isNeedToPrepare

    }

}