const val URL = "https://ievetrov.ru/kotlin-%d1%81-%d0%bd%d1%83%d0%bb%d1%8f-%d1%83%d1%80%d0%be%d0%ba%d0%b8/%d1%83%d1%80%d0%be%d0%ba-9-%d1%81%d0%bf%d0%b8%d1%81%d0%ba%d0%b8-%d0%b8-%d1%84%d1%83%d0%bd%d0%ba%d1%86%d0%b8%d0%b8-%d0%b4%d0%bb%d1%8f-%d0%ba%d0%be%d0%bb%d0%bb%d0%b5%d0%ba%d1%86%d0%b8%d0%b9/"

fun main() {
 //   Arrays()
    ListCollecion()
}
fun Arrays() {
    val arrayOfIngredients: Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")
    val intArray: Array<Int> = arrayOf(4, 4, 2)
    val charArray: Array<Char> = arrayOf('4', '4', '2')

    //   val intArray2 = arrayOf()  only with initialization
    var intArray3 = intArrayOf()    //if
    intArray3 = intArrayOf(1, 2, 3, 4, 5)

    println("Размер массива с ингредиентами: ${arrayOfIngredients.size}")
    println(arrayOfIngredients.indexOf("помидор"))
    println(arrayOfIngredients[1])
    println(arrayOfIngredients[2])

    arrayOfIngredients[4] = "паприка"
    println(arrayOfIngredients[4])

    // Old fashion
    arrayOfIngredients.set(1, "капуста")
    println(arrayOfIngredients.get(1))

    for (i in arrayOfIngredients) {
        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
}

fun ListCollecion() {
    val list = listOf(4, 4, 2)   //immutable List

    val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
    println(mutableList)
    mutableList.add(42)
    println(mutableList)
    mutableList.add(0, 42)
    println(mutableList)

    println(mutableList.contains(42))
    println(mutableList.isEmpty())
    println(mutableList.isNotEmpty())
    println(mutableList.indexOf(42))
    println(mutableList.lastIndexOf(42))
    println(mutableList.sortDescending())
    mutableList.forEach {
        println(it)
    }
    println(mutableList.sort())
    mutableList.forEach {
        println(it)
    }

    val mutableList2 = mutableList.filter{
        it == 42
    }

    mutableList2.forEach{
        println(it)
    }

    val mutableList3 = mutableList2.map{
        it * 2
    }

    println(mutableList3)


}