<%@ page pageEncoding="UTF-8" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello ibtissame</title>
</head>
<body>

   <p>Hello World Vrai controller</p>
   
   <p>
   		<%
   			String variable = (String) request.getAttribute("variable");
  		 	out.println(variable);
  		 %>
   </p>p
</body>
</html>