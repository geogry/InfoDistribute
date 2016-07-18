package com.geogry.utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LengthLimit extends PlainDocument {

	private int limit = 0;
	
	public LengthLimit(int limit){
		super();
		this.limit = limit;
	}
	
	@Override
	public void insertString(int offset, String str, AttributeSet attr)
			throws BadLocationException {
		if(str == null)
			return;
		if((getLength() + str.length()) <= limit){
			super.insertString(offset, str, attr);
		}
	}

}
