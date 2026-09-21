package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class HintUtils {

    @java.lang.FunctionalInterface
    public interface SentryConsumer<T> {
        void accept(T t9);
    }

    @java.lang.FunctionalInterface
    public interface SentryHintFallback {
        void accept(java.lang.Object obj, java.lang.Class<?> cls);
    }

    @java.lang.FunctionalInterface
    public interface SentryNullableConsumer<T> {
        void accept(T t9);
    }

    private HintUtils() {
    }

    public static io.sentry.Hint createWithTypeCheckHint(java.lang.Object obj) {
        io.sentry.Hint hint = new io.sentry.Hint();
        setTypeCheckHint(hint, obj);
        return hint;
    }

    public static io.sentry.hints.EventDropReason getEventDropReason(io.sentry.Hint hint) {
        return (io.sentry.hints.EventDropReason) hint.getAs(io.sentry.TypeCheckHint.SENTRY_EVENT_DROP_REASON, io.sentry.hints.EventDropReason.class);
    }

    public static java.lang.Object getSentrySdkHint(io.sentry.Hint hint) {
        return hint.get(io.sentry.TypeCheckHint.SENTRY_TYPE_CHECK_HINT);
    }

    public static boolean hasType(io.sentry.Hint hint, java.lang.Class<?> cls) {
        return cls.isInstance(getSentrySdkHint(hint));
    }

    public static boolean isFromHybridSdk(io.sentry.Hint hint) {
        return java.lang.Boolean.TRUE.equals(hint.getAs(io.sentry.TypeCheckHint.SENTRY_IS_FROM_HYBRID_SDK, java.lang.Boolean.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runIfDoesNotHaveType$0(java.lang.Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runIfHasType$2(java.lang.Object obj, java.lang.Class cls) {
    }

    public static <T> void runIfDoesNotHaveType(io.sentry.Hint hint, java.lang.Class<T> cls, io.sentry.util.HintUtils.SentryNullableConsumer<java.lang.Object> sentryNullableConsumer) {
        runIfHasType(hint, cls, new io.sentry.protocol.a(2), new F1.e(23, sentryNullableConsumer));
    }

    public static <T> void runIfHasType(io.sentry.Hint hint, java.lang.Class<T> cls, io.sentry.util.HintUtils.SentryConsumer<T> sentryConsumer) {
        runIfHasType(hint, cls, sentryConsumer, new io.sentry.protocol.a(1));
    }

    public static <T> void runIfHasTypeLogIfNot(io.sentry.Hint hint, java.lang.Class<T> cls, io.sentry.ILogger iLogger, io.sentry.util.HintUtils.SentryConsumer<T> sentryConsumer) {
        runIfHasType(hint, cls, sentryConsumer, new F1.e(22, iLogger));
    }

    public static void setEventDropReason(io.sentry.Hint hint, io.sentry.hints.EventDropReason eventDropReason) {
        hint.set(io.sentry.TypeCheckHint.SENTRY_EVENT_DROP_REASON, eventDropReason);
    }

    public static void setIsFromHybridSdk(io.sentry.Hint hint, java.lang.String str) {
        if (str.startsWith(io.sentry.TypeCheckHint.SENTRY_JAVASCRIPT_SDK_NAME) || str.startsWith(io.sentry.TypeCheckHint.SENTRY_DART_SDK_NAME) || str.startsWith(io.sentry.TypeCheckHint.SENTRY_DOTNET_SDK_NAME)) {
            hint.set(io.sentry.TypeCheckHint.SENTRY_IS_FROM_HYBRID_SDK, java.lang.Boolean.TRUE);
        }
    }

    public static void setTypeCheckHint(io.sentry.Hint hint, java.lang.Object obj) {
        hint.set(io.sentry.TypeCheckHint.SENTRY_TYPE_CHECK_HINT, obj);
    }

    public static boolean shouldApplyScopeData(io.sentry.Hint hint) {
        return !(hasType(hint, io.sentry.hints.Cached.class) || hasType(hint, io.sentry.hints.Backfillable.class)) || hasType(hint, io.sentry.hints.ApplyScopeData.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void runIfHasType(io.sentry.Hint hint, java.lang.Class<T> cls, io.sentry.util.HintUtils.SentryConsumer<T> sentryConsumer, io.sentry.util.HintUtils.SentryHintFallback sentryHintFallback) {
        java.lang.Object sentrySdkHint = getSentrySdkHint(hint);
        if (!hasType(hint, cls) || sentrySdkHint == null) {
            sentryHintFallback.accept(sentrySdkHint, cls);
        } else {
            sentryConsumer.accept(sentrySdkHint);
        }
    }
}
