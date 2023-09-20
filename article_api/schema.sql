
    create sequence api.article_seq start with 1 increment by 50;

    create sequence api.user_seq start with 1 increment by 50;

    create table api.article (
        article_id bigint not null,
        article_quantity bigint,
        article_description varchar(255),
        article_name varchar(255),
        primary key (article_id)
    );

    create table api.user (
        id bigint not null,
        email varchar(255),
        password varchar(255),
        primary key (id)
    );

    create sequence api.article_seq start with 1 increment by 50;

    create sequence api.user_seq start with 1 increment by 50;

    create table api.article (
        article_id bigint not null,
        article_quantity bigint,
        article_description varchar(255),
        article_name varchar(255),
        primary key (article_id)
    );

    create table api.user (
        id bigint not null,
        email varchar(255),
        password varchar(255),
        primary key (id)
    );

    create sequence api.article_seq start with 1 increment by 50;

    create sequence api.user_seq start with 1 increment by 50;

    create table api.article (
        article_id bigint not null,
        article_quantity bigint,
        article_description varchar(255),
        article_name varchar(255),
        primary key (article_id)
    );

    create table api.user (
        id bigint not null,
        email varchar(255),
        password varchar(255),
        primary key (id)
    );

    create sequence api.article_seq start with 1 increment by 50;

    create sequence api.user_seq start with 1 increment by 50;

    create table api.article (
        article_id bigint not null,
        article_quantity bigint,
        article_description varchar(255),
        article_name varchar(255),
        primary key (article_id)
    );

    create table api.user (
        id bigint not null,
        email varchar(255),
        password varchar(255),
        primary key (id)
    );
