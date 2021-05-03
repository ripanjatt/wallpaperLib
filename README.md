
Anime photo API
-
> A simple API to get anime wallpapers free!

Features
-
Gets anime photos for free!

Working
-
Simply add your search term and wait
'''
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
