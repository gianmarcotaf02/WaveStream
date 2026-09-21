package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public class Period {
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> adaptationSets;
    public final androidx.media3.exoplayer.dash.manifest.Descriptor assetIdentifier;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> eventStreams;
    public final java.lang.String id;
    public final long startMs;

    public Period(java.lang.String str, long j, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list) {
        this(str, j, list, java.util.Collections.EMPTY_LIST, null);
    }

    public int getAdaptationSetIndex(int i3) {
        int size = this.adaptationSets.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.adaptationSets.get(i9).type == i3) {
                return i9;
            }
        }
        return -1;
    }

    public Period(java.lang.String str, long j, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list2) {
        this(str, j, list, list2, null);
    }

    public Period(java.lang.String str, long j, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list2, androidx.media3.exoplayer.dash.manifest.Descriptor descriptor) {
        this.id = str;
        this.startMs = j;
        this.adaptationSets = java.util.Collections.unmodifiableList(list);
        this.eventStreams = java.util.Collections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }
}
