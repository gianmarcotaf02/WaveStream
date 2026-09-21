package androidx.media3.exoplayer.audio;

import java.util.function.Function;

public final class c implements Function {
    @Override
    public final Object apply(Object obj) {
        return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
    }
}
