-- auto-generated definition
create table user
(
    id           bigint auto_increment comment '' 用户ID ''
        primary key,
    username     varchar(200) null comment '' 昵称 '',
    avatarUrl    varchar(1024) null comment '' 用户头像 '',
    userAccount  varchar(256) null comment '' 账号 '',
    gender       tinyint null comment '' 性别 '',
    userPassword varchar(250) null comment '' 用户密码 '',
    phone        varchar(128) null comment '' 电话 '',
    email        varchar(256) null comment '' 邮箱 '',
    userStatus   int     default 0 null comment '' 用户状态：0 表示正常；1 表示封禁 '',
    createTime   datetime null comment '' 创建时间 '',
    updateTime   datetime null comment '' 更新时间 '',
    isDelete     tinyint default 0 null comment '' 是否删除（0 表示未删除）'',
    userRole     int     default 0 not null comment '' 用户角色（0-普通用户，1-管理员）'',
    planetCode   varchar(512) null comment '' 星球编号 '',
    tags         varchar(1024) null comment '' 标签列表 '',
    constraint user_id_uindex
        unique (id),
    constraint user_userAccount_uindex
        unique (userAccount)
) comment ''用户'';

