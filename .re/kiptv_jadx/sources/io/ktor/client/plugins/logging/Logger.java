package io.ktor.client.plugins.logging;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/ktor/client/plugins/logging/Logger;", "", "", "message", "Lh6/A;", "log", "(Ljava/lang/String;)V", "Companion", "ktor-client-logging"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.logging.Logger.Companion INSTANCE = io.ktor.client.plugins.logging.Logger.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/logging/Logger$Companion;", "", "<init>", "()V", "ktor-client-logging"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ io.ktor.client.plugins.logging.Logger.Companion $$INSTANCE = new io.ktor.client.plugins.logging.Logger.Companion();

        private Companion() {
        }
    }

    void log(java.lang.String message);
}
