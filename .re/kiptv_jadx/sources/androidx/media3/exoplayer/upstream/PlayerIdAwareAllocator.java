package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface PlayerIdAwareAllocator extends androidx.media3.exoplayer.upstream.Allocator {
    @Override // androidx.media3.exoplayer.upstream.Allocator
    int getTotalBytesAllocated();

    void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId);
}
