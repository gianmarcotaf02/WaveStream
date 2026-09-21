package T1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.media3.common.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p136q.C2662f;

public final class j {
    public static final Object j = new Object();

    public static volatile j f9685k;

    public final ReentrantReadWriteLock f9686a;

    public final C2662f f9687b;

    public volatile int f9688c;

    public final Handler f9689d;

    public final f f9690e;

    public final i f9691f;
    public final B3.o g;

    public final int f9692h;

    public final d f9693i;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f9686a = reentrantReadWriteLock;
        this.f9688c = 3;
        i iVar = (i) sVar.f9683b;
        this.f9691f = iVar;
        int i3 = sVar.f9682a;
        this.f9692h = i3;
        this.f9693i = (d) sVar.f9684c;
        this.f9689d = new Handler(Looper.getMainLooper());
        this.f9687b = new C2662f(0);
        this.g = new B3.o(26);
        f fVar = new f(this);
        this.f9690e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f9688c = 0;
            } catch (Throwable th) {
                this.f9686a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (j) {
            jVar = f9685k;
            E8.d.L("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", jVar != null);
        }
        return jVar;
    }

    public static boolean d() {
        return f9685k != null;
    }

    public final int b(CharSequence charSequence, int i3) {
        E8.d.L("Not initialized yet", c() == 1);
        E8.d.K(charSequence, "charSequence cannot be null");
        android.support.v4.media.session.q qVar = (android.support.v4.media.session.q) this.f9690e.f9679a;
        qVar.getClass();
        if (i3 < 0 || i3 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            x[] xVarArr = (x[]) spanned.getSpans(i3, i3 + 1, x.class);
            if (xVarArr.length > 0) {
                return spanned.getSpanStart(xVarArr[0]);
            }
        }
        return ((p) qVar.F(charSequence, Math.max(0, i3 - 16), Math.min(charSequence.length(), i3 + 16), Log.LOG_LEVEL_OFF, true, new p(i3))).f9699i;
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
            f fVar = this.f9690e;
            j jVar = (j) fVar.f9680b;
            try {
                jVar.f9691f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.f(th);
            }
        } catch (Throwable th2) {
            this.f9686a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f9686a.writeLock().lock();
        try {
            this.f9688c = 2;
            arrayList.addAll(this.f9687b);
            this.f9687b.clear();
            this.f9686a.writeLock().unlock();
            this.f9689d.post(new A1.a(arrayList, this.f9688c, th));
        } catch (Throwable th2) {
            this.f9686a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence g(int i3, int i9, int i10, CharSequence charSequence) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i11;
        int i12;
        x[] xVarArr;
        int spanStart;
        E8.d.L("Not initialized yet", c() == 1);
        if (i3 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i3 <= i9)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        z zVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i9 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i3 == i9) {
            return charSequence;
        }
        boolean z6 = i10 == 1;
        android.support.v4.media.session.q qVar = (android.support.v4.media.session.q) this.f9690e.f9679a;
        qVar.getClass();
        boolean z9 = charSequence instanceof v;
        if (z9) {
            ((v) charSequence).a();
        }
        if (z9) {
            zVar = new z((Spannable) charSequence);
            if (zVar != null) {
                for (x xVar : xVarArr) {
                    spanStart = zVar.f9730i.getSpanStart(xVar);
                    int spanEnd = zVar.f9730i.getSpanEnd(xVar);
                    if (spanStart != i9) {
                        zVar.removeSpan(xVar);
                    }
                    i3 = Math.min(spanStart, i3);
                    i9 = Math.max(spanEnd, i9);
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
            ((v) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    zVar = new z((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z9) {
                        throw th;
                    }
                    ((v) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i3 - 1, i9 + 1, x.class) <= i9) {
                zVar = new z();
                zVar.f9729h = false;
                zVar.f9730i = new SpannableString(charSequence);
            }
            if (zVar != null && (xVarArr = (x[]) zVar.f9730i.getSpans(i3, i9, x.class)) != null && xVarArr.length > 0) {
                while (i < r3) {
                    spanStart = zVar.f9730i.getSpanStart(xVar);
                    int spanEnd2 = zVar.f9730i.getSpanEnd(xVar);
                    if (spanStart != i9) {
                        zVar.removeSpan(xVar);
                    }
                    i3 = Math.min(spanStart, i3);
                    i9 = Math.max(spanEnd2, i9);
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
                    z zVar2 = (z) qVar.F(charSequence2, i11, i12, Log.LOG_LEVEL_OFF, z6, new S2.a(zVar, (B3.o) qVar.f15617i, 2));
                    if (zVar2 != null) {
                        Spannable spannable = zVar2.f9730i;
                        if (z9) {
                            ((v) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z9) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z9) {
                        throw th;
                    }
                    ((v) charSequence2).b();
                    throw th;
                }
            }
            ((v) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z9) {
            throw th;
        }
        ((v) charSequence2).b();
        throw th;
    }

    public final void h(h hVar) {
        E8.d.K(hVar, "initCallback cannot be null");
        this.f9686a.writeLock().lock();
        try {
            if (this.f9688c == 1 || this.f9688c == 2) {
                this.f9689d.post(new A1.a(Arrays.asList(hVar), this.f9688c, (Throwable) null));
            } else {
                this.f9687b.add(hVar);
            }
        } finally {
            this.f9686a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f9690e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        U1.b bVar = (U1.b) ((A7.m) fVar.f9681c).f321i;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f1972k).getInt(iA + bVar.f1970h) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((j) fVar.f9680b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
