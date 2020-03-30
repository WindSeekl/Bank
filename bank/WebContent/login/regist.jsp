<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户注册</title>
  </head>
  <script src="../static/resources/js/common/header.js"></script>
  <body>
  		<div class="col-xs-12 col-sm-12 col-md-5 col-lg-4">
				<div class="well no-padding">
	<label >用户名：</label><input id="UserName" type="text" name="registUser"><br>
	<label >密码：</label><input id="PassWord" type="password" name="registPass"><br>
	
	<label>请再次输入密码：</label><input id="PassWord2" type="password" name="registPass2"><br>
	<footer >
	<button type="button" id="regist" class="btn btn-primary">注册</button>
	<button type="button" id="call" class="btn btn-primary">取消</button>
	</footer>
		</div>
	</div>			
			
	<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
   <script type="text/javascript">
   $('#call').click(function() {
	   window.location.href = 'login.jsp';
});
   $('#regist').click(function() {
	   addUser();
});
   	function addUser() {
   		$.ajax({
			type:"post",
			url:"../regists",
			data:{
			UserName:$("#UserName").val(),
   			PassWord:$("#PassWord").val(),
   			PassWord2:$("#PassWord2").val()
			},
			dataType: "text",
			success:function(data){
				alert('注册成功!');
				document.href("../login.jsp");
			},
			error:function(data){
				alert("注册失败!");
			}
			
		});
	}
   </script>

  </body>
</html>
