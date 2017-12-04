
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="in.vamsoft.training.model.ModelQuestion"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<head>
<title>UserDashBoard</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>

	<form action="ResultServlet" method="post">
		
				<a style="float: right" href="LogoutServlet"><span
						class="glyphicon glyphicon-log-in"></span> Logout</a></li>
			</ul>
		</div>



		
				<div class="text-left">
					<h4>
						Welcome:
						<%=session.getAttribute("currentSessionUser")%></h4>
						<h3 style="text-align:left">Test</h3>
				</div>
				

					
					
						<%
						  List<ModelQuestion> questions = (List<ModelQuestion>) session.getAttribute("ModelQuestion");
						%>

						<%
						  for (ModelQuestion element : questions) {
						%>
						<div>
					   <div><%=element.getQuestionNo()%>.<%=element.getQuestion()%></div>
                        <div>
							<input type="radio" name="<%=element.getQuestionNo()%>"
								value="<%=element.getOption1()%>"><%=element.getOption1()%><br>

							<input type="radio" name="<%=element.getQuestionNo()%>"
								value="<%=element.getOption2()%>"><%=element.getOption2()%><br>
							<input type="radio" name="<%=element.getQuestionNo()%>"
								value="<%=element.getOption3()%>"><%=element.getOption3()%><br>
							<input type="radio" name="<%=element.getQuestionNo()%>"
								value="<%=element.getOption4()%>"><%=element.getOption4()%><br>
						</div>

						<%
                          }
                        %>
					
</div>
					<div class="container-fluid text-center" style="float: right">
						<input type="submit" name="submit" value="submit">
					</div>



				</div>





	</form>
</body>
</html>