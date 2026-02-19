fun main() {
    val name = getName()
    val age = getAge()
    printNameAndAge(userName = name, userAge = age)
    ///////////////////////
    val kotlin = transformText("asdasd advvvv", ::encodeVowels)
    val kotlin2 = transformText("asdasd advvvv", ::toUpperCaseWords)
    val kotlin3 = transformText("asdasd adveeveevv") {x -> x.reversed()}
    println(kotlin)
    println(kotlin2)
    println(kotlin3)
}

fun getName(): String? {
    println("Введите имя:")
    return readLine()
}

//fun getAge() = readLine()?.toInt()
fun getAge(): Int? {
    println("Введите возраст:")
    return readLine()?.toIntOrNull()
}

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Данные пользователя: $userName, $userAge лет")
}


fun encodeVowels(input: String): String {
    return input.replace("[aeiouAEIOU]".toRegex(), "*")
}

fun toUpperCaseWords(input: String): String {
    val result = input.split(" ")
        .joinToString(" ") { word ->
            word.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
        }
    return result

}
fun transformText(input: String, operation: (String) -> String): String {
    return operation(input)
}