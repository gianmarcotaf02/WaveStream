package Z2;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.sentry.ProfilingTraceData;
import java.util.HashMap;
import org.videolan.libvlc.media.MediaPlayer;

public abstract class H0 {

    public static final HashMap f12682a;

    static {
        HashMap map = new HashMap(13);
        f12682a = map;
        Integer numValueOf = Integer.valueOf(RCHTTPStatusCodes.BAD_REQUEST);
        map.put(ProfilingTraceData.TRUNCATION_REASON_NORMAL, numValueOf);
        Integer numValueOf2 = Integer.valueOf(MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
        map.put(TtmlNode.BOLD, numValueOf2);
        Y6.f.z(1, map, "bolder", -1, "lighter");
        Y6.f.z(100, map, "100", 200, "200");
        map.put("300", Integer.valueOf(RCHTTPStatusCodes.UNSUCCESSFUL));
        map.put("400", numValueOf);
        Y6.f.z(500, map, "500", 600, "600");
        map.put("700", numValueOf2);
        map.put("800", Integer.valueOf(MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
        map.put("900", Integer.valueOf(MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR));
    }
}
