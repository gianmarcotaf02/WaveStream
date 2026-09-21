package p110m7;

import java.util.Iterator;
import java.util.Map;

public abstract class AbstractC2638k extends AbstractC2637j implements v {

    public C2636i f25493i = C2636i.f25489c;
    public boolean j;

    public final void e(AbstractC2639l abstractC2639l) {
        A a2;
        if (!this.j) {
            this.f25493i = this.f25493i.clone();
            this.j = true;
        }
        C2636i c2636i = this.f25493i;
        C2636i c2636i2 = abstractC2639l.f25494h;
        c2636i.getClass();
        int i3 = 0;
        while (true) {
            int size = c2636i2.f25490a.f25443i.size();
            a2 = c2636i2.f25490a;
            if (i3 >= size) {
                break;
            }
            c2636i.g((Map.Entry) a2.f25443i.get(i3));
            i3++;
        }
        Iterator it = a2.c().iterator();
        while (it.hasNext()) {
            c2636i.g((Map.Entry) it.next());
        }
    }
}
