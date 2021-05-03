fun main() {
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
}