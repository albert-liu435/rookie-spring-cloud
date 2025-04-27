## 解压安装包
sudo tar -zxvf jdk-8u331-linux-x64.tar.gz -C /usr/local/

## 配置jdk环境变量
sudo vim ~/.bashrc
在末尾添加
export JAVA_HOME=/usr/local/jdk1.8.0_331
export PATH=$JAVA_HOME/bin:$PATH

保存并退出后在终端输入命令source ~/.bashrc生效配置文件

测试是否成功 
java -version
