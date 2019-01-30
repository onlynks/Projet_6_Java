<%@ include file="head.jsp" %>
<%@ include file="menu.jsp" %>

<body>

<c:forEach items="${ bookList }" var="book">
    <p><c:out value="${ book.title }" /></p>
</c:forEach>

</body>
</html>