package com.google.android.gms.cast.framework.media.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Map f18671a;

    static {
        java.util.HashMap map = new java.util.HashMap();
        Y6.f.z(com.kiptv.tv.R.drawable.cast_ic_notification_small_icon, map, "smallIconDrawableResId", com.kiptv.tv.R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId");
        Y6.f.z(com.kiptv.tv.R.drawable.cast_ic_notification_pause, map, "pauseDrawableResId", com.kiptv.tv.R.drawable.cast_ic_notification_play, "playDrawableResId");
        Y6.f.z(com.kiptv.tv.R.drawable.cast_ic_notification_skip_next, map, "skipNextDrawableResId", com.kiptv.tv.R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId");
        Y6.f.z(com.kiptv.tv.R.drawable.cast_ic_notification_forward, map, "forwardDrawableResId", com.kiptv.tv.R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        Y6.f.z(com.kiptv.tv.R.drawable.cast_ic_notification_forward30, map, "forward30DrawableResId", com.kiptv.tv.R.drawable.cast_ic_notification_rewind, "rewindDrawableResId");
        Y6.f.z(com.kiptv.tv.R.drawable.cast_ic_notification_rewind10, map, "rewind10DrawableResId", com.kiptv.tv.R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        Y6.f.z(com.kiptv.tv.R.drawable.cast_ic_notification_disconnect, map, "disconnectDrawableResId", com.kiptv.tv.R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId");
        Y6.f.z(com.kiptv.tv.R.string.cast_casting_to_device, map, "castingToDeviceStringResId", com.kiptv.tv.R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        Y6.f.z(com.kiptv.tv.R.string.cast_pause, map, "pauseStringResId", com.kiptv.tv.R.string.cast_play, "playStringResId");
        Y6.f.z(com.kiptv.tv.R.string.cast_skip_next, map, "skipNextStringResId", com.kiptv.tv.R.string.cast_skip_prev, "skipPrevStringResId");
        Y6.f.z(com.kiptv.tv.R.string.cast_forward, map, "forwardStringResId", com.kiptv.tv.R.string.cast_forward_10, "forward10StringResId");
        Y6.f.z(com.kiptv.tv.R.string.cast_forward_30, map, "forward30StringResId", com.kiptv.tv.R.string.cast_rewind, "rewindStringResId");
        Y6.f.z(com.kiptv.tv.R.string.cast_rewind_10, map, "rewind10StringResId", com.kiptv.tv.R.string.cast_rewind_30, "rewind30StringResId");
        map.put("disconnectStringResId", java.lang.Integer.valueOf(com.kiptv.tv.R.string.cast_disconnect));
        f18671a = java.util.Collections.unmodifiableMap(map);
    }

    public static java.lang.Integer findResourceByName(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (java.lang.Integer) f18671a.get(str);
    }
}
