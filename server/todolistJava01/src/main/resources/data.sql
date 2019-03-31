insert into USER (id, name, password) values ('linnefromice', 'linnefromice', 'linnefromice');
insert into USER (id, name, password) values ('001', 'user1', 'password1');
insert into USER (id, name, password) values ('002', 'user2', 'password2');

insert into TASK (id, user_id, task_title, task_description, completed, registered_date) values (1, 'linnefromice', 'プログラミング1_java1', 'java100本ノックやる', false, to_date('20190301', 'YYYYMMDD'));
insert into TASK (id, user_id, task_title, task_description, completed, registered_date) values (2, 'linnefromice', 'プログラミング1_java2', 'オブジェクト志向エクササイズやる', false, to_date('20190301', 'YYYYMMDD'));
