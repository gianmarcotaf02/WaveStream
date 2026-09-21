package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p191x3.C3101b;

public final class C1735e {

    public final Context f18890a;

    public final String f18891b;

    public final p191x3.x f18892c;

    public final C3101b f18893d;

    public final BinderC1783q f18894e;

    public C1735e(Context context, C3101b c3101b, BinderC1783q binderC1783q) {
        String strY0;
        boolean zIsEmpty = Collections.unmodifiableList(c3101b.f31169i).isEmpty();
        String str = c3101b.f31168h;
        if (zIsEmpty) {
            strY0 = p184w3.x.a(str);
        } else {
            List listUnmodifiableList = Collections.unmodifiableList(c3101b.f31169i);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (listUnmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            strY0 = p079i7.f.Y0(new p079i7.f(str, listUnmodifiableList, 14));
        }
        this.f18892c = new p191x3.x(this);
        this.f18890a = context.getApplicationContext();
        H3.q.e(strY0);
        this.f18891b = strY0;
        this.f18893d = c3101b;
        this.f18894e = binderC1783q;
    }
}
