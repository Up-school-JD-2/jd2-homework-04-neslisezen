package homework4;
import java.util.UUID;

public class Account {
	private String userName;
	private String userSurname;
	private String userID;
	Cash userBasket;
	
	 public Account(String userName, String userSurname) {
		    this.userID = UUID.randomUUID().toString();
		    this.userName = userName;
		    this.userSurname = userSurname;
		  }

		  public String getUserId() {
		    return userID;
		  }

		  public String getUserName() {
		    return userName;
		  }

		  public void setName(String userName) {
		    this.userName = userName;
		  }

		  public String getSurname() {
		    return userSurname;
		  }

		  public void setSurname(String userSurname) {
		    this.userSurname = userSurname;
		  }

		  @Override
		  public String toString() {
		    return "User {" +
		           "UserID='" + userID + '\'' +
		           ", Username='" + userName + '\'' +
		           ", Usersurname='" + userSurname + '\'' +
		            +
		           '}' + '\n';
		  }
}
