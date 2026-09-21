package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.core.app.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.core.app.K f16069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.app.PendingIntent f16070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.app.PendingIntent f16071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.app.PendingIntent f16072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16073f;
    public java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Integer f16074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.core.graphics.drawable.IconCompat f16075i;
    public java.lang.CharSequence j;

    @Override // androidx.core.app.C
    public final void addCompatExtras(android.os.Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putInt("android.callType", this.f16068a);
        bundle.putBoolean("android.callIsVideo", this.f16073f);
        androidx.core.app.K k9 = this.f16069b;
        if (k9 != null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                k9.getClass();
                bundle.putParcelable("android.callPerson", androidx.core.app.q.b(D1.AbstractC0225j.u(k9)));
            } else {
                bundle.putParcelable("android.callPersonCompat", k9.b());
            }
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = this.f16075i;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", androidx.core.app.p.a(iconCompat.i(this.mBuilder.f16045a)));
        }
        bundle.putCharSequence("android.verificationText", this.j);
        bundle.putParcelable("android.answerIntent", this.f16070c);
        bundle.putParcelable("android.declineIntent", this.f16071d);
        bundle.putParcelable("android.hangUpIntent", this.f16072e);
        java.lang.Integer num = this.g;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        java.lang.Integer num2 = this.f16074h;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // androidx.core.app.C
    public final void apply(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        int i3 = android.os.Build.VERSION.SDK_INT;
        java.lang.String string = null;
        callStyleA = null;
        android.app.Notification.CallStyle callStyleA = null;
        if (i3 < 31) {
            android.app.Notification.Builder builder = ((androidx.core.app.E) interfaceC1487g).f15975b;
            androidx.core.app.K k9 = this.f16069b;
            builder.setContentTitle(k9 != null ? k9.f15998a : null);
            android.os.Bundle bundle = this.mBuilder.f16061s;
            java.lang.CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.mBuilder.f16061s.getCharSequence("android.text");
            if (charSequence == null) {
                int i9 = this.f16068a;
                if (i9 == 1) {
                    string = this.mBuilder.f16045a.getResources().getString(com.kiptv.tv.R.string.call_notification_incoming_text);
                } else if (i9 == 2) {
                    string = this.mBuilder.f16045a.getResources().getString(com.kiptv.tv.R.string.call_notification_ongoing_text);
                } else if (i9 == 3) {
                    string = this.mBuilder.f16045a.getResources().getString(com.kiptv.tv.R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            androidx.core.app.K k10 = this.f16069b;
            if (k10 != null) {
                androidx.core.graphics.drawable.IconCompat iconCompat = k10.f15999b;
                if (iconCompat != null) {
                    androidx.core.app.p.b(builder, iconCompat.i(this.mBuilder.f16045a));
                }
                if (i3 >= 28) {
                    androidx.core.app.K k11 = this.f16069b;
                    k11.getClass();
                    androidx.core.app.q.a(builder, D1.AbstractC0225j.u(k11));
                } else {
                    androidx.core.app.o.a(builder, this.f16069b.f16000c);
                }
            }
            androidx.core.app.o.b(builder, "call");
            return;
        }
        int i10 = this.f16068a;
        if (i10 == 1) {
            androidx.core.app.K k12 = this.f16069b;
            k12.getClass();
            callStyleA = androidx.core.app.r.a(D1.AbstractC0225j.u(k12), this.f16071d, this.f16070c);
        } else if (i10 == 2) {
            androidx.core.app.K k13 = this.f16069b;
            k13.getClass();
            callStyleA = androidx.core.app.r.b(D1.AbstractC0225j.u(k13), this.f16072e);
        } else if (i10 == 3) {
            androidx.core.app.K k14 = this.f16069b;
            k14.getClass();
            callStyleA = androidx.core.app.r.c(D1.AbstractC0225j.u(k14), this.f16072e, this.f16070c);
        } else if (android.util.Log.isLoggable("NotifCompat", 3)) {
            android.util.Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + java.lang.String.valueOf(this.f16068a));
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(((androidx.core.app.E) interfaceC1487g).f15975b);
            java.lang.Integer num = this.g;
            if (num != null) {
                androidx.core.app.r.d(callStyleA, num.intValue());
            }
            java.lang.Integer num2 = this.f16074h;
            if (num2 != null) {
                androidx.core.app.r.e(callStyleA, num2.intValue());
            }
            androidx.core.app.r.h(callStyleA, this.j);
            androidx.core.graphics.drawable.IconCompat iconCompat2 = this.f16075i;
            if (iconCompat2 != null) {
                androidx.core.app.r.g(callStyleA, iconCompat2.i(this.mBuilder.f16045a));
            }
            androidx.core.app.r.f(callStyleA, this.f16073f);
        }
    }

    public final androidx.core.app.C1489i c(int i3, int i9, java.lang.Integer num, int i10, android.app.PendingIntent pendingIntent) {
        if (num == null) {
            num = java.lang.Integer.valueOf(this.mBuilder.f16045a.getColor(i10));
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) this.mBuilder.f16045a.getResources().getString(i9));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        androidx.core.app.C1489i c1489iA = new androidx.core.app.C1488h(androidx.core.graphics.drawable.IconCompat.d(this.mBuilder.f16045a, i3), spannableStringBuilder, pendingIntent, new android.os.Bundle()).a();
        c1489iA.f16031a.putBoolean("key_action_priority", true);
        return c1489iA;
    }

    @Override // androidx.core.app.C
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // androidx.core.app.C
    public final java.lang.String getClassName() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // androidx.core.app.C
    public final void restoreFromCompatExtras(android.os.Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.f16068a = bundle.getInt("android.callType");
        this.f16073f = bundle.getBoolean("android.callIsVideo");
        if (android.os.Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f16069b = D1.AbstractC0225j.d(H2.w.b(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f16069b = androidx.core.app.K.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.f16075i = androidx.core.graphics.drawable.IconCompat.b((android.graphics.drawable.Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f16075i = androidx.core.graphics.drawable.IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.j = bundle.getCharSequence("android.verificationText");
        this.f16070c = (android.app.PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f16071d = (android.app.PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f16072e = (android.app.PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.g = bundle.containsKey("android.answerColor") ? java.lang.Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f16074h = bundle.containsKey("android.declineColor") ? java.lang.Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }
}
