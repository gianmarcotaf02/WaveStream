package androidx.core.app;

import D1.AbstractC0225j;
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.kiptv.tv.R;

public final class s extends C {

    public int f16068a;

    public K f16069b;

    public PendingIntent f16070c;

    public PendingIntent f16071d;

    public PendingIntent f16072e;

    public boolean f16073f;
    public Integer g;

    public Integer f16074h;

    public IconCompat f16075i;
    public CharSequence j;

    @Override
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putInt("android.callType", this.f16068a);
        bundle.putBoolean("android.callIsVideo", this.f16073f);
        K k9 = this.f16069b;
        if (k9 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                k9.getClass();
                bundle.putParcelable("android.callPerson", q.b(AbstractC0225j.u(k9)));
            } else {
                bundle.putParcelable("android.callPersonCompat", k9.b());
            }
        }
        IconCompat iconCompat = this.f16075i;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", p.a(iconCompat.i(this.mBuilder.f16045a)));
        }
        bundle.putCharSequence("android.verificationText", this.j);
        bundle.putParcelable("android.answerIntent", this.f16070c);
        bundle.putParcelable("android.declineIntent", this.f16071d);
        bundle.putParcelable("android.hangUpIntent", this.f16072e);
        Integer num = this.g;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f16074h;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override
    public final void apply(InterfaceC1487g interfaceC1487g) {
        int i3 = Build.VERSION.SDK_INT;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (i3 < 31) {
            Notification.Builder builder = ((E) interfaceC1487g).f15975b;
            K k9 = this.f16069b;
            builder.setContentTitle(k9 != null ? k9.f15998a : null);
            Bundle bundle = this.mBuilder.f16061s;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.mBuilder.f16061s.getCharSequence("android.text");
            if (charSequence == null) {
                int i9 = this.f16068a;
                if (i9 == 1) {
                    string = this.mBuilder.f16045a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i9 == 2) {
                    string = this.mBuilder.f16045a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i9 == 3) {
                    string = this.mBuilder.f16045a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            K k10 = this.f16069b;
            if (k10 != null) {
                IconCompat iconCompat = k10.f15999b;
                if (iconCompat != null) {
                    p.b(builder, iconCompat.i(this.mBuilder.f16045a));
                }
                if (i3 >= 28) {
                    K k11 = this.f16069b;
                    k11.getClass();
                    q.a(builder, AbstractC0225j.u(k11));
                } else {
                    o.a(builder, this.f16069b.f16000c);
                }
            }
            o.b(builder, "call");
            return;
        }
        int i10 = this.f16068a;
        if (i10 == 1) {
            K k12 = this.f16069b;
            k12.getClass();
            callStyleA = r.a(AbstractC0225j.u(k12), this.f16071d, this.f16070c);
        } else if (i10 == 2) {
            K k13 = this.f16069b;
            k13.getClass();
            callStyleA = r.b(AbstractC0225j.u(k13), this.f16072e);
        } else if (i10 == 3) {
            K k14 = this.f16069b;
            k14.getClass();
            callStyleA = r.c(AbstractC0225j.u(k14), this.f16072e, this.f16070c);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f16068a));
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(((E) interfaceC1487g).f15975b);
            Integer num = this.g;
            if (num != null) {
                r.d(callStyleA, num.intValue());
            }
            Integer num2 = this.f16074h;
            if (num2 != null) {
                r.e(callStyleA, num2.intValue());
            }
            r.h(callStyleA, this.j);
            IconCompat iconCompat2 = this.f16075i;
            if (iconCompat2 != null) {
                r.g(callStyleA, iconCompat2.i(this.mBuilder.f16045a));
            }
            r.f(callStyleA, this.f16073f);
        }
    }

    public final C1489i c(int i3, int i9, Integer num, int i10, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.mBuilder.f16045a.getColor(i10));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.mBuilder.f16045a.getResources().getString(i9));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        C1489i c1489iA = new C1488h(IconCompat.d(this.mBuilder.f16045a, i3), spannableStringBuilder, pendingIntent, new Bundle()).a();
        c1489iA.f16031a.putBoolean("key_action_priority", true);
        return c1489iA;
    }

    @Override
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.f16068a = bundle.getInt("android.callType");
        this.f16073f = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f16069b = AbstractC0225j.d(H2.w.b(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f16069b = K.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.f16075i = IconCompat.b((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f16075i = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.j = bundle.getCharSequence("android.verificationText");
        this.f16070c = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f16071d = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f16072e = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.g = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f16074h = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }
}
