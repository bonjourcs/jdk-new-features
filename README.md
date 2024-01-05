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