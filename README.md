## 简单Maven集成SSH框架Demo
1. 先导入maven.sql到数据库

2. 修改**ssh-dao**的applicationContext-dao.xml的数据库地址

3. 运行项目（mvn tomcat7:run）

4. 浏览器访问地址：http://localhost:8888/ssh/findById.action?id=1

PS:访问动作需与action为后缀才能被Struts2拦截，可在Struts2.xml修改

