<%@ include file="head.jsp" %>
<%@ include file="menu.jsp" %>

<c:forEach items="${bookFound}" var="book">
    <p>${book.title}</p>
</c:forEach>

<%@ include file="footer.jsp" %>