package com.revature.models;

public class locker {
	
	private int num;
	private boolean open = false;
	
	public locker() {
		
	}
	
	
	public locker(int num, boolean open) {
		super();
		this.num = num;
		this.open = open;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	
	

}
