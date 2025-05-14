package qsp;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
ArrayList al1=new ArrayList();
al1.add(10);
al1.add(20);
al1.add(30);
al1.add(40);
al1.add(2,50);
System.out.println("Size of first collection:" + al1.size());
System.out.println("Before adding: al1:-");
for (int i=0;i<al1.size();i++)
{
	System.out.println(al1.get(i));
}
ArrayList al2=new ArrayList();
al2.add(60);
al2.add(70);
al1.addAll(al2);

System.out.println("After adding: al1:-"+ al1);

	}

}
