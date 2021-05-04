package com.ripanjatt.wallpaperLib

import java.net.URL
import kotlin.concurrent.thread

class WallpaperLib {

    private val searchURL = "https://wallpaperaccess.com/search?q="
    private val mainURL = "https://wallpaperaccess.com/full/"
    private val list = ArrayList<String>()

    private var listener: Listener? = null

    fun setListener(listener: Listener) {
        this.listener = listener
    }

    fun start(keyWord: String) {
        thread {
            try {
                val link = searchURL + keyWord.replace(" ",  "+")
                val url = URL(link)
                var html = ""
                val stream = url.openStream()
                val bytes = ByteArray(1024)
                while (stream.read(bytes) > -1) {
                    html += String(bytes)
                }
                extract(html)
            } catch (e: Exception) {
                listener?.onErrorListener("Error: $e")
            }
        }
    }

    private fun extract(html: String){
        var temp = html
        while (temp.contains("data-src=\"/thumb")) {
            val link = temp.split("data-src=\"/thumb/")[1].split("\"")[0]
            temp = temp.replace("data-src=\"/thumb/$link", "")
            if(link.contains(".jpg")) {
                list.add(mainURL + link)
            }
        }
        listener?.onCompleteListener(list)
    }
}