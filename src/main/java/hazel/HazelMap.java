package hazel;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelMap {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        IMap<String, String> map = hz.getMap("my-distributed-map");
        map.put("key", "value");
        System.out.println("Value for 'key': " + map.get("key"));
        map.putIfAbsent("key", "value");	
        map.replace("key", "value", "newvalue");
        hz.shutdown();
    }
}
