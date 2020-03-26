<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>账单查询</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="../css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="../css/AdminLTE.css" rel="stylesheet" type="text/css" />
        <style type="text/css">
        #main{
        	margin-top:	5%;
        	margin-left:25%;
        }
        #a1{
        	margin-top: 5%;
        }
        #a2{
        	margin-top:6%;
        }
        #a3{
        	margin-top: 7%;
        }
        
        le>
        /* table,table tr th, table tr td { border:1px solid gray; } */
        table tr th,table tr td{
        	width:163px;
        }
        th{
        	text-align:center;
        }
		td {
 			text-align:center;
        }
        table {  min-height: 25px; line-height: 25px; text-align: center; border-collapse: collapse;}
        #alreadyTb{
        	display: none;
       	}
       	#notTb{
        	display: none;
       	}
        </style>


		

    </head>
    <body class="skin-blue">
		<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
        <header class="header">
            <a href="../index.jsp" class="logo">
                爆炸银行
            </a>
            <nav class="navbar navbar-static-top" role="navigation">
                <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>
                <div class="navbar-right">
                    <ul class="nav navbar-nav">
                        <li class="dropdown messages-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-envelope"></i>
                                <span class="label label-success">4</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">You have 4 messages</li>
                                <li>
                                    <ul class="menu">
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/avatar3.png" class="img-circle" alt="User Image"/>
                                                </div>
                                                <h4>
                                                    Support Team
                                                    <small><i class="fa fa-clock-o"></i> 5 mins</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/avatar2.png" class="img-circle" alt="user image"/>
                                                </div>
                                                <h4>
                                                    AdminLTE Design Team
                                                    <small><i class="fa fa-clock-o"></i> 2 hours</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/avatar.png" class="img-circle" alt="user image"/>
                                                </div>
                                                <h4>
                                                    Developers
                                                    <small><i class="fa fa-clock-o"></i> Today</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/avatar2.png" class="img-circle" alt="user image"/>
                                                </div>
                                                <h4>
                                                    Sales Department
                                                    <small><i class="fa fa-clock-o"></i> Yesterday</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/avatar.png" class="img-circle" alt="user image"/>
                                                </div>
                                                <h4>
                                                    Reviewers
                                                    <small><i class="fa fa-clock-o"></i> 2 days</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="footer"><a href="#">See All Messages</a></li>
                            </ul>
                        </li>
                        <li class="dropdown notifications-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-warning"></i>
                                <span class="label label-warning">10</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">You have 10 notifications</li>
                                <li>
                                    <ul class="menu">
                                        <li>
                                            <a href="#">
                                                <i class="ion ion-ios7-people info"></i> 5 new members joined today
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="fa fa-warning danger"></i> Very long description here that may not fit into the page and may cause design problems
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="fa fa-users warning"></i> 5 new members joined
                                            </a>
                                        </li>

                                        <li>
                                            <a href="#">
                                                <i class="ion ion-ios7-cart success"></i> 25 sales made
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="ion ion-ios7-person danger"></i> You changed your username
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="footer"><a href="#">View all</a></li>
                            </ul>
                        </li>
                        <li class="dropdown tasks-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-tasks"></i>
                                <span class="label label-danger">9</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">You have 9 tasks</li>
                                <li>
                                    <ul class="menu">
                                        <li><!-- Task item -->
                                            <a href="#">
                                                <h3>
                                                    Design some buttons
                                                    <small class="pull-right">20%</small>
                                                </h3>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                        <span class="sr-only">20% Complete</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <h3>
                                                    Create a nice theme
                                                    <small class="pull-right">40%</small>
                                                </h3>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                        <span class="sr-only">40% Complete</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <h3>
                                                    Some task I need to do
                                                    <small class="pull-right">60%</small>
                                                </h3>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                        <span class="sr-only">60% Complete</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <h3>
                                                    Make beautiful transitions
                                                    <small class="pull-right">80%</small>
                                                </h3>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                        <span class="sr-only">80% Complete</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="footer">
                                    <a href="#">View all tasks</a>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="glyphicon glyphicon-user"></i>
                                <span>Jane Doe <i class="caret"></i></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="user-header bg-light-blue">
                                    <img src="../img/avatar3.png" class="img-circle" alt="User Image" />
                                    <p>
                                        Jane Doe - Web Developer
                                        <small>Member since Nov. 2012</small>
                                    </p>
                                </li>
                                <li class="user-body">
                                    <div class="col-xs-4 text-center">
                                        <a href="#">Followers</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#">Sales</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#">Friends</a>
                                    </div>
                                </li>
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="#" class="btn btn-default btn-flat">Profile</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="#" class="btn btn-default btn-flat">Sign out</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            <aside class="left-side sidebar-offcanvas">
                <section class="sidebar">
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="../img/avatar3.png" class="img-circle" alt="User Image" />
                        </div>
                        <div class="pull-left info">
                            <p>Hello, Jane</p>

                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search..."/>
                            <span class="input-group-btn">
                                <button type='submit' name='seach' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </form>
                    <ul class="sidebar-menu">
                        <li class="active">
                            <a href="index.html">
                                <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                            </a>
                        </li>
                        <li>
                            <a href="widgets.html">
                                <i class="fa fa-th"></i> <span>Widgets</span> <small class="badge pull-right bg-green">new</small>
                            </a>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-bar-chart-o"></i>
                                <span>客户服务</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href=""><i class="fa fa-angle-double-right"></i> 个人信息管理</a></li>
                                <li><a href=""><i class="fa fa-angle-double-right"></i> 预留信息设置</a></li>
                                <li><a href="../khfw/changeName.jsp"><i class="fa fa-angle-double-right"></i> 网银登录名修改</a></li>
                                <li><a href="../khfw/changePass.jsp"><i class="fa fa-angle-double-right"></i> 网银密码修改</a></li>
                                <li><a href=""><i class="fa fa-angle-double-right"></i> 大额取款预约服务</a></li>
                                <li><a href=""><i class="fa fa-angle-double-right"></i> 贷款计算器</a></li>
                                <li><a href=""><i class="fa fa-angle-double-right"></i> 存款计算器</a></li>
                            </ul>
                        </li>
                        <li class="treeview">
                             <a href="#">
                                <i class="fa fa-laptop"></i>
                                <span>账户服务</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                 <li><a href="../zhfw/glzhgl.html"><i class="fa fa-angle-double-right"></i> 关联账户管理 </a></li>
                                <li><a href="../zhfw/gs.jsp"><i class="fa fa-angle-double-right"></i> 账户服务 </a></li>
                                <li><a href="../zhfw/mmxg.jsp"><i class="fa fa-angle-double-right"></i> 密码修改</a></li>
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-edit"></i> <span>Forms</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="forms/general.html"><i class="fa fa-angle-double-right"></i> General Elements</a></li>
                                <li><a href="forms/advanced.html"><i class="fa fa-angle-double-right"></i> Advanced Elements</a></li>
                                <li><a href="forms/editors.html"><i class="fa fa-angle-double-right"></i> Editors</a></li>
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="glyphicon glyphicon-tags"></i> <span>信用卡</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="sqjd.jsp"><i class="glyphicon glyphicon-tag"></i>申请进度查询</a></li>
                                <li><a href="xykgl.jsp"><i class="glyphicon glyphicon-tag"></i>信用卡管理</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="calendar.html">
                                <i class="fa fa-calendar"></i> <span>Calendar</span>
                                <small class="badge pull-right bg-red">3</small>
                            </a>
                        </li>
                        <li>
                            <a href="mailbox.html">
                                <i class="fa fa-envelope"></i> <span>Mailbox</span>
                                <small class="badge pull-right bg-yellow">12</small>
                            </a>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-folder"></i> <span>Examples</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="examples/invoice.html"><i class="fa fa-angle-double-right"></i> Invoice</a></li>
                                <li><a href="examples/login.html"><i class="fa fa-angle-double-right"></i> Login</a></li>
                                <li><a href="examples/register.html"><i class="fa fa-angle-double-right"></i> Register</a></li>
                                <li><a href="examples/lockscreen.html"><i class="fa fa-angle-double-right"></i> Lockscreen</a></li>
                                <li><a href="examples/404.html"><i class="fa fa-angle-double-right"></i> 404 Error</a></li>
                                <li><a href="examples/500.html"><i class="fa fa-angle-double-right"></i> 500 Error</a></li>
                                <li><a href="examples/blank.html"><i class="fa fa-angle-double-right"></i> Blank Page</a></li>
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-folder"></i>  Multilevel Menu
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>

                            <ul class="treeview-menu">
                                <li class="treeview">
                                    <a href="#">
                                        First level
                                        <i class="fa fa-angle-left pull-right"></i>
                                    </a>

                                    <ul class="treeview-menu">
                                        <li class="treeview">
                                            <a href="#">
                                                Second level
                                                <i class="fa fa-angle-left pull-right"></i>
                                            </a>

                                            <ul class="treeview-menu">
                                                <li>
                                                    <a href="#">Third level</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                  已出账账单查询  
                        <small></small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="../index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
						 <li><a href="#"><i class="fa fa-dashboard"></i> 账单查询</a></li>
                        <li class="active">已出账账单</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
					
					<div class="row">
						
						<div class="col-lg-9 col-sm-11 col-xs-11 col-md-10">
							
							<div class="nav-tabs-custom">
                                <ul class="nav nav-tabs pull-right">
	                                <li class="active"><a href="#tab_1-1" data-toggle="tab">已出账账单</a></li>
									<li><a href="#tab_2-2" data-toggle="tab">未出账账单</a></li>
	                                <li class="pull-left header"><i class="fa fa-th"></i> 操作</li>
                                </ul>
                               	<div class="tab-content">
                                
                               		<div class="tab-pane active" id="tab_1-1">
                               		
								         <form action='#' id="alreadyForm"  method="post">
											<table id="alreadyTb" class="table table-hover">
										  		
										  		<thead>
										  			<tr>
										  				<th>编号</th>
										  				<th>信用卡编号</th>
										  				<th>开始时间</th>
										  				<th>结束时间</th>
										  				<th>币种</th>
										  				<th>最后还款日</th>
										  				<th>存入总计</th>
										  				<th>支出总计</th>
										  				<th>消费</th>
										  				<th>手续费</th>
										  				<th>取现</th>
										  				<th>循环利息</th>
										  				<th>最低还款</th>
									  				</tr>
									  			</thead>
									  	</table>
									  	</form>
                               		
                               		
                                 		<div id="main" style="width: 40%">
										<form action="#" id="queryBillForm" method="post">
											<!-- <div class="form-group">
							 					<div class="input-group">
                                      				<span class="input-group-addon">选择账号：</span>
                                      				<select class="form-control" name="cardId">
                                          				<option>aaa</option>
                                          				<option>option 2</option>
                                         				<option>option 3</option>
                                          				<option>option 4</option>
                                          				<option>option 5</option>
                                           			</select>
												</div>input-group
											</div>  form-group
											 -->
											<div class="row">
									  		<div class="col-lg-8">
												<div class="form-group">
							 						<div class="input-group">
                                      					<span class="input-group-addon">选择账号：</span>
                                      					<select class="form-control" name="cardId">
                                          					<option>aaa</option>
                                          					<option>option 2</option>
                                         					<option>option 3</option>
                                          				    <option>option 4</option>
                                          					<option>option 5</option>
                                           				</select>
													</div><!-- input-group -->
												</div> <!--  form-group -->
									  		</div> <!--  col -->
										</div> <!--  row -->
											
										<div class="row">
									  		<div class="col-lg-8">
												<div class="form-group">
							 						<div class="input-group">
														<span class="input-group-addon">查询日期:</span>
														<input type="date" name="beginTime" class="form-control"/>
														<input type="date" name="endTime" class="form-control"/><br/>
													</div>
												</div>
									  		</div> 
										</div> 
											
										<!-- <div id="a1">
											<div class="input-group">
												<span class="input-group-addon">查询日期:</span>
												<input type="date" name="beginTime" class="form-control"/>
												<input type="date" name="endTime" class="form-control"/><br/>
											</div>
										</div> -->
										
										<div class="row">
									  		<div class="col-lg-8">
												<div class="form-group">
							 						<div class="input-group">
														<span class="input-group-addon">查询密码：</span>
														<input type="password" class="form-control"  name="queryPass"><br/>
													</div>
												</div>
									  		</div> 
										</div> 
										
										<!-- <div id="a2">
											<div class="input-group">
												<span class="input-group-addon">查询密码：</span>
												<input type="password" class="form-control"  name="queryPass"><br/>
											</div>
										</div> -->
										<div class="modal-footer clearfix">
											<input type="hidden" name="mark" value="already"> 
											<center><input type="button" id="query" value="查询" class="btn btn-primary"></center>
										</div>
										</form>	
									</div>
                       		  	</div><!-- /.tab-pane -->
                                    
                            	<div class="tab-pane" id="tab_2-2">
                            	
                            		<form action='#' id="notTbForm"  method="post">
										<table id="notTb" class="table table-hover">
									  		<thead>
									  			<tr>
									  				<th>编号</th>
									  				<th>信用卡编号</th>
									  				<th>开始时间</th>
									  				<th>结束时间</th>
									  				<th>币种</th>
									  				<th>最后还款日</th>
									  				<th>存入总计</th>
									  				<th>支出总计</th>
									  				<th>消费</th>
									  				<th>手续费</th>
									  				<th>取现</th>
									  				<th>循环利息</th>
									  				<th>最低还款</th>
								  				</tr>
								  			</thead>
									  	</table>
								  	</form>
                               		<div id="not" style="width: 40%">
										<form action="#" id="notForm" method="post">
											<div class="row">
									  		<div class="col-lg-8">
												<div class="form-group">
							 						<div class="input-group">
                                      					<span class="input-group-addon">选择账号：</span>
                                      					<select class="form-control" name="cardId">
                                          					<option>aaa</option>
                                          					<option>option 2</option>
                                         					<option>option 3</option>
                                          				    <option>option 4</option>
                                          					<option>option 5</option>
                                           				</select>
													</div><!-- input-group -->
												</div> <!--  form-group -->
									  		</div> <!--  col -->
										</div> <!--  row -->
											
										<div class="row">
									  		<div class="col-lg-8">
												<div class="form-group">
							 						<div class="input-group">
														<span class="input-group-addon">查询密码：</span>
														<input type="password" class="form-control"  name="queryPass"><br/>
													</div>
												</div>
									  		</div> 
										</div> 
											
										<!-- <div id="a1">
											<div class="input-group">
											</div>
										</div> -->
										<div class="modal-footer clearfix">
											<input type="hidden" name="mark" value="not"> 
											<center><input type="button" id="notquery" value="查询" class="btn btn-primary"></center>
										</div>
									</form>
                            	
                            	
                            	
                            	
                            	
                            	</div>
					
                           		</div>
									
										
                                 </div><!-- /.tab-pane -->
                                    
                                </div><!-- /.tab-content -->
                            </div><!-- nav-tabs-custom -->
							
						</div> <!-- col -->
							
							



								

		
							
							
							
							
						
					


                </section><!-- /.content -->
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->
       <script type="text/javascript">
		$("#query").click(function(){
			$.ajax({
				url:'../billController',
				data:$("#queryBillForm").serialize(),
				success:function(data){
					$("#queryBillForm").css('display', 'none');
					$("#alreadyTb tbody").html("");
					$("#alreadyTb").css('display', 'table');
					for(var i in data){
						var html = "<tr class='alreadyInfo'>";
						html += "<td>" + data[i].cbId + "</td>";
						html += "<td>" + data[i].cardId + "</td>";
						html += "<td>" + data[i].beginTime + "</td>";
						html += "<td>" + data[i].endTime + "</td>";
						html += "<td>" + data[i].coinType + "</td>";
						html += "<td>" + data[i].lastTime + "</td>";
						html += "<td>" + data[i].putSum + "</td>";
						html += "<td>" + data[i].useSum + "</td>";
						html += "<td>" + data[i].consume + "</td>";
						html += "<td>" + data[i].commossion + "</td>";
						html += "<td>" + data[i].essay + "</td>";
						html += "<td>" + data[i].cycleRate + "</td>";
						html += "<td>" + data[i].minBack + "</td>";
						html += "</tr>"
						$("#alreadyTb").append(html);
					}
				},error:function(){
					alert("失败");
				}
			})
		})
		$("#notquery").click(function(){
			$.ajax({
				url:'../billController',
				data:$("#notForm").serialize(),
				success:function(data){
					$("#notForm").css('display', 'none');
					$("#notTb tbody").html("");
					$("#notTb").css('display', 'table');
					for(var i in data){
						var html = "<tr class='notInfo'>";
						html += "<td>" + data[i].cbId + "</td>";
						html += "<td>" + data[i].cardId + "</td>";
						html += "<td>" + data[i].beginTime + "</td>";
						html += "<td>" + data[i].endTime + "</td>";
						html += "<td>" + data[i].coinType + "</td>";
						html += "<td>" + data[i].lastTime + "</td>";
						html += "<td>" + data[i].putSum + "</td>";
						html += "<td>" + data[i].useSum + "</td>";
						html += "<td>" + data[i].consume + "</td>";
						html += "<td>" + data[i].commossion + "</td>";
						html += "<td>" + data[i].essay + "</td>";
						html += "<td>" + data[i].cycleRate + "</td>";
						html += "<td>" + data[i].minBack + "</td>";
						html += "</tr>"
						$("#notTb").append(html);
					}
				},error:function(){
					alert("失败");
				}
			})
		})
		
		
		</script>
		
		
        <!-- jQuery 2.0.2 -->
        <script src="../js/jquery.min.js"></script>
     
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="../js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="../js/AdminLTE/demo.js" type="text/javascript"></script>
    </body>
</html>
