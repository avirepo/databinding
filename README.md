# databinding

DataBinding is to bind a object model to UI element. As in classic approach we usually set the data on view by finding their reference in activity or fragment and then set data on UI element from the business model.
Databinding introduces a clean code writing approach which allow user to bind a viewmodel to the UI element.
It is basically implementation of MVVM(Model View ViewModel) design pattern.


Get Started with Data Binding
To get started with data binding one should need to follow some steps.
First make entry for dependency  in gradle file using code In project gradle add following lines


dependencies {
        classpath 'com.android.tools.build:gradle:1.5.0'
        classpath 'com.android.databinding:dataBinder:1.0-rc4'
    }
In App main module build.gradle add lines 

apply plugin: 'com.android.application'
apply plugin: 'com.android.databinding'
android {
    compileSdkVersion 23
    buildToolsVersion "23.0.2"

    defaultConfig {
     ….
    }
}



