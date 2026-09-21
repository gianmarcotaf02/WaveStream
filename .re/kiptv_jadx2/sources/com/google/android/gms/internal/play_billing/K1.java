package com.google.android.gms.internal.play_billing;

import java.util.Objects;

public final class K1 extends I1 {

    public final L1 f19250o;

    public K1(L1 l2) {
        Objects.requireNonNull(l2);
        this.f19250o = l2;
    }

    @Override
    public final String b() {
        J1 j9 = (J1) this.f19250o.f19258h.get();
        return j9 == null ? "Completer object has been garbage collected, future will fail soon" : Y6.f.h("tag=[", String.valueOf(j9.f19239a), "]");
    }
}
