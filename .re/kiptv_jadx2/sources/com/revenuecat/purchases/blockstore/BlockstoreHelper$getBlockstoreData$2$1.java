package com.revenuecat.purchases.blockstore;

import S7.InterfaceC0894j;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import p070h6.A;
import p173u3.e;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu3/e;", "kotlin.jvm.PlatformType", "it", "Lh6/A;", "invoke", "(Lu3/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BlockstoreHelper$getBlockstoreData$2$1 extends o implements j {
    final InterfaceC0894j $cont;

    public BlockstoreHelper$getBlockstoreData$2$1(InterfaceC0894j interfaceC0894j) {
        super(1);
        this.$cont = interfaceC0894j;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((e) obj);
        return A.f22523a;
    }

    public final void invoke(e eVar) {
        CancellableContinuationExtensionsKt.safeResume(this.$cont, Collections.unmodifiableMap(eVar.j));
    }
}
