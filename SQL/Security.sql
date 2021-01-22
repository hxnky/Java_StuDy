insert into open.member (memberid, password, membername ) 
values ('test123123', aes_encrypt('1111', SHA2('key_value', 512)), 
aes_encrypt('tester', SHA2('key_value', 512)));

select memberid, aes_decrypt() from open.member where idx = 24;