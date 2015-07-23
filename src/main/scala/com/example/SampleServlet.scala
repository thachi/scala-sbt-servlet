package com.example

import java.util.Date
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

class SampleServlet extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) = {

    val s = response.getOutputStream
    s.print("Hello! " + new Date().toString)
    s.flush()
  }
}