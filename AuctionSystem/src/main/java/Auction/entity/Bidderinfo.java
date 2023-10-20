package Auction.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table(name ="bidder")
public class Bidderinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bId;
	
	@Column(name = "first_name", length = 20)
	@NotEmpty
	@Size(min=3, message="first name should conatin atleast 3 characters")
	public String firstName;

	@Column(name = "last_name", length = 20)
	@NotEmpty
	@Size(min=1, message="first name should conatin atleast 1 characters")
	public String lastName;
	
	@Column(name = "phno",unique=true, length = 10)
	@NotEmpty
	@Size(min=10,max=10, message="Phone number should contain atleast 10 and not more than 10 characters")
	public String phno;
	
	@Column(name = "address", length = 100)
	@NotEmpty
	@Size(min=3, message="Address should conatain at 3 Characters")
	public String address;
	
	public String email;
	
	@Column(name = "password", length = 20)
	@NotEmpty
	@Size(min = 8, message = "Password length must be 8 and contain uppercase,lowercase,digits")
	@Pattern(regexp = "(?=.\\d)(?=.[a-z])(?=.*[A-Z]).{8,}")
	public String password;

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Bidderinfo [bId=" + bId + ", firstName=" + firstName + ", lastName=" + lastName + ", phno=" + phno
				+ ", address=" + address + ", email=" + email + ", password=" + password + "]";
	}
	
}
