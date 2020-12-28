package guestbook.domain;

import java.util.List;

public class MessageListView {

	private int messageTotalCount; // 총 게시물 수 : 페이지 갯수 구하는 용도
	private int currentPageNumber; // 현재 페이지 번호 : List<Message>
	private List<Message> messageList; // 한 페이지에 출력할 게시물
	private int pageTotalCount; // 총 페이지 수
	private int messageCountperPage; // 한 페이지에 출력할 게시물 수
	private int firstRow; // DB에서 테이블의 시작 행
	private int endRow; // Oracle에서만 필요

	// pageTotalCount는 내부에서 계산메소드 만들었습니뎅
	public MessageListView(int messageTotalCount, int currentPageNumber, List<Message> messageList,
			int messageCountperPage, int firstRow, int endRow) {
		super();
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageList = messageList;
		this.messageCountperPage = messageCountperPage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		calculatePageTotalCount();
	}

	private void calculatePageTotalCount() {
		if (messageTotalCount == 0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = messageTotalCount / messageCountperPage;
			if (messageTotalCount % messageCountperPage > 0) {
				pageTotalCount++;
			}
		}
	}

	public int getMessageTotalCount() {
		return messageTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public int getMessageCountperPage() {
		return messageCountperPage;
	}

	public int getFirstRow() {
		return firstRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public boolean isEmpty() {
		return messageTotalCount == 0;
	}

}
