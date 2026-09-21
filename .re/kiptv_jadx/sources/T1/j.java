package T1;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final java.lang.Object j = new java.lang.Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile T1.j f9685k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f9686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p136q.C2662f f9687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f9688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Handler f9689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T1.f f9690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T1.i f9691f;
    public final B3.o g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T1.d f9693i;

    public j(T1.s sVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f9686a = reentrantReadWriteLock;
        this.f9688c = 3;
        T1.i iVar = (T1.i) sVar.f9683b;
        this.f9691f = iVar;
        int i3 = sVar.f9682a;
        this.f9692h = i3;
        this.f9693i = (T1.d) sVar.f9684c;
        this.f9689d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f9687b = new p136q.C2662f(0);
        this.g = new B3.o(26);
        T1.f fVar = new T1.f(this);
        this.f9690e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f9688c = 0;
            } catch (java.lang.Throwable th) {
                this.f9686a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.a(new T1.e(fVar));
            } catch (java.lang.Throwable th2) {
                f(th2);
            }
        }
    }

    public static T1.j a() {
        T1.j jVar;
        synchronized (j) {
            jVar = f9685k;
            E8.d.L("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", jVar != null);
        }
        return jVar;
    }

    public static boolean d() {
        return f9685k != null;
    }

    public final int b(java.lang.CharSequence charSequence, int i3) {
        E8.d.L("Not initialized yet", c() == 1);
        E8.d.K(charSequence, "charSequence cannot be null");
        android.support.v4.media.session.q qVar = (android.support.v4.media.session.q) this.f9690e.f9679a;
        qVar.getClass();
        if (i3 < 0 || i3 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            T1.x[] xVarArr = (T1.x[]) spanned.getSpans(i3, i3 + 1, T1.x.class);
            if (xVarArr.length > 0) {
                return spanned.getSpanStart(xVarArr[0]);
            }
        }
        return ((T1.p) qVar.F(charSequence, java.lang.Math.max(0, i3 - 16), java.lang.Math.min(charSequence.length(), i3 + 16), androidx.media3.common.util.Log.LOG_LEVEL_OFF, true, new T1.p(i3))).f9699i;
    }

    public final int c() {
        this.f9686a.readLock().lock();
        try {
            return this.f9688c;
        } finally {
            this.f9686a.readLock().unlock();
        }
    }

    public final void e() {
        E8.d.L("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f9692h == 1);
        if (c() == 1) {
            return;
        }
        this.f9686a.writeLock().lock();
        try {
            if (this.f9688c == 0) {
                this.f9686a.writeLock().unlock();
                return;
            }
            this.f9688c = 0;
            this.f9686a.writeLock().unlock();
            T1.f fVar = this.f9690e;
            T1.j jVar = (T1.j) fVar.f9680b;
            try {
                jVar.f9691f.a(new T1.e(fVar));
            } catch (java.lang.Throwable th) {
                jVar.f(th);
            }
        } catch (java.lang.Throwable th2) {
            this.f9686a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f9686a.writeLock().lock();
        try {
            this.f9688c = 2;
            arrayList.addAll(this.f9687b);
            this.f9687b.clear();
            this.f9686a.writeLock().unlock();
            this.f9689d.post(new A1.a(arrayList, this.f9688c, th));
        } catch (java.lang.Throwable th2) {
            this.f9686a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:38:0x005d, B:41:0x0062, B:43:0x0066, B:45:0x0073, B:52:0x0092, B:54:0x009c, B:56:0x009f, B:58:0x00a2, B:60:0x00b2, B:61:0x00b5), top: B:99:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:38:0x005d, B:41:0x0062, B:43:0x0066, B:45:0x0073, B:52:0x0092, B:54:0x009c, B:56:0x009f, B:58:0x00a2, B:60:0x00b2, B:61:0x00b5), top: B:99:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    public final java.lang.CharSequence g(int i3, int i9, int i10, java.lang.CharSequence charSequence) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.CharSequence charSequence2;
        int i11;
        int i12;
        T1.x[] xVarArr;
        int spanStart;
        E8.d.L("Not initialized yet", c() == 1);
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("start cannot be negative");
        }
        if (i9 < 0) {
            throw new java.lang.IllegalArgumentException("end cannot be negative");
        }
        if (!(i3 <= i9)) {
            throw new java.lang.IllegalArgumentException("start should be <= than end");
        }
        T1.z zVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            throw new java.lang.IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i9 <= charSequence.length())) {
            throw new java.lang.IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i3 == i9) {
            return charSequence;
        }
        boolean z6 = i10 == 1;
        android.support.v4.media.session.q qVar = (android.support.v4.media.session.q) this.f9690e.f9679a;
        qVar.getClass();
        boolean z9 = charSequence instanceof T1.v;
        if (z9) {
            ((T1.v) charSequence).a();
        }
        if (z9) {
            zVar = new T1.z((android.text.Spannable) charSequence);
            if (zVar != null) {
                for (T1.x xVar : xVarArr) {
                    spanStart = zVar.f9730i.getSpanStart(xVar);
                    int spanEnd = zVar.f9730i.getSpanEnd(xVar);
                    if (spanStart != i9) {
                        zVar.removeSpan(xVar);
                    }
                    i3 = java.lang.Math.min(spanStart, i3);
                    i9 = java.lang.Math.max(spanEnd, i9);
                }
            }
            i11 = i3;
            i12 = i9;
            if (i11 != i12) {
                charSequence2 = charSequence;
                if (!z9) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z9) {
                    return charSequence2;
                }
            }
            ((T1.v) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof android.text.Spannable) {
                try {
                    zVar = new T1.z((android.text.Spannable) charSequence);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z9) {
                        throw th;
                    }
                    ((T1.v) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof android.text.Spanned) && ((android.text.Spanned) charSequence).nextSpanTransition(i3 - 1, i9 + 1, T1.x.class) <= i9) {
                zVar = new T1.z();
                zVar.f9729h = false;
                zVar.f9730i = new android.text.SpannableString(charSequence);
            }
            if (zVar != null && (xVarArr = (T1.x[]) zVar.f9730i.getSpans(i3, i9, T1.x.class)) != null && xVarArr.length > 0) {
                while (i < r3) {
                    spanStart = zVar.f9730i.getSpanStart(xVar);
                    int spanEnd2 = zVar.f9730i.getSpanEnd(xVar);
                    if (spanStart != i9) {
                        zVar.removeSpan(xVar);
                    }
                    i3 = java.lang.Math.min(spanStart, i3);
                    i9 = java.lang.Math.max(spanEnd2, i9);
                }
            }
            i11 = i3;
            i12 = i9;
            if (i11 != i12 || i11 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z9) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    T1.z zVar2 = (T1.z) qVar.F(charSequence2, i11, i12, androidx.media3.common.util.Log.LOG_LEVEL_OFF, z6, new S2.a(zVar, (B3.o) qVar.f15617i, 2));
                    if (zVar2 != null) {
                        android.text.Spannable spannable = zVar2.f9730i;
                        if (z9) {
                            ((T1.v) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z9) {
                        return charSequence2;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z9) {
                        throw th;
                    }
                    ((T1.v) charSequence2).b();
                    throw th;
                }
            }
            ((T1.v) charSequence2).b();
            return charSequence2;
        } catch (java.lang.Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z9) {
            throw th;
        }
        ((T1.v) charSequence2).b();
        throw th;
    }

    public final void h(T1.h hVar) {
        E8.d.K(hVar, "initCallback cannot be null");
        this.f9686a.writeLock().lock();
        try {
            if (this.f9688c == 1 || this.f9688c == 2) {
                this.f9689d.post(new A1.a(java.util.Arrays.asList(hVar), this.f9688c, (java.lang.Throwable) null));
            } else {
                this.f9687b.add(hVar);
            }
        } finally {
            this.f9686a.writeLock().unlock();
        }
    }

    public final void i(android.view.inputmethod.EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        T1.f fVar = this.f9690e;
        fVar.getClass();
        android.os.Bundle bundle = editorInfo.extras;
        U1.b bVar = (U1.b) ((A7.m) fVar.f9681c).f321i;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((java.nio.ByteBuffer) bVar.f1972k).getInt(iA + bVar.f1970h) : 0);
        android.os.Bundle bundle2 = editorInfo.extras;
        ((T1.j) fVar.f9680b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
