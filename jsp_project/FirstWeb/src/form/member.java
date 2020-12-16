package form;

public class member {

	private String userid;
	private String pw;
	private String username;
	private String userPhoto;
	
	// beans
	public member() {
	}

	public member(String userid, String pw, String username, String userPhoto) {
		super();
		this.userid = userid;
		this.pw = pw;
		this.username = username;
		this.userPhoto = userPhoto;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	@Override
	public String toString() {
		return "member [userid=" + userid + ", pw=" + pw + ", username=" + username + ", userPhoto=" + userPhoto + "]";
	}

	

	
	
}
