
public class MapEntry<K, V> {
	private final K key;
	private V value;
	public MapEntry next;
	
	public MapEntry(K key, V value){
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public K getKey(){
		return this.key;
	}
	public V getValue(){
		return this.value;
	}
	public void setValue(V value){
		this.value = value;
	}
}
