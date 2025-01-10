<%@ page  isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm" %>


<h1 style="color:red;text-align:center"> Student registration page</h1>

 <frm:form     modelAttribute="stud">
   <table  align="center">
      <tr>
         <td> student no:: </td>
         <td> <frm:input  path="sno"/> </td>
      </tr>
      <tr>
         <td> student name:: </td>
         <td> <frm:input type="text" path="sname"/> </td>
      </tr>
      <tr>
         <td> student address:: </td>
         <td> <frm:input type="text" path="sadd"/> </td>
      </tr>
      
      <tr>
         <td> student avg:: </td>
         <td> <frm:input type="text" path="avg"/> </td>
      </tr>
      <tr>
         <td><input type="submit" value="register"/>
                  <input type="reset" value="cancel"/>
         </td>
      </tr>
   </table>
 
 </frm:form>
