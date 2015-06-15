/**
  * 提交用户登录表单.
  * @author jiangweiyang01
  * @version 1.0
 */
$(function(){
	$("#btn_submit").bind("click",function(){
		var userName = $("#userCode").val();
		var userPass = $("#userPass").val();
		if (userName == null || userName == "") {
			$.beamDialog({
		        title: '系统提示',
		        content: '用户名不能为空'
		    });
		} else if (userPass == null || userPass == "") {
			$.beamDialog({
		        title: '系统提示',
		        content: '密码不能为空'
		    });
		} else {
			//验证成功之后，security请求认证
			$("#loginform").submit();
		}
	});
});

function submitForm(){
//	$.beamDialog({
//        title: '系统提示',
//        content: '确认删除本条记录?',
//        showCloseButton: true,
//        otherButtons: ["确定", "取消"],
//        otherButtonStyles: ['btn-primary', 'btn-primary'],
//        bsModalOption: {
//            keyboard: true
//        },
//        dialogShow: function () {
//            alert('即将显示对话框');
//        },
//        dialogShown: function () {
//            alert('显示对话框');
//        },
//        dialogHide: function () {
//            alert('即将关闭对话框');
//        },
//        dialogHidden: function () {
//            alert('关闭对话框');
//        },
//        clickButton: function (sender, modal, index) {
//            alert('选中第' + index + '个按钮：' + sender.html());
//            $(this).closeDialog(modal);
//        }
//    });
}