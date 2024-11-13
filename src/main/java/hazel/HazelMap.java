package hazel;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelMap {
    public static void main(String[] args) {
    	// client config for existing hazelcast instance (should be run externally)
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getNetworkConfig().addAddress("127.0.0.1:5701"); // localhost for testing

    	// initializing Hazelcast instance
        HazelcastInstance hz = HazelcastClient.newHazelcastClient(clientConfig);
        
        // getting (or making) the map
        IMap<String, Person> map = hz.getMap("my-distributed-map");
        
        // looping through 10,000 randomly generated person objects
        for (int i = 0; i < 10000; i++) {
        	
        	// adding to Hazelcast map
        	int age = 1 + (int)(Math.random() * 100); // generating random age
        	Person person = new Person("Person " + i, age);
        	map.put("person-" + i, person); // adding to Hazelcast Map
        	System.out.println(i + ". Added: " + person);
        	
        }
        for (int i = 0; i < 10; i++) {
        	// looping through first 10 persons from the map
        	System.out.println(map.get("person-" + i));
        }
        System.out.println("Value for 'person-20': " + map.get("person-20"));
        hz.shutdown();
    }
}
