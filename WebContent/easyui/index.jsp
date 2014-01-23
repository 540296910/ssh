<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Complex Layout - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<style type="text/css">
	#rd{
			margin:10px;
			width:100px;
			height:100px;
			background:#fafafa;
			border:1px solid #ccc;
			position:absolute;
			left:400px;
			top:200px;
		}
		#title{
			width:100%;
			height:20px;
			background:red;
		}
	</style>
	<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/easyloader.js"></script>
	<script>
	$(function(){
		$('#rd').draggable({handle:'#title'}).resizable({
		    maxWidth:800,
		    maxHeight:600,
		    minWidth:40,
		    minHeight:40
		});
	});
	
	</script>
</head>
<body class="easyui-layout">
	<div id="rd" title="hello">
		<div id="title">hello</div>
	</div>
</body>
</html>