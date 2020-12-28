-- 입력 SQL
INSERT INTO `open`.`guestbook_message` (guest_name, password, message) VALUES ('test' ,'1234', '반갑습니뎅');
-- INSERT INTO guestbook_message (guest_name, password, message) VALUES (? ,?, ?);

-- 질의 SQL
select * from open.guestbook_message;
-- select * from guestbook_message;

-- 삭제 SQL
DELETE FROM `open`.`guestbook_message` WHERE message_id = 1;
-- DELETE FROM guestbook_message WHERE message_id = 1;

-- 전체 게시물 개수 구하기
select count(*) from open.guestbook_message;
-- select count(*) from guestbook_message

-- 페이지 별 메시지 리스트
select * from open.guestbook_message order by message_id desc limit 3, 3;
-- select * from guestbook_message order by message_id desc limit ?, ?;

