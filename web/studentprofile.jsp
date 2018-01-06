<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="header.jsp" %>
</head>
<body>
<section id="ext_menu-1">

    <nav class="navbar navbar-dropdown navbar-fixed-top">
        <div class="container">

            <div class="mbr-table">
                <div class="mbr-table-cell">

                    <div class="navbar-brand">
                        <a href="" class="navbar-logo"><img src="assets/images/logo-fullwhite-495x128.png" alt="icad"></a>
                        <a class="navbar-caption" href="">Teacher's Evaluation System</a>
                    </div>

                </div>
                <div class="mbr-table-cell">

                    <button class="navbar-toggler pull-xs-right hidden-md-up" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
                        <div class="hamburger-icon"></div>
                    </button>

                    <ul class="nav-dropdown collapse pull-xs-right nav navbar-nav navbar-toggleable-sm" id="exCollapsingNavbar">
                        <li class="nav-item"><a class="nav-link link" href="">About</a></li>
                          <li class="nav-item"><a class="nav-link link" href="">iSims</a></li>
                            <li class="nav-item"><a class="nav-link link" href="logout.html">Logout</a></li></ul>

                    <button hidden="" class="navbar-toggler navbar-close" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
                        <div class="close-icon"></div>
                    </button>

                </div>
            </div>

        </div>
    </nav>
</section>
<section class="engine"><a rel="external" href=""></a></section><section class="mbr-section mbr-after-navbar" id="msg-box5-2" style="background-color: rgb(255, 255, 255); padding-top: 200px; padding-bottom: 150px;">
    <div class="container">
        <div class="row">
            <div class="mbr-table-md-up">

              <div class="mbr-table-cell mbr-right-padding-md-up mbr-valign-top col-md-7 image-size" style="width: 25%;">
                  <div class="mbr-figure"><img src="assets/images/desktop.jpg"><br>
  <h3 class="mbr-section-title display-2"><%=session.getAttribute("name") %></h3>
  <p>Subject</p>
  <p>Time</p>
                  </div>
              </div>

              <table>
  <thead>
      <tr>
          <th>SUBJECT</th>
          <th>PROFESSOR</th>
          <th>TIME</th>
          <th>STATUS</th>
      </tr>
  </thead>
  <tbody>
      <tr>
          <td>ENT JAVA</td>
          <td>MON ZALAMEDA</td>
          <td>7:30 - 11:00</td>
          <td><a href="evaluationForm.jsp" class="action-button shadow animate blue">Evaluate</a></td>
      </tr>
      <tr>
          <td>SETHES 1</td>
          <td>ANGELA GARONG</td>
          <td>7:30 - 11:00</td>
          <td><p>DONE</p></td>
      </tr>
  </tbody>
</table>



            </div>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
</body>
</html>