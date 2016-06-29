package code.model;

import java.util.Date;

public class ToDo {
	private int id;
	private String user;
	private String description;
	private Date date;
	private boolean checked;
	


	@Override
	public String toString() {
		return "ToDo [id=" + id + ", user=" + user + ", description=" + description + ", date=" + date + ", checked="
				+ checked + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDo other = (ToDo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	  public ToDo() {
	        super();
	    }
	public ToDo( String user, String description, Date date, boolean checked) {
		super();
		this.user = user;
		this.description = description;
		this.date = date;
		this.checked = checked;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
}
