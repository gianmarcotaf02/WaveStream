package io.github.jan.supabase.logging;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/logging/KermitSupabaseLogger;", "Lio/github/jan/supabase/logging/SupabaseLogger;", "Lio/github/jan/supabase/logging/LogLevel;", "level", "", "tag", "LD2/h;", io.sentry.SentryEvent.JsonKeys.LOGGER, "<init>", "(Lio/github/jan/supabase/logging/LogLevel;Ljava/lang/String;LD2/h;)V", "LD2/i;", "toSeverity", "(Lio/github/jan/supabase/logging/LogLevel;)LD2/i;", "Lh6/A;", "setLevel", "(Lio/github/jan/supabase/logging/LogLevel;)V", "", "throwable", "message", "log", "(Lio/github/jan/supabase/logging/LogLevel;Ljava/lang/Throwable;Ljava/lang/String;)V", "LD2/h;", "value", "Lio/github/jan/supabase/logging/LogLevel;", "getLevel", "()Lio/github/jan/supabase/logging/LogLevel;", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KermitSupabaseLogger extends io.github.jan.supabase.logging.SupabaseLogger {
    private io.github.jan.supabase.logging.LogLevel level;
    private final D2.h logger;

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.github.jan.supabase.logging.LogLevel.values().length];
            try {
                iArr[io.github.jan.supabase.logging.LogLevel.DEBUG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.github.jan.supabase.logging.LogLevel.INFO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.github.jan.supabase.logging.LogLevel.WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[io.github.jan.supabase.logging.LogLevel.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[io.github.jan.supabase.logging.LogLevel.NONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KermitSupabaseLogger(io.github.jan.supabase.logging.LogLevel logLevel, java.lang.String tag, D2.h hVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        if ((i3 & 4) != 0) {
            D2.g gVar = D2.h.j;
            gVar.getClass();
            kotlin.jvm.internal.m.e(tag, "tag");
            hVar = new D2.h((D2.d) gVar.f2006h, tag);
        }
        this(logLevel, tag, hVar);
    }

    private final D2.i toSeverity(io.github.jan.supabase.logging.LogLevel logLevel) {
        int i3 = io.github.jan.supabase.logging.KermitSupabaseLogger.WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i3 == 1) {
            return D2.i.f2088i;
        }
        if (i3 == 2) {
            return D2.i.j;
        }
        if (i3 == 3) {
            return D2.i.f2089k;
        }
        if (i3 == 4) {
            return D2.i.f2090l;
        }
        if (i3 == 5) {
            return D2.i.f2091m;
        }
        throw new I3.b();
    }

    @Override // io.github.jan.supabase.logging.SupabaseLogger
    public io.github.jan.supabase.logging.LogLevel getLevel() {
        return this.level;
    }

    @Override // io.github.jan.supabase.logging.SupabaseLogger
    public void log(io.github.jan.supabase.logging.LogLevel level, java.lang.Throwable throwable, java.lang.String message) {
        kotlin.jvm.internal.m.e(level, "level");
        kotlin.jvm.internal.m.e(message, "message");
        D2.h hVar = this.logger;
        D2.i severity = toSeverity(level);
        java.lang.String tag = this.logger.E0();
        if (((D2.d) hVar.f2006h).f2083a.compareTo(severity) <= 0) {
            kotlin.jvm.internal.m.e(severity, "severity");
            kotlin.jvm.internal.m.e(tag, "tag");
            for (D2.e eVar : ((D2.d) hVar.f2006h).f2084b) {
                eVar.getClass();
                eVar.a(severity, message, tag, throwable);
            }
        }
    }

    @Override // io.github.jan.supabase.logging.SupabaseLogger
    @io.github.jan.supabase.annotations.SupabaseInternal
    public void setLevel(io.github.jan.supabase.logging.LogLevel level) {
        kotlin.jvm.internal.m.e(level, "level");
        this.level = level;
    }

    public KermitSupabaseLogger(io.github.jan.supabase.logging.LogLevel logLevel, java.lang.String tag, D2.h logger) {
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(logger, "logger");
        this.logger = logger;
        this.level = logLevel;
    }
}
