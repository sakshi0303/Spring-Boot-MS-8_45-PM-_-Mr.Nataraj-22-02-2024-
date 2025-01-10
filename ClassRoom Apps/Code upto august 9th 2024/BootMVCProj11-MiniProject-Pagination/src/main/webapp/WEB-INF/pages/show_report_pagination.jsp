<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <h1 style="text-align: center;color: green"> Report  with Pagination </h1>
<c:choose>
   <c:when  test="${!empty pageEmpList}">
     <table  border="1" bgcolor="cyan"  align="center">
        <tr>
          <th>empno </th><th>emp name </th><th>emp desg </th> <th>emp salary </th> <th>deptno </th><th> operations </th>
        </tr>
        
        <c:forEach var="emp"  items="${pageEmpList.getContent()}">
            <tr>
              <td>${emp.empno}</td>
              <td>${emp.ename}</td>
              <td>${emp.job}</td>
              <td>${emp.sal}</td>
              <td>${emp.deptno}</td>
            <td><a href="edit?no=${emp.empno}"><img src="images/edit.png" width="30px" height="30px"></a> &nbsp;&nbsp;&nbsp;
                       <a href="delete?no=${emp.empno}" onclick="return confirm(' are u sure to delete???')"><img src="images/delete.jpg" width="30px" height="30px"></a> 
              </td>
            </tr>
        </c:forEach>
     </table>
      <center>
         <c:if  test="${!pageEmpList.isFirst() }">
               <a href="page-report?page=0">first</a>
         </c:if>
         &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
         <c:if  test="${pageEmpList.hasNext() }">
               <a href="page-report?page=${pageEmpList.getPageable().getPageNumber() + 1}">next</a>
         </c:if>
         
         <c:forEach var="i"  begin="0"  end="${pageEmpList.getTotalPages()-1}"  step="1" >
                   <a href="page-report?page=${i}">${i +1}</a> &nbsp;&nbsp;&nbsp;&nbsp;
         </c:forEach>
         
          <c:if  test="${pageEmpList.hasPrevious() }">
               <a href="page-report?page=${pageEmpList.getPageable().getPageNumber() -1}">previous</a>
         </c:if>
         &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
         <c:if  test="${!pageEmpList.isLast() }">
               <a href="page-report?page=${pageEmpList.getTotalPages()-1}">last</a>
         </c:if>
       
        </center>
        
        
   
   </c:when>
   <c:otherwise>
       <h1 style="color:red;text-align:center"> Records not found  </h1>
   </c:otherwise>

</c:choose>
 <br><br><br>
 
<h2 style="color:green;text-align:center"> ${resultMsg}  </h2> 
 
<center>  <a href="register">Register Employee <img src="images/add.jpg"  width="100px" height="100px"/></a></center>
 
<br>
<center>  <a href="./">home <img src="images/home.jpg"  width="100px" height="100px"/></a></center>
