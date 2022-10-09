package day15_assignment;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LogIn_Table")
public class LogIn {

    @Id
    @Column(name="login_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loginId;

    @Column(name="user_name")
    private String userName;
    
    @Column(name="password")
    private String password;

    public LogIn(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }

    public int getLoginId() {
		return loginId;
	}



	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

}

