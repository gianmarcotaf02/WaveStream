package com.revenuecat.purchases;

import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2 extends o implements j {
    final j $callback;

    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2(j jVar) {
        super(1);
        this.$callback = jVar;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return A.f22523a;
    }

    public final void invoke(PurchasesError error) {
        LogHandler currentLogHandler;
        String strM;
        String str;
        m.e(error, "error");
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1(logIntent, error);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke(), null);
                break;
        }
        j jVar = this.$callback;
        if (jVar != null) {
            jVar.invoke(new SyncPendingPurchaseResult.Error(error));
        }
    }
}
