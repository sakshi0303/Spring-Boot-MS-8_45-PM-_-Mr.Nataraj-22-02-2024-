<%@ page language="java"  isELIgnored="false"  import="java.util.*,com.nt.model.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


   <%-- <%
      //read model attribute vlaue
      List<Customer> list=(List<Customer>)request.getAttribute("custData");
     if(list!=null){  %>
        <table border="1"  bgcolor="cyan"  align="center">
            <tr>
              <th>cno </th><th>cname </th> <th>cadd </th> <th> billAmt </th> 
            </tr>
            
            <%
                for(Customer cust:list){ %>
            	    <tr>
            	      <td><%=cust.getCno() %>  </td>
            	      <td><%=cust.getCname() %>  </td>
            	      <td><%=cust.getCadd() %>  </td>
            	      <td><%=cust.getBillAmt() %>  </td>
            	    </tr>
            <%    }
            %>
        </table>
    <% }//if
     else{  %>
    	   <h1 style="color:red;text-align:center"> Records not found </h1>
    <%  }
    %>
 --%>
 
    <c:choose>
      <c:when test="${!empty custData }">
       <table border="1"  bgcolor="cyan"  align="center">
            <tr>
              <th>cno </th><th>cname </th> <th>cadd </th> <th> billAmt </th> 
            </tr>
         <c:forEach var="cust"  items="${custData}">
            <tr>
               <td>${cust.cno}  </td>
               <td>${cust.cname}  </td>
               <td>${cust.cadd}  </td>
               <td>${cust.billAmt}  </td>
            </tr>
         </c:forEach>
         </table>
       </c:when>
 
    <c:otherwise>
             <h1  style="color:red"> Data not found </h1>
    </c:otherwise>
    
      </c:choose>
    <%-- <b> Model attributes are ::  ${name}, ${age}</b> --%>
    
    
   <%--  <h1> model attributes are </h1>
       <b> FavColors ::<%=Arrays.toString((String[])request.getAttribute("favColors")) %> </b> <br>
       <b> Friends :: ${friends}</b> <br>
       <b> phone Numbers :: ${phoneNumbers}</b> <br>
       <b> Id Details :: ${idDetails}</b> <br>
        --%>
   <%--     <b> FavColors ::
                       <c:forEach var="color" items="${favColors}">
                                ${color},
                       </c:forEach>
       </b> <br>
       <b> Friends :: <c:out value="${friends}" /></b> <br>
       <b> PhoneNumbers :: <c:out value="${phoneNumbers}" /></b> <br>
       <b> IdDetails :: <c:out value="${idDetails}" /></b> <br> --%>
       
   <%--     <c:if test="${!empty  custData}">
        <b> Model  attribute data :: ${custData}</b> <br>
        <b>  Model attribute data :: ${custData.cno}, ${custData.cname},${custData.cadd},${custData.billAmt}</b>
       </c:if> --%>
       
      
       