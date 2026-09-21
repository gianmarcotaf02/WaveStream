package androidx.core.app;

import D1.AbstractC0225j;
import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

public final class A {

    public final CharSequence f15963a;

    public final long f15964b;

    public final K f15965c;

    public final Bundle f15966d = new Bundle();

    public String f15967e;

    public Uri f15968f;

    public A(CharSequence charSequence, long j, K k9) {
        this.f15963a = charSequence;
        this.f15964b = j;
        this.f15965c = k9;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            A a2 = (A) arrayList.get(i3);
            a2.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = a2.f15963a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", a2.f15964b);
            K k9 = a2.f15965c;
            if (k9 != null) {
                bundle.putCharSequence("sender", k9.f15998a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", z.a(AbstractC0225j.u(k9)));
                } else {
                    bundle.putBundle("person", k9.b());
                }
            }
            String str = a2.f15967e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = a2.f15968f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = a2.f15966d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i3] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        K kD;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                A a2 = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            kD = K.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            kD = AbstractC0225j.d(H2.w.b(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            K k9 = new K();
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
                        A a9 = new A(bundle.getCharSequence("text"), bundle.getLong("time"), kD);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            a9.f15967e = string;
                            a9.f15968f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            a9.f15966d.putAll(bundle.getBundle("extras"));
                        }
                        a2 = a9;
                    }
                } catch (ClassCastException unused) {
                }
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message messageA;
        int i3 = Build.VERSION.SDK_INT;
        long j = this.f15964b;
        CharSequence charSequence = this.f15963a;
        K k9 = this.f15965c;
        if (i3 >= 28) {
            messageA = z.b(charSequence, j, k9 != null ? AbstractC0225j.u(k9) : null);
        } else {
            messageA = y.a(charSequence, j, k9 != null ? k9.f15998a : null);
        }
        String str = this.f15967e;
        if (str != null) {
            y.b(messageA, str, this.f15968f);
        }
        return messageA;
    }
}
