package io.ktor.client.plugins.logging;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u001f\u0010\b\u001a\u00020\u0000*\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/logging/Logger;", "getAndroidLogger", "()Lio/ktor/client/plugins/logging/Logger;", "Lio/ktor/client/plugins/logging/Logger$Companion;", "ANDROID$delegate", "Lh6/h;", "getANDROID", "(Lio/ktor/client/plugins/logging/Logger$Companion;)Lio/ktor/client/plugins/logging/Logger;", "ANDROID", "getDEFAULT", "DEFAULT", "ktor-client-logging"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LoggerJvmKt {
    private static final p070h6.h ANDROID$delegate = com.google.common.util.concurrent.D.B(new p026c6.a(17));

    public static final io.ktor.client.plugins.logging.Logger getANDROID(io.ktor.client.plugins.logging.Logger.Companion companion) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        return (io.ktor.client.plugins.logging.Logger) ANDROID$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.client.plugins.logging.Logger getAndroidLogger() {
        io.ktor.client.plugins.logging.Logger logger = getDEFAULT(io.ktor.client.plugins.logging.Logger.INSTANCE);
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.util.Log");
            if (!(P8.d.b().a() instanceof R8.c)) {
                return new io.ktor.client.plugins.logging.MessageLengthLimitingLogger(0, 0, logger, 3, null);
            }
            return new io.ktor.client.plugins.logging.MessageLengthLimitingLogger(0, 0, new io.ktor.client.plugins.logging.LogcatLogger(cls, logger), 3, null);
        } catch (java.lang.ClassNotFoundException unused) {
            return new io.ktor.client.plugins.logging.MessageLengthLimitingLogger(0, 0, logger, 3, null);
        }
    }

    public static final io.ktor.client.plugins.logging.Logger getDEFAULT(io.ktor.client.plugins.logging.Logger.Companion companion) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        return new io.ktor.client.plugins.logging.Logger() { // from class: io.ktor.client.plugins.logging.LoggerJvmKt$DEFAULT$1
            private final P8.b delegate;

            {
                int i3;
                int i9 = P8.d.f8182a;
                P8.b bVarA = P8.d.b().a().a(io.ktor.client.HttpClient.class.getName());
                if (P8.d.f8185d) {
                    R8.h hVar = R8.i.f9095a;
                    java.lang.Class cls = null;
                    if (hVar == null) {
                        if (R8.i.f9096b) {
                            hVar = null;
                        } else {
                            try {
                                hVar = new R8.h();
                            } catch (java.lang.SecurityException unused) {
                                hVar = null;
                            }
                            R8.i.f9095a = hVar;
                            R8.i.f9096b = true;
                        }
                    }
                    if (hVar != null) {
                        java.lang.Class[] classContext = hVar.getClassContext();
                        java.lang.String name = R8.i.class.getName();
                        int i10 = 0;
                        while (i10 < classContext.length && !name.equals(classContext[i10].getName())) {
                            i10++;
                        }
                        if (i10 >= classContext.length || (i3 = i10 + 2) >= classContext.length) {
                            throw new java.lang.IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                        }
                        cls = classContext[i3];
                    }
                    if (cls != null && !cls.isAssignableFrom(io.ktor.client.HttpClient.class)) {
                        R8.e.d("Detected logger name mismatch. Given name: \"" + bVarA.getName() + "\"; computed name: \"" + cls.getName() + "\".");
                        R8.e.d("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
                    }
                }
                this.delegate = bVarA;
            }

            @Override // io.ktor.client.plugins.logging.Logger
            public void log(java.lang.String message) {
                kotlin.jvm.internal.m.e(message, "message");
                this.delegate.g(message);
            }
        };
    }
}
