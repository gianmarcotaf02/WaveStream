package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface IOptionsObserver {
    void setDist(java.lang.String str);

    void setEnvironment(java.lang.String str);

    void setProguardUuid(java.lang.String str);

    void setRelease(java.lang.String str);

    void setReplayErrorSampleRate(java.lang.Double d4);

    void setSdkVersion(io.sentry.protocol.SdkVersion sdkVersion);

    void setTags(java.util.Map<java.lang.String, java.lang.String> map);
}
