package com.acme.apps.pos;

public class SimpleDisplay implements Display {
	
	/* (non-Javadoc)
	 * @see com.acme.apps.pos.second.Display#writePrice(java.lang.String)
	 */
	@Override
	public void write(String line) {
		System.out.println(line);
	}
}
