<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.zensar.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>List of All students</h2>
<%
	List<Student>listOfAllStudent = (List<Student>) request.getAttribute("listOfAllStudent");
%>
<table border="1">
		<th>Rollno</th>
		<th>Name</th>
		<th>Course</th>
		<th>Duration</th>
		<th>Age</th>
		<th>Gender</th>
		<th>Hometown</th>
		<%
			for (Student student : listOfAllStudent) {
		%>
		<tr>
			<td><%=student.getRollno()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getCourse()%></td>
			<td><%=student.getDuration()%></td>
			<td><%=student.getAge()%></td>
			<td><%=student.getGender()%></td>
			<td><%=student.getHometown() %></td>
			<td><a href="deleteStudent?requestAction=delete&rollno=<%= student.getRollno()%>">Delete</a>
			<td><a href="updateStudentForm?requestAction=openUpdateForm&rollno=<%= student.getRollno()%>">Update</a>
		</tr>
		<%
			}
		%>
		</table>
</body>
</html>