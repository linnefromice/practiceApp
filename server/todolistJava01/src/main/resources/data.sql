insert into USER (id, name, password) values ('linnefromice', 'linnefromice', 'linnefromice');
insert into USER (id, name, password) values ('001', 'user1', 'password1');
insert into USER (id, name, password) values ('002', 'user2', 'password2');

insert into TASK (id, user_id, task_title, task_description, registered_date, completion_date, completed) values (1, 'linnefromice', 'プログラミング1_java1', 'java100本ノックやる', to_date('20160101', 'YYYYMMDD'), to_date('20201231', 'YYYYMMDD'), false);
insert into TASK (id, user_id, task_title, task_description, registered_date, completion_date, completed) values (2, 'linnefromice', 'プログラミング1_java2', 'オブジェクト志向エクササイズやる', to_date('20190301', 'YYYYMMDD'), to_date('20190430', 'YYYYMMDD'), false);
