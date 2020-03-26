<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>爆炸银行</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="css/AdminLTE.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="skin-blue">
        <!-- header logo: style can be found in header.less -->
        <header class="header">
            <a href="index.jsp" class="logo">
                <!-- Add the class icon to your logo image or logo icon to add the margining -->
                爆炸银行
            </a>
            <!-- Header Navbar: style can be found in header.less -->
            <nav class="navbar navbar-static-top" role="navigation">
                <!-- Sidebar toggle button-->
                <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>
                <div class="navbar-right">
                    <ul class="nav navbar-nav">
                        <!-- Messages: style can be found in dropdown.less-->
                        <li class="dropdown messages-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-envelope"></i>
                                <span class="label label-success">4</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">You have 4 messages</li>
                                <li>
                                    <!-- inner menu: contains the actual data -->
                                    <ul class="menu">
                                        <li><!-- start message -->
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="img/avatar3.png" class="img-circle" alt="User Image"/>
                                                </div>
                                                <h4>
                                                    Support Team
                                                    <small><i class="fa fa-clock-o"></i> 5 mins</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li><!-- end message -->
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="img/avatar2.png" class="img-circle" alt="user image"/>
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
                                                    <img src="img/avatar.png" class="img-circle" alt="user image"/>
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
                                                    <img src="img/avatar2.png" class="img-circle" alt="user image"/>
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
                                                    <img src="img/avatar.png" class="img-circle" alt="user image"/>
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
                        <!-- Notifications: style can be found in dropdown.less -->
                        <li class="dropdown notifications-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-warning"></i>
                                <span class="label label-warning">10</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">You have 10 notifications</li>
                                <li>
                                    <!-- inner menu: contains the actual data -->
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
                        <!-- Tasks: style can be found in dropdown.less -->
                        <li class="dropdown tasks-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-tasks"></i>
                                <span class="label label-danger">9</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">You have 9 tasks</li>
                                <li>
                                    <!-- inner menu: contains the actual data -->
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
                                        </li><!-- end task item -->
                                        <li><!-- Task item -->
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
                                        </li><!-- end task item -->
                                        <li><!-- Task item -->
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
                                        </li><!-- end task item -->
                                        <li><!-- Task item -->
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
                                        </li><!-- end task item -->
                                    </ul>
                                </li>
                                <li class="footer">
                                    <a href="#">View all tasks</a>
                                </li>
                            </ul>
                        </li>
                        <!-- User Account: style can be found in dropdown.less -->
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="glyphicon glyphicon-user"></i>
                                <span>Jane Doe <i class="caret"></i></span>
                            </a>
                            <ul class="dropdown-menu">
                                <!-- User image -->
                                <li class="user-header bg-light-blue">
                                    <img src="img/avatar3.png" class="img-circle" alt="User Image" />
                                    <p>
                                        Jane Doe - Web Developer
                                        <small>Member since Nov. 2012</small>
                                    </p>
                                </li>
                                <!-- Menu Body -->
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
                                <!-- Menu Footer-->
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
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="left-side sidebar-offcanvas">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <!-- Sidebar user panel -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="img/avatar3.png" class="img-circle" alt="User Image" />
                        </div>
                        <div class="pull-left info">
                            <p>Hello, Jane</p>

                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>
                    <!-- search form -->
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search..."/>
                            <span class="input-group-btn">
                                <button type='submit' name='seach' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </form>
                    <!-- /.search form -->
                    <!-- sidebar menu: : style can be found in sidebar.less -->
                    <ul class="sidebar-menu">
                        <li class="active">
                            <a href="index.jsp">
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
                                <li><a href="khfw/changePass.jsp"><i class="fa fa-angle-double-right"></i> 个人信息管理</a></li>
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
                                 <li><a href="zhfw/glzhgl.html"><i class="fa fa-angle-double-right"></i> 关联账户管理 </a></li>
                                <li><a href="zhfw/gs.jsp"><i class="fa fa-angle-double-right"></i> 账户服务 </a></li>
                                <li><a href="zhfw/mmxg.jsp"><i class="fa fa-angle-double-right"></i> 密码修改</a></li>
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
                                <li><a href="creditCard/sqjd.jsp"><i class="glyphicon glyphicon-tag"></i>申请进度查询</a></li>
                                <li><a href="creditCard/xykgl.jsp"><i class="glyphicon glyphicon-tag"></i>信用卡管理</a></li>
                                <li><a href="creditCard/queryBill.jsp"><i class="glyphicon glyphicon-tag"></i>账单查询</a></li>
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
                        我的账户
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active"><i class="fa fa-dashboard"></i> 首页</li>
                    </ol>
                </section>

                <!-- Main content -->
					
				
                <section class="content">
				
				
					  <div class="row">
					  
                        <div class="col-lg-3 col-xs-6">
                            <!-- small box -->
                            <div class="small-box bg-aqua">
                                <div class="inner">
                                    <h3>
                                        622700381417
                                    </h3>
                                    <p>
                                        New Orders
                                    </p>
                                </div>
                                <div class="icon">
                                    <i class="ion ion-bag"></i>
                                </div>
                                <a href="#" class="small-box-footer">
                                    More info <i class="fa fa-arrow-circle-right"></i>
                                </a>
                            </div>
                        </div><!-- ./col -->
                        <div class="col-lg-3 col-xs-6">
                            <!-- small box -->
                            <div class="small-box bg-green">
                                <div class="inner">
                                    <h3>
                                        53<sup style="font-size: 20px">%</sup>
                                    </h3>
                                    <p>
                                        Bounce Rate
                                    </p>
                                </div>
                                <div class="icon">
                                    <i class="ion ion-stats-bars"></i>
                                </div>
                                <a href="#" class="small-box-footer">
                                    More info <i class="fa fa-arrow-circle-right"></i>
                                </a>
                            </div>
                        </div><!-- ./col -->
                        <div class="col-lg-3 col-xs-6">
                            <!-- small box -->
                            <div class="small-box bg-yellow">
                                <div class="inner">
                                    <h3>
                                        44
                                    </h3>
                                    <p>
                                        User Registrations
                                    </p>
                                </div>
                                <div class="icon">
                                    <i class="ion ion-person-add"></i>
                                </div>
                                <a href="#" class="small-box-footer">
                                    More info <i class="fa fa-arrow-circle-right"></i>
                                </a>
                            </div>
                        </div><!-- ./col -->
                    </div><!-- /.count - row -->
					
					<div class="box">
					</div>
					
					  <div class="row">
					  
                        <div class="col-lg-12  col-xs-12 .col-md-12">
                          
						  <div>
						  	<h3>快捷菜单</h3>
							
							 <div class="row">
							 
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<a href="#" class="small" >
										<img class="" src="img/paid.png">
										<br />缴费</a>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<a href="#" class="small" >
										<img class="" src="img/pay.png">
										<br />转账</a>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
									<br>
										<a href="#" class="small" >
										<img class="" src="img/account.png">
										<br />账户</a>
									</div>
								</div>
								
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<br/>
										<a href="#" class="small" >
										<img class="" src="img/person.png">
										<br />客户</a>
									</div>
								</div>
								
							 	<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
									<a href="creditCard/xykgl.jsp" class="small" >
										<img class="" src="img/credit.png">
										<br />
										信用卡</a>
									</div>
	
								</div>
								
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<a class="small" data-toggle="modal" data-backdrop="static" data-target="#compose-modal" >
										<img class="" src="img/setting.png">
										<br />
										设置</a>
									</div>
								</div>
							 
							 </div><!-- row -->
								
						  	
						  </div>
                          
                        </div><!-- ./col -->
					</div><!-- /.fast -- row -->
					
					<div style="height:20px">
					</div>
					
					<div class="row">
						 <div class="col-lg-4  col-xs-4 .col-md-6">
						 
						 	
							 <!-- quick email widget -->
                            <div class="box box-solid box-success">
                                <div class="box-header">
                                    <i class="fa  fa-thumbs-o-up"></i>
                                    <h3 class="box-title">理财产品推荐</h3>
                                   
                                </div>
                                <div class="box-body">
                                   
                                </div>
                             
                            </div>  <!-- end widget -->
						 	
						 </div>
						  <div class="col-lg-4  col-xs-4 .col-md-6">
						  
						  
						   <!-- quick email widget -->
                            <div class="box box-solid box-info">
                                <div class="box-header">
                                    <i class="fa fa-envelope"></i>
                                    <h3 class="box-title">银行公告</h3>
                                </div>
                                <div class="box-body">
								
									 <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                        <ol class="carousel-indicators">
                                            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                            <li data-target="#carousel-example-generic" data-slide-to="1" class=""></li>
                                            <li data-target="#carousel-example-generic" data-slide-to="2" class=""></li>
                                        </ol>
                                        <div class="carousel-inner">
                                            <div class="item active">
                                                <img src="http://placehold.it/900x500/39CCCC/ffffff&text=I+Love+Bootstrap" alt="First slide">
                                                <div class="carousel-caption">
                                                    First Slide
                                                </div>
                                            </div>
                                            <div class="item">
                                                <img src="http://placehold.it/900x500/3c8dbc/ffffff&text=I+Love+Bootstrap" alt="Second slide">
                                                <div class="carousel-caption">
                                                    Second Slide
                                                </div>
                                            </div>
                                            <div class="item">
                                                <img src="http://placehold.it/900x500/f39c12/ffffff&text=I+Love+Bootstrap" alt="Third slide">
                                                <div class="carousel-caption">
                                                    Third Slide
                                                </div>
                                            </div>
                                        </div>
                                        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                                            <span class="glyphicon glyphicon-chevron-left"></span>
                                        </a>
                                        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                                            <span class="glyphicon glyphicon-chevron-right"></span>
                                        </a>
                                    </div>
                                   
                                </div>
                             
                            </div>  <!-- end widget -->
						  
						  
						  	
						 </div>
						  <div class="col-lg-4  col-xs-4 .col-md-6">
						  	
							
							 <!-- quick email widget -->
                            <div class="box  box-solid box-info">
                                <div class="box-header">
                                    <i class="fa fa-heart-o"></i>
                                    <h3 class="box-title">温馨提示</h3>
									<!-- tools box -->
                                    <div class="pull-right box-tools">
                                        <button class="btn btn-info btn-sm" data-widget="remove" data-toggle="tooltip" title="关闭"><i class="fa fa-times"></i></button>
                                    </div><!-- /. tools -->
                                </div>
                                <div class="box-body">
                                   
								     <ul class="todo-list">
									 	<li class="callout callout-info">
											1.请尽量使用专用电脑操作网上银行，并定期更新操作系统安全补丁和杀毒软件。
										</li>
										
										<li>
											2.请通过建行网站访问网上银行，不要通过电子邮件、不明网站等链接登录网上银行。
										</li>
										<li>
											3.请在使用网上银行完毕后，点击页面右上角的“退出系统”，以确保安全退出。
										</li>
										<li>
											4.如果您是网银盾客户，请在退出网上银行后，立即拔出您的网银盾，并妥善保管。
										</li>
									 </ul>
							
                                </div>
                             
                            </div>  <!-- end widget -->
							
							
						 </div>
						
					
					</div><!-- /.fast -- row -->
					
			
					<div class="row">
						
						<div class="col-lg-12">
							<div class="box">
							</div>
							
							
							<div>
						
								<small style="color:#666">
									©版权所有 中国建设银行版权所有&nbsp;&nbsp;京ICP备&nbsp;13030780号&nbsp;&nbsp;京公网安备&nbsp;&nbsp;110102000450&nbsp;&nbsp;中国建设银行&nbsp;&nbsp;建设现代生活&nbsp;&nbsp;总行地址：中国北京西城区金融大街25号&nbsp;&nbsp;邮编：100033    
								</small>
							
							</div>
							
						</div>
					
					</div>
				
				
					
                </section><!-- /.content -->
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->
		
		   <!-- COMPOSE MESSAGE MODAL -->
        <div class="modal fade" id="compose-modal" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"><i class="fa fa-cog"></i> 快捷菜单设置</h4>
                    </div>
                    
                        <div class="modal-body">
						
							 <div class="row">
							 
							 	<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
										<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
	
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
										<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
									<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
									<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
										<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
										<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
										<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
										<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
										<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								<div class="col-lg-2 .col-md-2 col-xs-3">
									
									<div style="text-align:center">
										<img class="" src="img/a.jpg">
										<br />
										<input type="checkbox" class="minimal"/><span>&nbsp;&nbsp;转账</span>
									</div>
								</div>
								
								
							</div> <!-- row -->
                            
                        </div>
                        <div class="modal-footer clearfix">
						
                            <button type="submit" class="btn btn-primary pull-left"><i class="fa fa-check"></i> 确认</button>
							
							 <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> 取消</button>
                        </div>
                  
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


        <!-- jQuery 2.0.2 -->
        <script src="js/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
		 <!-- daterangepicker -->
        <script src="js/plugins/daterangepicker/daterangepicker.js" type="text/javascript"></script>
        <!-- datepicker -->
        <script src="js/plugins/datepicker/bootstrap-datepicker.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="js/AdminLTE/demo.js" type="text/javascript"></script>
    </body>
</html>
