1. Architecture MVC, MVP, MVVM, MVI, Clean
2. private val context: Context
   - class TextDataSource(private val context: Context){} 
   - val dataSource = TextDataSource(this) в mainActivity
3. Разобрать по шагам
   override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)
   enableEdgeToEdge()
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
4. Добавить картинку для MVC