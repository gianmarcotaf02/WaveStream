package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4AlternateGroupData implements androidx.media3.common.Metadata.Entry {
    public final int alternateGroup;

    public Mp4AlternateGroupData(int i3) {
        this.alternateGroup = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.media3.container.Mp4AlternateGroupData) && this.alternateGroup == ((androidx.media3.container.Mp4AlternateGroupData) obj).alternateGroup;
    }

    public int hashCode() {
        return this.alternateGroup;
    }

    public java.lang.String toString() {
        return "Mp4AlternateGroup: " + this.alternateGroup;
    }
}
