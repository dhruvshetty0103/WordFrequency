package com.hashtable.wordfrequency;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class WordFrequency 
{
	private Hashtable<String, Integer> table = new Hashtable<String, Integer>();

	public void add(String words)
	{
		String[] splited = words.split(" ");
		Set<String> keys = table.keySet();
		for (String count : splited) 
		{
			 if (table.containsKey(count)) {
			        table.put(count, table.get(count) + 1);
			    } else {
			        table.put(count, 1);
			    }
		}
	}

	public void show() {
		for (Entry<String, Integer> entry : table.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

	public static void main(String[] args) {
		WordFrequency abc = new WordFrequency();
		abc.add("To be or not to be");
		abc.show();
	}
}