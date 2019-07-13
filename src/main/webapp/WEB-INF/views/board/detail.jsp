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
<table style="border: 1px solid black;">
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
</table>
<input type="button" id="reqUpdateContentsBtn" value="변경">
<input type="button" id="deleteContentsBtn" value="삭제">
<input type="button" id="updateContentsBtn" value="수정하기">

<form name="updateContentsFm" action="/board/postUpdate" method="POST">
    <input type="hidden" name="eid" value="${contentsInfo.eid}">
</form>
<form name="deleteContentsFm" action="/board/postDelete" method="POST">
    <input type="hidden" name="eid" value="${contentsInfo.eid}">
</form>
</body>
<script type="text/javascript">

    function post(dictionary, url, method) {
        method = method || "post"; // method default is post

        var form = document.createElement("form");
        form.setAttribute("method", method);
        form.setAttribute('action', url);

        var hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", dictionary);
        hiddenField.setAttribute("value", dictionary);
        form.appendChild(hiddenField);

        document.body.appendChild(form);
        form.submit();
    }

    // 수정안내
    function reqUpdateContentsFunc() {
        document.updateContentsFm.submit();
    }

    // 수정요청
    function updateContentsFunc() {
        document.deleteContentsFm.submit();
    }

    // 삭제요청
    function deleteContentsFunc() {
        document.deleteContentsFm.submit();
    }

    const reqUpdateContentsBtn = document.getElementById("reqUpdateContentsBtn");
    const updateContentsBtn = document.getElementById("updateContentsBtn");
    const deleteContentsBtn = document.getElementById("deleteContentsBtn");

    reqUpdateContentsBtn.addEventListener("click", function(event){reqUpdateContentsFunc()});
    updateContentsBtn.addEventListener("click", function(event){updateContentsFunc()});
    deleteContentsBtn.addEventListener("click", function(event){ deleteContentsFunc()});


</script>
</html>


