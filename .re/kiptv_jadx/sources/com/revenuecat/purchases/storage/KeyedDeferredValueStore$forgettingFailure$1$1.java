package com.revenuecat.purchases.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"H", "T", "", io.sentry.SentryEvent.JsonKeys.EXCEPTION, "Lh6/A;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class KeyedDeferredValueStore$forgettingFailure$1$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ H $key;
    final /* synthetic */ com.revenuecat.purchases.storage.KeyedDeferredValueStore<H, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedDeferredValueStore$forgettingFailure$1$1(com.revenuecat.purchases.storage.KeyedDeferredValueStore<H, T> keyedDeferredValueStore, H h9) {
        super(1);
        this.this$0 = keyedDeferredValueStore;
        this.$key = h9;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((java.lang.Throwable) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(java.lang.Throwable th) {
        if (th != null) {
            com.revenuecat.purchases.storage.KeyedDeferredValueStore<H, T> keyedDeferredValueStore = this.this$0;
            java.lang.Object obj = this.$key;
            synchronized (((com.revenuecat.purchases.storage.KeyedDeferredValueStore) keyedDeferredValueStore).lock) {
                keyedDeferredValueStore.getDeferred().remove(obj);
            }
        }
    }
}
