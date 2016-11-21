# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/Apple/Library/Android/sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

#
#For Otto
#http://square.github.io/otto/
-keepattributes *Annotation*
-keepclassmembers class ** {
    @com.squareup.otto.Subscribe public *;
    @com.squareup.otto.Produce public *;
}

#
#For retrofit 2
#https://github.com/krschultz/android-proguard-snippets/blob/master/libraries/proguard-square-retrofit2.pro
-dontwarn retrofit2.**
-keep class retrofit2.** { *; }
-keepattributes Signature
-keepattributes Exceptions

-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
}

#
#For picasso
#https://github.com/square/picasso
-dontwarn com.squareup.okhttp.**

#
#
#