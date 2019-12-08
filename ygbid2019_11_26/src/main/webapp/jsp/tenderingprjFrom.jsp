<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/12/5
  Time: 16:40
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
        $(function () {
                $.get("gettype",function (data) {
                    for (var i=0;i<data.length;i++){
                        $("#tenderingtypeid").append("<option >"+data[i].tenderingtypename+"</option>")
                    }
                })
        })
        function tjwj() {

            $("#tjddiv").append("<input type='file'  name='file' onchange='tjwj()'>")
        }
    </script>
</head>
<body>
<div class="container">
    <div>
        <h1>
            <legend>表单</legend>
        </h1>
    </div>
    <form class="form-horizontal" method="post" action="addtenderingprj" enctype="multipart/form-data">
        <div class="form-group">
            <label for="tenderingtypeid" class="col-sm-2 control-label">招标类型</label>
            <div class="col-sm-8">
                <select class="form-control" id="tenderingtypeid" name="tenderingtypename">

                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="titletext" class="col-sm-2 control-label">标题</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="titletext" name="title" placeholder="title">
            </div>
        </div>
        <div class="form-group">
            <label for="bodytext" class="col-sm-2 control-label">内容</label>
            <div class="col-sm-8">
                <textarea class="form-control" id="bodytext" rows="3" name="body" placeholder="body"></textarea>
            </div>
        </div>
        <div class="form-group">
            <label for="opentime" class="col-sm-2 control-label">开标时间</label>
            <div class="col-sm-8">
                <input type="date" class="form-control" name="opentime" id="opentime" >
            </div>
        </div>
        <div class="form-group">
            <label for="supplierendtime" class="col-sm-2 control-label">截止时间</label>
            <div class="col-sm-8">
                <input type="date" class="form-control" id="supplierendtime" name="supplierendtime" >
            </div>
        </div>
        <div class="form-group">
            <label for="files" class="col-sm-2 control-label">添加文件</label>
            <div class="col-sm-2" id="tjddiv">
                <input type="file"  id="files" name="file" onchange="tjwj()">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-8">
                <button type="submit" class="btn btn-default">Sign in</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
