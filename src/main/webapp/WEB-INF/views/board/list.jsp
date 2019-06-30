<%--
  Created by IntelliJ IDEA.
  User: wjjeong
  Date: 05/06/2019
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/assets/include.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="">
    <h3>${boardListr}</h3>
    <table border="1px solid;">
            <c:forEach var="board" items="${boardList}" varStatus="status">
        <tr>
            <td>${status.count}</td><td>${board.title}</td>
        </tr>
            </c:forEach>
    </table>
</form>
</body>
<script type="text/javascript">
</script>
</html>


