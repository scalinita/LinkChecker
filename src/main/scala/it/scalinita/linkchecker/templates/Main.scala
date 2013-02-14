package it.scalinita.linkchecker.templates

object Main {
	def apply(title: String)(body: => scala.xml.Elem): scala.xml.Elem = {
	  <html>
		<head>
		  <title>{title}</title>
		</head>
		<body>
			{body}
		</body>
	  </html>
	}
}