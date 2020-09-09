package com.class28;

class Room extends Building{
int roomNumber; // roon muber is equal to 101
Room(String address, int floor, int roomnumber){
	super(address, floor);
	this.roomNumber=roomNumber;
}
public void print() {
	System.out.println(address+" "+floor);
}
public static void main(String[] args) {
	Room room=new Room("121 test drive",10, 101);
	//System.out.println(room.floor);
	room.print();
}
}
