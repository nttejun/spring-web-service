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
<form action="/board/postUpdate" name="postUpdateFm" method="post">
    <table style="border: 1px solid black;">
        <tr style="visibility: hidden;">
            <input type="hidden" name="eid" value="${contentsInfo.eid}"/>
        </tr>
        <tr>
            <td>카테고리</td>
            <td><input type="text" name="category" value="${contentsInfo.category}" readonly="readonly"/></td>
        </tr>
        <tr>
            <td>제목</td>
            <td><input type="text" name="title" value="${contentsInfo.title}" readonly="readonly"/></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><input type="text" name="contents" value="${contentsInfo.contents}" readonly="readonly"/></td>
        </tr>
        <tr>
            <td>등록자</td>
            <td><input type="text" name="regUser" value="${contentsInfo.reg_user}" readonly="readonly"></td>
        </tr>
        <tr>
            <td>등록일시</td>
            <td><input type="text" name="regDttm" value="${contentsInfo.reg_dttm}" readonly="readonly"></td>
        </tr>
        <tr>
            <td>수정자</td>
            <td><input type="text" name="uptUser" value="${contentsInfo.upt_user}" readonly="readonly"/></td>
        </tr>
        <tr>
            <td>수정일시</td>
            <td><input type="text" name="uptDttm" value="${contentsInfo.upt_dttm}" readonly="readonly"/></td>
        </tr>
    </table>
</form>
<input type="button" id="updateContentsBtn" value="수정하기" style="display: none;">
<input type="button" id="updateBtn" value="변경">
<input type="button" id="deleteContentsBtn" value="삭제">
<input type="button" id="updateCancelBtn" value="취소" style="display: none;">

<form name="updateCancelFm" action="/board/" method="GET"></form>
<form name="postDeleteFm" action="/board/postDelete" method="POST">
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
    function updateFunc() {
        postUpdateFm.category.readOnly = "";
        postUpdateFm.title.readOnly = "";
        postUpdateFm.contents.readOnly = "";
        postUpdateFm.uptUser.readOnly = "";
        document.getElementById("updateBtn").style.display = "none";
        document.getElementById("updateContentsBtn").style.display = "";
        document.getElementById("updateCancelBtn").style.display = "";
    }

    // 수정요청
    function updateContentsFunc() {
        document.postUpdateFm.submit();
    }

    function updateCancelFunc() {
        document.updateCancelFm.submit();
    }

    // 삭제요청
    function deleteContentsFunc() {
        document.postDeleteFm.submit();
    }

    const updateBtn = document.getElementById("updateBtn");
    const updateContentsBtn = document.getElementById("updateContentsBtn");
    const updateCancelBtn = document.getElementById("updateCancelBtn");
    const deleteContentsBtn = document.getElementById("deleteContentsBtn");

    updateBtn.addEventListener("click", function (event) {
        updateFunc()
    });
    updateContentsBtn.addEventListener("click", function (event) {
        updateContentsFunc()
    });
    updateCancelBtn.addEventListener("click", function (event) {
        updateCancelFunc();
    })
    deleteContentsBtn.addEventListener("click", function (event) {
        deleteContentsFunc()
    });


</script>
</html>


