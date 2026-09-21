package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/DefaultLogHandler;", "Lcom/revenuecat/purchases/LogHandler;", "<init>", "()V", "", "tag", "msg", "Lh6/A;", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "d", androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT, "w", "", "throwable", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class DefaultLogHandler implements com.revenuecat.purchases.LogHandler {
    @Override // com.revenuecat.purchases.LogHandler
    public void d(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(msg, "msg");
        android.util.Log.d(tag, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void e(java.lang.String tag, java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(msg, "msg");
        if (throwable != null) {
            android.util.Log.e(tag, msg, throwable);
        } else {
            android.util.Log.e(tag, msg);
        }
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void i(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(msg, "msg");
        android.util.Log.i(tag, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void v(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(msg, "msg");
        android.util.Log.v(tag, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void w(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(msg, "msg");
        android.util.Log.w(tag, msg);
    }
}
