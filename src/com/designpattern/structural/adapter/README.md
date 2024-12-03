# Adapter pattern.
![Interface Design Pattern Screenshot](../../../../../images/adapter-pattern.png)

### Overview
The adapter pattern is a great structural pattern that is used to connect new code to legacy code
with having the change the pattern of the original legacy code.  You have multiple adapters

### Concepts
- Converter to another interface
- Legacy
- Translate requests
- Client talks to the Adaptee using the adapter


### Examples
- The collections API (List) - specifically Arrays.asList
    - use to convert an array into a List without altering the source array. 
      - the array are originally what you will consider as the legacy pattern
- The streams API - IO Streams

### Design:
- Adapter are client centric in nature
- Integrate new with old