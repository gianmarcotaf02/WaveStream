package p105m2;

/* JADX INFO: renamed from: m2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC2605c extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f25272a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f25273b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p105m2.C2608f f25274c;

    public HandlerC2605c(p105m2.C2608f c2608f) {
        this.f25274c = c2608f;
    }

    public static void a(p105m2.C2625x c2625x, int i3, java.lang.Object obj, int i9) {
        p105m2.C c9 = c2625x.f25373a;
        int i10 = 65280 & i3;
        p105m2.AbstractC2624w abstractC2624w = c2625x.f25374b;
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
                case org.videolan.libvlc.interfaces.IMediaList.Event.ItemDeleted /* 514 */:
                    abstractC2624w.getClass();
                    break;
                case 515:
                    abstractC2624w.getClass();
                    break;
            }
        }
        p105m2.A a2 = (i3 == 264 || i3 == 262) ? (p105m2.A) ((C1.b) obj).f868b : (p105m2.A) obj;
        p105m2.A a9 = (i3 == 264 || i3 == 262) ? (p105m2.A) ((C1.b) obj).f867a : null;
        if (a2 != null) {
            boolean zC = true;
            if ((c2625x.f25376d & 2) == 0 && !a2.e(c2625x.f25375c)) {
                p105m2.P p2 = p105m2.C.c().f25301p;
                zC = ((p2 == null ? false : p2.f25228c) && a2.c() && i3 == 262 && i9 == 3 && a9 != null) ? true ^ a9.c() : false;
            }
            if (zC) {
                switch (i3) {
                    case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                        abstractC2624w.a(a2);
                        break;
                    case org.videolan.libvlc.MediaPlayer.Event.Opening /* 258 */:
                        abstractC2624w.c(a2);
                        break;
                    case org.videolan.libvlc.MediaPlayer.Event.Buffering /* 259 */:
                        abstractC2624w.b(a2);
                        break;
                    case org.videolan.libvlc.MediaPlayer.Event.Playing /* 260 */:
                        abstractC2624w.getClass();
                        break;
                    case org.videolan.libvlc.MediaPlayer.Event.Paused /* 261 */:
                        abstractC2624w.getClass();
                        break;
                    case org.videolan.libvlc.MediaPlayer.Event.Stopped /* 262 */:
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

    public final void b(int i3, java.lang.Object obj) {
        obtainMessage(i3, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int iL;
        java.util.ArrayList arrayList = this.f25272a;
        int i3 = message.what;
        java.lang.Object obj = message.obj;
        int i9 = message.arg1;
        p105m2.C2608f c2608f = this.f25274c;
        if (i3 == 259 && c2608f.e().f25195c.equals(((p105m2.A) obj).f25195c)) {
            c2608f.o(true);
        }
        java.util.ArrayList arrayList2 = this.f25273b;
        if (i3 == 262) {
            p105m2.A a2 = (p105m2.A) ((C1.b) obj).f868b;
            c2608f.f25289b.t(a2);
            if (c2608f.f25302q != null && a2.c()) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c2608f.f25289b.s((p105m2.A) it.next());
                }
                arrayList2.clear();
            }
        } else if (i3 != 264) {
            switch (i3) {
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                    c2608f.f25289b.r((p105m2.A) obj);
                    break;
                case org.videolan.libvlc.MediaPlayer.Event.Opening /* 258 */:
                    c2608f.f25289b.s((p105m2.A) obj);
                    break;
                case org.videolan.libvlc.MediaPlayer.Event.Buffering /* 259 */:
                    p105m2.b0 b0Var = c2608f.f25289b;
                    p105m2.A a9 = (p105m2.A) obj;
                    b0Var.getClass();
                    if (a9.a() != b0Var && (iL = b0Var.l(a9)) >= 0) {
                        b0Var.y((p105m2.e0) b0Var.y.get(iL));
                    }
                    break;
            }
        } else {
            p105m2.A a10 = (p105m2.A) ((C1.b) obj).f868b;
            arrayList2.add(a10);
            c2608f.f25289b.r(a10);
            c2608f.f25289b.t(a10);
        }
        try {
            int size = c2608f.f25293f.size();
            while (true) {
                size--;
                if (size < 0) {
                    java.util.Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a((p105m2.C2625x) it2.next(), i3, obj, i9);
                    }
                    return;
                } else {
                    java.util.ArrayList arrayList3 = c2608f.f25293f;
                    p105m2.C c9 = (p105m2.C) ((java.lang.ref.WeakReference) arrayList3.get(size)).get();
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
