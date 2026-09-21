package p105m2;

import C1.b;
import android.os.Handler;
import android.os.Message;
import androidx.media3.extractor.ts.TsExtractor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.IMediaList;

public final class HandlerC2605c extends Handler {

    public final ArrayList f25272a = new ArrayList();

    public final ArrayList f25273b = new ArrayList();

    public final C2608f f25274c;

    public HandlerC2605c(C2608f c2608f) {
        this.f25274c = c2608f;
    }

    public static void a(C2625x c2625x, int i3, Object obj, int i9) {
        C c9 = c2625x.f25373a;
        int i10 = 65280 & i3;
        AbstractC2624w abstractC2624w = c2625x.f25374b;
        if (i10 != 256) {
            if (i10 != 512) {
                if (i10 == 768 && i3 == 769) {
                    abstractC2624w.getClass();
                }
                return;
            }
            switch (i3) {
                case 513:
                    abstractC2624w.getClass();
                    break;
                case IMediaList.Event.ItemDeleted:
                    abstractC2624w.getClass();
                    break;
                case 515:
                    abstractC2624w.getClass();
                    break;
            }
        }
        A a2 = (i3 == 264 || i3 == 262) ? (A) ((b) obj).f868b : (A) obj;
        A a9 = (i3 == 264 || i3 == 262) ? (A) ((b) obj).f867a : null;
        if (a2 != null) {
            boolean zC = true;
            if ((c2625x.f25376d & 2) == 0 && !a2.e(c2625x.f25375c)) {
                P p2 = C.c().f25301p;
                zC = ((p2 == null ? false : p2.f25228c) && a2.c() && i3 == 262 && i9 == 3 && a9 != null) ? true ^ a9.c() : false;
            }
            if (zC) {
                switch (i3) {
                    case TsExtractor.TS_STREAM_TYPE_AIT:
                        abstractC2624w.a(a2);
                        break;
                    case MediaPlayer.Event.Opening:
                        abstractC2624w.c(a2);
                        break;
                    case MediaPlayer.Event.Buffering:
                        abstractC2624w.b(a2);
                        break;
                    case MediaPlayer.Event.Playing:
                        abstractC2624w.getClass();
                        break;
                    case MediaPlayer.Event.Paused:
                        abstractC2624w.getClass();
                        break;
                    case MediaPlayer.Event.Stopped:
                        abstractC2624w.d(c9, a2, i9);
                        break;
                    case 263:
                        abstractC2624w.e(a2, i9);
                        break;
                    case 264:
                        abstractC2624w.d(c9, a2, i9);
                        break;
                }
            }
        }
    }

    public final void b(int i3, Object obj) {
        obtainMessage(i3, obj).sendToTarget();
    }

    @Override
    public final void handleMessage(Message message) {
        int iL;
        ArrayList arrayList = this.f25272a;
        int i3 = message.what;
        Object obj = message.obj;
        int i9 = message.arg1;
        C2608f c2608f = this.f25274c;
        if (i3 == 259 && c2608f.e().f25195c.equals(((A) obj).f25195c)) {
            c2608f.o(true);
        }
        ArrayList arrayList2 = this.f25273b;
        if (i3 == 262) {
            A a2 = (A) ((b) obj).f868b;
            c2608f.f25289b.t(a2);
            if (c2608f.f25302q != null && a2.c()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c2608f.f25289b.s((A) it.next());
                }
                arrayList2.clear();
            }
        } else if (i3 != 264) {
            switch (i3) {
                case TsExtractor.TS_STREAM_TYPE_AIT:
                    c2608f.f25289b.r((A) obj);
                    break;
                case MediaPlayer.Event.Opening:
                    c2608f.f25289b.s((A) obj);
                    break;
                case MediaPlayer.Event.Buffering:
                    b0 b0Var = c2608f.f25289b;
                    A a9 = (A) obj;
                    b0Var.getClass();
                    if (a9.a() != b0Var && (iL = b0Var.l(a9)) >= 0) {
                        b0Var.y((e0) b0Var.y.get(iL));
                    }
                    break;
            }
        } else {
            A a10 = (A) ((b) obj).f868b;
            arrayList2.add(a10);
            c2608f.f25289b.r(a10);
            c2608f.f25289b.t(a10);
        }
        try {
            int size = c2608f.f25293f.size();
            while (true) {
                size--;
                if (size < 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a((C2625x) it2.next(), i3, obj, i9);
                    }
                    return;
                } else {
                    ArrayList arrayList3 = c2608f.f25293f;
                    C c9 = (C) ((WeakReference) arrayList3.get(size)).get();
                    if (c9 == null) {
                        arrayList3.remove(size);
                    } else {
                        arrayList.addAll(c9.f25215b);
                    }
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}
