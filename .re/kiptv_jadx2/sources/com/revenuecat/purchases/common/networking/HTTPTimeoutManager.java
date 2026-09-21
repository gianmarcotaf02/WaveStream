package com.revenuecat.purchases.common.networking;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "shouldResetTimeout", "()Z", "Lh6/A;", "resetTimeout", "()V", "isFallback", "fallbackAvailable", "", "getTimeoutForRequest", "(ZZ)J", "Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;", "result", "recordRequestResult", "(Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/DateProvider;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastTimeoutRequestTime", "Ljava/util/concurrent/atomic/AtomicLong;", "Companion", "RequestResult", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HTTPTimeoutManager {
    public static final long DEFAULT_TIMEOUT_MS = 30000;
    public static final long REDUCED_TIMEOUT_MS = 2000;
    public static final long SUPPORTED_FALLBACK_TIMEOUT_MS = 5000;
    public static final long TEST_DIVIDER = 10;
    public static final long TIMEOUT_RESET_INTERVAL_MS = 600000;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final AtomicLong lastTimeoutRequestTime;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;", "", "(Ljava/lang/String;I)V", "SUCCESS_ON_MAIN_BACKEND", "TIMEOUT_ON_MAIN_BACKEND_FOR_FALLBACK_SUPPORTED_ENDPOINT", "OTHER_RESULT", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum RequestResult {
        SUCCESS_ON_MAIN_BACKEND,
        TIMEOUT_ON_MAIN_BACKEND_FOR_FALLBACK_SUPPORTED_ENDPOINT,
        OTHER_RESULT
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestResult.values().length];
            try {
                iArr[RequestResult.SUCCESS_ON_MAIN_BACKEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestResult.TIMEOUT_ON_MAIN_BACKEND_FOR_FALLBACK_SUPPORTED_ENDPOINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestResult.OTHER_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPTimeoutManager(AppConfig appConfig, DateProvider dateProvider) {
        m.e(appConfig, "appConfig");
        m.e(dateProvider, "dateProvider");
        this.appConfig = appConfig;
        this.dateProvider = dateProvider;
        this.lastTimeoutRequestTime = new AtomicLong(0L);
    }

    private final void resetTimeout() {
        this.lastTimeoutRequestTime.set(0L);
    }

    private final boolean shouldResetTimeout() {
        long j = this.lastTimeoutRequestTime.get();
        return j != 0 && this.dateProvider.getNow().getTime() - j >= 600000;
    }

    public final long getTimeoutForRequest(boolean isFallback, boolean fallbackAvailable) {
        long j;
        if (shouldResetTimeout()) {
            resetTimeout();
        }
        if (isFallback || !fallbackAvailable) {
            j = 30000;
        } else {
            j = this.lastTimeoutRequestTime.get() > 0 ? 2000L : 5000L;
        }
        return this.appConfig.getRunningTests() ? j / 10 : j;
    }

    public final void recordRequestResult(RequestResult result) {
        m.e(result, "result");
        int i3 = WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
        if (i3 == 1) {
            resetTimeout();
        } else {
            if (i3 != 2) {
                return;
            }
            this.lastTimeoutRequestTime.set(this.dateProvider.getNow().getTime());
        }
    }

    public HTTPTimeoutManager(AppConfig appConfig, DateProvider dateProvider, int i3, AbstractC2541f abstractC2541f) {
        this(appConfig, (i3 & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
