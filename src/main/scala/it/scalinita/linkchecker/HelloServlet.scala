package it.scalinita.linkchecker

import javax.servlet.annotation._
import java.io._
import javax.servlet._
import javax.servlet.http._
import java.lang.SuppressWarnings
import javax.servlet.annotation.WebServlet

@SuppressWarnings(Array("serial"))
@WebServlet(name = "HelloServlet", urlPatterns = { Array("/hello") })
class HelloServlet extends HttpServlet {

  override def doGet(req: HttpServletRequest, res: HttpServletResponse): Unit = {

    val user = req.getParameter("user") match {
      case s: String => s
      case _ => "Qualcuno!"
    }
    val out = res.getWriter()
    out.println(toHtml(user).toString())

  }

  // basic template! :-)
  def toHtml(user: String) =
    <html>
      <body>
        <h1>Hello { user }</h1>
      </body>
    </html>

}
