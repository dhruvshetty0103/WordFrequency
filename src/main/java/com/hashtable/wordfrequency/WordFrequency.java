package com.hashtable.wordfrequency;

import java.util.Hashtable;
import java.util.Map.Entry;

public class WordFrequency 
{
	/* Hash table to store the key and value pair where key's
	 * are the different words in sentence and paragraph and 
	 * values to store the count it's frequency
	 */
	private Hashtable<String, Integer> table = new Hashtable<String, Integer>();

	public void add(String words)
	{
		String[] splited = words.split(" ");
		for (String count : splited) 
		{
			if(table.containsKey("avoidable"))
				table.remove("avoidable");//deleting word avoidable from the paragraph
			else if(table.containsKey(count)) 
			{
				table.put(count, table.get(count) + 1);
			}
			else 
			{
				table.put(count, 1);
			}
		}
	}
	/* Iterating through the HashMap set 
	 */
	public void show() 
	{	
		for (Entry<String, Integer> entry : table.entrySet()) 
		{
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

	public static void main(String[] args) 
	{
		WordFrequency abc = new WordFrequency();
		abc.add("Paranoids are not paranoid because they are paranoid but because they keep putting themselves"
				+ " deliberately into paranoid avoidable situations");
		abc.show();
	}
}