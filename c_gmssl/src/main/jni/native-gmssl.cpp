#include <jni.h>
#include <string>
#include "GmSSL.h"

extern "C"
JNIEXPORT jstring JNICALL
Java_com_dds_gmssl_GmCipher_sm4Encode(JNIEnv *env, jobject thiz, jstring content, jstring key) {

    return key;
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_dds_gmssl_GmCipher_sm4Decode(JNIEnv *env, jobject thiz, jstring content, jstring key) {


    return key;
}