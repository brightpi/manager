ALTER TABLE USER ADD head_portrait VARCHAR(100) NULL;
COMMENT ON COLUMN USER.head_portrait IS '用户头像';