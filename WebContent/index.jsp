<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="baseType.do">
		<h3>基本数据类型绑定</h3>
		年龄：<input type="text" name="age"/>
		<input type="submit" value="提交"/>
	</form>
		<form action="baseType2.do">
		<h3>包装类型绑定</h3>
		年龄：<input type="text" name="age"/>
		<input type="submit" value="提交"/>
	</form>
	<hr/>
	<form action="object1.do">
		<h3>简单对象的数据绑定</h3>
		编号：<input type="text" name="id"/><br/>
		姓名：<input type="text" name="name"/><br/>
		年龄：<input type="text" name="age"/><br/>
		<input type="submit" value="提交"/>
	</form>
		<hr/>
	<form action="object2.do">
		<h3>多层级对象</h3>
		编号：<input type="text" name="id"/><br/>
		姓名：<input type="text" name="name"/><br/>
		年龄：<input type="text" name="age"/><br/>
		部门编号：<input type="text" name="depart.deId"/><br/>
		部门名称：<input type="text" name="depart.deName"/><br/>
		<input type="submit" value="提交"/>
	</form>
		<hr/>
	<form action="object3.do">
		<h3>同属性的多对象绑定</h3>
		user编号：<input type="text" name="user.id"/><br/>
		user姓名：<input type="text" name="user.name"/><br/>
		user年龄：<input type="text" name="user.age"/><br/>
		user部门编号：<input type="text" name="user.depart.deId"/><br/>
		user部门名称：<input type="text" name="user.depart.deName"/><br/>
		admin编号：<input type="text" name="admin.id"/><br/>
		admin姓名：<input type="text" name="admin.name"/><br/>
		admin年龄：<input type="text" name="admin.age"/><br/>
		<input type="submit" value="提交"/>
	</form>
	<hr/>		
	<form action="array.do">
		<h3>数组的绑定</h3>
		姓名：<input type="text" name="name"/><br/>
		姓名：<input type="text" name="name"/><br/>
		姓名：<input type="text" name="name"/><br/>
		姓名：<input type="text" name="name"/><br/>
		<input type="submit" value="提交"/>
	</form>
	<hr/>	
	
	<form action="list.do">
		<h3>List的数据绑定</h3>
		编号：<input type="text" name="users[0].id"/>
		姓名：<input type="text" name="users[0].name"/>
		年龄：<input type="text" name="users[0].age"/><br/>
		编号：<input type="text" name="users[1].id"/>
		姓名：<input type="text" name="users[1].name"/>
		年龄：<input type="text" name="users[1].age"/><br/>
		编号：<input type="text" name="users[2].id"/>
		姓名：<input type="text" name="users[2].name"/>
		年龄：<input type="text" name="users[2].age"/><br/>
		<input type="submit" value="提交"/>
	</form>	
	<hr/>
	
	<form action="set.do">
		<h3>Set的数据绑定</h3>
		编号：<input type="text" name="users[0].id"/>
		姓名：<input type="text" name="users[0].name"/>
		年龄：<input type="text" name="users[0].age"/><br/>
		编号：<input type="text" name="users[1].id"/>
		姓名：<input type="text" name="users[1].name"/>
		年龄：<input type="text" name="users[1].age"/><br/>
		编号：<input type="text" name="users[2].id"/>
		姓名：<input type="text" name="users[2].name"/>
		年龄：<input type="text" name="users[2].age"/><br/>
		<input type="submit" value="提交"/>
	</form>	
	<hr/>
		<form action="map.do">
		<h3>Map的数据绑定</h3>
		编号：<input type="text" name="users['x'].id"/>
		姓名：<input type="text" name="users['x'].name"/>
		年龄：<input type="text" name="users['x'].age"/><br/>
		编号：<input type="text" name="users['y'].id"/>
		姓名：<input type="text" name="users['y'].name"/>
		年龄：<input type="text" name="users['y'].age"/><br/>
	
		<input type="submit" value="提交"/>
	</form>	
	<hr/>
	<form action="object4.do">
		<h3>Conterter类型转换器</h3>
		编号：<input type="text" name="id"/><br/>
		姓名：<input type="text" name="name"/><br/>
		生日：<input type="text" name="date"/><br/>
		年龄：<input type="text" name="age"/><br/>
		<input type="submit" value="提交"/>
	</form>
		<hr/>
</body>
</html>