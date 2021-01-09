<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.zensar.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%Student student = (Student)request.getAttribute("student"); %>
<body>
<h2>Update Student Form</h2>
<table>
<tr>
<td>Rollno: </td>
<td> <input type="text" name="rollno" value="<%=student.getRollno() %>" /></td>
</tr>
<tr>
<td> Name: </td>
<td> <input type="text" name="Name"value="<%=student.getName()%>"/></td>
</tr>
<tr>
<td>Course: </td>
<td> <input type="text" name="course" value="<%=student.getCourse()%>"/></td>
</tr>
<tr>
<td> Duration: </td>
<td> <input type="text" name="duration" value ="<%=student.getDuration() %>"/></td>
</tr>
<tr>
<td> Age: </td>
<td> <input type="text" name="age" value ="<%=student.getAge() %>"/></td>
</tr>
<tr>
<td>gender:</td>
<td><input type="radio"  name="gender" value="male">
<label for="male">Male</label><br></td>

<td><input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label><br>
</td>
<tr>

<tr>
<td>hometown:</td><br>
<td><br>
<select id = "hometown" name="hometown"><br>
<option value="Pune">Pune</option>
<option value="Mumbai">Mumbai</option>
<option value="Goa">Goa</option>
<option value="Hydrebad">Hydrebad</option>
</select>
<td> &nbsp; </td>
<td> <input type="submit" value="Update Student" /></td>
</tr>
</table>

</body>
</html>