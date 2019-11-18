-- auto-generated definition
CREATE TABLE PUBLISH
(
  ID           INTEGER DEFAULT (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_A27E4AA1_B703_4EC7_9D6B_F1150B75A0B0) AUTO_INCREMENT PRIMARY KEY NOT NULL,
  TITLE         VARCHAR(50),
  DESCRIPTION   CLOB,
  TAG           VARCHAR(256),
  GMT_CREATE    BIGINT,
  GMT_MODIFIED  BIGINT,
  CREATOR       INTEGER,
  COMMENT_COUNT INTEGER DEFAULT 0,
  VIEW_COUNT    INTEGER DEFAULT 0,
  LIKE_COUNT    INTEGER DEFAULT 0
);
COMMENT ON COLUMN PUBLISH.CREATOR IS '创建人id，关联user表id';

COMMENT ON COLUMN PUBLISH.COMMENT_COUNT IS '评论数'