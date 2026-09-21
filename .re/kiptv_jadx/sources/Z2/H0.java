package Z2;

/* JADX INFO: loaded from: classes.dex */
public abstract class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f12682a;

    static {
        java.util.HashMap map = new java.util.HashMap(13);
        f12682a = map;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST);
        map.put(io.sentry.ProfilingTraceData.TRUNCATION_REASON_NORMAL, numValueOf);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
        map.put(androidx.media3.extractor.text.ttml.TtmlNode.BOLD, numValueOf2);
        Y6.f.z(1, map, "bolder", -1, "lighter");
        Y6.f.z(100, map, "100", 200, "200");
        map.put("300", java.lang.Integer.valueOf(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.UNSUCCESSFUL));
        map.put("400", numValueOf);
        Y6.f.z(500, map, "500", 600, "600");
        map.put("700", numValueOf2);
        map.put("800", java.lang.Integer.valueOf(org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
        map.put("900", java.lang.Integer.valueOf(org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR));
    }
}
