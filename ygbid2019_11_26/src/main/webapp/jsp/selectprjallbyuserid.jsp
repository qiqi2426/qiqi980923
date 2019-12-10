<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/12/9
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询未发布招标项目界面</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script src="<%=request.getContextPath()%>js/jquery-2.1.0.js"></script>
    <script>

        function chakang(s) {

            location.href="<%=request.getContextPath()%>/selectdetailedinformation/"+s
        }
        function tongguo(tgid) {
            if(confirm("是否确认通过")){
                location.href="<%=request.getContextPath()%>/tongguotenderngprjbyid/"+tgid
            }else {
                alert("已取消")
            }
        }
    </script>
</head>
<body>
<div class="container-fluid">
    <table class="table table-striped">
        <tr>
            <td>招标项目编号</td>
            <td>招标类型</td>
            <td>标题</td>
            <td>内容</td>
            <td>截止时间</td>
            <td>开标时间</td>
            <td>审核的意见</td>
        </tr>
        <c:forEach var="v" items="${tenderingprjs}">
            <tr>
                <td>${v.id}</td>
                <td>${v.tenderingtype.tenderingtypename}</td>
                <td>${v.title}</td>
                <td>${v.body}</td>
                <td>${v.supplierendtime}</td>
                <td>${v.opentime}</td>
                <td><a class="btn btn-primary btn-sm  active" role="button"  onclick="tongguo(${v.id})">通过</a>
                    <a class="btn btn-primary btn-sm  active"  role="button" onclick="chakang(${v.id})">查看</a>
                    <a class="btn btn-primary btn-sm  active" role="button" href="">删除</a></td>
            </tr>
        </c:forEach>
    </table>


</div>
</body>
</html>
