package com.edureka.javasql1.hibernate.one2one;
import javax.persistence.*;

@Entity(name = "jEmployee")
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "age")
	private int age;
	
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address address;
	
	public Employee() {}
	
	public Employee(String firstName, String lastName, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		
		return String.format("Id %d, First Name %s, Last Name %s, Age %d", id, firstName,
						lastName, age);
	}
	
}
