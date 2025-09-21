# 📘 Selenium with Java – Beginners Tutorial

Welcome to the **Selenium with Java Beginners Tutorial** repository! 🚀
This repo contains all the code examples and resources used in my [https://www.youtube.com/playlist?list=PLU-gf_aqj7RKDY6yWbVl9G12zWHH2_uip](https://www.youtube.com/playlist?list=PLU-gf_aqj7RKDY6yWbVl9G12zWHH2_uip) on Selenium with Java for automation testing.

---

## 📌 About This Repository

This project is designed for **beginners** who want to learn Selenium step by step using Java.
We’ll start from the basics (first script) and gradually move toward advanced concepts and real-life projects.

---

## 📂 Project Structure

```
automation/
│
├── pom.xml                # Maven dependencies for Selenium 
├── src/
│   └── main/java/
│       └── App.java # First Selenium test script
│
└── README.md              # Project documentation
```

---

## 🛠️ Prerequisites

Before running the code, make sure you have the following installed:

* [Java JDK 11+](https://www.oracle.com/java/technologies/javase-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [Chrome Browser](https://www.google.com/chrome/)
* [ChromeDriver](https://chromedriver.chromium.org/downloads) (must match your Chrome version)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse IDE](https://www.eclipse.org/)

---

## 📦 Maven Dependencies

Add the following to your **pom.xml** for Selenium:

```xml
<dependencies>
    <!-- Selenium Java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.35.0</version>
    </dependency>
</dependencies>
```

---

## ▶️ Running the First Test

Example code:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Title is: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
```

**Steps to run:**

1. Clone this repository

   ```bash
   git clone https://github.com/amit83pandey/automation.git
   cd automation
   ```
2. Open the project in **IntelliJ/Eclipse**.
3. Run the `App.java` file.
4. Browser will open, navigate to Google, print the title, and close. 🎉

---

## 🎯 What You’ll Learn in This Series

* Introduction to Automation & Selenium
* Locators (ID, Name, XPath, CSS, etc.)
* Handling elements: buttons, inputs, dropdowns, checkboxes
* Waits (implicit & explicit)
* Alerts, frames, multiple windows
* TestNG integration
* Real-life project automation

---

## 📽️ YouTube Playlist

👉 Watch the full video series here: [https://www.youtube.com/playlist?list=PLU-gf_aqj7RKDY6yWbVl9G12zWHH2_uip](https://www.youtube.com/playlist?list=PLU-gf_aqj7RKDY6yWbVl9G12zWHH2_uip)

---

## 🤝 Contributing

Found a bug or want to add more examples?
Feel free to fork the repo, raise an issue, or create a pull request. Contributions are welcome!

