<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/21
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生展示页面</title>
    <link rel="stylesheet" href="../../static/layui/css/layui.css">
    <script src="../../static/layui/layui.js"></script>
</head>
<body>
    <div>
        <table class="layui-table" lay-even lay-skin="nob">
            <colgroup>
                <col width="150">
                <col width="200">
                <col>
            </colgroup>
            <thead align="center">
                <tr>
                    <th colspan="3" style="align-content: center">个人基本信息</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>姓名:${student.stuName}</td>
                    <td>性别:${student.sex}</td>
                    <td>出生日期:${student.birthday}</td>
                </tr>
                <tr>
                    <td>电话:${student.telephone}</td>
                    <td>邮箱:</td>
                    <td>身份证号:${student.idCard}</td>
                </tr>
                <tr>
                    <td>民族:${student.nation}</td>
                    <td>籍贯:${student.birthPlace}</td>
                    <td>婚姻状态:${student.marry}</td>
                </tr>
                <tr>
                    <td>学校:${student.university}</td>
                    <td>专业:${student.major}</td>
                    <td></td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
<script>
    layui.use('table', function(){
        var table = layui.table;
    });
</script>
</html>
