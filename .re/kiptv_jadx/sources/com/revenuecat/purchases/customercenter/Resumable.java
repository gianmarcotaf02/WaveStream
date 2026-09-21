package com.revenuecat.purchases.customercenter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/customercenter/Resumable;", "", "", "shouldResume", "Lh6/A;", "resume", "(Z)V", "invoke", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Resumable {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void invoke(com.revenuecat.purchases.customercenter.Resumable resumable, boolean z6) {
            com.revenuecat.purchases.customercenter.Resumable.super.invoke(z6);
        }
    }

    static /* synthetic */ void invoke$default(com.revenuecat.purchases.customercenter.Resumable resumable, boolean z6, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        resumable.invoke(z6);
    }

    default void invoke(boolean shouldResume) {
        resume(shouldResume);
    }

    void resume(boolean shouldResume);
}
