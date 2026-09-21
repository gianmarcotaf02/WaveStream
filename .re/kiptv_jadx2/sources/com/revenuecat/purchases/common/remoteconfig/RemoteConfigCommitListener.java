package com.revenuecat.purchases.common.remoteconfig;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigCommitListener;", "", "", "generation", "Lh6/A;", "onConfigCommitted", "(I)V", "onConfigInvalidated", "onRemoteConfigDisabled", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RemoteConfigCommitListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @Deprecated
        public static void onConfigInvalidated(RemoteConfigCommitListener remoteConfigCommitListener, int i3) {
            RemoteConfigCommitListener.super.onConfigInvalidated(i3);
        }

        @Deprecated
        public static void onRemoteConfigDisabled(RemoteConfigCommitListener remoteConfigCommitListener, int i3) {
            RemoteConfigCommitListener.super.onRemoteConfigDisabled(i3);
        }
    }

    void onConfigCommitted(int generation);

    default void onConfigInvalidated(int generation) {
    }

    default void onRemoteConfigDisabled(int generation) {
    }
}
