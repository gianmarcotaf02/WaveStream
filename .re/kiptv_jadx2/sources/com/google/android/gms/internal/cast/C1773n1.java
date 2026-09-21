package com.google.android.gms.internal.cast;

import B3.C0089b;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.ts.TsExtractor;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.util.HashSet;
import java.util.Iterator;

public final class C1773n1 {

    public static final C0089b f19006i = new C0089b("FeatureUsageAnalytics", null);
    public static final String j = "22.0.0";

    public static C1773n1 f19007k;

    public final W f19008a;

    public final SharedPreferences f19009b;

    public final String f19010c;

    public long f19014h;

    public final HashSet f19013f = new HashSet();
    public final HashSet g = new HashSet();

    public final Z3.d f19012e = new Z3.d(Looper.getMainLooper(), 2);

    public final RunnableC1802v f19011d = new RunnableC1802v(3, this);

    public C1773n1(SharedPreferences sharedPreferences, W w6, String str) {
        this.f19009b = sharedPreferences;
        this.f19008a = w6;
        this.f19010c = str;
    }

    public static void a(EnumC1803v0 enumC1803v0) {
        C1773n1 c1773n1;
        if (!W.f18831k || (c1773n1 = f19007k) == null) {
            return;
        }
        String string = Integer.toString(enumC1803v0.f19159h);
        SharedPreferences sharedPreferences = c1773n1.f19009b;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String strC = p121o0.p.C("feature_usage_timestamp_reported_feature_", string);
        if (!sharedPreferences.contains(strC)) {
            strC = p121o0.p.C("feature_usage_timestamp_detected_feature_", string);
        }
        editorEdit.putLong(strC, System.currentTimeMillis()).apply();
        c1773n1.f19013f.add(enumC1803v0);
        c1773n1.f19012e.post(c1773n1.f19011d);
    }

    public static EnumC1803v0 b(String str) {
        EnumC1803v0 enumC1803v0 = EnumC1803v0.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        try {
            switch (Integer.parseInt(str)) {
                case 0:
                    return enumC1803v0;
                case 1:
                    return EnumC1803v0.CAF_CAST_BUTTON;
                case 2:
                    return EnumC1803v0.CAF_EXPANDED_CONTROLLER;
                case 3:
                    return EnumC1803v0.CAF_MINI_CONTROLLER;
                case 4:
                    return EnumC1803v0.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return EnumC1803v0.CAST_CONTEXT;
                case 6:
                    return EnumC1803v0.IMAGE_CACHE;
                case 7:
                    return EnumC1803v0.IMAGE_PICKER;
                case 8:
                    return EnumC1803v0.AD_BREAK_PARSER;
                case 9:
                    return EnumC1803v0.UI_STYLE;
                case 10:
                    return EnumC1803v0.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return EnumC1803v0.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return EnumC1803v0.PAUSE_CONTROLLER;
                case 13:
                    return EnumC1803v0.SEEK_CONTROLLER;
                case 14:
                    return EnumC1803v0.STREAM_VOLUME;
                case 15:
                    return EnumC1803v0.UI_MEDIA_CONTROLLER;
                case 16:
                    return EnumC1803v0.PLAYBACK_RATE_CONTROLLER;
                case 17:
                    return EnumC1803v0.PRECACHE;
                case 18:
                    return EnumC1803v0.INSTRUCTIONS_VIEW;
                case 19:
                    return EnumC1803v0.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return EnumC1803v0.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return EnumC1803v0.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return EnumC1803v0.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return EnumC1803v0.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case 24:
                    return EnumC1803v0.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case 25:
                    return EnumC1803v0.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case 26:
                    return EnumC1803v0.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case 27:
                    return EnumC1803v0.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case 28:
                    return EnumC1803v0.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case 29:
                    return EnumC1803v0.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return EnumC1803v0.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return EnumC1803v0.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return EnumC1803v0.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case 33:
                    return EnumC1803v0.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case 34:
                    return EnumC1803v0.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case 35:
                    return EnumC1803v0.CAST_OUTPUT_SWITCHER_ENABLED;
                case TsExtractor.TS_STREAM_TYPE_H265:
                    return EnumC1803v0.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case 37:
                    return EnumC1803v0.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case FlacConstants.STREAM_INFO_BLOCK_SIZE:
                    return EnumC1803v0.CAST_BUTTON_DELEGATE;
                case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI:
                    return EnumC1803v0.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case 40:
                    return EnumC1803v0.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case 41:
                    return EnumC1803v0.CAST_TRANSFER_TO_LOCAL_USED;
                case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE:
                    return EnumC1803v0.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 43:
                    return EnumC1803v0.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 44:
                    return EnumC1803v0.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case TsExtractor.TS_STREAM_TYPE_MHAS:
                    return EnumC1803v0.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 46:
                    return EnumC1803v0.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case 47:
                    return EnumC1803v0.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED:
                    return EnumC1803v0.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                    return EnumC1803v0.CAF_NOTIFICATION_SERVICE;
                case 50:
                    return EnumC1803v0.HARDWARE_VOLUME_BUTTON_PRESS;
                case 51:
                    return EnumC1803v0.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case 52:
                    return EnumC1803v0.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return EnumC1803v0.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return EnumC1803v0.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return EnumC1803v0.CAF_MEDIA_NOTIFICATION_PROXY;
                case 56:
                    return EnumC1803v0.REMOTE_CONNECTION_MANAGER_ACQUIRED;
                case 57:
                    return EnumC1803v0.REMOTE_CONNECTION_CALLBACK_SET;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
        }
    }

    public final void c(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f19009b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }
}
