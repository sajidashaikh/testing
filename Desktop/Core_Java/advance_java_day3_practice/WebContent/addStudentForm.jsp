<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<h2>Add Student</h2>
<form action="addStudent" method="post">
<table>
<tr>
<td> Rollno: </td>
<td> <input type="text" name="rollno" /></td>
</tr>
<tr>
<td> Student Name: </td>
<td> <input type="text" name="studentName" /></td>
</tr>
<tr>
<td> Course: </td>
<td> <input type="text" name="course" /></td>
</tr>
<tr>
<td> Duration: </td>
<td> <input type="text" name="duration" /></td>
</tr>
<tr>
<td> Age: </td>
<td> <input type="text" name="age" /></td>
</tr>
<tr>
<td>gender:</td>
<td><input type="radio"  name="gender" value="male">
<label for="male">Male</label><br></td>

<td><input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label><br>
</td>

</tr><br>

<tr>
<td>hometown:</td><br>
<td><br>
<select id = "hometown" name="hometown"><br>
<option value="Pune">Pune</option>
<option value="Mumbai">Mumbai</option>
<option value="Goa">Goa</option>
<option value="Hydrebad">Hydrebad</option>
</select>
<br><br>
<td> &nbsp; </td><br><br>
<td> <input type="submit" value="Add Student" /></td>
</tr>
</table>
</form>
</body>
</html>