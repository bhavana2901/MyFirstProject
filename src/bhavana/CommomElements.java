package bhavana;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommomElements {

		// TODO Auto-generated method stub
	    private static void FindCommonElemet(String[] arr1,
                String[] arr2)
{
Set<String> set = new HashSet<>();
for (int i = 0; i < arr1.length; i++) {
for (int j = 0; j < arr2.length; j++) {
if (arr1[i] == arr2[j]) {

// add common elements
set.add(arr1[i]);
break;
}
}
}
for (String i : set) {
System.out.print(i + " ");
}
}


public static void main(String[] args)
{


String[] arr1
= { "Hai", "hello", "How", "Are", "You" };

String[] arr2 = { "Wow", "Hai", "You" };


System.out.println("Array 1: "
                   + Arrays.toString(arr1));


System.out.println("Array 2: "
                   + Arrays.toString(arr2));

System.out.print("Common Elements: ");


FindCommonElemet(arr1, arr2);




	}

}
