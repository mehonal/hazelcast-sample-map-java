# About

This is a basic implementation of Hazelcast in Java.

# How to Run

In order to run the project, you must:
- Run Hazelcast
- Run Hazelcast Management Center (optional)
- Download the repo locally
- Install the Maven dependencies using the pom.xml file
- Run HazelMap.java class

## Running Hazelcast

This implementation ties to an existing running instance of Hazelcast. You may easily run Hazelcast through the docker image using:

```
$ docker pull hazelcast/hazelcast:latest
$ docker run  -d --name hazelcast -p 5701:5701 hazelcast/hazelcast:latest
```

## Running Hazelcast Management Center (optional)

Optionally, you may also run the Hazelcast Management Center to see the impact of your actions through a neat dashboard. Here is an example:

![Hazelcast Management Center](https://raw.githubusercontent.com/mehonal/hazelcast-sample-map-java/refs/heads/master/src/main/resources/screenshots/hazelcast-management-center-map.png)

You may easily run the Hazelcast Management Center using:

```
$ docker pull hazelcast/management-center:latest
$ docker run -d --name hazelcast_management_center -p 8080:8080 hazelcast/management-center:latest
```

# Expected Behaviour

If you have followed the steps correctly, you should have an output that is similar to this:

```
0. Added: Person 0 (aged 54)
1. Added: Person 1 (aged 95)
2. Added: Person 2 (aged 74)
...
...
...
9997. Added: Person 9997 (aged 91)
9998. Added: Person 9998 (aged 98)
9999. Added: Person 9999 (aged 16)
Person 0 (aged 54)
Person 1 (aged 95)
Person 2 (aged 74)
Person 3 (aged 72)
Person 4 (aged 99)
Person 5 (aged 1)
Person 6 (aged 2)
Person 7 (aged 40)
Person 8 (aged 17)
Person 9 (aged 55)
Value for 'person-20': Person 20 (aged 85)
```


