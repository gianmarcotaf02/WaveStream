package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/common/LogIntent;", "intent", "Lkotlin/Function0;", "", "messageBuilder", "Lh6/A;", "log", "(Lcom/revenuecat/purchases/common/LogIntent;Lkotlin/jvm/functions/Function0;)V", "Lcom/revenuecat/purchases/LogHandler;", "currentLogHandler", "Lcom/revenuecat/purchases/LogHandler;", "getCurrentLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setCurrentLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LogWrapperKt {
    private static com.revenuecat.purchases.LogHandler currentLogHandler = new com.revenuecat.purchases.common.DefaultLogHandler();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.common.LogIntent.values().length];
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.DEBUG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.GOOGLE_WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.INFO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.PURCHASE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.RC_ERROR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.RC_PURCHASE_SUCCESS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.RC_SUCCESS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.USER.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.WARNING.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.AMAZON_WARNING.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.AMAZON_ERROR.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.GALAXY_WARNING.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.revenuecat.purchases.common.LogIntent.GALAXY_ERROR.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.revenuecat.purchases.LogHandler getCurrentLogHandler() {
        return currentLogHandler;
    }

    public static final void log(com.revenuecat.purchases.common.LogIntent intent, kotlin.jvm.functions.Function0 messageBuilder) {
        kotlin.jvm.internal.m.e(intent, "intent");
        kotlin.jvm.internal.m.e(messageBuilder, "messageBuilder");
        com.revenuecat.purchases.common.LogWrapperKt$log$fullMessageBuilder$1 logWrapperKt$log$fullMessageBuilder$1 = new com.revenuecat.purchases.common.LogWrapperKt$log$fullMessageBuilder$1(intent, messageBuilder);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[intent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler2.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 2:
                getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler3.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler5.d(com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 6:
                getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler6.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler7.d(com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler8 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler8.d(com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler9 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler9.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler10 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler10.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 12:
                getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler11 = getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler11.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke());
                }
                break;
            case 14:
                getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logWrapperKt$log$fullMessageBuilder$1.invoke(), null);
                break;
        }
    }

    public static final void setCurrentLogHandler(com.revenuecat.purchases.LogHandler logHandler) {
        kotlin.jvm.internal.m.e(logHandler, "<set-?>");
        currentLogHandler = logHandler;
    }
}
