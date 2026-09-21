package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator;", "", "<init>", "()V", "", "apiKey", "Lcom/revenuecat/purchases/Store;", "configuredStore", "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "validate", "(Ljava/lang/String;Lcom/revenuecat/purchases/Store;)Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "validationResult", "Lh6/A;", "logValidationResult", "(Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;)V", "Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "getApiKeyPlatform", "(Ljava/lang/String;)Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "validateAndLog", "redactApiKey", "(Ljava/lang/String;)Ljava/lang/String;", "APIKeyPlatform", "ValidationResult", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class APIKeyValidator {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "", "(Ljava/lang/String;I)V", "GOOGLE", "AMAZON", "GALAXY", "LEGACY", "TEST", "OTHER_PLATFORM", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        GALAXY,
        LEGACY,
        TEST,
        OTHER_PLATFORM
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "", "(Ljava/lang/String;I)V", "VALID", "GOOGLE_KEY_AMAZON_STORE", "GOOGLE_KEY_GALAXY_STORE", "AMAZON_KEY_GOOGLE_STORE", "AMAZON_KEY_GALAXY_STORE", "GALAXY_KEY_GOOGLE_STORE", "GALAXY_KEY_AMAZON_STORE", "LEGACY", "SIMULATED_STORE", "OTHER_PLATFORM", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        GOOGLE_KEY_GALAXY_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        AMAZON_KEY_GALAXY_STORE,
        GALAXY_KEY_GOOGLE_STORE,
        GALAXY_KEY_AMAZON_STORE,
        LEGACY,
        SIMULATED_STORE,
        OTHER_PLATFORM
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.APIKeyValidator.ValidationResult.values().length];
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.GALAXY_KEY_GOOGLE_STORE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.GOOGLE_KEY_GALAXY_STORE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.GALAXY_KEY_AMAZON_STORE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.AMAZON_KEY_GALAXY_STORE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.LEGACY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.OTHER_PLATFORM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.SIMULATED_STORE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.revenuecat.purchases.APIKeyValidator.ValidationResult.VALID.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform getApiKeyPlatform(java.lang.String apiKey) {
        if (O7.x.x0(apiKey, "goog_", false)) {
            return com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.GOOGLE;
        }
        if (O7.x.x0(apiKey, "amzn_", false)) {
            return com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.AMAZON;
        }
        if (O7.x.x0(apiKey, "galx_", false)) {
            return com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.GALAXY;
        }
        if (O7.x.x0(apiKey, "test_", false)) {
            return com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.TEST;
        }
        return !O7.q.C0(apiKey, '_') ? com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.LEGACY : com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.OTHER_PLATFORM;
    }

    private final void logValidationResult(com.revenuecat.purchases.APIKeyValidator.ValidationResult validationResult) {
        switch (com.revenuecat.purchases.APIKeyValidator.WhenMappings.$EnumSwitchMapping$0[validationResult.ordinal()]) {
            case 1:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", com.revenuecat.purchases.strings.ConfigureStrings.AMAZON_API_KEY_GOOGLE_STORE, null);
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", com.revenuecat.purchases.strings.ConfigureStrings.GOOGLE_API_KEY_AMAZON_STORE, null);
                break;
            case 3:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", com.revenuecat.purchases.strings.ConfigureStrings.GALAXY_API_KEY_GOOGLE_STORE, null);
                break;
            case 4:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", com.revenuecat.purchases.strings.ConfigureStrings.GOOGLE_API_KEY_GALAXY_STORE, null);
                break;
            case 5:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", com.revenuecat.purchases.strings.ConfigureStrings.GALAXY_API_KEY_AMAZON_STORE, null);
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", com.revenuecat.purchases.strings.ConfigureStrings.AMAZON_API_KEY_GALAXY_STORE, null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    com.google.android.gms.internal.play_billing.M0.t(logLevel, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler, com.revenuecat.purchases.strings.ConfigureStrings.LEGACY_API_KEY);
                }
                break;
            case 8:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", com.revenuecat.purchases.strings.ConfigureStrings.INVALID_API_KEY, null);
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), com.revenuecat.purchases.strings.ConfigureStrings.SIMULATED_STORE_API_KEY);
                }
                break;
        }
    }

    private final com.revenuecat.purchases.APIKeyValidator.ValidationResult validate(java.lang.String apiKey, com.revenuecat.purchases.Store configuredStore) {
        com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(apiKey);
        if (apiKeyPlatform == com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.TEST) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.SIMULATED_STORE;
        }
        com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform aPIKeyPlatform = com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.GOOGLE;
        if (apiKeyPlatform == aPIKeyPlatform && configuredStore == com.revenuecat.purchases.Store.PLAY_STORE) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.VALID;
        }
        com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform aPIKeyPlatform2 = com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.AMAZON;
        if (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == com.revenuecat.purchases.Store.AMAZON) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.VALID;
        }
        com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform aPIKeyPlatform3 = com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.GALAXY;
        if (apiKeyPlatform == aPIKeyPlatform3 && configuredStore == com.revenuecat.purchases.Store.GALAXY) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.VALID;
        }
        if (apiKeyPlatform == aPIKeyPlatform && configuredStore == com.revenuecat.purchases.Store.AMAZON) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.GOOGLE_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == com.revenuecat.purchases.Store.PLAY_STORE) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.AMAZON_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform && configuredStore == com.revenuecat.purchases.Store.GALAXY) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.GOOGLE_KEY_GALAXY_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform3 && configuredStore == com.revenuecat.purchases.Store.PLAY_STORE) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.GALAXY_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform3 && configuredStore == com.revenuecat.purchases.Store.AMAZON) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.GALAXY_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == com.revenuecat.purchases.Store.GALAXY) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.AMAZON_KEY_GALAXY_STORE;
        }
        if (apiKeyPlatform == com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.LEGACY) {
            return com.revenuecat.purchases.APIKeyValidator.ValidationResult.LEGACY;
        }
        return apiKeyPlatform == com.revenuecat.purchases.APIKeyValidator.APIKeyPlatform.OTHER_PLATFORM ? com.revenuecat.purchases.APIKeyValidator.ValidationResult.OTHER_PLATFORM : com.revenuecat.purchases.APIKeyValidator.ValidationResult.OTHER_PLATFORM;
    }

    public final java.lang.String redactApiKey(java.lang.String apiKey) {
        java.lang.String strP1;
        java.lang.String strSubstring;
        kotlin.jvm.internal.m.e(apiKey, "apiKey");
        int iK0 = O7.q.K0(apiKey, '_', 0, 6);
        if (iK0 == -1) {
            strP1 = "";
            strSubstring = apiKey;
        } else {
            int i3 = iK0 + 1;
            strP1 = O7.q.p1(i3, apiKey);
            strSubstring = apiKey.substring(i3);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        }
        if (strSubstring.length() < 6) {
            return apiKey;
        }
        return strP1 + O7.q.p1(2, strSubstring) + "********" + O7.q.q1(4, strSubstring);
    }

    public final com.revenuecat.purchases.APIKeyValidator.ValidationResult validateAndLog(java.lang.String apiKey, com.revenuecat.purchases.Store configuredStore) {
        kotlin.jvm.internal.m.e(apiKey, "apiKey");
        kotlin.jvm.internal.m.e(configuredStore, "configuredStore");
        com.revenuecat.purchases.APIKeyValidator.ValidationResult validationResultValidate = validate(apiKey, configuredStore);
        logValidationResult(validationResultValidate);
        return validationResultValidate;
    }
}
