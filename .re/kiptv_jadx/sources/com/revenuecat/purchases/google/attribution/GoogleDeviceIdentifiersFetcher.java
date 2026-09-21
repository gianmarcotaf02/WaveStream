package com.revenuecat.purchases.google.attribution;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/Dispatcher;)V", "Landroid/app/Application;", "applicationContext", "", "getAdvertisingID", "(Landroid/app/Application;)Ljava/lang/String;", "Lkotlin/Function1;", "", "Lh6/A;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lx6/j;)V", "Lcom/revenuecat/purchases/common/Dispatcher;", "noPermissionAdvertisingIdValue", "Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GoogleDeviceIdentifiersFetcher implements com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher {
    private final com.revenuecat.purchases.common.Dispatcher dispatcher;
    private final java.lang.String noPermissionAdvertisingIdValue;

    public GoogleDeviceIdentifiersFetcher(com.revenuecat.purchases.common.Dispatcher dispatcher) {
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.noPermissionAdvertisingIdValue = io.sentry.util.StringUtils.PROPER_NIL_UUID;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final java.lang.String getAdvertisingID(android.app.Application applicationContext) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            H3.D dA = p130p3.a.a(applicationContext);
            java.lang.String str3 = dA.f3941b;
            if (!dA.a()) {
                if (!kotlin.jvm.internal.m.a(str3, this.noPermissionAdvertisingIdValue)) {
                    return str3;
                }
                com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.WARNING;
                com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1 = new com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1(logIntent);
                switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return null;
                        }
                        break;
                    case 2:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                        return null;
                    case 3:
                        com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 4:
                        com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 5:
                        com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return null;
                        }
                        break;
                    case 6:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                        return null;
                    case 7:
                        com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 8:
                        com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return null;
                        }
                        break;
                    case 9:
                        com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return null;
                        }
                        break;
                    case 10:
                        com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 11:
                        com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 12:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                        return null;
                    case 13:
                        com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 14:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                        return null;
                    default:
                        break;
                }
            }
        } catch (D3.g e6) {
            com.revenuecat.purchases.common.LogIntent logIntent2 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR;
            com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2 = new com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2(logIntent2, e6);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d(com.google.android.gms.internal.play_billing.M0.m(logLevel11, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w(com.google.android.gms.internal.play_billing.M0.m(logLevel12, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i(com.google.android.gms.internal.play_billing.M0.m(logLevel13, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d(com.google.android.gms.internal.play_billing.M0.m(logLevel14, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i(com.google.android.gms.internal.play_billing.M0.m(logLevel15, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d(com.google.android.gms.internal.play_billing.M0.m(logLevel16, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d(com.google.android.gms.internal.play_billing.M0.m(logLevel17, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w(com.google.android.gms.internal.play_billing.M0.m(logLevel18, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w(com.google.android.gms.internal.play_billing.M0.m(logLevel19, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(com.google.android.gms.internal.play_billing.M0.m(logLevel20, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
            }
        } catch (java.io.IOException e9) {
            com.revenuecat.purchases.common.LogIntent logIntent3 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR;
            com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5 = new com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5(logIntent3, e9);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel21 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler18 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler18.d(com.google.android.gms.internal.play_billing.M0.m(logLevel21, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel22 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler19 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler19.w(com.google.android.gms.internal.play_billing.M0.m(logLevel22, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel23 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler20 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler20.i(com.google.android.gms.internal.play_billing.M0.m(logLevel23, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel24 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler21 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        currentLogHandler21.d(com.google.android.gms.internal.play_billing.M0.m(logLevel24, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel25 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler22 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler22.i(com.google.android.gms.internal.play_billing.M0.m(logLevel25, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel26 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler23 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler23.d(com.google.android.gms.internal.play_billing.M0.m(logLevel26, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel27 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler24 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler24.d(com.google.android.gms.internal.play_billing.M0.m(logLevel27, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel28 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler25 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler25.w(com.google.android.gms.internal.play_billing.M0.m(logLevel28, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel29 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler26 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler26.w(com.google.android.gms.internal.play_billing.M0.m(logLevel29, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel30 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler27 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler27.w(com.google.android.gms.internal.play_billing.M0.m(logLevel30, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
            }
        } catch (java.lang.NoSuchMethodError unused) {
            com.revenuecat.purchases.common.LogIntent logIntent4 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR;
            com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7 = new com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7(logIntent4);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel31 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler28 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                        currentLogHandler28.d(com.google.android.gms.internal.play_billing.M0.m(logLevel31, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel32 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler29 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                        currentLogHandler29.w(com.google.android.gms.internal.play_billing.M0.m(logLevel32, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel33 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler30 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                        currentLogHandler30.i(com.google.android.gms.internal.play_billing.M0.m(logLevel33, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel34 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler31 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                        currentLogHandler31.d(com.google.android.gms.internal.play_billing.M0.m(logLevel34, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel35 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler32 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                        currentLogHandler32.i(com.google.android.gms.internal.play_billing.M0.m(logLevel35, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel36 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler33 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                        currentLogHandler33.d(com.google.android.gms.internal.play_billing.M0.m(logLevel36, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel37 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler34 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                        currentLogHandler34.d(com.google.android.gms.internal.play_billing.M0.m(logLevel37, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel38 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler35 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                        currentLogHandler35.w(com.google.android.gms.internal.play_billing.M0.m(logLevel38, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel39 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler36 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                        currentLogHandler36.w(com.google.android.gms.internal.play_billing.M0.m(logLevel39, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel40 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler37 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                        currentLogHandler37.w(com.google.android.gms.internal.play_billing.M0.m(logLevel40, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
            }
        } catch (java.lang.NullPointerException e10) {
            com.revenuecat.purchases.common.LogIntent logIntent5 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR;
            com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6 = new com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6(logIntent5, e10);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent5.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel41 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler38 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                        currentLogHandler38.d(com.google.android.gms.internal.play_billing.M0.m(logLevel41, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel42 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler39 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                        currentLogHandler39.w(com.google.android.gms.internal.play_billing.M0.m(logLevel42, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel43 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler40 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                        currentLogHandler40.i(com.google.android.gms.internal.play_billing.M0.m(logLevel43, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel44 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler41 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                        currentLogHandler41.d(com.google.android.gms.internal.play_billing.M0.m(logLevel44, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel45 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler42 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                        currentLogHandler42.i(com.google.android.gms.internal.play_billing.M0.m(logLevel45, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel46 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler43 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel46) <= 0) {
                        currentLogHandler43.d(com.google.android.gms.internal.play_billing.M0.m(logLevel46, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel47 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler44 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel47) <= 0) {
                        currentLogHandler44.d(com.google.android.gms.internal.play_billing.M0.m(logLevel47, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel48 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler45 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel48) <= 0) {
                        currentLogHandler45.w(com.google.android.gms.internal.play_billing.M0.m(logLevel48, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel49 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler46 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel49) <= 0) {
                        currentLogHandler46.w(com.google.android.gms.internal.play_billing.M0.m(logLevel49, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel50 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler47 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel50) <= 0) {
                        currentLogHandler47.w(com.google.android.gms.internal.play_billing.M0.m(logLevel50, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
            }
        } catch (java.util.concurrent.TimeoutException e11) {
            com.revenuecat.purchases.common.LogIntent logIntent6 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR;
            com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4 = new com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4(logIntent6, e11);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent6.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel51 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler48 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel51) <= 0) {
                        currentLogHandler48.d(com.google.android.gms.internal.play_billing.M0.m(logLevel51, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel52 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler49 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel52) <= 0) {
                        currentLogHandler49.w(com.google.android.gms.internal.play_billing.M0.m(logLevel52, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel53 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler50 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel53) <= 0) {
                        currentLogHandler50.i(com.google.android.gms.internal.play_billing.M0.m(logLevel53, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel54 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler51 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel54) <= 0) {
                        currentLogHandler51.d(com.google.android.gms.internal.play_billing.M0.m(logLevel54, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel55 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler52 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel55) <= 0) {
                        currentLogHandler52.i(com.google.android.gms.internal.play_billing.M0.m(logLevel55, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel56 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler53 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel56) <= 0) {
                        currentLogHandler53.d(com.google.android.gms.internal.play_billing.M0.m(logLevel56, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel57 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler54 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel57) <= 0) {
                        currentLogHandler54.d(com.google.android.gms.internal.play_billing.M0.m(logLevel57, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel58 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler55 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel58) <= 0) {
                        currentLogHandler55.w(com.google.android.gms.internal.play_billing.M0.m(logLevel58, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel59 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler56 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel59) <= 0) {
                        currentLogHandler56.w(com.google.android.gms.internal.play_billing.M0.m(logLevel59, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel60 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler57 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel60) <= 0) {
                        currentLogHandler57.w(com.google.android.gms.internal.play_billing.M0.m(logLevel60, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDeviceIdentifiers$lambda$0(com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, android.app.Application application, p194x6.j jVar) {
        jVar.invoke(com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAdvertisingID(application)), new p070h6.k(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), "true"), new p070h6.k(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion.INSTANCE.getBackendKey(), "true"))));
    }

    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(android.app.Application applicationContext, p194x6.j completion) {
        kotlin.jvm.internal.m.e(applicationContext, "applicationContext");
        kotlin.jvm.internal.m.e(completion, "completion");
        com.revenuecat.purchases.common.Dispatcher.enqueue$default(this.dispatcher, new O.g(this, applicationContext, completion, 9), null, 2, null);
    }
}
