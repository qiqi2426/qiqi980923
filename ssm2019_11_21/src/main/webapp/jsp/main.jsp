<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/26
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/ssm2019_11_21_war_exploded/css/aftermain.css"/>
    <link rel="stylesheet" type="text/css" href="/ssm2019_11_21_war_exploded/css/zTreeStyle/zTreeStyle.css">
    <script src="/ssm2019_11_21_war_exploded/js/jquery-1.4.4.min.js"></script>
    <script src="/ssm2019_11_21_war_exploded/js/jquery.ztree.core-3.5.min.js"></script>
    <SCRIPT type="text/javascript">
        <!--
        var setting = {
            view: {
                dblClickExpand: false,
                showLine: false
            },
            data: {
                simpleData: {
                    enable: true
                }
            },
            callback: {
                onClick: onClick
            }

        };

        // var zNodes =[
        //     { id:1, pId:0, name:"父节点1 - 展aaaa开", open:true},
        //     { id:11, pId:1, name:"父节点11 - 折叠",url:"http://www.163.com","target":"af"},
        //     { id:12, pId:1, name:"父节点12 - 折叠",url:"http://www.163.com","target":"af"},
        //     { id:13, pId:1, name:"父节点13 - 折叠",url:"http://www.163.com","target":"af"},
        //     { id:14, pId:0, name:"父节点13 - 折叠",url:"http://www.163.com","target":"af"},
        //     { id:15, pId:14, name:"父节点13 - 折叠",url:"http://www.163.com","target":"af"},
        //
        // ];
        var zNodes = ${menusJson};
            $(document).ready(function () {
                $.fn.zTree.init($("#treeDemo"), setting, zNodes);
            });


        function onClick(e, treeId, treeNode) {
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            zTree.expandNode(treeNode, null, null, null, true);

        }

        //-->
    </SCRIPT>

    <style type="text/css">
        #treeDemo {
            background-color: white
        }

        .ztree li span.button.switch {
            width: 18px;
            height: 18px;
            display: none;
        }

        .ztree li a {
            padding: 0px 3px 0 0;
            border: 1px #fff solid;
        }

        .ztree li a.curSelectedNode {
            padding-top: 0px;
            background: #EBEDF2 url("images/tree/button.png") repeat-x 0 0;
            color: black;
            border: 1px #A9ACB5 solid;
            opacity: 0.8;
        }

        #treeDemo a {
            height: 21px;
            line-height: 19px;
            vertical-align: middle;
        }

        #treeDemo a span {
            font-size: 13px;
            vertical-align: middle;
        }
    </style>


</head>
<body>
<div class="maintop">
    <ul class="commonul menuul">
        <li class="commonli m1">首页</li>
        <li class="commonli m1">系统</li>
        <li class="commonli m1">用户</li>
        <li class="commonli m1">任务</li>
    </ul>

</div>
<div class="mainleft">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
</div>
<div class="mainright">

    <iframe name="mainiframe" src="" width="100%" height="99%" frameborder="0px" style="background: #FFFFFF;"></iframe>
</div>
</body>
</html>
