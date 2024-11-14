package mmm;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class test1 {
//@Test
public void regular()
{
  ArrayList<String> ab=new ArrayList<String>();
ab.add("abc");
ab.add("cde");
ab.add("absg");
ab.add("efu");
ab.add("avf");
int count=0;
for(int i=0;i<ab.size();i++)
{
	String cd=ab.get(i);
	if(cd.startsWith("a"))
	{
		System.out.println(cd);
		count++;
	}
	
}
System.out.println(count);
}

//	@Test
	public void streamfilter() {

		 ArrayList<String> ac=new ArrayList<String>();
		 ac.add("abc");
		 ac.add("cde");
		 ac.add("absg");
		 ac.add("efu");
		 ac.add("avf");
		Long c=ac.stream().filter(s->s.startsWith("a")).count();
		 System.out.println(c);
		 ac.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
	}
	@Test
public void streammap() {
	
		 ArrayList<String> ac=new ArrayList<String>();
		 ac.add("bbc");
		 ac.add("bbc");
		 ac.add("absg");
		 ac.add("efu");
		 ac.add("avc");
		// ac.stream().filter(s->s.endsWith("c")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		 //ac.stream().filter(s->s.endsWith("c")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		 ac.stream().distinct().forEach(s->System.out.println(s));
		 ac.stream().sorted().forEach(s->System.out.println(s));
}
}
