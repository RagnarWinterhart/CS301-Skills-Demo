
# What are 3 examples of problems that are in NP? Please be as descriptive as possible in describing these problems.



## 1 Subset sum
The subset problem asks if a subset of numbers from a given larger collection adds up to a target value. 

This is in NP because finding the combination (the subset) from the set that reaches the target may require considering many different subsets that grow exponentially as the collection gets larger, but  we can tell if a subset sums to the target easily if given a "solution".


## 2 Traveling sales person
The traveling sales person problem involves finding the shortest route that visits every defined city once and returns to the starting city. The decision version of this problem asks if there is a route that visits every city exactly once and returns to the starting city, and has a total distance of 500 miles or less. 

This problem is in NP because if a solution route is provided we can check that it visits each city once and returns to the starting city and then we can caluclate the total distance. 


## 3 Vertex Cover
The Vertex Cover Problem involves a graph with nodes or vertices and edges, and the problem asks if it is possible to select of subset of vertcies that every edge in the graph is is connected to at least one vertex.

It is in NP because finding the smallest combination of vertices that covers every edge is quite difficult, since checking every subset grows exponentially as the size of the graph does. However verifying a solution is straight forward if someone were to claim that a list of vertices solved the problem. 


# What is the difference between universality, computability, and intractability, in your own words.

Universality is about how flexible and general computational system is, especially with its ability to simulate other computational systems.

Computability is about whether a problem can be solved by an algorithm 

Iteractibility is about how difficult or expensive a problem is to solve, rather than whether it can be solved at at all