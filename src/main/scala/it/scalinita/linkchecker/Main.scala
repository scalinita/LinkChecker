package it.scalinita.linkchecker

import java.net.URL
import java.net.Proxy
import java.net.InetSocketAddress
import java.net.HttpURLConnection

object Main extends App {

  // TODO
  
  val userAgent = "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)"
  val method = "GET" // HEAD etc
  val url = new URL("http://www.google.com")

  val huc = url.openConnection().asInstanceOf[HttpURLConnection]
  huc.setRequestProperty("User-Agent", userAgent)
  huc.setRequestMethod(method)
  huc.connect();
  val status = huc.getResponseCode()

  status match {
    case code if code == HttpURLConnection.HTTP_OK => println(code + " OK!")
    case code if code == HttpURLConnection.HTTP_MOVED_PERM => println(code + " MOVED!")
    case _ => println("...")
  }

}