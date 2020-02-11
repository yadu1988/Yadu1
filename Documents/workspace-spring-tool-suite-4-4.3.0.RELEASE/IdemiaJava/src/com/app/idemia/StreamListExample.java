package com.app.idemia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamListExample {
	
	
	
	
	
	public static void main(String[] args) {
		
		
	 List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	 
	 
	 System.out.println("Normal List============================");
	 
	 System.out.println(list);
	 
	 List< Integer> squareList= list.stream().map(i ->i*2).collect(Collectors.toList());
	 
	 System.out.println("Square List============================");
	 System.out.println(squareList);
	 
	 List<Integer> evenList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	 System.out.println("Even List============================");
	 System.out.println(evenList);
	 
	 List<Integer> oddList=list.stream().filter(i->i%2==1).collect(Collectors.toList());
	 System.out.println("Odd List============================");
	 System.out.println(oddList);
	 
	 
	 
	 List<Person> listPerson= new ArrayList<Person>();
	 
	 listPerson.add(new Person(1,"ram",18));
	 listPerson.add(new Person(2,"kumar",30));
	 listPerson.add(new Person(3,"verma",25));
	 listPerson.add(new Person(4,"sharna",24));
	 listPerson.add(new Person(6,"Amit",19));
	 
	 
	 System.out.println("PERSON NORMAL List============================");
	 System.out.println(listPerson);
	 
	 
	 listPerson.sort((Person s1, Person s2)->s1.getAge()-s2.getAge()); 
	 
	 System.out.println("PERSON Sorted List============================");
	 System.out.println(listPerson);
	 
	 
	 List<Person> ageList= listPerson.stream().filter(str->str.getAge()>20).collect(Collectors.toList());
	 
	 System.out.println("PERSON Sorted List which age is Greater than 20============================");
	 
	 System.out.println(ageList);
	 
	 
	 
	 List<String> listString=Arrays.asList("john","smiTh","MARRY","piotr","Simon","raHul", "daniaL");
	 
	 
	 List<String> upperList=listString.stream().map(String::toUpperCase).collect(Collectors.toList());
	 
     System.out.println("List of String in upper case============================");
	 
	 System.out.println(upperList);
	 
	 
	 //String str = "john","smiTh","MARRY","piotr","Simon","raHul", "daniaL";
	 //String str= "welcome to java";
	// uppercase first letter of each word
	//String output = Arrays.stream(str.split("\\s+"))
	  //      .map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
	    //    .collect(Collectors.joining(" "));
	// print the string
	//System.out.println(output);
	// Welcome To Java


	
	List<String> lisstString=Arrays.asList("john","smiTh","MARRY","piotr","Simon","raHul", "daniaL");
	 
	 List<String> lowerList=listString.stream().map(String::toLowerCase).collect(Collectors.toList());
	 
	 System.out.println("List of String in Lower case============================");
	 
	 System.out.println(lowerList);
	 
	 
	 // First Letter should be in Upper Case and other Letter should be in small Letter
     List<String> newTitleList=lowerList.stream().map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
     .collect(Collectors.toList());
     
     
     System.out.println("List of String in Titlecase============================");
     
     System.out.println(newTitleList);
	
	
	//List<String> ssList=Arrays.asList("john","smiTh","MARRY","piotr","Simon","raHul", "daniaL");
	//String[]  strTest =  { "john","smiTh","MARRY","piotr","Simon","raHul", "daniaL"};
	//String toLower= strTest.stream().map(String::toUpperCase).collect(Collectors.toList());
	//String newoutput = Arrays.stream(strTest)
	        //.map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
	        //.collect(Collectors.joining(" "));
	// print the string
	//System.out.println(newoutput);
     
     Stream<Integer> stream = IntStream.range(0, 50).boxed(); 
     
     List<Integer> listRange=stream.filter(i ->i%2==0).collect(Collectors.toList());
     
	 System.out.println("Even Integer with range (0-50) List============================");
	 System.out.println(listRange);
     
     
	 System.out.println("Append Hello to each name List============================");
	 
	 List<String> appendList = Arrays.asList("John", "Sam", "Akash", "Karan","Sourab","Shweta");
     
	 String joinedString = appendList.stream()
	                                 .map(namePart -> namePart)
	                                 .collect(Collectors.joining(", Hello ", "[ Hello ", "]"));
	  
	 System.out.println(joinedString);
   
	 Set<Person> setPerson= new HashSet<Person>();
	 setPerson.add(new Person(1,"ram",18));
	 setPerson.add(new Person(2,"kumar",30));
	 setPerson.add(new Person(3,"verma",25));
	 setPerson.add(new Person(4,"sharna",24));
	 setPerson.add(new Person(6,"Amit",19)); 
	 System.out.println("PERSON NORMAL Set============================");
	 System.out.println(setPerson);
	 
	 
	 
	 
	 
	 
	 
	 
	
	
		
	}
	
	
	


}
