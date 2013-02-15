package it.scalinita.linkchecker.templates

object Home {
	def apply(user: String): scala.xml.Elem = {
	  Main("Home page"){
		  <div><h1>hello {user}!</h1></div>
	  }
	}
}