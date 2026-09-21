package com.revenuecat.purchases.blockstore;

import S7.InterfaceC0894j;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lh6/A;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BlockstoreHelper$storeUserIdIfNeeded$6$1 extends o implements j {
    final InterfaceC0894j $cont;
    final String $userId;

    public BlockstoreHelper$storeUserIdIfNeeded$6$1(InterfaceC0894j interfaceC0894j, String str) {
        super(1);
        this.$cont = interfaceC0894j;
        this.$userId = str;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Integer) obj);
        return A.f22523a;
    }

    public final void invoke(Integer num) {
        String str = this.$userId;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(M0.m(logLevel, new StringBuilder("[Purchases] - ")), "Block store: User ID: " + str + " stored in Block store.");
        }
        CancellableContinuationExtensionsKt.safeResume(this.$cont, A.f22523a);
    }
}
