interface AnimeListener {
    fun onStartListener()
    fun onCompleteListener(urlList: ArrayList<String>)
    fun onErrorListener(error: String)
}