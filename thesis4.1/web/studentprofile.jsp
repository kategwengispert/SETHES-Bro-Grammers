<jsp:useBean id="records" type="java.sql.ResultSet" scope="request"/>
<!DOCTYPE html>
<html>
<head>

  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" href="assets/images/logo-fullwhite-495x128.png" type="image/x-icon">
  <meta name="description" content="">

<link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic&amp;subset=latin">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">
  <link rel="stylesheet" href="assets/bootstrap-material-design-font/css/material.css">
  <link rel="stylesheet" href="assets/tether/tether.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/dropdown/css/style.css">
  <link rel="stylesheet" href="assets/animate.css/animate.min.css">
  <link rel="stylesheet" href="assets/theme/css/style.css">
  <link rel="stylesheet" href="assets/jerx/css/table.css" type="text/css">
  <link rel="stylesheet" href="assets/jerx/css/mbr-additional.css" type="text/css">
  <link rel="stylesheet" href="assets/jerx/css/style.css" type="text/css">




</head>
<body>
<%@include file = "header.jsp" %>
<section class="engine"><a rel="external" href=""></a></section><section class="mbr-section mbr-after-navbar" id="msg-box5-2" style="background-color: rgb(255, 255, 255); padding-top: 200px; padding-bottom: 150px;">
    <div class="container">
        <div class="row">
            <div class="mbr-table-md-up">

              <div class="mbr-table-cell mbr-right-padding-md-up mbr-valign-top col-md-7 image-size" style="width: 25%;">
                  <div class="mbr-figure"><img src="assets/images/desktop.jpg"><br>
  <h3 class="mbr-section-title display-2"></h3>
  <p></p>
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
  	<%
	while (records.next()){
	%>
      <tr>
          <td><%=records.getString("courseName") %></td>
          <td><%=records.getString("professorName") %></td>
          <td><%=records.getString("courseTime") %></td>
          <td><a href="evaluationForm.jsp" class="action-button shadow animate blue">Evaluate</a></td>
      </tr>
    <%} %>	
  </tbody>
</table>



            </div>
        </div>
    </div>
</section>
<%@include file = "footer.jsp" %>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  <script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/tether/tether.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/smooth-scroll/smooth-scroll.js"></script>
  <script src="assets/dropdown/js/script.min.js"></script>
  <script src="assets/touch-swipe/jquery.touch-swipe.min.js"></script>
  <script src="assets/viewport-checker/jquery.viewportchecker.js"></script>
  <script src="assets/theme/js/script.js"></script>
  <script src="assets/jerx/js/checkbox.js"></script>


  <input name="animation" type="hidden">
  </body>
</html>
