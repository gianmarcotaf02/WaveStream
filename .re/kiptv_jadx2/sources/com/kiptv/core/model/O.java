package com.kiptv.core.model;

import com.google.android.gms.internal.play_billing.M0;

public final class O extends Q {

    public final int f19897h;

    public O(int i3) {
        super(M0.l(i3, "M3U download failed with status "));
        this.f19897h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O) && this.f19897h == ((O) obj).f19897h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19897h);
    }

    @Override
    public final String toString() {
        return Y6.f.k(new StringBuilder("DownloadFailed(statusCode="), this.f19897h, ")");
    }
}
