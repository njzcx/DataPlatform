<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>大企业填报系统</title>
<link rel="stylesheet" href="<%=basePath%>css/style.css">
<link href="<%=basePath%>css/popup-box.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Sign In And Sign Up Forms  Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); 
	 function hideURLbar(){
		 window.scrollTo(0,1);
	 } 
</script>

<script src="<%=basePath%>js/jquery.min.js"></script>
<script src="<%=basePath%>js/jquery.magnific-popup.js" type="text/javascript"></script>
<script src="<%=basePath%>js/modernizr.custom.53451.js" type="text/javascript"></script>
<script src="<%=basePath%>js/distpicker.min.js" type="text/javascript"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script>
	$(document).ready(function() {
		$('.popup-with-zoom-anim').magnificPopup({
			type : 'inline',
			fixedContentPos : false,
			fixedBgPos : true,
			overflowY : 'auto',
			closeBtnInside : true,
			preloader : false,
			midClick : true,
			removalDelay : 300,
			mainClass : 'my-mfp-zoom-in'
		});
	});
</script>
</head>
<body>
	<div class="pop-up"> 
		<div id="small-dialog" class="book-form">
			<h3>注册表单 </h3>
			<a href="<%=basePath%>restful/companyinfo/index"><input type="button" value="集团总部企业信息录入"/></a>
			<a href="<%=basePath%>restful/officerinfo/index"><input type="button" value="主管税务机关信息录入"/></a>
		</div>
	</div>
	<div class="footer-w3l">
		<p class="agileinfo">
			亿信华辰版权所有 <a href="http://www.esensoft.com" target="_blank">亿信华辰</a>
		</p>
	</div>
</body>
</html>