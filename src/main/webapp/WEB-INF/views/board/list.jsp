<%--
  Created by IntelliJ IDEA.
  User: wjjeong
  Date: 05/06/2019
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/assets/include.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1px solid;">
    <c:forEach var="board" items="${boardList}" varStatus="status">
        <tr onclick="location.href='/board/post/${board.eid}'">
            <td>${status.count}</td>
            <td>${board.title}</td>
        </tr>
    </c:forEach>
</table>

<div>
    <button id="btnAddBoard">Add Board</button>
</div>

<form method="get" id="fmAddBoard" action="/board/post"></form>
</body>
<script type="text/javascript">

    var fmAddBoard = function (ev) {
        document.getElementById("fmAddBoard").submit();
    };

    var btnAddBoard = document.querySelector('#btnAddBoard');
    btnAddBoard.addEventListener('click', fmAddBoard);

</script>
</html>


