//import kotlin.math.pow
//const val MAX_USERS = 100  //const
//
//Test2
//
//fun main() {
//	variable()
//    arithmetic(5,2)
//	comparisonAndLogical(1, 0, "Hi")
//}
//
//fun variable(){
//	val name: String = "Andrey " // unmutable
//	var age: Int = 34 // mutable
//}
//
//fun arithmetic(a: Int, b: Int) {
//    val addition = a + b
//	val subtraction = a - b
//	val multiplication = a * b
//	val division = a / b
//    val power = a.toDouble().pow(b)  // for Int not available .pow(), so first needs to convert to Double
//	val remainder = a % b
//	println("""                      // """ raw string, allows to write multi-line text without escaping
//        addition: $addition			 // $ pastes the value of a variable directly to the String
//        subtraction: $subtraction
//        multiplication: $multiplication
//        division: $division
//        power: $power
//        remainder: $remainder
//    """.trimIndent())                 // .trimIndent() cleans spaces in the String
//}
//
//fun comparisonAndLogical(a: Int, b: Int, s: String): Int {
//    val comparisonCheck1 = (a == b)
//    println(comparisonCheck1)
//
//    val comparisonCheck2 = (a != b)
//    println(comparisonCheck2)
//
//    val comparisonCheck3 = (a < s.length)
//    println(comparisonCheck3)
//
//    val logicalCheck1 = true && false                  // return first false or true
//    println("logicalCheck1 " + logicalCheck1)
//
//    val logicalCheck2 = true || false                  // return first true or false
//    println("logicalCheck2 " + logicalCheck2)
//
//
//    val checkIf = if(a > b) a else b
//    println(checkIf)
//
//    if(a > b) {
//        return a
//    } else {
//        return b
//    }
//
//}