<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>EAS系统登录</title>
<link rel="stylesheet" href="widgets/css/bootstrap.min.css">
<link rel="stylesheet" href="widgets/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="widgets/css/main.css">
<script type="text/javascript" src="widgets/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="widgets/js/bootstrap.min.js"></script>
<script type="text/javascript" src="widgets/js/bs.beamDialog.js"></script>
<script type="text/javascript" src="widgets/js/login/login.js"></script>
</head>
<body>
	<form class="form-signin" role="form">
		<fieldset>
			<legend>EAS系统登录</legend>
			<div class="form-group">
				<label class="control-label" for="userCode">用户名</label>
				<div>
					<input type="text" id="userCode" class="form-control"
						placeholder="请输入登录用户名..." />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label" for="userPass">密码</label>
				<div>
					<input type="password" id="userPass" class="form-control"
						placeholder="请输入登录用户名..." />
				</div>
			</div>
			<div class="form-group center">
				<button type="button" class="btn btn-primary" id="btn_submit">登 录</button>
				&nbsp;&nbsp;&nbsp;
				<button type="button" class="btn btn-primary" id="btn_cancle">取 消</button>
			</div>
		</fieldset>
	</form>
</body>
</html>