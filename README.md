# calctests

Simple project of functional tests for: http://www.calculator.net/conversion-calculator.html

## Instaling
```
git clone https://github.com/thiefik/calctests.git
```

## Running
To run all tests on Windows you need to triger task 'test' from gradle. 
```
gradlew.bat test
```
On Linux
```
./gradlew -Dwebdriver.chrome.driver=drivers/chromedriver test
```
Results are located in:
```
build/reports/tests/test/index.html
```

## Used technologies
* Groovy
* Gradle
* Spock
* Geb
* Chromedriver

## Author
Paweł Bogdanowicz [thiefik](https://github.com/thiefik)
