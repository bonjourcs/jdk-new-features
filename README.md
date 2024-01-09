# jdk new features

Java 各个版本的新功能和代码解释。在 test 包下有各个版本的单元测试，结构如下所示：

```text
├─java
│  └─com
│      └─bonjourcs
│          └─java
│              └─newfeatures
│                  ├─jdk8
│                  └─jdk9
└─resources
```

其中 `@JDK` 注解用来说明版本信息。

- since: 表示最低支持的 JDK 版本
- lts: 表示所属的最低 JDK 是否为 LTS 版本

# JDK 功能说明

## JDK 8

- Lambda 表达式
- 方法引用
- Stream API
- Optional
- 新的日期时间类

## JDK 9

- JShell
- 模块化系统
- 快速创建不可变集合
- 接口私有化
- Stream API 增强
- try-with-resource增强

## JDK 10

- var关键字

## JDK 11

- String类增加新的方法
- Predicate增加新的方法
- 新的构建不可变集合方法

## JDK 12

- 增强的Switch语句

## JDK 13

- 增强的Switch语句（增加yield关键字）
- 文本块