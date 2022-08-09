package CollectionExample;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ArrayListExample {

	public static void main(String[] args) throws Exception{
		List<String> al=new ArrayList<String>();
		al.add("Prem");
		al.add("Mayank");
		al.add("Dipali");
		al.add("Prashant");
		al.add("Mayank");
		al.add(null);
		al.add("");
		al.add("");

		al.add("");
		al.add("");
		al.add("");

		System.out.println(al);
		/*al.add(0, "Rahul");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.remove("Rahul");
		System.out.println(al);*/
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Set<String>  hs=new HashSet<String>();
		
		hs.add("Prem");
		hs.add("Mayank");
		hs.add("Dipali");
		hs.add("Prashant");
		hs.add("Mayank");
		hs.add(null);
		hs.add("");
		hs.add("");
		hs.add("");
		hs.add("");
		hs.add("");
		
		
		System.out.println(hs);
		Iterator<String> it=hs.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
		
		List<String> ll=new ArrayList<String>(hs);  // Converting HashSet to List
	}

}
