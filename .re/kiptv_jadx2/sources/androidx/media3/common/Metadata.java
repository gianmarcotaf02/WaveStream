package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.V0;
import java.util.Arrays;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.Y;

public final class Metadata {
    private final Entry[] entries;
    public final long presentationTimeUs;

    public interface Entry {
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default Format getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(MediaMetadata.Builder builder) {
        }
    }

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }

    private <T extends Entry> T entryIfMatches(Entry entry, Class<T> cls, p068h4.l lVar) {
        if (!cls.isAssignableFrom(entry.getClass())) {
            return null;
        }
        T tCast = cls.cast(entry);
        if (lVar.apply(tCast)) {
            return tCast;
        }
        return null;
    }

    public Metadata copyWithAppendedEntries(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.presentationTimeUs, (Entry[]) Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    public Metadata copyWithAppendedEntriesFrom(Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public Metadata copyWithPresentationTimeUs(long j) {
        return this.presentationTimeUs == j ? this : new Metadata(j, this.entries);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs) {
                return true;
            }
        }
        return false;
    }

    public Entry get(int i3) {
        return this.entries[i3];
    }

    public <T extends Entry> AbstractC2186b0 getEntriesOfType(Class<T> cls) {
        Y yS = AbstractC2186b0.s();
        for (Entry entry : this.entries) {
            if (cls.isAssignableFrom(entry.getClass())) {
                yS.c(cls.cast(entry));
            }
        }
        return yS.f();
    }

    public <T extends Entry> T getFirstEntryOfType(Class<T> cls) {
        return (T) getFirstMatchingEntry(cls, p068h4.r.f22499h);
    }

    public <T extends Entry> T getFirstMatchingEntry(Class<T> cls, p068h4.l lVar) {
        for (Entry entry : this.entries) {
            T t9 = (T) entryIfMatches(entry, cls, lVar);
            if (t9 != null) {
                return t9;
            }
        }
        return null;
    }

    public <T extends Entry> AbstractC2186b0 getMatchingEntries(Class<T> cls, p068h4.l lVar) {
        Y yS = AbstractC2186b0.s();
        for (Entry entry : this.entries) {
            Entry entryEntryIfMatches = entryIfMatches(entry, cls, lVar);
            if (entryEntryIfMatches != null) {
                yS.c(entryEntryIfMatches);
            }
        }
        return yS.f();
    }

    public int hashCode() {
        return V0.v(this.presentationTimeUs) + (Arrays.hashCode(this.entries) * 31);
    }

    public int length() {
        return this.entries.length;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.entries));
        if (this.presentationTimeUs == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.presentationTimeUs;
        }
        sb.append(str);
        return sb.toString();
    }

    public Metadata(long j, Entry... entryArr) {
        this.presentationTimeUs = j;
        this.entries = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j, List<? extends Entry> list) {
        this(j, (Entry[]) list.toArray(new Entry[0]));
    }
}
