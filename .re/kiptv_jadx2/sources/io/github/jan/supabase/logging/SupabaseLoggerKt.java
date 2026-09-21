package io.github.jan.supabase.logging;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.github.jan.supabase.SupabaseClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a1\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u001a1\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/logging/SupabaseLogger;", "", "throwable", "Lkotlin/Function0;", "", "message", "Lh6/A;", "d", "(Lio/github/jan/supabase/logging/SupabaseLogger;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "w", "e", "supabase-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SupabaseLoggerKt {
    public static final void d(SupabaseLogger supabaseLogger, Throwable th, Function0 message) {
        m.e(supabaseLogger, "<this>");
        m.e(message, "message");
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) message.invoke());
        }
    }

    public static void d$default(SupabaseLogger supabaseLogger, Throwable th, Function0 message, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        m.e(supabaseLogger, "<this>");
        m.e(message, "message");
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) message.invoke());
        }
    }

    public static final void e(SupabaseLogger supabaseLogger, Throwable th, Function0 message) {
        m.e(supabaseLogger, "<this>");
        m.e(message, "message");
        LogLevel logLevel = LogLevel.ERROR;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) message.invoke());
        }
    }

    public static void e$default(SupabaseLogger supabaseLogger, Throwable th, Function0 message, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        m.e(supabaseLogger, "<this>");
        m.e(message, "message");
        LogLevel logLevel = LogLevel.ERROR;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) message.invoke());
        }
    }

    public static final void i(SupabaseLogger supabaseLogger, Throwable th, Function0 message) {
        m.e(supabaseLogger, "<this>");
        m.e(message, "message");
        LogLevel logLevel = LogLevel.INFO;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) message.invoke());
        }
    }

    public static void i$default(SupabaseLogger supabaseLogger, Throwable th, Function0 message, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        m.e(supabaseLogger, "<this>");
        m.e(message, "message");
        LogLevel logLevel = LogLevel.INFO;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) message.invoke());
        }
    }

    public static final void w(SupabaseLogger supabaseLogger, Throwable th, Function0 message) {
        m.e(supabaseLogger, "<this>");
        m.e(message, "message");
        LogLevel logLevel = LogLevel.WARNING;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) message.invoke());
        }
    }

    public static void w$default(SupabaseLogger supabaseLogger, Throwable th, Function0 message, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        m.e(supabaseLogger, "<this>");
        m.e(message, "message");
        LogLevel logLevel = LogLevel.WARNING;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) message.invoke());
        }
    }
}
