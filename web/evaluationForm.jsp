<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<section class="engine"><a rel="external" href=""></a></section><section class="mbr-section mbr-after-navbar" id="msg-box5-2" style="background-color: rgb(255, 255, 255); padding-top: 280px; padding-bottom: 40px;">
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
                  <div class="">
                    <div class="">
                      <h1 class="surv-header">This is a scale survey</h1>
                      <form action="">

                        <label class="statement">Is an asset to iACADEMY</label>
                        <div class='surv'>
                          <div class="col-md-2">
                            <input type="radio" class="radio" name="surv[1][]" value="5">
                            <label>5</label>
                          </div>
                          <div class="col-md-2">
                            <input type="radio" class="radio" name="surv[1][]" value="4">
                            <label>4</label>
                          </div>
                          <div class="col-md-2">
                            <input type="radio" class="radio" name="surv[1][]" value="3">
                            <label>3</label>
                          </div>
                          <div class="col-md-2">
                            <input type="radio" class="radio" name="surv[1][]" value="2">
                            <label>2</label>
                          </div>
                          <div class="col-md-2">
                            <input type="radio" class="radio" name="surv[1][]" value="1">
                            <label>1</label>
                          </div>
                          <div class="col-md-2">
                            <input type="radio" class="radio" name="surv[1][]" value="na">
                            <label>NA</label>
                          </div>
                        </div>
                        <label class="statement">Speaks in clear, well modulated voice</label>
                        <ul class='surv'>
                          <li>
                            <input type="radio" class="radio" name="surv[2][]" value="5">
                            <label>5</label>
                          </li>
                          <li>
                            <input type="radio" class="radio" name="surv[2][]" value="4">
                            <label>4</label>
                          </li>
                          <li>
                            <input type="radio" class="radio" name="surv[2][]" value="3">
                            <label>3</label>
                          </li>
                          <li>
                            <input type="radio" class="radio" name="surv[2][]" value="2">
                            <label>2</label>
                          </li>
                          <li>
                            <input type="radio" class="radio" name="surv[2][]" value="1">
                            <label>1</label>
                          </li>
                          <li>
                            <input type="radio" class="radio" name="surv[2][]" value="na">
                            <label>NA</label>
                          </li>
                        </ul>
                          </fieldset>
                        
                        <div class="buttons">
                          <button class="clear">Clear</button>
                          <button class="submit">Submit</button>
                        </div>
                      </form>



            </div>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
</body>
</html>