<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html dir="ltr">
  <head>
    <title>首页</title>
    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" language="javascript">
		function toRegist(){
			location.href = "regist.jsp";
		}
	
	</script>
  </head>
  
  <body>
  	
   		<label>账户:</label><input id="UserName" name="UserName" type="text" />
	
		<label>密码:</label><input id="UserPassWord" name="UserPassWord" type="password" />

		<button id="logins" class="logins">登陆</button>
	
   	
   		<button id="register" class="register">注册</button>
  </body>
  <script type="text/javascript">
  $(".register").click(function () {
      window.location.href = 'WebContent/regist.jsp';
  });
  
  $(".logins").click(
	function() {
		$.ajax({
			type:"post",
			url:"../logins",
			data:{UserName:$("#UserName").val(),
				UserPass:$("#UserPassWord").val()},
				dataType: "text",
			success:function(data){
				alert('登陆成功!');
				document.href("index.html");
			},
			error:function(data){
				alert("登陆失败!");
			}
			
		});
	}	  
  )
  </script>
</html>
