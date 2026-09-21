package io.github.jan.supabase.storage.resumable;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0016j\u0002`\u00170\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/github/jan/supabase/storage/resumable/SettingsResumableCache;", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "LR5/a;", "settings", "<init>", "(LR5/a;)V", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", io.sentry.SentryEvent.JsonKeys.FINGERPRINT, "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "entry", "Lh6/A;", "set-zb63x2Q", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Ll6/c;)Ljava/lang/Object;", "set", "get-iiNwMIM", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "get", "remove-iiNwMIM", "remove", "clear", "(Ll6/c;)Ljava/lang/Object;", "", "Lh6/k;", "Lio/github/jan/supabase/storage/resumable/CachePair;", "entries", "LS5/b;", "LS5/b;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SettingsResumableCache implements io.github.jan.supabase.storage.resumable.ResumableCache {
    private final S5.b settings;

    /* JADX INFO: renamed from: io.github.jan.supabase.storage.resumable.SettingsResumableCache$clear$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {35, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265}, m = "clear")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.storage.resumable.SettingsResumableCache.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.storage.resumable.SettingsResumableCache$entries$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {41, 44}, m = "entries")
    public static final class C23501 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23501(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.storage.resumable.SettingsResumableCache.this.entries(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsResumableCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    public java.lang.Object clear(p100l6.c cVar) throws java.lang.Throwable {
        io.github.jan.supabase.storage.resumable.SettingsResumableCache.AnonymousClass1 anonymousClass1;
        io.github.jan.supabase.storage.resumable.SettingsResumableCache settingsResumableCache;
        io.github.jan.supabase.storage.resumable.SettingsResumableCache settingsResumableCache2;
        java.util.Iterator it;
        java.lang.String str;
        java.lang.String strM379invoke3xapfgk;
        if (cVar instanceof io.github.jan.supabase.storage.resumable.SettingsResumableCache.AnonymousClass1) {
            anonymousClass1 = (io.github.jan.supabase.storage.resumable.SettingsResumableCache.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.github.jan.supabase.storage.resumable.SettingsResumableCache.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.github.jan.supabase.storage.resumable.SettingsResumableCache.AnonymousClass1(cVar);
        }
        java.lang.Object objK = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objK);
            S5.b bVar = this.settings;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            S2.a aVar2 = (S2.a) bVar;
            aVar2.getClass();
            objK = S7.C.K((S7.AbstractC0906w) aVar2.j, new S5.d(aVar2, null), anonymousClass1);
            if (objK != aVar) {
                settingsResumableCache = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            settingsResumableCache = (io.github.jan.supabase.storage.resumable.SettingsResumableCache) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(objK);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) anonymousClass1.L$1;
            settingsResumableCache2 = (io.github.jan.supabase.storage.resumable.SettingsResumableCache) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(objK);
        }
        while (it.hasNext()) {
            str = (java.lang.String) it.next();
            if (O7.q.b1(str, new java.lang.String[]{io.github.jan.supabase.storage.resumable.Fingerprint.FINGERPRINT_SEPARATOR}, 0, 6).size() != 2) {
                strM379invoke3xapfgk = io.github.jan.supabase.storage.resumable.Fingerprint.INSTANCE.m379invoke3xapfgk(str);
                if (strM379invoke3xapfgk != null) {
                    throw new java.lang.IllegalStateException("Invalid fingerprint ".concat(str).toString());
                }
                anonymousClass1.L$0 = settingsResumableCache2;
                anonymousClass1.L$1 = it;
                anonymousClass1.label = 2;
                if (settingsResumableCache2.mo382removeiiNwMIM(strM379invoke3xapfgk, anonymousClass1) == aVar) {
                    return aVar;
                }
            }
        }
        return p070h6.A.f22523a;
        settingsResumableCache2 = settingsResumableCache;
        it = ((java.lang.Iterable) objK).iterator();
        while (it.hasNext()) {
            str = (java.lang.String) it.next();
            if (O7.q.b1(str, new java.lang.String[]{io.github.jan.supabase.storage.resumable.Fingerprint.FINGERPRINT_SEPARATOR}, 0, 6).size() != 2) {
                strM379invoke3xapfgk = io.github.jan.supabase.storage.resumable.Fingerprint.INSTANCE.m379invoke3xapfgk(str);
                if (strM379invoke3xapfgk != null) {
                    throw new java.lang.IllegalStateException("Invalid fingerprint ".concat(str).toString());
                }
                anonymousClass1.L$0 = settingsResumableCache2;
                anonymousClass1.L$1 = it;
                anonymousClass1.label = 2;
                if (settingsResumableCache2.mo382removeiiNwMIM(strM379invoke3xapfgk, anonymousClass1) == aVar) {
                    return aVar;
                }
            }
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d9 -> B:36:0x00da). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    public java.lang.Object entries(p100l6.c r10) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.SettingsResumableCache.entries(l6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* JADX INFO: renamed from: get-iiNwMIM */
    public java.lang.Object mo381getiiNwMIM(java.lang.String str, p100l6.c cVar) throws java.lang.Throwable {
        io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1 settingsResumableCache$get$1;
        if (cVar instanceof io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1) {
            settingsResumableCache$get$1 = (io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1) cVar;
            int i3 = settingsResumableCache$get$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                settingsResumableCache$get$1.label = i3 - Integer.MIN_VALUE;
            } else {
                settingsResumableCache$get$1 = new io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1(this, cVar);
            }
        } else {
            settingsResumableCache$get$1 = new io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1(this, cVar);
        }
        java.lang.Object objK = settingsResumableCache$get$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = settingsResumableCache$get$1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objK);
            S5.b bVar = this.settings;
            settingsResumableCache$get$1.label = 1;
            S2.a aVar2 = (S2.a) bVar;
            aVar2.getClass();
            objK = S7.C.K((S7.AbstractC0906w) aVar2.j, new S5.c(aVar2, str, null), settingsResumableCache$get$1);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objK);
        }
        java.lang.String str2 = (java.lang.String) objK;
        if (str2 == null) {
            return null;
        }
        p162s8.c cVar2 = p162s8.d.f27387d;
        cVar2.getClass();
        return (io.github.jan.supabase.storage.resumable.ResumableCacheEntry) cVar2.b(str2, com.google.android.gms.internal.play_billing.V0.s(io.github.jan.supabase.storage.resumable.ResumableCacheEntry.INSTANCE.serializer()));
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* JADX INFO: renamed from: remove-iiNwMIM */
    public java.lang.Object mo382removeiiNwMIM(java.lang.String str, p100l6.c cVar) throws java.lang.Throwable {
        java.lang.Object objN = ((S2.a) this.settings).N(str, cVar);
        return objN == p109m6.a.f25430h ? objN : p070h6.A.f22523a;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* JADX INFO: renamed from: set-zb63x2Q */
    public java.lang.Object mo383setzb63x2Q(java.lang.String str, io.github.jan.supabase.storage.resumable.ResumableCacheEntry resumableCacheEntry, p100l6.c cVar) throws java.lang.Throwable {
        S5.b bVar = this.settings;
        p162s8.c cVar2 = p162s8.d.f27387d;
        cVar2.getClass();
        java.lang.Object objM = ((S2.a) bVar).M(str, cVar2.d(io.github.jan.supabase.storage.resumable.ResumableCacheEntry.INSTANCE.serializer(), resumableCacheEntry), cVar);
        return objM == p109m6.a.f25430h ? objM : p070h6.A.f22523a;
    }

    public SettingsResumableCache(R5.a settings) {
        kotlin.jvm.internal.m.e(settings, "settings");
        this.settings = p000a.a.E(settings);
    }

    public /* synthetic */ SettingsResumableCache(R5.a aVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? p199y3.e.c() : aVar);
    }
}
