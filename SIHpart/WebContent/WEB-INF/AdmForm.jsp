<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
<body>

	<h1>${headerMessage}</h1>

	<h3> STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h3> 
	<f:errors path="student1.*" cssClass="error"/>
	<form action="/SIHpart/submitAdmissionForm.html" method="post">
	
		<table>
		<tr>
			<td>Student's Name : </td><td>        <input type="text" name="studentName" /></td>
			<td><f:errors path="studentName" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Student's Hobby : </td><td>       <input type="text" name="studentHobby" /></td>
			<td><f:errors path="studentHobby" cssClass="error"/></td>
		</tr>
	
			<tr>
			<td>Student's Mobile : </td><td>      <input type="text" name="studentMobile" /></td>
		</tr>
		<tr>
			<td>Student's DOB : </td><td>     	   <input type="text" name="studentDOB" /></td>
		</tr>
		<tr>
			<td>Student's Skills set :</td><td>    <select name="studentSkills" multiple>
													<option value="Java Core">Java Core</option>
													<option value="Spring Core">Spring Core</option>
													<option value="Spring MVC">Spring MVC</option>
													</select><td>
		</tr>
		<tr><td>Student's Address : </td></tr> 
		<tr>
			<td>country: <input type="text" name="studentAddress.country"/></td>
			<td>city: <input type="text" name="studentAddress.city" /></td>
			<td>street: <input type="text" name="studentAddress.street" /></td> 
			<td>pincode:<input type="text" name="studentAddress.pincode" /></td>
		</tr>
		
		<tr><td><input type="submit" value="Submit this form by clicking here" /></td></tr>
		
		</table>
		
	</form>
 
</body>
</html>

