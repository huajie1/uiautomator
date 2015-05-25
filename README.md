# uiautomator
一个简单的uiautomatro demo
环境配置：环境配置:java环境配置、adb环境配置、ant环境配置
做好之后按照以下步骤执行：
1、新建一个Java项目，导入android 和 uiautomator的jar包（在sdk的tools目录下）
2、使用uiautomatorviewer检测元素，编写测试案例（本demo中是test.java）
3、先创建编译文件build.xml，使用命令
  android create uitest-project -n <name> -t <android taget> -p <project path>
4、定位到项目目录，执行ant build；即通过build.xml将uiautomatorDemo打包成jar
5、通过adb导入jar包到手机，使用命令
	adb push <path>/uiautomator.jar data/local/temp
6、通过adb shell命令调起运行，使用命令
	adb shell uiautomator runtest <jar的name> -c <包.classname>
