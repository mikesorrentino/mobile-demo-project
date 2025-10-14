# Sample project for Appium + Spring Boot + Cucumber

First install APPIUM SERVER and set the IP and PORT to match the same in the property:
 ```
appium.server.url=http://127.0.0.1:4723 
```

### How to get your device name:

 In a terminal run:
 ```
 adb devices
 ```

### How to get your app package
 In a terminal run:

UNIX/LINUX
 ```
 aapt dump badging <path_to_your_apk_file> | grep package
 ```
WINDOWS
 ```
 aapt dump badging <path_to_your_apk_file> | findstr "package"
 ```

### How to run:
 1. Retrieve the App you want to install and put it in the ```src/main/resources/apk``` folder
 2. Change the variables in the ```application.properties``` 
    ```
    device.name=<your_device_name>
    platform.version=<your_platform_version>
    app.path=apk/<apk_name>
    app.package=<your_app_package>
    ```

## Author
- [@filipetgomes](https://github.com/filipetgomes)