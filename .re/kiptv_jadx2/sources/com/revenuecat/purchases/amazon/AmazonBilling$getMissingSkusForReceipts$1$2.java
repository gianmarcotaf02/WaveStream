package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import p070h6.A;
import p194x6.j;
import p194x6.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AmazonBilling$getMissingSkusForReceipts$1$2 extends o implements j {
    final Map<String, PurchasesError> $errorMap;
    final m $onCompletion;
    final Receipt $receipt;
    final y $receiptsLeft;
    final Map<String, String> $successMap;

    public AmazonBilling$getMissingSkusForReceipts$1$2(Map<String, PurchasesError> map, Receipt receipt, y yVar, m mVar, Map<String, String> map2) {
        super(1);
        this.$errorMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = yVar;
        this.$onCompletion = mVar;
        this.$successMap = map2;
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
        kotlin.jvm.internal.m.e(error, "error");
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        AmazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1 amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1 = new AmazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1(logIntent, error);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
        }
        Map<String, PurchasesError> map = this.$errorMap;
        String receiptId = this.$receipt.getReceiptId();
        kotlin.jvm.internal.m.d(receiptId, "receipt.receiptId");
        map.put(receiptId, error);
        y yVar = this.$receiptsLeft;
        int i3 = yVar.f24555h - 1;
        yVar.f24555h = i3;
        if (i3 == 0) {
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
