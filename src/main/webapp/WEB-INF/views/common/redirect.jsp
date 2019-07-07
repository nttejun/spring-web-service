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
<form id="redirectFm" style="display: none;" method="get" action="${redirectUrl}">
</form>
</body>
<script type="text/javascript">
    document.getElementById("redirectFm").submit();
</script>
</html>


