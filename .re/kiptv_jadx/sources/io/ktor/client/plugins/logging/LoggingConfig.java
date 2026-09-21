package io.ktor.client.plugins.logging;

/* JADX INFO: loaded from: classes4.dex */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\r\u0010\u000eR4\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010/\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lio/ktor/client/plugins/logging/LoggingConfig;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "predicate", "Lh6/A;", "filter", "(Lx6/j;)V", "", "placeholder", "sanitizeHeader", "(Ljava/lang/String;Lx6/j;)V", "", "filters", "Ljava/util/List;", "getFilters$ktor_client_logging", "()Ljava/util/List;", "setFilters$ktor_client_logging", "(Ljava/util/List;)V", "Lio/ktor/client/plugins/logging/SanitizedHeader;", "sanitizedHeaders", "getSanitizedHeaders$ktor_client_logging", "Lio/ktor/client/plugins/logging/Logger;", "_logger", "Lio/ktor/client/plugins/logging/Logger;", "Lio/ktor/client/plugins/logging/LoggingFormat;", "format", "Lio/ktor/client/plugins/logging/LoggingFormat;", "getFormat", "()Lio/ktor/client/plugins/logging/LoggingFormat;", "setFormat", "(Lio/ktor/client/plugins/logging/LoggingFormat;)V", "Lio/ktor/client/plugins/logging/LogLevel;", "level", "Lio/ktor/client/plugins/logging/LogLevel;", "getLevel", "()Lio/ktor/client/plugins/logging/LogLevel;", "setLevel", "(Lio/ktor/client/plugins/logging/LogLevel;)V", "value", "getLogger", "()Lio/ktor/client/plugins/logging/Logger;", "setLogger", "(Lio/ktor/client/plugins/logging/Logger;)V", io.sentry.SentryEvent.JsonKeys.LOGGER, "ktor-client-logging"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LoggingConfig {
    private io.ktor.client.plugins.logging.Logger _logger;
    private java.util.List<p194x6.j> filters = new java.util.ArrayList();
    private final java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> sanitizedHeaders = new java.util.ArrayList();
    private io.ktor.client.plugins.logging.LoggingFormat format = io.ktor.client.plugins.logging.LoggingFormat.Default;
    private io.ktor.client.plugins.logging.LogLevel level = io.ktor.client.plugins.logging.LogLevel.HEADERS;

    public static /* synthetic */ void sanitizeHeader$default(io.ktor.client.plugins.logging.LoggingConfig loggingConfig, java.lang.String str, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = "***";
        }
        loggingConfig.sanitizeHeader(str, jVar);
    }

    public final void filter(p194x6.j predicate) {
        kotlin.jvm.internal.m.e(predicate, "predicate");
        this.filters.add(predicate);
    }

    public final java.util.List<p194x6.j> getFilters$ktor_client_logging() {
        return this.filters;
    }

    public final io.ktor.client.plugins.logging.LoggingFormat getFormat() {
        return this.format;
    }

    public final io.ktor.client.plugins.logging.LogLevel getLevel() {
        return this.level;
    }

    public final io.ktor.client.plugins.logging.Logger getLogger() {
        io.ktor.client.plugins.logging.Logger logger = this._logger;
        return logger == null ? io.ktor.client.plugins.logging.LoggerJvmKt.getDEFAULT(io.ktor.client.plugins.logging.Logger.INSTANCE) : logger;
    }

    public final java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> getSanitizedHeaders$ktor_client_logging() {
        return this.sanitizedHeaders;
    }

    public final void sanitizeHeader(java.lang.String placeholder, p194x6.j predicate) {
        kotlin.jvm.internal.m.e(placeholder, "placeholder");
        kotlin.jvm.internal.m.e(predicate, "predicate");
        this.sanitizedHeaders.add(new io.ktor.client.plugins.logging.SanitizedHeader(placeholder, predicate));
    }

    public final void setFilters$ktor_client_logging(java.util.List<p194x6.j> list) {
        kotlin.jvm.internal.m.e(list, "<set-?>");
        this.filters = list;
    }

    public final void setFormat(io.ktor.client.plugins.logging.LoggingFormat loggingFormat) {
        kotlin.jvm.internal.m.e(loggingFormat, "<set-?>");
        this.format = loggingFormat;
    }

    public final void setLevel(io.ktor.client.plugins.logging.LogLevel logLevel) {
        kotlin.jvm.internal.m.e(logLevel, "<set-?>");
        this.level = logLevel;
    }

    public final void setLogger(io.ktor.client.plugins.logging.Logger value) {
        kotlin.jvm.internal.m.e(value, "value");
        this._logger = value;
    }
}
