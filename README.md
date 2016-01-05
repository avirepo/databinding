# databinding

DataBinding is to bind a object model to UI element. As in classic approach we usually set the data on view by finding their reference in activity or fragment and then set data on UI element from the business model.
Databinding introduces a clean code writing approach which allow user to bind a viewmodel to the UI element.
It is basically implementation of MVVM(Model View ViewModel) design pattern.


Usage
---------------
This library is a sample app of data binding using simple features.

To use the feture of databinding first we have added dependency in project gradle file
```
dependencies {
        classpath 'com.android.tools.build:gradle:1.5.0'
        classpath 'com.android.databinding:dataBinder:1.0-rc4'
    }
```


```xml
apply plugin: 'com.android.application'
apply plugin: 'com.android.databinding'
android {
    compileSdkVersion 23
    buildToolsVersion "23.0.2"

    defaultConfig {
     ….
    }
}
```

License
-------

    Copyright 2015 Vikas Goyal.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.





