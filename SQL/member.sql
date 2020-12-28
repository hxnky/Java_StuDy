INSERT INTO `open`.`member` (memberid, password, membername) VALUES ('cool@gmail', '1111', 'COOL');
-- INSERT INTO `open`.`member` (memberid, password, membername) VALUES (?, ?, ?)

select * from open.member;

select * from open.member where memberid='cool@gmail' and password ='1111';
-- select * from open.member where memberid=? and password =?;