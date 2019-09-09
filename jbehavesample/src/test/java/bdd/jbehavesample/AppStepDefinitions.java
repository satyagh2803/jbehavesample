package bdd.jbehavesample;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Unit test for simple App.
 */
public class AppStepDefinitions 
{
	int a; int b; int sum;
	@Given(value = "I have two numbers <value1> and <value2>")
	public void method1(@Named("value1") int value1,@Named("value2") int value2){
		a = value1;
		b = value2;
	}
	@When(value = "I add these numbers")
	public void method2(){
		sum = a+b;
	}
	@Then(value = "The total should be <sum>")
	public void method3(@Named("sum") int sumFromStory){
		if(sum==sumFromStory) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}

}
