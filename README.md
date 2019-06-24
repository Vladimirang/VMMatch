# VMMatch
一言不合就来场匹配吧

### 介绍
这是一个使用环信 IM 开发的一款开源聊天项目，涵盖了时下流行的一些聊天元素，同时已将 IM 功能封装为单独库，可以直接引用，方便使用

下载实例：
[本地下载](./VMMatch.apk)

[小米应用商店 审核中]()


### 项目截图
![匹配](http://q.data.melove.net/main01.png-vthumb256)![匹配](http://q.data.melove.net/main02.png-vthumb256)![匹配](http://q.data.melove.net/main03.png-vthumb256)
![匹配](http://q.data.melove.net/chat01.png-vthumb256)![匹配](http://q.data.melove.net/chat02.png-vthumb256)![匹配](http://q.data.melove.net/call01.png-vthumb256)
![匹配](http://q.data.melove.net/call02.png-vthumb256)![匹配](http://q.data.melove.net/call03.png-vthumb256)![匹配](http://q.data.melove.net/call04.png-vthumb256)
![匹配](http://q.data.melove.net/settings01.png-vthumb256)![匹配](http://q.data.melove.net/settings02.png-vthumb256)


### 开发环境
项目基本属于在最新的`Android`开发环境下开发，使用`Java8`的一些新特性，比如`Lambda`表达式，
然后项目已经适配`Android6.x`以上的动态权限适配，以及`7.x`的文件选择，和`8.x`的通知提醒等；

- Mac OS 10.14.4
- Android Studio 3.3.2



### 项目模块儿
本项目包含两部分：
- 一部分是项目主模块`app`，这部分主要包含了项目的业务逻辑，比如匹配、信息修改、设置等
- 另一部分是封装成`library`的`vmim`，这是为了方便大家引用到自己的项目中做的一步封装，不用再去复杂的复制代码和资源等，
只需要将`vmim`以`module`导入到自己的项目中就行了，具体使用方式参见项目`app`模块儿；


### 功能与 TODO
**IM部分功能**
- [x] 链接监听
- [x] 登录注册
- [x] 会话功能
  - [x] 置顶
  - [x] 标为未读
  - [x] 删除与清空
  - [x] 草稿功能
- [x] 消息功能
  - [x] 下拉加载更多
  - [x] 消息复制（仅文字类消息）
  - [x] 消息删除
  - [x] 文本+Emoji消息收发
  - [x] 大表情消息收发
  - [x] 图片消息
    - [x] 查看大图
    - [ ] 保存图片
  - [x] 语音消息
    - [x] 语音录制
    - [x] 语音播放（可暂停，波形待优化）
    - [x] 听筒和扬声器播放切换
  - [x] 语音实时通话功能
  - [x] 视频实时通话功能
  - [x] 通话过程中的娱乐消息收发
    - [x] 骰子
    - [x] 石头剪刀布
    - [x] 大表情
  - [x] 昵称头像处理（通过回调实现）
  - [x]


**App部分功能**
- [x] 登录注册（包括业务逻辑和 IM 逻辑）
- [x] 匹配
    - [x] 提交匹配信息
    - [x] 拉取匹配信息
- [x] 聊天（这里直接加载 IM 模块儿）
- [x] 我的
    - [x] 个人信息展示
    - [x] 上传头像
    - [x] 设置昵称
    - [x] 设置签名
- [x] 设置
    - [x] 个人信息设置
    - [x] 通知提醒
    - [x] 聊天
    - [ ] 隐私（随业务部分一起完善）
    - [ ] 通用（随业务部分一起完善）
    - [ ] 帮助反馈（随业务部分一起完善）
    - [x] 关于
    - [x] 退出
- [ ] 社区
    - [ ] 发布
    - [ ] 收藏
    - [ ] 关注


**发布功能**
- [x] 多渠道打包
- [x] 签名配置
- [x] 开发与线上环境配置
- [x] 敏感信息保护

### 配置运行
1. 首先复制`config.default.gradle`到`config.gradle`
2. 配置下`config.gradle`环信`appkey`以及`bugly`统计Id
3. 正式打包需要配置下签名信息，同时将签名文件放置在项目根目录

### 参与贡献
如果你有什么好的想法，或者好的实现，可以通过下边的步骤参与进来，让我们一起把这个项目做得更好，欢迎参与 😁

1. `Fork`本仓库
2. 新建`feature_xxx`分支 (单独创建一个实现你自己想法的分支)
3. 提交代码
4. 新建`Pull Request`
5. 等待我们的`Review & Merge`


