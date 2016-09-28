    drop table if exists meeting_room cascade;
    drop table if exists reservable_room cascade;
    drop table if exists reservation cascade;
    drop table if exists "user" cascade;

    create table if not EXISTS meeting_room (
        room_id  serial not null,
        room_name varchar(255),
        primary key (room_id)
    );

    create table if not EXISTS reservable_room (
        reserved_date date not null,
        room_id int4 not null,
        primary key (reserved_date, room_id)
    );

    create table if not EXISTS reservation (
        reservation_id  serial not null,
        end_time time not null,
        start_time time not null,
        reserved_date date not null,
        room_id int4 not null,
        user_id varchar(255) NOT NULL ,
        primary key (reservation_id)
    );

    create table if not EXISTS "user" (
        user_id varchar(255) not null,
        first_name varchar(255) NOT NULL ,
        last_name varchar(255) NOT NULL ,
        password varchar(255) NOT NULL ,
        role_name varchar(255) NOT NULL ,
        primary key (user_id)
    );

    alter table reservable_room
        drop constraint if EXISTS FK_f4wnx2qj0d59s9tl1q5800fw7
        ;
    alter table reservation
        drop constraint  if EXISTS  FK_p1k4iriqd4eo1cpnv79uvni9g
        ;
    alter table reservation
        drop constraint if EXISTS  FK_recqnfjcp370rygd9hjjxjtg
        ;

    alter table reservable_room
        add constraint FK_f4wnx2qj0d59s9tl1q5800fw7
        foreign key (room_id)
        references meeting_room
        ;

    alter table reservation
        add constraint FK_p1k4iriqd4eo1cpnv79uvni9g
        foreign key (reserved_date, room_id)
        references reservable_room
        ;

    alter table reservation
        add constraint FK_recqnfjcp370rygd9hjjxjtg
        foreign key (user_id)
        references "user"
        ;
