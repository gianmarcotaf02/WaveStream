package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceProvider;", "", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle$Purpose;", "purpose", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle;", "getCurrent", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle$Purpose;)Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle;", "currentAPISource", "()Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle;", "handle", "Lh6/A;", "reportUnhealthy", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle;)V", "restart", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle$Purpose;)V", "", "restartIfExhausted", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle$Purpose;)Z", "clear", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RemoteConfigSourceProvider {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void clear(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceProvider remoteConfigSourceProvider) {
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceProvider.super.clear();
        }

        @java.lang.Deprecated
        public static com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle currentAPISource(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceProvider remoteConfigSourceProvider) {
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceProvider.super.currentAPISource();
        }
    }

    default void clear() {
    }

    default com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle currentAPISource() {
        return getCurrent(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle.Purpose.API);
    }

    com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle getCurrent(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle.Purpose purpose);

    void reportUnhealthy(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle handle);

    void restart(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle.Purpose purpose);

    boolean restartIfExhausted(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle.Purpose purpose);
}
