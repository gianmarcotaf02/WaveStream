package io.ktor.client.plugins.logging;

import P8.b;
import P8.d;
import R8.c;
import R8.e;
import R8.i;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import io.ktor.client.HttpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u001f\u0010\b\u001a\u00020\u0000*\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/logging/Logger;", "getAndroidLogger", "()Lio/ktor/client/plugins/logging/Logger;", "Lio/ktor/client/plugins/logging/Logger$Companion;", "ANDROID$delegate", "Lh6/h;", "getANDROID", "(Lio/ktor/client/plugins/logging/Logger$Companion;)Lio/ktor/client/plugins/logging/Logger;", "ANDROID", "getDEFAULT", "DEFAULT", "ktor-client-logging"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LoggerJvmKt {
    private static final h ANDROID$delegate = D.B(new p026c6.a(17));

    public static final Logger getANDROID(Logger.Companion companion) {
        m.e(companion, "<this>");
        return (Logger) ANDROID$delegate.getValue();
    }

    public static final Logger getAndroidLogger() {
        Logger logger = getDEFAULT(Logger.INSTANCE);
        try {
            Class<?> cls = Class.forName("android.util.Log");
            if (!(d.b().a() instanceof c)) {
                return new MessageLengthLimitingLogger(0, 0, logger, 3, null);
            }
            return new MessageLengthLimitingLogger(0, 0, new LogcatLogger(cls, logger), 3, null);
        } catch (ClassNotFoundException unused) {
            return new MessageLengthLimitingLogger(0, 0, logger, 3, null);
        }
    }

    public static final Logger getDEFAULT(Logger.Companion companion) {
        m.e(companion, "<this>");
        return new Logger() {
            private final b delegate;

            {
                int i3;
                int i9 = d.f8182a;
                b bVarA = d.b().a().a(HttpClient.class.getName());
                if (d.f8185d) {
                    R8.h hVar = i.f9095a;
                    Class cls = null;
                    if (hVar == null) {
                        if (i.f9096b) {
                            hVar = null;
                        } else {
                            try {
                                hVar = new R8.h();
                            } catch (SecurityException unused) {
                                hVar = null;
                            }
                            i.f9095a = hVar;
                            i.f9096b = true;
                        }
                    }
                    if (hVar != null) {
                        Class[] classContext = hVar.getClassContext();
                        String name = i.class.getName();
                        int i10 = 0;
                        while (i10 < classContext.length && !name.equals(classContext[i10].getName())) {
                            i10++;
                        }
                        if (i10 >= classContext.length || (i3 = i10 + 2) >= classContext.length) {
                            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                        }
                        cls = classContext[i3];
                    }
                    if (cls != null && !cls.isAssignableFrom(HttpClient.class)) {
                        e.d("Detected logger name mismatch. Given name: \"" + bVarA.getName() + "\"; computed name: \"" + cls.getName() + "\".");
                        e.d("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
                    }
                }
                this.delegate = bVarA;
            }

            @Override
            public void log(String message) {
                m.e(message, "message");
                this.delegate.g(message);
            }
        };
    }
}
