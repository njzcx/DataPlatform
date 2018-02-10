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
<script src="<%=basePath%>js/jquery.validate.min.js"></script>
<script src="<%=basePath%>js/jquery.validate.cn.js" type="text/javascript"></script>
<script src="<%=basePath%>js/jquery.validate.ext.js" type="text/javascript"></script>
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
		$("#infoform").validate({
			errorElement: "span",
			errorPlacement: function(error, element) {
				if (element.is(':radio') || element.is(':checkbox')) { //如果是radio或checkbox
				       error.appendTo(element.parent()); //将错误信息添加当前元素的父结点后面
				     } else {
				  error.insertAfter(element.prev()); 
				     }
				  },
			submitHandler: function(form){ //表单提交句柄,为一回调函数，带一个参数：form   
                   upload(); //提交表单   
	            },
		    rules: {
		      groupname: {
		        required: true,
		        minlength: 2,
		        maxlength: 100
		      },
		      province: {
		        required: true,
		      },
		      taxdept: {
		        required: true,
		      },
		      username: {
		        required: true,
		        minlength: 2,
		        maxlength: 100
		      },
		      department: {
		        required: true,
		        minlength: 5,
		        maxlength: 100
		      },
		      duty: {
		        required: true,
		        minlength: 2,
		        maxlength: 100
		      },
		      tel: {
		        required: true,
		        minlength: 10,
		        maxlength: 15,
		        number:true
		      },
		      email: {
		        required: true,
		        email: true,
		        maxlength: 100
		      },
		      file: {
		    	  checkPicSize: true,
		    	  checkPicType: true
		      }
		    },
		    messages: {
		      groupname: {
		        required: "请输入集团名称",
		        minlength: "集团名称必需大于两个字母组成"
		      },
		      province: "请选择一个省份",
		      taxdept: "请选择一个税务部门",
		      username: {
		        required: "请输入联络员姓名",
		        minlength: "用户名必需大于两个字母组成"
		      },
		      department: {
		        required: "请输入所在部门",
		      },
		      duty: {
		        required: "请输入职务",
		      },
		      email: {
		    	  required: "请输入邮箱",
		    	  email: "请输入正确的邮箱"
		      },
		      tel: {
		    	  required: "请输入电话号码",
	    		  number: "请输入正确的电话号码"
		      }
		     }
		    });
	});
	function upload() {
		var form = new FormData(document.getElementById("infoform"));
		$.ajax({
            url : '<%=basePath%>restful/companyinfo',
            type : "post",
            /* data : $('form').serialize(), */
            data : form,
            processData : false,
            contentType : false,
            success : function(response, status, xhr) {
            	alert("您已上报完成");
				$(':input','#infoform')  
				 .not(':button, :submit, :reset, :hidden')  
				 .val('')  
				 .removeAttr('checked')  
				 .removeAttr('selected');
            },
            error : function(response, status, xhr) {
				alert("提交失败");
			}
        });
	}
</script>
</head>
<body>
	<div class="pop-up"> 
		<div id="small-dialog" class="book-form">
			<h3>注册表单 </h3>
				<form id="infoform" action="#" method="post"  enctype="multipart/form-data">
					<p>集团名称</p>
					<input type="text" name="groupname" placeholder="集团名称" required/>
					<p>省市</p>
					<div data-toggle="distpicker"><!-- container -->
					  <select name="province"></select><!-- 省 -->
					  <select name="city" style="visibility:hidden"></select><!-- 市 -->
					</div>
					<p>税务部门</p>
					<label class="demo--label">
						<input class="demo--radio" type="radio" name="taxdept" value="国税" checked> 
						<span class="demo--radioInput"></span>国税
					</label>
					<label class="demo--label">
						<input class="demo--radio" type="radio" name="taxdept" value="地税">
						<span class="demo--radioInput"></span>地税
					</label>
					<p>联络员姓名</p>
					<input type="text" name="username" placeholder="联络员姓名" required/>
					<p>所在部门</p>
					<input type="text" name="department" placeholder="所在部门" required=""/>					
					<p>职务</p>
					<input type="text" name="duty" placeholder="职务" required=""/>					
					<p>电话</p>
					<input type="text" name="tel" class="tel" placeholder="电话" required=""/>
					<p>邮件</p>
					<input type="text" name="email" class="email" placeholder="邮件" required=""/>
					<p>头像上传</p>
					<input type="file" name="file" class="file" placeholder="头像上传" required="" accept="image/*"/>
					<p style="font-size:14px">请上传jpg,bmp,png,gif格式</p>
<!-- 					<input type="button" onclick="upload()" value="点击提交"> -->
					<input type="submit" value="点击提交">
				</form>
		</div>
	</div>
	<div class="footer-w3l">
		<p class="agileinfo">
			国家税务总局版权所有 <a href="http://www.chinatax.gov.cn/" target="_blank">国家税务总局</a>
		</p>
	</div>
</body>
</html>