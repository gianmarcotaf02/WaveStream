// JNI bridge tra WaveStream e whisper.cpp
// Espone: init da file, trascrizione con lingua configurabile, lettura segmenti.
#include <jni.h>
#include <android/log.h>
#include <string.h>
#include "whisper.h"

#define TAG "WaveStreamWhisper"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, TAG, __VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN, TAG, __VA_ARGS__)

extern "C" {

JNIEXPORT jlong JNICALL
Java_it_wavestream_app_voice_WhisperLib_initContext(
        JNIEnv *env, jobject thiz, jstring model_path_str) {
    UNUSED(thiz);
    const char *model_path = (*env)->GetStringUTFChars(env, model_path_str, NULL);
    LOGI("Loading model from %s", model_path);
    struct whisper_context *context = whisper_init_from_file_with_params(
            model_path, whisper_context_default_params());
    (*env)->ReleaseStringUTFChars(env, model_path_str, model_path);
    if (context == NULL) {
        LOGW("Failed to load model");
        return 0;
    }
    return (jlong) context;
}

JNIEXPORT void JNICALL
Java_it_wavestream_app_voice_WhisperLib_freeContext(
        JNIEnv *env, jobject thiz, jlong context_ptr) {
    UNUSED(env); UNUSED(thiz);
    if (context_ptr != 0) {
        whisper_free((struct whisper_context *) context_ptr);
    }
}

JNIEXPORT void JNICALL
Java_it_wavestream_app_voice_WhisperLib_fullTranscribe(
        JNIEnv *env, jobject thiz, jlong context_ptr, jint num_threads,
        jfloatArray audio_data, jstring language_str) {
    UNUSED(env); UNUSED(thiz);
    struct whisper_context *context = (struct whisper_context *) context_ptr;
    if (context == NULL) return;

    jfloat *audio = (*env)->GetFloatArrayElements(env, audio_data, NULL);
    const jsize audio_length = (*env)->GetArrayLength(env, audio_data);
    const char *language = (*env)->GetStringUTFChars(env, language_str, "it");

    struct whisper_full_params params = whisper_full_default_params(WHISPER_SAMPLING_GREEDY);
    params.print_realtime = false;
    params.print_progress = false;
    params.print_timestamps = false;
    params.print_special = false;
    params.translate = false;
    params.language = language;
    params.n_threads = num_threads;
    params.offset_ms = 0;
    params.no_context = true;
    params.single_segment = false;
    params.temperature_inc = 0.4f;
    params.greedy.best_of = 1;
    params.suppress_blank = true;

    whisper_reset_timings(context);
    if (whisper_full(context, params, audio, audio_length) != 0) {
        LOGW("whisper_full failed");
    }

    (*env)->ReleaseStringUTFChars(env, language_str, language);
    (*env)->ReleaseFloatArrayElements(env, audio_data, audio, JNI_ABORT);
}

JNIEXPORT jint JNICALL
Java_it_wavestream_app_voice_WhisperLib_getTextSegmentCount(
        JNIEnv *env, jobject thiz, jlong context_ptr) {
    UNUSED(env); UNUSED(thiz);
    struct whisper_context *context = (struct whisper_context *) context_ptr;
    if (context == NULL) return 0;
    return whisper_full_n_segments(context);
}

JNIEXPORT jstring JNICALL
Java_it_wavestream_app_voice_WhisperLib_getTextSegment(
        JNIEnv *env, jobject thiz, jlong context_ptr, jint index) {
    UNUSED(thiz);
    struct whisper_context *context = (struct whisper_context *) context_ptr;
    if (context == NULL) return (*env)->NewStringUTF(env, "");
    const char *text = whisper_full_get_segment_text(context, index);
    return (*env)->NewStringUTF(env, text);
}

JNIEXPORT jstring JNICALL
Java_it_wavestream_app_voice_WhisperLib_systemInfo(JNIEnv *env, jobject thiz) {
    UNUSED(thiz);
    return (*env)->NewStringUTF(env, whisper_print_system_info());
}

} // extern "C"
