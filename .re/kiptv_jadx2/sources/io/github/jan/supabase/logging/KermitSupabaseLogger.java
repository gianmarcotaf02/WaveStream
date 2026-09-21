package io.github.jan.supabase.logging;

import D2.d;
import D2.e;
import D2.g;
import D2.h;
import D2.i;
import I3.b;
import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/logging/KermitSupabaseLogger;", "Lio/github/jan/supabase/logging/SupabaseLogger;", "Lio/github/jan/supabase/logging/LogLevel;", "level", "", "tag", "LD2/h;", SentryEvent.JsonKeys.LOGGER, "<init>", "(Lio/github/jan/supabase/logging/LogLevel;Ljava/lang/String;LD2/h;)V", "LD2/i;", "toSeverity", "(Lio/github/jan/supabase/logging/LogLevel;)LD2/i;", "Lh6/A;", "setLevel", "(Lio/github/jan/supabase/logging/LogLevel;)V", "", "throwable", "message", "log", "(Lio/github/jan/supabase/logging/LogLevel;Ljava/lang/Throwable;Ljava/lang/String;)V", "LD2/h;", "value", "Lio/github/jan/supabase/logging/LogLevel;", "getLevel", "()Lio/github/jan/supabase/logging/LogLevel;", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KermitSupabaseLogger extends SupabaseLogger {
    private LogLevel level;
    private final h logger;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KermitSupabaseLogger(LogLevel logLevel, String tag, h hVar, int i3, AbstractC2541f abstractC2541f) {
        if ((i3 & 4) != 0) {
            g gVar = h.j;
            gVar.getClass();
            m.e(tag, "tag");
            hVar = new h((d) gVar.f2006h, tag);
        }
        this(logLevel, tag, hVar);
    }

    private final i toSeverity(LogLevel logLevel) {
        int i3 = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i3 == 1) {
            return i.f2088i;
        }
        if (i3 == 2) {
            return i.j;
        }
        if (i3 == 3) {
            return i.f2089k;
        }
        if (i3 == 4) {
            return i.f2090l;
        }
        if (i3 == 5) {
            return i.f2091m;
        }
        throw new b();
    }

    @Override
    public LogLevel getLevel() {
        return this.level;
    }

    @Override
    public void log(LogLevel level, Throwable throwable, String message) {
        m.e(level, "level");
        m.e(message, "message");
        h hVar = this.logger;
        i severity = toSeverity(level);
        String tag = this.logger.E0();
        if (((d) hVar.f2006h).f2083a.compareTo(severity) <= 0) {
            m.e(severity, "severity");
            m.e(tag, "tag");
            for (e eVar : ((d) hVar.f2006h).f2084b) {
                eVar.getClass();
                eVar.a(severity, message, tag, throwable);
            }
        }
    }

    @Override
    @SupabaseInternal
    public void setLevel(LogLevel level) {
        m.e(level, "level");
        this.level = level;
    }

    public KermitSupabaseLogger(LogLevel logLevel, String tag, h logger) {
        m.e(tag, "tag");
        m.e(logger, "logger");
        this.logger = logger;
        this.level = logLevel;
    }
}
