package com.class29;

public abstract class File {
public void edit() {
	System.out.println("It will work as editor");
}
public void close() {
	System.out.println("It will work as closer");
}
public abstract void open();
}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("it need notepad or sublime to the files");
		
	}

	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println(".doc ");
		
	}
	 
}
class PDFFile{
	public void open() {
		System.out.println("need PFD user to be opened");
	}
}