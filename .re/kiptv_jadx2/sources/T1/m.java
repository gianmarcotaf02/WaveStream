package T1;

import android.os.Trace;

public final class m implements Runnable {

    public final int f9697h;

    public m(int i3) {
        this.f9697h = i3;
    }

    @Override
    public final void run() {
        switch (this.f9697h) {
            case 0:
                try {
                    int i3 = p204z1.d.f32142a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.d()) {
                        j.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i9 = p204z1.d.f32142a;
                    Trace.endSection();
                }
            default:
                return;
        }
    }

    private final void a() {
    }
}
