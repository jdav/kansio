package com.malleamus.kansio.information;

import java.util.Iterator;
import java.util.ListIterator;

import com.malleamus.kansio.dossier.History;
import com.malleamus.kansio.visualization.Visualizable;

public interface Information<T extends Item> extends Visualizable {
	
	public boolean add(T t);
	public void add(int index, T t);
	public boolean addAll(Information<T> information);
	public boolean addAll(int index, Information<T> information);
	public void clear();
	public boolean contains(T t);
	public boolean containsAll(Information<T> information);
	public boolean equals(T t);
	public Event get(int index);
	public int indexOf(T t);
	public boolean isEmpty();
	public Iterator<T> iterator();
	public int lastIndexOf(T t);
	public ListIterator<Event> listIterator();
	public ListIterator<Event> listIterator(int index);
	public Event remove(int index);
	public boolean remove(T t);
	public boolean removeAll(Information<T> information);
	public boolean retainAll(Information<T> information);
	public Event set(int index, T t);
	public int size();
	public History subList(int fromIndex, int toIndex);
	
}
