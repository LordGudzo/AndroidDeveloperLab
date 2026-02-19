/**
 * Stores information about word
 * */
data class Word(
    val original: String,
    val translate: String,
    var learned: Boolean = false
)
/**
 * Stores information with variants of answer and correct answer
 * */
data class Question(
    val variants: List<Word>,
    val correctAnswer: Word
)

class LearnWordsTrainer {

    private val dictionary = listOf(
        Word("car", "машина"),
        Word("fish", "рыба"),
        Word("house", "дом"),
        Word("book", "книга"),
        Word("sun", "солнце"),
        Word("moon", "луна"),
        Word("water", "вода"),
        Word("fire", "огонь"),
        Word("tree", "дерево"),
        Word("road", "дорога"),
        Word("time", "время"),
        Word("life", "жизнь"),
        Word("work", "работа"),
        Word("friend", "друг"),
        Word("love", "любовь"),
        Word("city", "город"),
        Word("world", "мир"),
        Word("hand", "рука"),
        Word("eye", "глаз"),
        Word("heart", "сердце")
    )

    private var currentQuestion: Question? = null

    fun getNextQuestion(): Question? {
        //creates new collection dictionary with learned == false
        val notLearnedList = dictionary.filter { !it.learned }
        //if all words leaned == true return null
        if (notLearnedList.isEmpty()) return null

        val questionWords =
            if (notLearnedList.size < NUMBER_OF_ANSWERS) {
                val learnedList = dictionary.filter { it.learned }.shuffled()

                notLearnedList.shuffled()
                    .take(NUMBER_OF_ANSWERS) + learnedList
                    .take(NUMBER_OF_ANSWERS - notLearnedList.size)
            } else {
                notLearnedList.shuffled().take(NUMBER_OF_ANSWERS)
            }.shuffled()

        val correctAnswer = questionWords.random()

        currentQuestion = Question(
            variants = questionWords,
            correctAnswer = correctAnswer,
        )

        return currentQuestion
    }

    fun checkAnswer(userAnswerIndex: Int?): Boolean {
        return currentQuestion?.let{

            val correctAnswerId = it.variants.indexOf(it.correctAnswer)
            if(correctAnswerId == userAnswerIndex) {
                it.correctAnswer.learned = true
                true
            } else{
                false
            }
        }?: false
    }
}

const val NUMBER_OF_ANSWERS = 4