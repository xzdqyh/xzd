### 一、部署在locklhost

步骤：
更改application-dev.yml中数据库连接信息；
1. 在IDEA中运行项目，项目能正常跑起来才有部署的必要；
2. 点击项目右侧 Maven->选择项目->clean（清除）->package（将项目打成jar包）；
3. 打包过程结束后，控制台提示 [INFO] BUILD SUCCESS  则打包成功；
4. 打开项目根目录，进入target文件夹，找到刚刚打好的jar包；
5. 在当前jar包目录进cmd窗口，输入指令 java -jar jar名；
6. 部署完成，可通过访问 locklhost:端口号\  进行访问；

### 二、部署在服务器

步骤：

1. 将target文件夹中的lib文件打包；

2. 通过Xftp将jar包传输到Xshell中；

3. 下载unzip，yum install unzip;

4. 解压压缩文件，unzip 文件名;

5. 在此目录运行 java -jar jar名；

6. 部署完成，可通过访问 服务器地址：端口号\ 进行访问；

   需要在linux上安装jdk和mysql;
