1. ViewBinding
   - build.gradle.kts in the module of project 
     - android { 
           buildFeatures {
           viewBinding = true
           }
       }
   - sync
2. Gridle implementation("com.github.bumptech.glide:glide:5.0.5") to build.gradle.kts in the module of project