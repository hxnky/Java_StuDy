package generic;

public class Orange {
	
	private int sugarContent;	// 당분 함량
	
	Orange(int sugarContent){
		this.sugarContent = sugarContent;
	}
	
	public void showSugarContent() {
		System.out.println("오렌지의 당도 " + sugarContent);
	}
	
	
	
}
