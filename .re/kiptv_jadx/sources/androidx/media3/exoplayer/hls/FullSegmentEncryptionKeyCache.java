package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class FullSegmentEncryptionKeyCache {
    private final java.util.LinkedHashMap<android.net.Uri, byte[]> backingMap;

    public FullSegmentEncryptionKeyCache(final int i3) {
        this.backingMap = new java.util.LinkedHashMap<android.net.Uri, byte[]>(i3 + 1, 1.0f, false) { // from class: androidx.media3.exoplayer.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(java.util.Map.Entry<android.net.Uri, byte[]> entry) {
                return size() > i3;
            }
        };
    }

    public boolean containsUri(android.net.Uri uri) {
        java.util.LinkedHashMap<android.net.Uri, byte[]> linkedHashMap = this.backingMap;
        uri.getClass();
        return linkedHashMap.containsKey(uri);
    }

    public byte[] get(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.backingMap.get(uri);
    }

    public byte[] put(android.net.Uri uri, byte[] bArr) {
        java.util.LinkedHashMap<android.net.Uri, byte[]> linkedHashMap = this.backingMap;
        uri.getClass();
        bArr.getClass();
        return linkedHashMap.put(uri, bArr);
    }

    public byte[] remove(android.net.Uri uri) {
        java.util.LinkedHashMap<android.net.Uri, byte[]> linkedHashMap = this.backingMap;
        uri.getClass();
        return linkedHashMap.remove(uri);
    }
}
