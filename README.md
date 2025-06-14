# Karofi App - Mobile Automation Testing

This project automates UI tests for the **Karofi mobile application** using **Appium**, **Java**, **BDD Cucumber**, and **Page Object Model** design pattern.

---

## ✅ Prerequisites

Before running the project, ensure you have the following installed:

- Java 11 or higher
- Maven
- Node.js (for Appium)
- Appium (installed globally)
- Android Studio or Android SDK
- Git

---

## 📱 Device Setup

1. **Connect your Android device to your PC/Mac** via USB.
2. **Enable Developer Mode** on the device:
   - Go to `Settings` → `About phone` → tap `Build number` 7 times.
3. **Enable USB Debugging**:
   - Go to `Settings` → `Developer options` → enable `USB Debugging`.
4. **Allow access on your device** when prompted.

---

## 🌐 Verify Device Connection

Run the following command in your terminal to check if the device is recognized: 
```bash
adb devices
```
## 🌏 Set Device Language to Vietnamese
Make sure your Android device is set to Vietnamese (Tiếng Việt) for accurate test execution:
Go to `Settings` → `System` → `Languages & input` → `Select Languages` → Add or move Tiếng Việt to the top of the list

## 🔧 Appium Setup
Ensure Appium is installed and running on your machine:

1. Install Appium (if not installed)
2. Start Appium server:
```bash
appium
```
The default server URL is http://localhost:4723. Make sure this is running before starting tests.

## ⚙️ Update Device UDID
In AppiumBase.jav), update the device UDID:
```bash
.setUdid("YOUR_DEVICE_UDID_HERE") // Example: "R5CX62RY7CW"
```
## How to Run
1. Clone this repo
2. Run the test using Maven 
```bash
.mvn clean test
```
## Test Structure
````` 
src
├── main
│ ├── java
│ │ └── huyenltt20
│ │ ├── core/
│ │ │ └── AppiumBase.java # Base setup for Appium
│ │ ├── options/
│ │ │ └── CucumberRunner.java # Cucumber test runner
│ │ ├── pages/
│ │ └── stepDef/
│ └── resources
````` 
