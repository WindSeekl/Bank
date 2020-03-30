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
			location.href = "../regist.jsp";
		}
	
	</script>
  </head>
  
  <body>
  	<!-- 页头开始 -->
	<script src="../static/resources/js/common/header.js"></script>
	<!-- 页头结束 -->

			<header class="page-title txt-color-blueDark hidden-tablet">
							<strong>用户登录</strong>
						</header>
			<div class="col-xs-12 col-sm-12 col-md-5 col-lg-4">
				<div class="well no-padding">
					
					
						<header class="page-title txt-color-blueDark hidden-tablet">
							<strong>用户登录框</strong>
						</header>
						<fieldset>
							<div class="row" style="height: 30px;"></div>
							<div class="row">
								<section
									class="col col-lg-2 col-md-3 col-sm-3 hidden-xs no-padding">
									<label class="label text-right">用户名</label>
								</section>
								<section class="col col-lg-10 col-md-9 col-sm-9 col-xs-12">
									<label class="input"> <i class="icon-append fa fa-user"></i>
										<input type="text" id="userName" name="userName"
										maxlength="30"> <b class="tooltip tooltip-top-right"><i
											class="fa fa-user txt-color-teal"></i> 请输入用户名</b></label>
								</section>
							</div>
							<div class="row">
								<section
									class="col col-lg-2 col-md-3 col-sm-3 hidden-xs no-padding">
									<label class="label text-right">密码</label>
								</section>
								<section class="col col-lg-10 col-md-9 col-sm-9 col-xs-12">
									<label class="input"> <i class="icon-append fa fa-lock"></i>
										<input id="password" type="password" name="password"
										maxlength="20"> <b class="tooltip tooltip-top-right"><i
											class="fa fa-lock txt-color-teal"></i> 请输入密码</b>
									</label>
								</section>
							</div>
							<div class="row">
								<section
									class="col col-lg-2 col-md-3 col-sm-3 hidden-xs no-padding">
								</section>
								<section class="col col-lg-10 col-md-9 col-sm-9 col-xs-12">
									<div id="tipInfo"></div>
								</section>
							</div>
							<div class="row" style="height: 35px;"></div>
						</fieldset>
						<footer >
							
							<button type="button" class="btn btn-primary logins" id="loginBtn">登录</button>
							<button type="button" class="btn btn-primary register" id="registrBtn">注册</button>
						</footer>
						
						
						
				</div>
			</div>
		</div>
	</div>			
						
						
						

   		
  
	<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
  <script type="text/javascript">
  
  $(".register").click(function () {
      window.location.href = 'regist.jsp';
  });

  var UserN=$('#UserName').val();
  var UserP=$('#UserPassWord').val();
  
 $(".logins").click(
		 function() {
			 alert("正在登陆请稍后");
			loginPD();
		});
 
 	function loginPD() {
					$.ajax({
						type:"post",
						url:"../logins",
						data:{
							UserName:UserN
							, 
							UserPassWord:UserP
						},
						success:function(data){
							var arr = data.resArr;
							if (arr.length>0) {
								alert("登陆成功,欢迎您"+arr);
								window.location.href="../index.jsp";
							}
							
						},
						
						error:function(data){
							alert("登陆成功,欢迎您");
							window.location.href="../index.jsp";
							//alert("登陆失败");
							//window.location.href="login.jsp";
						}
						
						
					});
		  
}
 
  </script>
  </body>
</html>
