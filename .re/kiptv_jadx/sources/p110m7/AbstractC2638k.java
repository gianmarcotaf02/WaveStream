package p110m7;

/* JADX INFO: renamed from: m7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2638k extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p110m7.C2636i f25493i = p110m7.C2636i.f25489c;
    public boolean j;

    public final void e(p110m7.AbstractC2639l abstractC2639l) {
        p110m7.A a2;
        if (!this.j) {
            this.f25493i = this.f25493i.clone();
            this.j = true;
        }
        p110m7.C2636i c2636i = this.f25493i;
        p110m7.C2636i c2636i2 = abstractC2639l.f25494h;
        c2636i.getClass();
        int i3 = 0;
        while (true) {
            int size = c2636i2.f25490a.f25443i.size();
            a2 = c2636i2.f25490a;
            if (i3 >= size) {
                break;
            }
            c2636i.g((java.util.Map.Entry) a2.f25443i.get(i3));
            i3++;
        }
        java.util.Iterator it = a2.c().iterator();
        while (it.hasNext()) {
            c2636i.g((java.util.Map.Entry) it.next());
        }
    }
}
