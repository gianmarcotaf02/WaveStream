package com.google.android.gms.internal.cast;

import B3.C0089b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class BinderC1727c extends AbstractBinderC1743g {
    public static final C0089b g = new C0089b("AppVisibilityProxy", null);

    public static final int f18877h = 1;

    public final Set f18878e;

    public int f18879f;

    public BinderC1727c() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 1);
        this.f18878e = Collections.synchronizedSet(new HashSet());
        this.f18879f = f18877h;
    }
}
