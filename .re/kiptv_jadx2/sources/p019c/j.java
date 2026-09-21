package p019c;

import T7.d;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;

public final class j extends o implements Function0 {

    public final int f18047h;

    public final k f18048i;

    public j(k kVar, int i3) {
        super(0);
        this.f18047h = i3;
        this.f18048i = kVar;
    }

    @Override
    public final Object invoke() {
        switch (this.f18047h) {
            case 0:
                k kVar = this.f18048i;
                return new a0(kVar.getApplication(), kVar, kVar.getIntent() != null ? kVar.getIntent().getExtras() : null);
            case 1:
                this.f18048i.reportFullyDrawn();
                return A.f22523a;
            case 2:
                k kVar2 = this.f18048i;
                return new m(kVar2.f18053m, new j(kVar2, 1));
            default:
                k kVar3 = this.f18048i;
                u uVar = new u(new c(kVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (m.a(Looper.myLooper(), Looper.getMainLooper())) {
                        kVar3.f16022h.a(new e(uVar, kVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new d(kVar3, uVar, 11));
                    }
                }
                return uVar;
        }
    }
}
