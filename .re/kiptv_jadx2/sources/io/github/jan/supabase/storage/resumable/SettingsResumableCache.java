package io.github.jan.supabase.storage.resumable;

import O7.q;
import S5.b;
import S5.d;
import S7.AbstractC0906w;
import S7.C;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.P;
import io.sentry.SentryEvent;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.A;
import p109m6.a;
import p117n6.c;
import p117n6.e;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0016j\u0002`\u00170\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/github/jan/supabase/storage/resumable/SettingsResumableCache;", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "LR5/a;", "settings", "<init>", "(LR5/a;)V", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", SentryEvent.JsonKeys.FINGERPRINT, "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "entry", "Lh6/A;", "set-zb63x2Q", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Ll6/c;)Ljava/lang/Object;", "set", "get-iiNwMIM", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "get", "remove-iiNwMIM", "remove", "clear", "(Ll6/c;)Ljava/lang/Object;", "", "Lh6/k;", "Lio/github/jan/supabase/storage/resumable/CachePair;", "entries", "LS5/b;", "LS5/b;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SettingsResumableCache implements ResumableCache {
    private final b settings;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {35, TsExtractor.TS_STREAM_TYPE_H265}, m = "clear")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsResumableCache.this.clear(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {41, 44}, m = "entries")
    public static final class C23501 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        Object result;

        public C23501(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsResumableCache.this.entries(this);
        }
    }

    public SettingsResumableCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override
    public Object clear(p100l6.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SettingsResumableCache settingsResumableCache;
        SettingsResumableCache settingsResumableCache2;
        Iterator it;
        String str;
        String strM379invoke3xapfgk;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objK = anonymousClass1.result;
        a aVar = a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            P.u0(objK);
            b bVar = this.settings;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            S2.a aVar2 = (S2.a) bVar;
            aVar2.getClass();
            objK = C.K((AbstractC0906w) aVar2.j, new d(aVar2, null), anonymousClass1);
            if (objK != aVar) {
                settingsResumableCache = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            settingsResumableCache = (SettingsResumableCache) anonymousClass1.L$0;
            P.u0(objK);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) anonymousClass1.L$1;
            settingsResumableCache2 = (SettingsResumableCache) anonymousClass1.L$0;
            P.u0(objK);
        }
        while (it.hasNext()) {
            str = (String) it.next();
            if (q.b1(str, new String[]{Fingerprint.FINGERPRINT_SEPARATOR}, 0, 6).size() != 2) {
                strM379invoke3xapfgk = Fingerprint.INSTANCE.m379invoke3xapfgk(str);
                if (strM379invoke3xapfgk != null) {
                    throw new IllegalStateException("Invalid fingerprint ".concat(str).toString());
                }
                anonymousClass1.L$0 = settingsResumableCache2;
                anonymousClass1.L$1 = it;
                anonymousClass1.label = 2;
                if (settingsResumableCache2.mo382removeiiNwMIM(strM379invoke3xapfgk, anonymousClass1) == aVar) {
                    return aVar;
                }
            }
        }
        return A.f22523a;
        settingsResumableCache2 = settingsResumableCache;
        it = ((Iterable) objK).iterator();
        while (it.hasNext()) {
            str = (String) it.next();
            if (q.b1(str, new String[]{Fingerprint.FINGERPRINT_SEPARATOR}, 0, 6).size() != 2) {
                strM379invoke3xapfgk = Fingerprint.INSTANCE.m379invoke3xapfgk(str);
                if (strM379invoke3xapfgk != null) {
                    throw new IllegalStateException("Invalid fingerprint ".concat(str).toString());
                }
                anonymousClass1.L$0 = settingsResumableCache2;
                anonymousClass1.L$1 = it;
                anonymousClass1.label = 2;
                if (settingsResumableCache2.mo382removeiiNwMIM(strM379invoke3xapfgk, anonymousClass1) == aVar) {
                    return aVar;
                }
            }
        }
        return A.f22523a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override
    public java.lang.Object entries(p100l6.c r10) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.SettingsResumableCache.entries(l6.c):java.lang.Object");
    }

    @Override
    public Object mo381getiiNwMIM(String str, p100l6.c cVar) throws Throwable {
        SettingsResumableCache$get$1 settingsResumableCache$get$1;
        if (cVar instanceof SettingsResumableCache$get$1) {
            settingsResumableCache$get$1 = (SettingsResumableCache$get$1) cVar;
            int i3 = settingsResumableCache$get$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                settingsResumableCache$get$1.label = i3 - Integer.MIN_VALUE;
            } else {
                settingsResumableCache$get$1 = new SettingsResumableCache$get$1(this, cVar);
            }
        } else {
            settingsResumableCache$get$1 = new SettingsResumableCache$get$1(this, cVar);
        }
        Object objK = settingsResumableCache$get$1.result;
        a aVar = a.f25430h;
        int i9 = settingsResumableCache$get$1.label;
        if (i9 == 0) {
            P.u0(objK);
            b bVar = this.settings;
            settingsResumableCache$get$1.label = 1;
            S2.a aVar2 = (S2.a) bVar;
            aVar2.getClass();
            objK = C.K((AbstractC0906w) aVar2.j, new S5.c(aVar2, str, null), settingsResumableCache$get$1);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objK);
        }
        String str2 = (String) objK;
        if (str2 == null) {
            return null;
        }
        p162s8.c cVar2 = p162s8.d.f27387d;
        cVar2.getClass();
        return (ResumableCacheEntry) cVar2.b(str2, V0.s(ResumableCacheEntry.INSTANCE.serializer()));
    }

    @Override
    public Object mo382removeiiNwMIM(String str, p100l6.c cVar) throws Throwable {
        Object objN = ((S2.a) this.settings).N(str, cVar);
        return objN == a.f25430h ? objN : A.f22523a;
    }

    @Override
    public Object mo383setzb63x2Q(String str, ResumableCacheEntry resumableCacheEntry, p100l6.c cVar) throws Throwable {
        b bVar = this.settings;
        p162s8.c cVar2 = p162s8.d.f27387d;
        cVar2.getClass();
        Object objM = ((S2.a) bVar).M(str, cVar2.d(ResumableCacheEntry.INSTANCE.serializer(), resumableCacheEntry), cVar);
        return objM == a.f25430h ? objM : A.f22523a;
    }

    public SettingsResumableCache(R5.a settings) {
        m.e(settings, "settings");
        this.settings = p000a.a.E(settings);
    }

    public SettingsResumableCache(R5.a aVar, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? p199y3.e.c() : aVar);
    }
}
