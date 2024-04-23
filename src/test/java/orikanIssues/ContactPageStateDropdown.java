package orikanIssues;


import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import components.BaseTest;

public class ContactPageStateDropdown {

	@Test
	public void ContactPageDropdown() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		
		bt.registration("dinesh@orikan", "dinesh", "dinesh");
	
		bt.contactPage("Dinesh", "", "119", "sadsff123", "Hyderabad", "Queensland");
		
		WebElement dropdown = driver.findElement(By.cssSelector("[formcontrolname='state']"));

        // Get all options within the dropdown
        List<WebElement> options = dropdown.findElements(By.tagName("option"));

        // Validate uniqueness of states
        Set<String> states = new HashSet<>();
        boolean hasDuplicates = false;
        for (WebElement option : options) {
            String state = option.getText().trim();
            if (!states.add(state)) { // If the state is already in the set, it's a duplicate
                System.out.println("Duplicate state found: " + state);
                hasDuplicates = true;
	}

        }
	}
}
