package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class FlagSet {
    private final android.util.SparseBooleanArray flags;

    public boolean contains(int i3) {
        return this.flags.get(i3);
    }

    public boolean containsAny(int... iArr) {
        for (int i3 : iArr) {
            if (contains(i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.media3.common.FlagSet) {
            return this.flags.equals(((androidx.media3.common.FlagSet) obj).flags);
        }
        return false;
    }

    public int get(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, size());
        return this.flags.keyAt(i3);
    }

    public int hashCode() {
        return this.flags.hashCode();
    }

    public int size() {
        return this.flags.size();
    }

    public static final class Builder {
        private boolean buildCalled;
        private final android.util.SparseBooleanArray flags = new android.util.SparseBooleanArray();

        public androidx.media3.common.FlagSet.Builder add(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.flags.append(i3, true);
            return this;
        }

        public androidx.media3.common.FlagSet.Builder addAll(int... iArr) {
            for (int i3 : iArr) {
                add(i3);
            }
            return this;
        }

        public androidx.media3.common.FlagSet.Builder addIf(int i3, boolean z6) {
            return z6 ? add(i3) : this;
        }

        public androidx.media3.common.FlagSet build() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.buildCalled = true;
            return new androidx.media3.common.FlagSet(this.flags);
        }

        public androidx.media3.common.FlagSet.Builder remove(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.flags.delete(i3);
            return this;
        }

        public androidx.media3.common.FlagSet.Builder removeAll(int... iArr) {
            for (int i3 : iArr) {
                remove(i3);
            }
            return this;
        }

        public androidx.media3.common.FlagSet.Builder removeIf(int i3, boolean z6) {
            return z6 ? remove(i3) : this;
        }

        public androidx.media3.common.FlagSet.Builder addAll(androidx.media3.common.FlagSet flagSet) {
            for (int i3 = 0; i3 < flagSet.size(); i3++) {
                add(flagSet.get(i3));
            }
            return this;
        }
    }

    private FlagSet(android.util.SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }

    public boolean containsAny(androidx.media3.common.FlagSet flagSet) {
        for (int i3 = 0; i3 < flagSet.size(); i3++) {
            if (contains(flagSet.get(i3))) {
                return true;
            }
        }
        return false;
    }
}
