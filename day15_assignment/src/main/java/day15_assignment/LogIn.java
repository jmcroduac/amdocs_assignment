package day15_assignment;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LogIn_JSP")
public class LogIn {

    @Id
    @Column(name="login_id")
    private int login_id;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="password")
    private String password;

    public LogIn(int login_id, String userName, String password) {
        super();
        this.login_id = login_id;
        this.userName = userName;
        this.password = password;
    }
    
    

	public int getLogin_id() {
		return login_id;
	}



	public void setLogin_id(int login_id) {
		this.login_id = login_id;
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

