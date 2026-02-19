fun main() {
    // While, do-while loops
    var counter = 5

    do {
        println("${counter--}")
        Thread.sleep(100)
    } while (counter > 0)

    while (counter <= 0 || counter < 5) {
        println(counter++)
    }

    //ranges
    val range1 = 0..10 step 2
    val range2 = 0 until 10 step 2
    val range3: IntProgression = 10 downTo 0 step 2

    val a = 52 in range1
    val b = 52 !in range1
    println(a)
    println(b)

    //for loops
    for (i in range2) {
        println("For until $i")
        Thread.sleep(100)
    }
    for (i in range3) {
        if (i == 8) {
            println("Continue")
            continue
        }

        if (i == 0) {
            println("Break")
            break
        }


        println("For downTo $i")
        Thread.sleep(100)
    }
}
