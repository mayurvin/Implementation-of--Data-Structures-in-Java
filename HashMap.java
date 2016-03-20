import java.util.*;

public class HashMap<K, V> {
	private int size;
	private int DEFAULT_CAPACITY = 16;
	
	private MapEntry<K, V>[] table;
	HashMap(){
		table = new MapEntry[DEFAULT_CAPACITY];
	}
	public void put(K key, V value){
		boolean insert = false;
		MapEntry<K, V> newEntry = new MapEntry<K, V>(key, value);
		if(table[(int) key].equals(null)){
			//chkCapacity();
			table[size] = new MapEntry<K, V>(key, value);
		}
		else{
			MapEntry current = table[(int) key];
			while(current.next != null){
				if(current.getKey().equals(newEntry.getKey())){
					current.setValue(newEntry.getValue());
					insert = true;
					break;
				}
				else{
					current = current.next;
				}
			}
			if(!insert){
				
			}
		}
	}
	
}
