
Anime photo API
-
> A simple API to get anime wallpapers free using <a href='https://wallpaperaccess.com' action='_blank'>Wallpaperaccess.com</a>

Features
-
* Gets anime photos for free
* Works with android(Java/Kotlin)

Gradle implementation(in app level build.gradle)
-
```
allprojects {
  repositories {
      google()
      maven { url 'https://jitpack.io' }
  }
}

dependencies {
 implementation 'com.github.ripanjatt:anime_photo_API:1.0.0'
}
```

Working
-
Simply add your search term and wait
>Example
```
val api = AnimeAPI()
    api.start("hinata")
    api.setAnimeListener(object: AnimeListener {
        override fun onStartListener() {
            println("Started!")
        }

        override fun onCompleteListener(urlList: ArrayList<String>) {
            println("Complete: ${urlList.size}")
            println(urlList[0])
        }

        override fun onErrorListener(error: String) {
            println(error)
        }

    })
 ```
 Here, urlList is an ArrayList containing urls of all the photos!
