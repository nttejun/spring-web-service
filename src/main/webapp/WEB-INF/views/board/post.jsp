<%--
  Created by IntelliJ IDEA.
  User: wjjeong
  Date: 30/06/2019
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시물 생성</title>
</head>
<body>
<form id="fmAddBoard" method="post" action="/board/">
    <table>
        <tr>
            <td>
                category : <input type="text" name="category">
            </td>
        </tr>
        <tr>
            <td>
                title : <input type="text" name="title">
            </td>
        </tr>
        <tr>
            <td>
                contents : <input type="text" name="contents">
            </td>
        </tr>
        <tr>
            <td>
                reg_user : <input type="text" name="regUser">
            </td>
        </tr>
    </table>
    <input type="submit" value="등록하기"/>
    <button id="btnBoardCancel">취소하기</button>
</form>
</body>
</html>
