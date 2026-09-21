package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class Permissions {
    private Permissions() {
    }

    public static boolean hasPermission(android.content.Context context, java.lang.String str) {
        io.sentry.util.Objects.requireNonNull(context, "The application context is required.");
        return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }
}
