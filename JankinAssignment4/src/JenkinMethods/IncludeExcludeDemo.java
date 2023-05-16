package JenkinMethods;


import org.testng.annotations.Test;

public class IncludeExcludeDemo {

@Test(groups= {"Include Group"})

 public void test_case1() {

System.out.println("This is test case 1");
 }


@Test(groups= {"Exclude Groups"})

 public void test_case3() {
	System.out.println("This is test case 3");
 }

@Test(groups = {"Include Group"})

public void test_case2() {
System.out.println("This is test case 2");
}

@Test(groups= {"Exclude Groups"})

public void test_case4() {

 System.out.println("This is test case 4");


}

}

