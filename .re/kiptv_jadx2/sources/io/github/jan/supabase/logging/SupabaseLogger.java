package io.github.jan.supabase.logging;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/logging/SupabaseLogger;", "", "<init>", "()V", "Lio/github/jan/supabase/logging/LogLevel;", "level", "", "throwable", "", "message", "Lh6/A;", "log", "(Lio/github/jan/supabase/logging/LogLevel;Ljava/lang/Throwable;Ljava/lang/String;)V", "Lkotlin/Function0;", "(Lio/github/jan/supabase/logging/LogLevel;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "setLevel", "(Lio/github/jan/supabase/logging/LogLevel;)V", "getLevel", "()Lio/github/jan/supabase/logging/LogLevel;", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SupabaseLogger {
    public static void log$default(SupabaseLogger supabaseLogger, LogLevel logLevel, Throwable th, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i3 & 2) != 0) {
            th = null;
        }
        supabaseLogger.log(logLevel, th, str);
    }

    public abstract LogLevel getLevel();

    public abstract void log(LogLevel level, Throwable throwable, String message);

    public final void log(LogLevel level, Throwable throwable, Function0 message) {
        m.e(level, "level");
        m.e(message, "message");
        LogLevel level2 = getLevel();
        if (level2 == null) {
            level2 = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (level.compareTo(level2) >= 0) {
            log(level, throwable, (String) message.invoke());
        }
    }

    @SupabaseInternal
    public abstract void setLevel(LogLevel level);

    public static void log$default(SupabaseLogger supabaseLogger, LogLevel level, Throwable th, Function0 message, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i3 & 2) != 0) {
            th = null;
        }
        m.e(level, "level");
        m.e(message, "message");
        LogLevel level2 = supabaseLogger.getLevel();
        if (level2 == null) {
            level2 = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (level.compareTo(level2) >= 0) {
            supabaseLogger.log(level, th, (String) message.invoke());
        }
    }
}
