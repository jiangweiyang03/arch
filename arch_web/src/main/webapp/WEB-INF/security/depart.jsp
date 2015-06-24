<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String ctx = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=ctx %>/widgets/css/default.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="<%=ctx %>/widgets/js/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="<%=ctx %>/widgets/js/easyui/themes/icon.css" />
<script type="text/javascript" src="<%=ctx %>/widgets/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript"
	src="<%=ctx %>/widgets/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=ctx %>/widgets/js/easyui/mainbody.js"></script>
<script type="text/javascript"
	src="<%=ctx %>/widgets/js/easyui/easyui-lang-zh_CN.js"></script>
</head>
<body>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
	<div region="west" split="false" title="组织机构" style="width: 400px;" collapsible="false"
		id="west">
	</div>
	<div id="mainPanle" region="center" title="部门列表"
		style="background: #eee; overflow-y: hidden"></div>

</body>
</body>
</html>