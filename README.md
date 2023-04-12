
## Documentation

[Documentation](https://www.selenium.dev/)


## Selenium
Selenium is one of the most widely used open source Web UI (User Interface) automation testing suite.

It was originally developed by Jason Huggins in 2004 as an internal tool at Thought Works. 

Selenium supports automation across different browsers, platforms and programming languages.

Selenium automates browsers. That's it! 

What you do with that power is entirely up to you 

Primarily it is for automating web applications for testing purposes, but is certainly not limited to just that 

Boring web-based administration tasks can (and should) also be automated as well 


## Driver Initilization

WebDriver driver = new ChromeDriver();<br>
WebDriver driver = new FirefoxDriver();<br>
WebDriver driver = new InternetExplorerDriver();<br>
WebDriver driver = new EdgeDriver();<br>
WebDriver driver = new SafariDriver();<br>
WebDriver driver = new HtmlUnitDriver();<br>

## Element Locators

driver.findElement(By.id("Id Value"));<br>
driver.findElement(By.name("Name Value"));<br>
driver.findElement(By.className("Class Name Value"));<br>
driver.findElement(By.linkText("Link text Value"));<br>
driver.findElement(By.partialLinkText("Partial Text Constant Value"));<br>
driver.findElement(By.tagName("Tag Name Value"));<br>
driver.findElement(By.cssSelector("CSS Value"));<br>
driver.findElement(By.xpath("Xpath Value"));<br>
driver.findElement(with(By.tagName("input")).above(passwordField));<br>
driver.findElement(with(By.tagName("input")).below(emailAddressField));<br>
driver.findElement(with(By.tagName("button")).toLeftOf(submitButton));<br>
driver.findElement(with(By.tagName("button")).toRightOf(submitButton));<br>
driver.findElement(with(By.tagName("input")).near(emailAddressLabel));<br>
driver.findElement(new ByAll(By.className("ElementClassName"),By.id("Element Id"), By.name("Element Name")))<br>

## Elements Operations

WebElement element =driver.FindElement(By.ElementLocator("Value of Element Locator"));<br>
element.click();<br>
element.sendKeys("Input Text");<br>
element.clear();<br>
element.submit();<br>
element.getAttribute(“type”);<br>
String innerText = element.getText();<br>
boolean enabledstatus = element.isEnabled();<br>
boolean displayedstatus = element.isDisplayed();<br>
boolean selectedstatus = element.isSelected();<br>

## Operation on drop down
Select select = new Select(element);<br><br>
select.selectByIndex(Integer Index);<br>
select.selectByVisibleText("Text");<br>
select.SelectByValue("Value");<br>
select.deselectAll();<br>
select.deselectByIndex(Integer Index);<br>
select.deselectByVisibleText("Text");<br>
select.deselectByValue("Value");<br><br>
WebElement selectedOptions = select.getOptions();<br>

## Browser Operations
String pageTitle = driver.getTitle();<br>
String currentURL = getCurrentUrl();<br>
String currentPageSource = driver.getPageSource();<br>

## Navigation history
driver.get("https://www.facebook.com/");<br>
driver.manage().window().maximize();<br>
driver.manage().window().fullscreen();<br>  
driver.navigate().to("https://www.google.com/");<br>
driver.navigate().back();<br>
driver.navigate().forward();<br>
driver.navigate().refresh();<br>
driver.close();<br>
driver.quit();<br>

## Handle Alert
Alert alert = driver.switchTo().alert();<br>
alert.accept();<br>
alert.dismiss();<br>
alert.getText();<br>
alert.sendKeys(“Input Data");<br>
## Handle Cookies
Cookie cookie = new Cookie(“cookieName”, “cookieValue”);<br>
driver.manage().addCookie(cookie);<br>
driver.manage().getCookies();<br>
driver.manage().getCookieNamed(arg0);<br>
driver.manage().deleteAllCookies();<br>
driver.manage().deleteCookieNamed(arg0);<br>
## Handle frames
driver.switchTo().frame(int Frame Index);<br><br>
driver.switchTo().frame("frameName");<br>
WebElement element =driver.FindElement(By.ElementLocator("Value of Element Locator"));<br>
driver.switchTo().frame(element);<br>
driver.SwitchTo().defaultContent();<br>
## Screenshots Capture
TakesScreenshot screenshot =((TakesScreenshot)driver);<br><br>
File srcFile= screenshot.getScreenshotAs(OutputType.FILE);<br>
FileHandler.copy(srcFile, destFile);<br>

## Actions Class/Mouse Event
Actions action = new Actions(driver);<br>
action.keyDown(Keys.CONTROL);<br>
action.keyUp(Keys.CONTROL);<br>
action.clickAndHold(webElement).build().perform();<br>
action.doubleClick(webElement).build().perform();<br>
action.moveToElement(webElement).build().perform();<br>
action.moveByOffset(xOffset,yOffset).build().perform();<br>
action.dragAndDrop(sourceEle,targetEle).build().perform();<br>
action.release().build().perform();<br>
## Manage Timeouts
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);<br>
welement = wait.until(Syntax: WebDriverWait wait = new WebDriverWait(driver, timeout);<br>
ExpectedConditions.elementToBeClickable(locator));<br><br>
welement.click();<br>
driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);<br>
## Upload a File
WebElement element =driver.FindElement(By.ElementLocator("Value of ElementLocator"));<br>
element.sendKeys(filePath);<br>
## Window Handle
String handle=driver.getWindowHandle();<br>
Set<String> handles = getWindowHandles();<br><br>
driver.switchTo().window(handle);<br>
    
##Capture Width and Height of an Element

 Point point = element.getLocation();<br>
int elementWidth = element.getSize().getWidth();<br>
int elementHeight = element.getSize().getHeight();<br>
    
## Scroll Down or Up Web Page
JavascriptExecutor js = (JavascriptExecutor)driver;<br><br>
js.executeScript("window.scrollBy(0,100)");<br>
js.executeScript("window.scrollTo(0,
document.body.scrollHeight)");<br>
WebElement element =driver.FindEle<br>ment(By.ElementLocator("Value of Element Locator"));<br>
js. executeScript("arguments[0].scrollIntoView()", element);<br>



## Authors

[@Dipak Kadam](https://www.linkedin.com/in/dmk07/)


##Selenium


### Table of Contents
You're sections headers will be used to reference location of destination.

- [Description](#description)
- [How To Use](#how-to-use)
- [References](#references)
- [License](#license)
- [Author Info](#author-info)

---

## Description

Selenium is the best automation tool for web testing.
In this project you wil learn from scratch to advanced level of concect which had in selenium.


#### Technologies

- Java
- Selenium WebDriver
- Eclipse(IDE)
- 

[Back To The Top](#read-me-template)

---

## How To Use

#### Installation



#### API Reference

```html
    <p>dummy code</p>
```
[Back To The Top](#read-me-template)

---

## References
[Back To The Top](#read-me-template)

---

## License

MIT License

Copyright (c) [2017] [James Q Quick]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

[Back To The Top](#read-me-template)

---

## Author Info

- Twitter - [@jamesqquick](https://twitter.com/jamesqquick)
- Website - [James Q Quick](https://jamesqquick.com)

[Back To The Top](#read-me-template)
