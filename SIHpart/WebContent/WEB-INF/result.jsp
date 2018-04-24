<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${comment.getName()}</td>
         </tr>

         <tr>
            <td>Age</td>
            <td>${comment.getAge()}</td>
         </tr>
         <tr>
            <td>ID</td>
            <td>${comment.getId()}</td>
         </tr>
      </table>  
   </body>
</html>