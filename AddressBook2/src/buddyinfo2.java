

public class buddyinfo2 {
private String name; 
private String address;
private long phoneNum;

public buddyinfo2(String name, String address, int phoneNum){
	this.name = name;
	this.address = address;
	this.phoneNum = phoneNum;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getPhoneNum() {
	return phoneNum;
}

public void setPhoneNum(long phoneNum) {
	this.phoneNum = phoneNum;
}

public static void main(String [ ] args){
	buddyinfo2 bud = new buddyinfo2("Bob","York Street", 495834);
	System.out.println("Hello " + bud.getName());
}
}