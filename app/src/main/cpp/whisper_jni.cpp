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
    (void) thiz;
    const char *model_path = env->GetStringUTFChars(model_path_str, nullptr);
    LOGI("Loading model from %s", model_path);
    struct whisper_context *context = whisper_init_from_file_with_params(
            model_path, whisper_context_default_params());
    env->ReleaseStringUTFChars(model_path_str, model_path);
    if (context == nullptr) {
        LOGW("Failed to load model");
        return 0;
    }
    return (jlong) context;
}

JNIEXPORT void JNICALL
Java_it_wavestream_app_voice_WhisperLib_freeContext(
        JNIEnv *env, jobject thiz, jlong context_ptr) {
    (void) env; (void) thiz;
    if (context_ptr != 0) {
        whisper_free((struct whisper_context *) context_ptr);
    }
}

JNIEXPORT void JNICALL
Java_it_wavestream_app_voice_WhisperLib_fullTranscribe(
        JNIEnv *env, jobject thiz, jlong context_ptr, jint num_threads,
        jfloatArray audio_data, jstring language_str) {
    (void) thiz;
    struct whisper_context *context = (struct whisper_context *) context_ptr;
    if (context == nullptr) return;

    jfloat *audio = env->GetFloatArrayElements(audio_data, nullptr);
    const jsize audio_length = env->GetArrayLength(audio_data);
    const char *language = env->GetStringUTFChars(language_str, "it");

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

    env->ReleaseStringUTFChars(language_str, language);
    env->ReleaseFloatArrayElements(audio_data, audio, JNI_ABORT);
}

JNIEXPORT jint JNICALL
Java_it_wavestream_app_voice_WhisperLib_getTextSegmentCount(
        JNIEnv *env, jobject thiz, jlong context_ptr) {
    (void) env; (void) thiz;
    struct whisper_context *context = (struct whisper_context *) context_ptr;
    if (context == nullptr) return 0;
    return whisper_full_n_segments(context);
}

JNIEXPORT jstring JNICALL
Java_it_wavestream_app_voice_WhisperLib_getTextSegment(
        JNIEnv *env, jobject thiz, jlong context_ptr, jint index) {
    (void) thiz;
    struct whisper_context *context = (struct whisper_context *) context_ptr;
    if (context == nullptr) return env->NewStringUTF("");
    const char *text = whisper_full_get_segment_text(context, index);
    return env->NewStringUTF(text);
}

JNIEXPORT jstring JNICALL
Java_it_wavestream_app_voice_WhisperLib_systemInfo(JNIEnv *env, jobject thiz) {
    (void) thiz;
    return env->NewStringUTF(whisper_print_system_info());
}

} // extern "C"
