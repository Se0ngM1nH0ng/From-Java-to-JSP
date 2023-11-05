<%@ tag language="java" pageEncoding="UTF-8"%>

<jsp:useBean id="pb" class="test.ProductBean" />

<%@ attribute name="border" %>
<%@ attribute name="bgcolor" %>


<h1><jsp:doBody/></h1>

<hr>
<table border="${border}" bgcolor="${bgcolor}">
   <% for(String v : pb.getPdatas()){ %>
      <tr><td><%=v%></td></tr>
   <% } %>
</table>

<table border="${border}" bgcolor="${bgcolor}">
	
</table>