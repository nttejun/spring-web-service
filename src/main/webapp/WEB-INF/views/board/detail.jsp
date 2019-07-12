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
    <div>
        <table>
            <tr>
                <td>카테고리</td>
                <td>${contentsInfo.category}</td>
            </tr>
            <tr>
                <td>제목</td>
                <td>${contentsInfo.title}</td>
            </tr>
            <tr>
                <td>내용</td>
                <td>${contentsInfo.contents}</td>
            </tr>
            <tr>
                <td>등록자</td>
                <td>${contentsInfo.regUser}</td>
            </tr>
            <tr>
                <td>등록일시</td>
                <td>${contentsInfo.regDttm}</td>
            </tr>
            </tr>
        </table>
        <input type="button" value="수정">
        <input type="button" value="삭제">
    </div>
</body>
</html>


