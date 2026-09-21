package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionArray {
    private int hashCode;
    public final int length;
    private final androidx.media3.exoplayer.trackselection.TrackSelection[] trackSelections;

    public TrackSelectionArray(androidx.media3.exoplayer.trackselection.TrackSelection... trackSelectionArr) {
        this.trackSelections = trackSelectionArr;
        this.length = trackSelectionArr.length;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.media3.exoplayer.trackselection.TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.trackSelections, ((androidx.media3.exoplayer.trackselection.TrackSelectionArray) obj).trackSelections);
    }

    public androidx.media3.exoplayer.trackselection.TrackSelection get(int i3) {
        return this.trackSelections[i3];
    }

    public androidx.media3.exoplayer.trackselection.TrackSelection[] getAll() {
        return (androidx.media3.exoplayer.trackselection.TrackSelection[]) this.trackSelections.clone();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 527 + java.util.Arrays.hashCode(this.trackSelections);
        }
        return this.hashCode;
    }
}
