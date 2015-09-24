//cheese its

import java.util.*;

public class AddressBook2 {
	
	private List<buddyinfo2> contacts;

	public AddressBook2(){
		contacts = new ArrayList<buddyinfo2>();
	}

	public void addContact(buddyinfo2 buddy){
		contacts.add(buddy);
	}

	public buddyinfo2 removeBuddy(int index){
		if(index >= 0 && index < this.contacts.size()){
			return contacts.remove(index);
		}
		return null;
	}
	
	public static void main(String aargs[]){
		buddyinfo2 buddy = new buddyinfo2("Tom", "carleton", 123412);
		buddyinfo2 buddy2 = new buddyinfo2("Jack", "carleton", 16512);
		AddressBook2 addressBook = new AddressBook2();
		addressBook.addContact(buddy);
		addressBook.addContact(buddy2);
		addressBook.removeBuddy(0);
		
	}
	

}
