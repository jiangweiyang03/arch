/**
 * 系统初始化处理
 * 
 * @author jiangweiyang01
 * @since 2015/06/22
 * @version 1.0
 */
$(function() {
	// 关闭密码修改窗口.
	$("#passwdWin").window("close");
	InitLeftMenu();
	tabClose();
	tabCloseEven();

	$('#tabs').tabs('add', {
		title : '个人中心'
	}).tabs({
		onSelect : function(title) {
			var currTab = $('#tabs').tabs('getTab', title);
			var iframe = $(currTab.panel('options').content);

			var src = iframe.attr('src');
			if (src)
				$('#tabs').tabs('update', {
					tab : currTab,
					options : {
						content : createFrame(src)
					}
				});

		}
	});
});

// 初始化左侧
function InitLeftMenu() {
	$("#nav").accordion({
		animate : true,
		fit:true,
		border:false
	}).accordion('select',0);
	/** 提取菜单信息* */
	$.post("findmenubyperson", {}, function(data) {
		$.each(data, function(i, n) {
			var menulist = '';
			menulist += '<ul>';
			$.each(n.children, function(j, o) {
				if (o.leaf == true) {
					menulist += '<li><div><a ref="' + o.id + '" href="#" rel="'
							+ o.url + '"><span class="icon ' + o.icon
							+ '" >&nbsp;</span><span class="nav">' + o.text
							+ '</span></a></div></li> ';
				} else {
					var childrenList = '';
					$.each(o.children,function(cj,co){
						childrenList += '<li><span>'+co.text+'<span></li>';
					});
					menulist += '<ul class="easyui-tree"><li><span class="icon">' + o.text+ '</span><ul>'+childrenList+'</ul></li></ul>';
				}
			});
			menulist += '</ul>';
			$('#nav').accordion('add', {
				title : n.text,
				content : menulist,
				iconCls : 'icon'
			});
		});

		$('.easyui-accordion li a').click(function() {
			var tabTitle = $(this).children('.nav').text();
			var url = $(this).attr("rel");
			addTab(tabTitle, url);
			$('.easyui-accordion li div').removeClass("selected");
			$(this).parent().addClass("selected");
		}).hover(function() {
			$(this).parent().addClass("hover");
		}, function() {
			$(this).parent().removeClass("hover");
		});
	}, "json");

}

function addTab(subtitle, url, icon) {
	if (url != null && url != '') {
		if (!$('#tabs').tabs('exists', subtitle)) {
			$('#tabs').tabs('add', {
				title : subtitle,
				content : createFrame(url),
				closable : true,
				icon : icon
			});
		} else {
			$('#tabs').tabs('select', subtitle);
			$('#mm-tabupdate').click();
		}
		tabClose();
	} else {
		$.messager.alert("系统管理","当前菜单的访问URL没有配置","info");
	}
}

function createFrame(url) {
	var s = '<iframe scrolling="auto" frameborder="0"  src="' + url
			+ '" style="width:100%;height:100%;"></iframe>';
	return s;
}

function tabClose() {
	/* 双击关闭TAB选项卡 */
	$(".tabs-inner").dblclick(function() {
		var subtitle = $(this).children(".tabs-closable").text();
		$('#tabs').tabs('close', subtitle);
	});
	/* 为选项卡绑定右键 */
	$(".tabs-inner").bind('contextmenu', function(e) {
		$('#mm').menu('show', {
			left : e.pageX,
			top : e.pageY
		});

		var subtitle = $(this).children(".tabs-closable").text();

		$('#mm').data("currtab", subtitle);
		$('#tabs').tabs('select', subtitle);
		return false;
	});
}
// 绑定右键菜单事件
function tabCloseEven() {
	// 刷新
	$('#mm-tabupdate').click(function() {
		var currTab = $('#tabs').tabs('getSelected');
		var url = $(currTab.panel('options').content).attr('src');
		$('#tabs').tabs('update', {
			tab : currTab,
			options : {
				content : createFrame(url)
			}
		});
	});
	// 关闭当前
	$('#mm-tabclose').click(function() {
		var currtab_title = $('#mm').data("currtab");
		$('#tabs').tabs('close', currtab_title);
	});
	// 全部关闭
	$('#mm-tabcloseall').click(function() {
		$('.tabs-inner span').each(function(i, n) {
			var t = $(n).text();
			$('#tabs').tabs('close', t);
		});
	});
	// 关闭除当前之外的TAB
	$('#mm-tabcloseother').click(function() {
		$('#mm-tabcloseright').click();
		$('#mm-tabcloseleft').click();
	});
	// 关闭当前右侧的TAB
	$('#mm-tabcloseright').click(function() {
		var nextall = $('.tabs-selected').nextAll();
		if (nextall.length == 0) {
			// msgShow('系统提示','后边没有啦~~','error');
			alert('后边没有啦~~');
			return false;
		}
		nextall.each(function(i, n) {
			var t = $('a:eq(0) span', $(n)).text();
			$('#tabs').tabs('close', t);
		});
		return false;
	});
	// 关闭当前左侧的TAB
	$('#mm-tabcloseleft').click(function() {
		var prevall = $('.tabs-selected').prevAll();
		if (prevall.length == 0) {
			alert('到头了，前边没有啦~~');
			return false;
		}
		prevall.each(function(i, n) {
			var t = $('a:eq(0) span', $(n)).text();
			$('#tabs').tabs('close', t);
		});
		return false;
	});

	// 退出
	$("#mm-exit").click(function() {
		$('#mm').menu('hide');
	});
}

// 弹出信息窗口 title:标题 msgString:提示信息 msgType:信息类型 [error,info,question,warning]
function msgShow(title, msgString, msgType) {
	$.messager.alert(title, msgString, msgType);
}
