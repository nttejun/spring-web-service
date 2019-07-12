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
<input type="button" id="updateContentsBtn" value="변경">
<input type="button" id="reqUpdateContentsBtn" value="수정하기">
<input type="button" id="deleteContentsBtn" value="삭제">
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
    function updateContentsFunc() {
    }

    // 수정요청
    function reqUpdateContentsFunc() {
        post("${eid}", "/board/post", "put");
    }

    // 삭제요청
    function deleteContentsFunc() {
        post("${eid}", "/board/post", "delete");
    }

    const updateContentsBtn = document.getElementById("updateContentsBtn");
    const reqUpdateContentsBtn = document.getElementById("reqUpdateContentsBtn");
    const deleteContentsBtn = document.getElementById("deleteContentsBtn");

    updateContentsBtn.addEventListener("click", function(event){updateContentsFunc()});
    reqUpdateContentsBtn.addEventListener("click", function(event){reqUpdateContentsFunc()});
    deleteContentsBtn.addEventListener("click", function(event){ deleteContentsFunc()});


</script>
</html>


