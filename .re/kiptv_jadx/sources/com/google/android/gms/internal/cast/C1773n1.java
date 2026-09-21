package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1773n1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B3.C0089b f19006i = new B3.C0089b("FeatureUsageAnalytics", null);
    public static final java.lang.String j = "22.0.0";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static com.google.android.gms.internal.cast.C1773n1 f19007k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.W f19008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f19009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19010c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19014h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f19013f = new java.util.HashSet();
    public final java.util.HashSet g = new java.util.HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z3.d f19012e = new Z3.d(android.os.Looper.getMainLooper(), 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.RunnableC1802v f19011d = new com.google.android.gms.internal.cast.RunnableC1802v(3, this);

    public C1773n1(android.content.SharedPreferences sharedPreferences, com.google.android.gms.internal.cast.W w6, java.lang.String str) {
        this.f19009b = sharedPreferences;
        this.f19008a = w6;
        this.f19010c = str;
    }

    public static void a(com.google.android.gms.internal.cast.EnumC1803v0 enumC1803v0) {
        com.google.android.gms.internal.cast.C1773n1 c1773n1;
        if (!com.google.android.gms.internal.cast.W.f18831k || (c1773n1 = f19007k) == null) {
            return;
        }
        java.lang.String string = java.lang.Integer.toString(enumC1803v0.f19159h);
        android.content.SharedPreferences sharedPreferences = c1773n1.f19009b;
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        java.lang.String strC = p121o0.p.C("feature_usage_timestamp_reported_feature_", string);
        if (!sharedPreferences.contains(strC)) {
            strC = p121o0.p.C("feature_usage_timestamp_detected_feature_", string);
        }
        editorEdit.putLong(strC, java.lang.System.currentTimeMillis()).apply();
        c1773n1.f19013f.add(enumC1803v0);
        c1773n1.f19012e.post(c1773n1.f19011d);
    }

    public static com.google.android.gms.internal.cast.EnumC1803v0 b(java.lang.String str) {
        com.google.android.gms.internal.cast.EnumC1803v0 enumC1803v0 = com.google.android.gms.internal.cast.EnumC1803v0.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        try {
            switch (java.lang.Integer.parseInt(str)) {
                case 0:
                    return enumC1803v0;
                case 1:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAF_CAST_BUTTON;
                case 2:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAF_EXPANDED_CONTROLLER;
                case 3:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAF_MINI_CONTROLLER;
                case 4:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_CONTEXT;
                case 6:
                    return com.google.android.gms.internal.cast.EnumC1803v0.IMAGE_CACHE;
                case 7:
                    return com.google.android.gms.internal.cast.EnumC1803v0.IMAGE_PICKER;
                case 8:
                    return com.google.android.gms.internal.cast.EnumC1803v0.AD_BREAK_PARSER;
                case 9:
                    return com.google.android.gms.internal.cast.EnumC1803v0.UI_STYLE;
                case 10:
                    return com.google.android.gms.internal.cast.EnumC1803v0.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return com.google.android.gms.internal.cast.EnumC1803v0.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return com.google.android.gms.internal.cast.EnumC1803v0.PAUSE_CONTROLLER;
                case 13:
                    return com.google.android.gms.internal.cast.EnumC1803v0.SEEK_CONTROLLER;
                case 14:
                    return com.google.android.gms.internal.cast.EnumC1803v0.STREAM_VOLUME;
                case 15:
                    return com.google.android.gms.internal.cast.EnumC1803v0.UI_MEDIA_CONTROLLER;
                case 16:
                    return com.google.android.gms.internal.cast.EnumC1803v0.PLAYBACK_RATE_CONTROLLER;
                case 17:
                    return com.google.android.gms.internal.cast.EnumC1803v0.PRECACHE;
                case 18:
                    return com.google.android.gms.internal.cast.EnumC1803v0.INSTRUCTIONS_VIEW;
                case 19:
                    return com.google.android.gms.internal.cast.EnumC1803v0.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return com.google.android.gms.internal.cast.EnumC1803v0.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return com.google.android.gms.internal.cast.EnumC1803v0.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return com.google.android.gms.internal.cast.EnumC1803v0.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return com.google.android.gms.internal.cast.EnumC1803v0.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case 24:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case 25:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case 26:
                    return com.google.android.gms.internal.cast.EnumC1803v0.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case 27:
                    return com.google.android.gms.internal.cast.EnumC1803v0.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case 28:
                    return com.google.android.gms.internal.cast.EnumC1803v0.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case 29:
                    return com.google.android.gms.internal.cast.EnumC1803v0.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return com.google.android.gms.internal.cast.EnumC1803v0.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case 33:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case 34:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case 35:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_OUTPUT_SWITCHER_ENABLED;
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case 37:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_BUTTON_DELEGATE;
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case 40:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case 41:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_TRANSFER_TO_LOCAL_USED;
                case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                    return com.google.android.gms.internal.cast.EnumC1803v0.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 43:
                    return com.google.android.gms.internal.cast.EnumC1803v0.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 44:
                    return com.google.android.gms.internal.cast.EnumC1803v0.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                    return com.google.android.gms.internal.cast.EnumC1803v0.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 46:
                    return com.google.android.gms.internal.cast.EnumC1803v0.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case 47:
                    return com.google.android.gms.internal.cast.EnumC1803v0.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAF_NOTIFICATION_SERVICE;
                case 50:
                    return com.google.android.gms.internal.cast.EnumC1803v0.HARDWARE_VOLUME_BUTTON_PRESS;
                case 51:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case 52:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return com.google.android.gms.internal.cast.EnumC1803v0.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return com.google.android.gms.internal.cast.EnumC1803v0.CAF_MEDIA_NOTIFICATION_PROXY;
                case 56:
                    return com.google.android.gms.internal.cast.EnumC1803v0.REMOTE_CONNECTION_MANAGER_ACQUIRED;
                case 57:
                    return com.google.android.gms.internal.cast.EnumC1803v0.REMOTE_CONNECTION_CALLBACK_SET;
                default:
                    return null;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
    }

    public final void c(java.util.HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = this.f19009b.edit();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            editorEdit.remove((java.lang.String) it.next());
        }
        editorEdit.apply();
    }
}
