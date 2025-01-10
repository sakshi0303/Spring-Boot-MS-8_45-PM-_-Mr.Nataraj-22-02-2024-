<%@ page  isELIgnored="false"%>


<h1 style="color:red;text-align:center"> Student registration page</h1>

 <form  action="register"  method="POST">
   <table  align="center">
      <tr>
         <td> student no:: </td>
         <td> <input type="text" name="sno"> </td>
      </tr>
      <tr>
         <td> student name:: </td>
         <td> <input type="text" name="sname"> </td>
      </tr>
      <tr>
         <td> student address:: </td>
         <td> <input type="text" name="sadd"> </td>
      </tr>
      
      <tr>
         <td> student avg:: </td>
         <td> <input type="text" name="avg"> </td>
      </tr>
      <tr>
         <td><input type="submit" value="register"/></td>
      </tr>
   </table>
 
 </form>
