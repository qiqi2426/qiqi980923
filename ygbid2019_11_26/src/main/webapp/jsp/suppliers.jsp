<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/12/3
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <script src="js/jquery-2.1.0.js"></script>
    <script>
// 判断是否是第一页
        function pddy() {


            if (${pageInfo.prePage}==0){
                alert("这已经是第一页了")
            }
        }
        // 判断是否是最后一页
        function pdzh() {
            if (${pageInfo.nextPage}==0){
               alert("这已经是最后一页了，已跳转至第一页")
            }
        }
    </script>
</head>
<body>
<div class="container-fluid">
    <table class="table table-striped">
        <tr>
            <td>供应商名字</td>
            <td>法人</td>
            <td>注册资金</td>
            <td>地址</td>
            <td>电话</td>
            <td>注册标志</td>
            <td>审核的意见</td>
        </tr>
        <c:forEach var="v" items="${suppliers}">
            <tr>
                <td>${v.suppliername}</td>
                <td>${v.supplierpeople}</td>
                <td>${v.suppliermoney}</td>
                <td>${v.supplieraddress}</td>
                <td>${v.tel}</td>
                <td>${v.sign}</td>
                <td><a class="btn btn-primary btn-sm btn-block active" role="button" href="selectUserMenu">提交</a></td>
            </tr>
        </c:forEach>
    </table>

<div class="row" >

    <a href="selectallsupplier?page=${pageInfo.firstPage}" class="col-md-offset-4 col-lg-1">首页</a>
    <a href="selectallsupplier?page=${pageInfo.prePage}" onclick="pddy()" class="col-lg-1">上一页</a>
    <a href="selectallsupplier?page=${pageInfo.nextPage}" onclick="pdzh()" class="col-lg-1">下一页</a>
    <a href="selectallsupplier?page=${pageInfo.lastPage}" class="col-lg-1">尾页</a>

</div>
</div>
</body>
</html>
