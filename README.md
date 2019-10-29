## 管理

## 资料

[Spring 文档](https://spring.io/guides)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[es](https://elasticsearch.cn/explore)

[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)

[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Bootstrap组件](https://v3.bootcss.com/components/#navbar-buttons)

[OKhttp](https://square.github.io/okhttp/)

[H2数据库](http://www.h2database.com/html/main.html)

[Mybatis-spring-boot-autoconfigure](https://mybatis.org/spring-boot-starter/) 

[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-connect-to-production-database)

## 工具

[Git](https://git-scm.com/download)

[Visual paradigm](https://www.visual-paradigm.com)

## 脚本

```sql
CREATE TABLE USER
(
  ID           INTEGER DEFAULT (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_A27E4AA1_B703_4EC7_9D6B_F1150B75A0B0) AUTO_INCREMENT PRIMARY KEY NOT NULL,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        VARCHAR(2147483647),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT
)

```
```bash
mvn flyway:migrate
```