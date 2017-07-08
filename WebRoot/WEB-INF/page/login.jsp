<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html style="background:url('<%=basePath%>img/bgs/landscape.jpg') no-repeat center center fixed;">
<head>
<title>登陆</title>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	
	<!-- bootstrap  -->
	<link href="<%=basePath %>/css/bootstrap/bootstrap.css" rel="stylesheet">
	<link href="<%=basePath %>/css/bootstrap/bootstrap-overrides.css" rel="stylesheet">

</head>
<body>
	<div class="login-wapper">
		<a href="<%=basePath%>login/toPage.do">
			<img  src="img/logo-white.png" alt="logo">
		</a>
		
		<div class="box">
			<div class="content-wrap">
				<h6>Log in</h6>
				<input class="form-control" type="text"  placeholder="用户名">
				<input class="form-control" type="password"  placeholder="密码">
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
	<script src="<%=basePath%>js/jquery/jquery-2.1.4.min.js" ></script>
	<script src="<%=basePath%>js/bootstrap/bootstrap.min.js" ></script>
	
	<!--  -->	
</body>
</html>