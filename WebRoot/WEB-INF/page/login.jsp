<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html class="login-bg">
<head>
<title>登陆</title>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	
	<!-- bootstrap  -->
	<link href="<%=basePath %>/bootstrap/css/bootstrap.css" rel="stylesheet">
	<link href="<%=basePath %>/bootstrap/css/bootstrap-overrides.css" rel="stylesheet">
	
	<!-- this page specific styles -->
	<link href="<%=basePath%>/css/compiled/login.css" rel="stylesheet" type="text/css" media="screen">

</head>
<body>
	<div class="login-wrapper">
		<a href="<%=basePath%>login/toPage.do">
			<img class="logo"  src="<%=basePath%>/img/logo-white.png" alt="logo">
		</a>
		
		<div class="box">
			<div class="content-wrap">
				<h6>Log in</h6>
				<div class="form-group has-feedback">
					<input class="form-control "  type="text"  placeholder="用户名">
					<span class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input class="form-control" type="password"  placeholder="密码">
					<span class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<a href="#" class="forgot">忘记密码？</a>
				<div class="remember">
					<input id="remember-me" type="checkbox">
					<label for="remember-me">Remember me</label>
				</div>
				<a class="btn-glow primary login" href="#">Login in</a>
			</div>
		</div>
		
		<div class="no-account">
            <p>Don't have an account?</p>
            <a href="signup.html">Sign up</a>
        </div>
	</div>
	
	<!-- script -->
	<script src="<%=basePath%>/js/jquery-2.1.4.min.js" ></script>
	<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js" ></script>
	
	<!--  -->	
</body>
</html>