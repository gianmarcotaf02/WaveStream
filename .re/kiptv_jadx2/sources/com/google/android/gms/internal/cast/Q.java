package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;

public final class Q implements E3.k {

    public final N f18805h;

    public Q(N n3) {
        this.f18805h = n3;
    }

    @Override
    public final Status getStatus() {
        return Status.f18685l;
    }

    public final String toString() {
        N n3 = this.f18805h;
        H3.q.g(n3);
        return "OptInOptionsResultImpl[" + (n3.f18797h == 1) + "]";
    }
}
