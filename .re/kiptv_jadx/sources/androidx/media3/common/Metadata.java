package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata {
    private final androidx.media3.common.Metadata.Entry[] entries;
    public final long presentationTimeUs;

    public interface Entry {
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default androidx.media3.common.Format getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        }
    }

    public Metadata(androidx.media3.common.Metadata.Entry... entryArr) {
        this(androidx.media3.common.C.TIME_UNSET, entryArr);
    }

    private <T extends androidx.media3.common.Metadata.Entry> T entryIfMatches(androidx.media3.common.Metadata.Entry entry, java.lang.Class<T> cls, p068h4.l lVar) {
        if (!cls.isAssignableFrom(entry.getClass())) {
            return null;
        }
        T tCast = cls.cast(entry);
        if (lVar.apply(tCast)) {
            return tCast;
        }
        return null;
    }

    public androidx.media3.common.Metadata copyWithAppendedEntries(androidx.media3.common.Metadata.Entry... entryArr) {
        return entryArr.length == 0 ? this : new androidx.media3.common.Metadata(this.presentationTimeUs, (androidx.media3.common.Metadata.Entry[]) androidx.media3.common.util.Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    public androidx.media3.common.Metadata copyWithAppendedEntriesFrom(androidx.media3.common.Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public androidx.media3.common.Metadata copyWithPresentationTimeUs(long j) {
        return this.presentationTimeUs == j ? this : new androidx.media3.common.Metadata(j, this.entries);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.Metadata.class == obj.getClass()) {
            androidx.media3.common.Metadata metadata = (androidx.media3.common.Metadata) obj;
            if (java.util.Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs) {
                return true;
            }
        }
        return false;
    }

    public androidx.media3.common.Metadata.Entry get(int i3) {
        return this.entries[i3];
    }

    public <T extends androidx.media3.common.Metadata.Entry> p076i4.AbstractC2186b0 getEntriesOfType(java.lang.Class<T> cls) {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (androidx.media3.common.Metadata.Entry entry : this.entries) {
            if (cls.isAssignableFrom(entry.getClass())) {
                yS.c(cls.cast(entry));
            }
        }
        return yS.f();
    }

    public <T extends androidx.media3.common.Metadata.Entry> T getFirstEntryOfType(java.lang.Class<T> cls) {
        return (T) getFirstMatchingEntry(cls, p068h4.r.f22499h);
    }

    public <T extends androidx.media3.common.Metadata.Entry> T getFirstMatchingEntry(java.lang.Class<T> cls, p068h4.l lVar) {
        for (androidx.media3.common.Metadata.Entry entry : this.entries) {
            T t9 = (T) entryIfMatches(entry, cls, lVar);
            if (t9 != null) {
                return t9;
            }
        }
        return null;
    }

    public <T extends androidx.media3.common.Metadata.Entry> p076i4.AbstractC2186b0 getMatchingEntries(java.lang.Class<T> cls, p068h4.l lVar) {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (androidx.media3.common.Metadata.Entry entry : this.entries) {
            androidx.media3.common.Metadata.Entry entryEntryIfMatches = entryIfMatches(entry, cls, lVar);
            if (entryEntryIfMatches != null) {
                yS.c(entryEntryIfMatches);
            }
        }
        return yS.f();
    }

    public int hashCode() {
        return com.google.android.gms.internal.play_billing.V0.v(this.presentationTimeUs) + (java.util.Arrays.hashCode(this.entries) * 31);
    }

    public int length() {
        return this.entries.length;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("entries=");
        sb.append(java.util.Arrays.toString(this.entries));
        if (this.presentationTimeUs == androidx.media3.common.C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.presentationTimeUs;
        }
        sb.append(str);
        return sb.toString();
    }

    public Metadata(long j, androidx.media3.common.Metadata.Entry... entryArr) {
        this.presentationTimeUs = j;
        this.entries = entryArr;
    }

    public Metadata(java.util.List<? extends androidx.media3.common.Metadata.Entry> list) {
        this((androidx.media3.common.Metadata.Entry[]) list.toArray(new androidx.media3.common.Metadata.Entry[0]));
    }

    public Metadata(long j, java.util.List<? extends androidx.media3.common.Metadata.Entry> list) {
        this(j, (androidx.media3.common.Metadata.Entry[]) list.toArray(new androidx.media3.common.Metadata.Entry[0]));
    }
}
