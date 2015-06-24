<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EAS管理系统</title>
<link href="widgets/css/default.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="widgets/js/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="widgets/js/easyui/themes/icon.css" />
<script type="text/javascript" src="widgets/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript"
	src="widgets/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="widgets/js/easyui/mainbody.js"></script>
<script type="text/javascript" src="widgets/js/easyui/easyui-lang-zh_CN.js"></script>
</head>

<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
	<div region="north" split="true" border="false"
		style="overflow: hidden; height: 30px; background: url(widgets/images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%; line-height: 30px; color: #fff; font-family: Verdana, 微软雅黑, 黑体">
		<span style="float: right; padding-right: 20px;" class="head">
			欢迎您,<span>${CurrentUser}</span>&nbsp;<a href="#" id="editpass">修改密码</a> <a href="j_spring_security_logout" id="loginOut">安全退出</a>
		</span>
		<span style="padding-left: 10px; font-size: 16px;"><img src="widgets/images/blocks.gif" width="20" height="15" align="absmiddle" />&nbsp;EAS后台管理系统</span>
	</div>
	<div region="south" split="true"
		style="height: 30px; background: #D2E0F2;">
		<div class="footer">@version yousoft@163.com</div>
	</div>
	<div region="west" split="true" title="导航菜单" style="width: 180px;"
		id="west">
		<div id="nav" class="easyui-accordion" border="false">
		</div>
	</div>
	<div id="mainPanle" region="center"
		style="background: #eee; overflow-y: hidden">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
		<!-- 		
			<div title="欢迎使用"
				style="padding: 20px; overflow: hidden; color: red;">
				<h1 style="font-size: 24px;">* 作者：悠软工作室</h1>
				<h1 style="font-size: 24px;">*
					电邮：yousoft@163.com
				<h1 style="font-size: 24px;">*
					QQ：1371689711
			</div>
		 -->
		</div>
	</div>


	<!--修改密码窗口-->
	<div id="passwdWin" class="easyui-window" title="修改密码" collapsible="false"
		minimizable=false" maximizable="false" icon="icon-save"
		style="width: 300px; height: 150px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false"
				style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<table cellpadding=3>
					<tr>
						<td>新密码：</td>
						<td><input id="txtNewPass" type="Password" class="txt01" /></td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input id="txtRePass" type="Password" class="txt01" /></td>
					</tr>
				</table>
			</div>
			<div region="south" border="false"
				style="text-align: right; height: 30px; line-height: 30px;">
				<a id="btnEp" class="easyui-linkbutton" icon="icon-ok"
					href="javascript:void(0)"> 确定</a> <a id="btnCancel"
					class="easyui-linkbutton" icon="icon-cancel"
					href="javascript:void(0)">取消</a>
			</div>
		</div>
	</div>

	<div id="mm" class="easyui-menu" style="width: 150px;">
		<div id="mm-tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">退出</div>
	</div>
	
	<!-- 隐式保存用户菜单信息 -->
	<input id="userMenuStr" type="hidden" value="${UserMenuStr}">  

</body>
</html>