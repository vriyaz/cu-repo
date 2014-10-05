package com.cu.dp.behavioral.iterator;

public class NameRepository implements Container {
	public String names[] = {"Gryffindor", "Hufflepuff", "Slytherin", "Ravenclaw"};
	
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
		int index;
		
		public boolean hasNext() {
			return (index < names.length);
		}

		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}

}
