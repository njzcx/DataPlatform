<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Sign In And Sign Up Forms  Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<link href="<%=basePath%>css/style.css" rel="stylesheet" />
<link href="<%=basePath%>css/popup-box.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath%>js/jquery.min.js"></script>
<script src="<%=basePath%>js/jquery.magnific-popup.js" type="text/javascript"></script>
<script src="<%=basePath%>js/modernizr.custom.53451.js" type="text/javascript"></script>
</head>
<body>
<div class="w3layouts">
	<div class="signin-agile">
		<h2>登录</h2>
		<form action="<%=basePath%>restful/login" method="post">
			<input type="text" name="id" class="name" placeholder="用户名"
				required=""> 
			<input type="password" name="password"
				class="password" placeholder="密码" required="">
			<ul>
				<li><input type="checkbox" id="brand1" value=""> <label
					for="brand1"><span></span>记住密码</label></li>
			</ul>
			<a href="#">忘记密码?</a><br>
			<div class="clear"></div>
			<input type="submit" value="登录">
		</form>
	</div>
	</div>
</body>
</html>