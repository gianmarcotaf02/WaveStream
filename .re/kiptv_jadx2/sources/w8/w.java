package w8;

import M8.C0677e;
import M8.C0685m;
import M8.InterfaceC0683k;
import M8.M;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public final class w extends z {

    public final int f30665a;

    public final q f30666b;

    public final Object f30667c;

    public w(q qVar, Object obj, int i3) {
        this.f30665a = i3;
        this.f30666b = qVar;
        this.f30667c = obj;
    }

    @Override
    public final long contentLength() {
        switch (this.f30665a) {
            case 0:
                return ((File) this.f30667c).length();
            default:
                return ((C0685m) this.f30667c).d();
        }
    }

    @Override
    public final q contentType() {
        switch (this.f30665a) {
            case 0:
                break;
        }
        return this.f30666b;
    }

    @Override
    public final void writeTo(InterfaceC0683k interfaceC0683k) throws IOException {
        Object obj = this.f30667c;
        switch (this.f30665a) {
            case 0:
                Logger logger = M8.y.f7290a;
                File file = (File) obj;
                kotlin.jvm.internal.m.e(file, "<this>");
                C0677e c0677e = new C0677e(new FileInputStream(file), M.f7231d);
                try {
                    ((M8.D) interfaceC0683k).M(c0677e);
                    c0677e.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1833d1.l(c0677e, th);
                        throw th2;
                    }
                }
            default:
                ((M8.D) interfaceC0683k).e((C0685m) obj);
                return;
        }
    }
}
