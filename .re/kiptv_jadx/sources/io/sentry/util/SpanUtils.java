package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class SpanUtils {
    private static final java.util.Map<java.lang.String, java.lang.Boolean> ignoredSpanDecisionsCache = new java.util.concurrent.ConcurrentHashMap();

    public static java.util.List<java.lang.String> ignoredSpanOriginsForOpenTelemetry(io.sentry.SentryOpenTelemetryMode sentryOpenTelemetryMode) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        io.sentry.SentryOpenTelemetryMode sentryOpenTelemetryMode2 = io.sentry.SentryOpenTelemetryMode.AGENT;
        if (sentryOpenTelemetryMode2 == sentryOpenTelemetryMode || io.sentry.SentryOpenTelemetryMode.AGENTLESS_SPRING == sentryOpenTelemetryMode) {
            arrayList.add("auto.http.spring_jakarta.webmvc");
            arrayList.add("auto.http.spring.webmvc");
            arrayList.add("auto.spring_jakarta.webflux");
            arrayList.add("auto.spring.webflux");
            arrayList.add("auto.db.jdbc");
            arrayList.add("auto.http.spring_jakarta.webclient");
            arrayList.add("auto.http.spring.webclient");
            arrayList.add("auto.http.spring_jakarta.restclient");
            arrayList.add("auto.http.spring.restclient");
            arrayList.add("auto.http.spring_jakarta.resttemplate");
            arrayList.add("auto.http.spring.resttemplate");
            arrayList.add("auto.http.openfeign");
        }
        if (sentryOpenTelemetryMode2 == sentryOpenTelemetryMode) {
            arrayList.add("auto.graphql.graphql");
            arrayList.add("auto.graphql.graphql22");
        }
        return arrayList;
    }

    public static boolean isIgnored(java.util.List<io.sentry.FilterString> list, java.lang.String str) {
        if (str != null && list != null && !list.isEmpty()) {
            java.util.Map<java.lang.String, java.lang.Boolean> map = ignoredSpanDecisionsCache;
            if (map.containsKey(str)) {
                return map.get(str).booleanValue();
            }
            java.util.Iterator<io.sentry.FilterString> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getFilterString().equalsIgnoreCase(str)) {
                    ignoredSpanDecisionsCache.put(str, java.lang.Boolean.TRUE);
                    return true;
                }
            }
            java.util.Iterator<io.sentry.FilterString> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (it2.next().matches(str)) {
                        ignoredSpanDecisionsCache.put(str, java.lang.Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (java.lang.Throwable unused) {
                }
            }
            ignoredSpanDecisionsCache.put(str, java.lang.Boolean.FALSE);
        }
        return false;
    }
}
