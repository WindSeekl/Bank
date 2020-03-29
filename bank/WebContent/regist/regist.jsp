<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户注册</title>
  </head>
  
  <body>
  	
	<label>用户名：</label><input id="UserName" type="text" name="registUser">
	<label>用户名：</label><input id="PassWord" type="password" name="registPass">
	<label>用户名：</label><input id="PassWord2" type="password" name="registPass2">
	<button id="login" onclick="addUser()">注册</button>
	<button id="call">取消</button>
	
   <script type="text/javascript">
   	function addUser() {
   		$.ajax({
			type:"post",
			url:"../regists",
			data:{
			UserName:$("UserName").val(),
   			PassWord:$("PassWord").val(),
   			PassWord2:$("PassWord2").val()
			},
				dataType: "text",
			success:function(data){
				alert('注册成功!');
				document.href("WebContent/login.jsp");
			},
			error:function(data){
				alert("注册失败!");
			}
			
		});
	}
   </script>

  </body>
</html>
