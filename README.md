# Dance Studio - Factory Method & Abstract Factory 
## Project Description
This project demonstrates two creational design patterns: factory Method and Abstract Factory Method. 
The system creates dance classes and outfits for two dance styles: Ballet and Hip-Hop.


### Part A - Factory Method
Factory Method is used to create different dance classes. 
Each concrete factory creates its own dance class through the common IDanceClassFactory interface.

### Part B - Abstract Factory 
Abstract Factory is used to create families of related products.
BalletStudioFactory creates BalletClass and BalletOutfit.
HipHopStudioFactory creates HipHopClass and HipHopOutfit.
The client works with interfaces instead of creating concrete products directly. 

## Clean Code Principles
### 1. Meaningful Names
Classes and methods have clear names that describe their purpose. 
Example:
```java
IDanceClass danceClass = factory.createDanceClass();
IDanceOutfit danceOutfit = factory.createDanceOutfit();
```
The method names clearly describe which products they create.

### 2. Single Responsibility Principle 
Each class has one main responsibility.
Example:
```java
public class BalletClassFactory implements IDanceClassFactory{
    public IDanceClass createDanceClass(){
        return new BalletClass();
    }
}
```
BalletClassFactory is responsible for creating ballet classes. 
It does not create other types of products. 

### 3. Small Methods
Methods are short and perform one specific task.
Example:
```java
public IDanceOutfit createDanceOutfit(){
        return new BalletOutfit();
    }
```
This method only creates and returns a ballet outfit. 

### 4. Consistent Formatting 
All concrete factories follow the same code structure. 
Example:
```java 
public IDanceClass createDanceClass(){
        return new BalletClass();
    }
public IDanceOutfit createDanceOutfit(){
        return new BalletOutfit();
    }
```
Consistent indentation, method names, and formatting make the code easier to read and maintain.

### 5. Programming to Interfaces
The client uses interfaces instead of depending directly on concrete product classes. 
Example:
```java
private static void runDanceStudio(IDanceStudioFactory factory){
        IDanceClass danceClass = factory.createDanceClass();
        IDanceOutfit danceOutfit = factory.createDanceOutfit();
        danceClass.startClass();
        danceOutfit.wearOutfit();
    }
```
The method works with any factory that implements IDanceStudioFactory.
We can add new dance styles without changing this method. 

