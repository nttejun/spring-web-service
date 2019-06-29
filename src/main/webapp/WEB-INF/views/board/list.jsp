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
    <table>
        <tr>
            <c:forEach var="boardList" items="${boardList}" varStatus="status">
                <td>${status.count} : <c:out value="${boardList}" /></td>
            </c:forEach>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript">
</script>
</html>


