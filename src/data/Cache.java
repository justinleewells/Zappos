package data;

import java.util.HashMap;

public class Cache {
	public HashMap<Integer, CacheEntry> map = new HashMap<Integer, CacheEntry>();
	
	public Cache() {
	}
	
	public boolean check(int key) {
		return map.containsKey(key);
	}
	
	public CacheEntry getCacheEntry(int key) {
		return (CacheEntry)map.get(key);
	}
	
	public void addCacheEntry(int key, CacheEntry cache) {
		map.put(key, cache);
	}
}
