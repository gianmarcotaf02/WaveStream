package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.analytics.PlayerId;

public interface PlayerIdAwareAllocator extends Allocator {
    @Override
    int getTotalBytesAllocated();

    void setPlayerId(PlayerId playerId);
}
