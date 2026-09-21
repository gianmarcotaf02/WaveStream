package io.ktor.client.plugins.logging;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/client/plugins/logging/LogcatLogger;", "Lio/ktor/client/plugins/logging/Logger;", "Ljava/lang/Class;", "logClass", "fallback", "<init>", "(Ljava/lang/Class;Lio/ktor/client/plugins/logging/Logger;)V", "", "message", "Lh6/A;", "log", "(Ljava/lang/String;)V", "Lio/ktor/client/plugins/logging/Logger;", "tag", "Ljava/lang/String;", "Ljava/lang/reflect/Method;", io.sentry.protocol.Request.JsonKeys.METHOD, "Ljava/lang/reflect/Method;", "ktor-client-logging"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class LogcatLogger implements io.ktor.client.plugins.logging.Logger {
    private final io.ktor.client.plugins.logging.Logger fallback;
    private final java.lang.reflect.Method method;
    private final java.lang.String tag;

    public LogcatLogger(java.lang.Class<?> logClass, io.ktor.client.plugins.logging.Logger fallback) {
        java.lang.reflect.Method declaredMethod;
        kotlin.jvm.internal.m.e(logClass, "logClass");
        kotlin.jvm.internal.m.e(fallback, "fallback");
        this.fallback = fallback;
        this.tag = "Ktor Client";
        try {
            declaredMethod = logClass.getDeclaredMethod(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT, java.lang.String.class, java.lang.String.class);
        } catch (java.lang.Throwable unused) {
            declaredMethod = null;
        }
        this.method = declaredMethod;
    }

    @Override // io.ktor.client.plugins.logging.Logger
    public void log(java.lang.String message) {
        kotlin.jvm.internal.m.e(message, "message");
        java.lang.reflect.Method method = this.method;
        if (method == null) {
            this.fallback.log(message);
            return;
        }
        try {
            method.invoke(null, this.tag, message);
        } catch (java.lang.Throwable unused) {
            this.fallback.log(message);
        }
    }
}
