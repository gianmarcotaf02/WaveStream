package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class ErrorUtils {
    public static boolean isIgnored(java.util.List<io.sentry.FilterString> list, io.sentry.SentryEvent sentryEvent) {
        if (sentryEvent != null && list != null && !list.isEmpty()) {
            java.util.HashSet hashSet = new java.util.HashSet();
            io.sentry.protocol.Message message = sentryEvent.getMessage();
            if (message != null) {
                java.lang.String message2 = message.getMessage();
                if (message2 != null) {
                    hashSet.add(message2);
                }
                java.lang.String formatted = message.getFormatted();
                if (formatted != null) {
                    hashSet.add(formatted);
                }
            }
            java.lang.Throwable throwable = sentryEvent.getThrowable();
            if (throwable != null) {
                hashSet.add(throwable.toString());
            }
            java.util.Iterator<io.sentry.FilterString> it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().getFilterString())) {
                    return true;
                }
            }
            for (io.sentry.FilterString filterString : list) {
                java.util.Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (filterString.matches((java.lang.String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
