<%@ page  isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm" %>


<h1  style="color:red;text-align:center">Employee registration page </h1>


<head> 
    <link rel="stylesheet" href="css/style.css" /> 
</head> 
 <script language="JavaScript"  src="js/validation.js">
 
 </script>

<frm:form  modelAttribute="emp"  onsubmit="return validate(this)">
 <%-- <p style="color:red;text-align:center">
   <frm:errors path="*"/>
  </p> 
  --%> 
  <table  align="center" bgcolor="yellow">
    <tr>
      <td> emp name :: </td>
      <td> <frm:input path="ename"/> <frm:errors cssClass="error" path="ename"/> <span id="enameErr"> </span> </td>
    </tr>
    <tr>
      <td> emp job :: </td>
      <td> <frm:input path="job"/> <frm:errors  cssClass="error" path="job"/> <span id="jobErr"> </span> </td>
    </tr>
    <tr>
      <td> emp salary :: </td>
      <td> <frm:input path="sal"/> <frm:errors  cssClass="error" path="sal"/><span id="salErr"> </span> </td>
    </tr>
    <tr>
      <td> emp deptno :: </td>
      <td> <frm:input path="deptno"/> <frm:errors cssClass="error" path="deptno"/> <span id="deptnoErr"> </span> </td>
    </tr>
    <tr>
      <td colspan="2"> <frm:hidden path="vflag"/>  </td>
    </tr>
    
    
    <tr>
      <td> <input type="submit"  value="register"> </td>
      <td> <input type="reset"  value="cancel"> </td>
    </tr>
    
    
    
  </table>
     
</frm:form>
