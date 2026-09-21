package com.revenuecat.purchases.blockstore;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu3/e;", "kotlin.jvm.PlatformType", "it", "Lh6/A;", "invoke", "(Lu3/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BlockstoreHelper$getBlockstoreData$2$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ S7.InterfaceC0894j $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockstoreHelper$getBlockstoreData$2$1(S7.InterfaceC0894j interfaceC0894j) {
        super(1);
        this.$cont = interfaceC0894j;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((p173u3.e) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(p173u3.e eVar) {
        com.revenuecat.purchases.common.CancellableContinuationExtensionsKt.safeResume(this.$cont, java.util.Collections.unmodifiableMap(eVar.j));
    }
}
