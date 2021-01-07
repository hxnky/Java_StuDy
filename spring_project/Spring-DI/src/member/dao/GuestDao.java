package member.dao;

public class GuestDao implements Dao {

	@Override
	public void insert() {
		System.out.println("회원의 방명록 정보를 입력합니뎅");

	}

	@Override
	public void select() {
		System.out.println("회원의 방명록 정보를 검색합니뎅");

	}

	@Override
	public void delete() {
		System.out.println("회원의 방명록 정보를 삭제합니뎅");

	}

	@Override
	public void update() {
		System.out.println("회원의 방명록 정보를 수정합니뎅");

	}

}
