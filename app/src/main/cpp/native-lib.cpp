//
// Created by admin on 2018/4/26.
//
#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_example_weatherdemo_MainActivity_stringFromJNI(JNIEnv *env, jobject){
    std::string hello = "Hello from JNI";
    return env->NewStringUTF(hello.c_str());
}