package p099l5;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.crypto.tink.shaded.protobuf.q0;
import io.sentry.protocol.SentryStackFrame;

public final class y {
    Auto(TtmlNode.TEXT_EMPHASIS_AUTO),
    ExoPlayer(SentryStackFrame.JsonKeys.NATIVE),
    MPV("mpv"),
    VLC("vlc");

    public static final x Companion;

    public final String f24812h;

    static {
        q0.t(yVarArr);
        Companion = new x();
    }

    public y(String str) {
        super(str, i);
        this.f24812h = str;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f24811m.clone();
    }
}
