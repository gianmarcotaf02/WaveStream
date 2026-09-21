package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a!\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a!\u0010\u000e\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a@\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0011\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/LogLevel$Companion;", "", "enabled", "Lcom/revenuecat/purchases/LogLevel;", "debugLogsEnabled", "(Lcom/revenuecat/purchases/LogLevel$Companion;Z)Lcom/revenuecat/purchases/LogLevel;", "Lkotlin/Function0;", "", "messageBuilder", "Lh6/A;", "verboseLog", "(Lkotlin/jvm/functions/Function0;)V", "debugLog", "infoLog", "warnLog", "", "throwable", "errorLog", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "level", "Lkotlin/Function2;", io.sentry.SentryEvent.JsonKeys.LOGGER, "logIfEnabled", "(Lcom/revenuecat/purchases/LogLevel;Lx6/m;Lkotlin/jvm/functions/Function0;)V", "Lcom/revenuecat/purchases/PurchasesError;", "error", "(Lcom/revenuecat/purchases/PurchasesError;)V", "PURCHASES_LOG_TAG", "Ljava/lang/String;", "getDebugLogsEnabled", "(Lcom/revenuecat/purchases/LogLevel;)Z", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LogUtilsKt {
    private static final java.lang.String PURCHASES_LOG_TAG = "[Purchases]";

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.PurchasesErrorCode.values().length];
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.UnknownError.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.NetworkError.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.ReceiptAlreadyInUseError.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.UnexpectedBackendResponseError.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.InvalidAppUserIdError.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.OperationAlreadyInProgressError.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.UnknownBackendError.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.LogOutWithAnonymousUserError.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.ConfigurationError.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.UnsupportedError.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.EmptySubscriberAttributesError.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.CustomerInfoError.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.SignatureVerificationError.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.InvalidSubscriberAttributesError.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.TestStoreSimulatedPurchaseError.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.PurchaseCancelledError.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.StoreProblemError.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.PurchaseNotAllowedError.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.ProductNotAvailableForPurchaseError.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.ProductAlreadyPurchasedError.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.InvalidReceiptError.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.MissingReceiptFileError.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.InvalidAppleSubscriptionKeyError.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.IneligibleError.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.InsufficientPermissionsError.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.PaymentPendingError.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesErrorCode.InvalidCredentialsError.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void debugLog(kotlin.jvm.functions.Function0 messageBuilder) {
        kotlin.jvm.internal.m.e(messageBuilder, "messageBuilder");
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) messageBuilder.invoke());
        }
    }

    public static final com.revenuecat.purchases.LogLevel debugLogsEnabled(com.revenuecat.purchases.LogLevel.Companion companion, boolean z6) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        return z6 ? com.revenuecat.purchases.LogLevel.DEBUG : com.revenuecat.purchases.LogLevel.INFO;
    }

    public static final void errorLog(java.lang.Throwable th, kotlin.jvm.functions.Function0 messageBuilder) {
        kotlin.jvm.internal.m.e(messageBuilder, "messageBuilder");
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) messageBuilder.invoke(), th);
    }

    public static /* synthetic */ void errorLog$default(java.lang.Throwable th, kotlin.jvm.functions.Function0 messageBuilder, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        kotlin.jvm.internal.m.e(messageBuilder, "messageBuilder");
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) messageBuilder.invoke(), th);
    }

    public static final boolean getDebugLogsEnabled(com.revenuecat.purchases.LogLevel logLevel) {
        kotlin.jvm.internal.m.e(logLevel, "<this>");
        return logLevel.compareTo(com.revenuecat.purchases.LogLevel.DEBUG) <= 0;
    }

    public static final void infoLog(kotlin.jvm.functions.Function0 messageBuilder) {
        kotlin.jvm.internal.m.e(messageBuilder, "messageBuilder");
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.INFO;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.i(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) messageBuilder.invoke());
        }
    }

    private static final void logIfEnabled(com.revenuecat.purchases.LogLevel logLevel, p194x6.m mVar, kotlin.jvm.functions.Function0 function0) {
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            mVar.invoke(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), function0.invoke());
        }
    }

    public static final void verboseLog(kotlin.jvm.functions.Function0 messageBuilder) {
        kotlin.jvm.internal.m.e(messageBuilder, "messageBuilder");
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) messageBuilder.invoke());
        }
    }

    public static final void warnLog(kotlin.jvm.functions.Function0 messageBuilder) {
        kotlin.jvm.internal.m.e(messageBuilder, "messageBuilder");
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.WARN;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.w(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) messageBuilder.invoke());
        }
    }

    public static final void errorLog(com.revenuecat.purchases.PurchasesError error) {
        kotlin.jvm.internal.m.e(error, "error");
        switch (com.revenuecat.purchases.common.LogUtilsKt.WhenMappings.$EnumSwitchMapping$0[error.getCode().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.RC_ERROR;
                com.revenuecat.purchases.common.LogUtilsKt$errorLog$$inlined$log$1 logUtilsKt$errorLog$$inlined$log$1 = new com.revenuecat.purchases.common.LogUtilsKt$errorLog$$inlined$log$1(logIntent, error);
                switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 2:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                        com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler4.d(com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 6:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                        com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler6.d(com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 9:
                        com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                        com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler7.d(com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 10:
                        com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler8.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler9.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler10.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                com.revenuecat.purchases.common.LogIntent logIntent2 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR;
                com.revenuecat.purchases.common.LogUtilsKt$errorLog$$inlined$log$2 logUtilsKt$errorLog$$inlined$log$2 = new com.revenuecat.purchases.common.LogUtilsKt$errorLog$$inlined$log$2(logIntent2, error);
                switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                        com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            currentLogHandler11.d(com.google.android.gms.internal.play_billing.M0.m(logLevel11, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 2:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler12.w(com.google.android.gms.internal.play_billing.M0.m(logLevel12, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 4:
                        com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler13.i(com.google.android.gms.internal.play_billing.M0.m(logLevel13, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 5:
                        com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                        com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler14.d(com.google.android.gms.internal.play_billing.M0.m(logLevel14, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 6:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler15.i(com.google.android.gms.internal.play_billing.M0.m(logLevel15, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 8:
                        com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                        com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler16.d(com.google.android.gms.internal.play_billing.M0.m(logLevel16, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 9:
                        com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                        com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler17.d(com.google.android.gms.internal.play_billing.M0.m(logLevel17, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 10:
                        com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler18 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler18.w(com.google.android.gms.internal.play_billing.M0.m(logLevel18, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 11:
                        com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler19 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                            currentLogHandler19.w(com.google.android.gms.internal.play_billing.M0.m(logLevel19, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 12:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler20 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                            currentLogHandler20.w(com.google.android.gms.internal.play_billing.M0.m(logLevel20, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 14:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                }
                break;
        }
    }
}
