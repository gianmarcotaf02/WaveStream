package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f15963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.core.app.K f15965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f15966d = new android.os.Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.String f15967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.net.Uri f15968f;

    public A(java.lang.CharSequence charSequence, long j, androidx.core.app.K k9) {
        this.f15963a = charSequence;
        this.f15964b = j;
        this.f15965c = k9;
    }

    public static android.os.Bundle[] a(java.util.ArrayList arrayList) {
        android.os.Bundle[] bundleArr = new android.os.Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.core.app.A a2 = (androidx.core.app.A) arrayList.get(i3);
            a2.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.CharSequence charSequence = a2.f15963a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", a2.f15964b);
            androidx.core.app.K k9 = a2.f15965c;
            if (k9 != null) {
                bundle.putCharSequence("sender", k9.f15998a);
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", androidx.core.app.z.a(D1.AbstractC0225j.u(k9)));
                } else {
                    bundle.putBundle("person", k9.b());
                }
            }
            java.lang.String str = a2.f15967e;
            if (str != null) {
                bundle.putString("type", str);
            }
            android.net.Uri uri = a2.f15968f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            android.os.Bundle bundle2 = a2.f15966d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i3] = bundle;
        }
        return bundleArr;
    }

    public static java.util.ArrayList b(android.os.Parcelable[] parcelableArr) {
        androidx.core.app.K kD;
        java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArr.length);
        for (android.os.Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof android.os.Bundle) {
                android.os.Bundle bundle = (android.os.Bundle) parcelable;
                androidx.core.app.A a2 = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            kD = androidx.core.app.K.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && android.os.Build.VERSION.SDK_INT >= 28) {
                            kD = D1.AbstractC0225j.d(H2.w.b(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            java.lang.CharSequence charSequence = bundle.getCharSequence("sender");
                            androidx.core.app.K k9 = new androidx.core.app.K();
                            k9.f15998a = charSequence;
                            k9.f15999b = null;
                            k9.f16000c = null;
                            k9.f16001d = null;
                            k9.f16002e = false;
                            k9.f16003f = false;
                            kD = k9;
                        } else {
                            kD = null;
                        }
                        androidx.core.app.A a9 = new androidx.core.app.A(bundle.getCharSequence("text"), bundle.getLong("time"), kD);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            java.lang.String string = bundle.getString("type");
                            android.net.Uri uri = (android.net.Uri) bundle.getParcelable("uri");
                            a9.f15967e = string;
                            a9.f15968f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            a9.f15966d.putAll(bundle.getBundle("extras"));
                        }
                        a2 = a9;
                    }
                } catch (java.lang.ClassCastException unused) {
                }
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public final android.app.Notification.MessagingStyle.Message c() {
        android.app.Notification.MessagingStyle.Message messageA;
        int i3 = android.os.Build.VERSION.SDK_INT;
        long j = this.f15964b;
        java.lang.CharSequence charSequence = this.f15963a;
        androidx.core.app.K k9 = this.f15965c;
        if (i3 >= 28) {
            messageA = androidx.core.app.z.b(charSequence, j, k9 != null ? D1.AbstractC0225j.u(k9) : null);
        } else {
            messageA = androidx.core.app.y.a(charSequence, j, k9 != null ? k9.f15998a : null);
        }
        java.lang.String str = this.f15967e;
        if (str != null) {
            androidx.core.app.y.b(messageA, str, this.f15968f);
        }
        return messageA;
    }
}
