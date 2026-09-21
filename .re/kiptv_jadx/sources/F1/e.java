package F1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p059g4.c, androidx.media3.common.util.ListenerSet.IterationFinishedEvent, com.google.common.util.concurrent.w, androidx.media3.datasource.ByteArrayDataSource.UriResolver, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory, androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory, androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter, androidx.media3.container.ReorderingBufferQueue.OutputConsumer, androidx.media3.common.util.Consumer, io.sentry.Sentry.OptionsConfiguration, io.sentry.ScopeCallback, p076i4.E0, io.sentry.util.LazyEvaluator.Evaluator, io.sentry.util.HintUtils.SentryHintFallback, io.sentry.Scope.IWithPropagationContext, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener, org.videolan.libvlc.MediaPlayer.EventListener, p106m3.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3513i;

    public /* synthetic */ e(int i3, java.lang.Object obj) {
        this.f3512h = i3;
        this.f3513i = obj;
    }

    @Override // p076i4.E0
    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        p076i4.J0 j9 = (p076i4.J0) this.f3513i;
        j9.getClass();
        return p076i4.AbstractC2230y.A((java.util.List) ((java.util.Collection) obj2), new p076i4.A0(j9.f22806m, obj));
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(io.sentry.PropagationContext propagationContext) {
        io.sentry.util.TracingUtils.lambda$startNewTrace$0((io.sentry.IScope) this.f3513i, propagationContext);
    }

    @Override // com.google.common.util.concurrent.w
    public com.google.common.util.concurrent.J apply(java.lang.Object obj) {
        return androidx.media3.common.SimpleBasePlayer.lambda$handleReplaceMediaItems$33((com.google.common.util.concurrent.J) this.f3513i, obj);
    }

    public p023c3.b b(android.support.v4.media.session.q qVar) throws java.io.IOException {
        p023c3.c cVar = (p023c3.c) this.f3513i;
        java.lang.String strT = com.google.android.gms.internal.play_billing.V0.t("CctTransportBackend");
        boolean zIsLoggable = android.util.Log.isLoggable(strT, 4);
        java.net.URL url = (java.net.URL) qVar.f15617i;
        if (zIsLoggable) {
            android.util.Log.i(strT, java.lang.String.format("Making request to: %s", url));
        }
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST);
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", com.revenuecat.purchases.common.HTTPClient.RC_FORMAT_ACCEPT_ENCODING);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", com.revenuecat.purchases.common.HTTPClient.RC_FORMAT_ACCEPT_ENCODING);
        java.lang.String str = (java.lang.String) qVar.f15618k;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
                try {
                    p166t3.i iVar = cVar.f18501a;
                    p033d3.i iVar2 = (p033d3.i) qVar.j;
                    java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(gZIPOutputStream));
                    F4.d dVar = (F4.d) iVar.f27782i;
                    F4.e eVar = new F4.e(bufferedWriter, dVar.f3657a, dVar.f3658b, dVar.f3659c, dVar.f3660d);
                    eVar.e(iVar2);
                    eVar.g();
                    eVar.f3662b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(responseCode);
                    java.lang.String strT2 = com.google.android.gms.internal.play_billing.V0.t("CctTransportBackend");
                    if (android.util.Log.isLoggable(strT2, 4)) {
                        android.util.Log.i(strT2, java.lang.String.format("Status Code: %d", numValueOf));
                    }
                    com.google.android.gms.internal.play_billing.V0.q("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    com.google.android.gms.internal.play_billing.V0.q("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new p023c3.b(responseCode, new java.net.URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new p023c3.b(responseCode, null, 0L);
                    }
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        java.io.InputStream gZIPInputStream = com.revenuecat.purchases.common.HTTPClient.RC_FORMAT_ACCEPT_ENCODING.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
                        try {
                            p023c3.b bVar = new p023c3.b(responseCode, null, p033d3.m.a(new java.io.BufferedReader(new java.io.InputStreamReader(gZIPInputStream))).f21219a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (java.lang.Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (java.lang.Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (D4.b e6) {
            e = e6;
            com.google.android.gms.internal.play_billing.V0.r(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new p023c3.b(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        } catch (java.net.ConnectException e9) {
            e = e9;
            com.google.android.gms.internal.play_billing.V0.r(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new p023c3.b(500, null, 0L);
        } catch (java.net.UnknownHostException e10) {
            e = e10;
            com.google.android.gms.internal.play_billing.V0.r(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new p023c3.b(500, null, 0L);
        } catch (java.io.IOException e11) {
            e = e11;
            com.google.android.gms.internal.play_billing.V0.r(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new p023c3.b(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        }
    }

    @Override // p106m3.b
    public java.lang.Object c() {
        java.lang.Object obj = this.f3513i;
        boolean z6 = false;
        switch (this.f3512h) {
            case 28:
                p098l3.g gVar = (p098l3.g) ((p098l3.c) obj);
                gVar.getClass();
                int i3 = p067h3.a.f22461e;
                A7.m mVar = new A7.m(15, z6);
                mVar.f321i = null;
                mVar.j = new java.util.ArrayList();
                mVar.f322k = null;
                mVar.f323l = "";
                java.util.HashMap map = new java.util.HashMap();
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = gVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    p067h3.a aVar = (p067h3.a) p098l3.g.z(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new java.lang.String[0]), new androidx.media3.exoplayer.source.h(gVar, map, mVar, 6));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            default:
                p098l3.g gVar2 = (p098l3.g) ((p098l3.d) obj);
                long jG = gVar2.f24730i.g() - gVar2.f24731k.f24721d;
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseB2 = gVar2.b();
                sQLiteDatabaseB2.beginTransaction();
                try {
                    java.lang.String[] strArr = {java.lang.String.valueOf(jG)};
                    android.database.Cursor cursorRawQuery = sQLiteDatabaseB2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            gVar2.t(cursorRawQuery.getInt(0), p067h3.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (java.lang.Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB2.setTransactionSuccessful();
                    sQLiteDatabaseB2.endTransaction();
                    return java.lang.Integer.valueOf(iDelete);
                } catch (java.lang.Throwable th2) {
                    sQLiteDatabaseB2.endTransaction();
                    throw th2;
                }
        }
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(io.sentry.SentryOptions sentryOptions) {
        java.lang.Object objT;
        java.lang.String str;
        io.sentry.android.core.SentryAndroidOptions options = (io.sentry.android.core.SentryAndroidOptions) sentryOptions;
        kotlin.jvm.internal.m.e(options, "options");
        options.setDsn("https://4o2LmyQzL91ppUUVAVVuaMoa@s2357704.eu-fsn-3.betterstackdata.com/2357704");
        com.kiptv.tv.KIPTVTvApplication kIPTVTvApplication = (com.kiptv.tv.KIPTVTvApplication) this.f3513i;
        if ((kIPTVTvApplication.getApplicationInfo().flags & 2) != 0) {
            str = "development";
        } else {
            try {
                objT = android.os.Build.VERSION.SDK_INT >= 30 ? kIPTVTvApplication.getPackageManager().getInstallSourceInfo(kIPTVTvApplication.getPackageName()).getInstallingPackageName() : kIPTVTvApplication.getPackageManager().getInstallerPackageName(kIPTVTvApplication.getPackageName());
            } catch (java.lang.Throwable th) {
                objT = com.google.common.util.concurrent.P.T(th);
            }
            if (objT instanceof p070h6.m) {
                objT = null;
            }
            java.lang.String str2 = (java.lang.String) objT;
            str = (str2 == null || !p015b5.AbstractC1664a.f17935a.contains(str2)) ? "internal" : "production";
        }
        options.setEnvironment(str);
        options.setSendDefaultPii(false);
        options.setEnableAutoSessionTracking(true);
        options.setAnrEnabled(true);
        options.setEnableNdk(true);
        options.setEnableScopeSync(true);
        options.setTracesSampleRate(java.lang.Double.valueOf(0.1d));
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        ((androidx.media3.extractor.mp4.FragmentedMp4Extractor) this.f3513i).lambda$new$2(j, parsableByteArray);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public java.util.List create(int i3, androidx.media3.common.TrackGroup trackGroup, int[] iArr) {
        return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.lambda$selectImageTrack$5((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) this.f3513i, i3, trackGroup, iArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public androidx.media3.exoplayer.trackselection.ExoTrackSelection createAdaptiveTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition) {
        return ((androidx.media3.exoplayer.trackselection.RandomTrackSelection.Factory) this.f3513i).lambda$createTrackSelections$0(definition);
    }

    public boolean d(A.a aVar, int i3, android.os.Bundle bundle) {
        D1.InterfaceC0217d aVar2;
        int i9 = android.os.Build.VERSION.SDK_INT;
        if (i9 >= 25 && (i3 & 1) != 0) {
            try {
                ((F1.i) aVar.f9i).b();
                android.os.Parcelable parcelable = (android.os.Parcelable) ((F1.i) aVar.f9i).e();
                bundle = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (java.lang.Exception e6) {
                android.util.Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        android.content.ClipDescription description = ((F1.i) aVar.f9i).getDescription();
        F1.i iVar = (F1.i) aVar.f9i;
        android.content.ClipData clipData = new android.content.ClipData(description, new android.content.ClipData.Item(iVar.a()));
        if (i9 >= 31) {
            aVar2 = new A.a(clipData, 2);
        } else {
            D1.C0219e c0219e = new D1.C0219e(0);
            c0219e.f2002i = clipData;
            c0219e.j = 2;
            aVar2 = c0219e;
        }
        aVar2.i(iVar.c());
        aVar2.setExtras(bundle);
        return D1.U.h((p103m.C2589t) this.f3513i, aVar2.build()) == null;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public java.lang.Object evaluate() {
        return io.sentry.protocol.SentryId.lambda$new$2((java.lang.String) this.f3513i);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
        ((androidx.media3.common.SimpleBasePlayer) this.f3513i).lambda$new$0((androidx.media3.common.Player.Listener) obj, flagSet);
    }

    @Override // androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
    public void onAudioCapabilitiesChanged(androidx.media3.exoplayer.audio.AudioCapabilities capabilities) {
        kotlin.jvm.internal.m.e(capabilities, "capabilities");
        p085j5.C2524n c2524n = (p085j5.C2524n) this.f3513i;
        c2524n.g = capabilities;
        android.util.Log.i("ExoPlayerEngine", "Audio route capabilities changed: " + capabilities);
        p077i5.C2237d c2237d = c2524n.f24187e;
        if (c2237d != null) {
            c2237d.invoke();
        }
    }

    @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
    public void onEvent(org.videolan.libvlc.interfaces.AbstractVLCEvent abstractVLCEvent) {
        p085j5.a0 a0Var = (p085j5.a0) this.f3513i;
        a0Var.f24101p.post(new T7.d(a0Var, (org.videolan.libvlc.MediaPlayer.Event) abstractVLCEvent, 28));
    }

    @Override // p059g4.c
    public void onSuccess(java.lang.Object obj) {
        java.lang.Object obj2 = this.f3513i;
        switch (this.f3512h) {
            case 1:
                int i3 = androidx.credentials.playservices.HiddenActivity.j;
                ((K1.d) obj2).invoke(obj);
                break;
            case 2:
                int i9 = androidx.credentials.playservices.HiddenActivity.j;
                ((K1.d) obj2).invoke(obj);
                break;
            case 3:
                int i10 = androidx.credentials.playservices.HiddenActivity.j;
                ((K1.d) obj2).invoke(obj);
                break;
            default:
                int i11 = androidx.credentials.playservices.HiddenActivity.j;
                ((K1.d) obj2).invoke(obj);
                break;
        }
    }

    @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
    public byte[] resolve(android.net.Uri uri) {
        return androidx.media3.datasource.ByteArrayDataSource.lambda$new$0((byte[]) this.f3513i, uri);
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope scope) {
        switch (this.f3512h) {
            case 15:
                kotlin.jvm.internal.m.e(scope, "scope");
                for (java.util.Map.Entry entry : ((java.util.Map) this.f3513i).entrySet()) {
                    scope.setTag((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                break;
            case 16:
            case 17:
            default:
                io.sentry.util.TracingUtils.lambda$setTrace$3((io.sentry.PropagationContext) this.f3513i, scope);
                break;
            case 18:
                ((io.sentry.android.core.internal.gestures.SentryGestureListener) this.f3513i).lambda$stopTracing$1(scope);
                break;
            case 19:
                io.sentry.android.replay.capture.BufferCaptureStrategy.captureReplay$lambda$1((io.sentry.android.replay.capture.BufferCaptureStrategy) this.f3513i, scope);
                break;
            case 20:
                io.sentry.android.replay.capture.SessionCaptureStrategy.start$lambda$0((io.sentry.android.replay.capture.SessionCaptureStrategy) this.f3513i, scope);
                break;
        }
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return ((androidx.media3.extractor.FlacStreamMetadata) this.f3513i).getSampleNumber(j);
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(java.lang.Object obj, java.lang.Class cls) {
        switch (this.f3512h) {
            case 22:
                io.sentry.util.LogUtils.logNotInstanceOf(cls, obj, (io.sentry.ILogger) this.f3513i);
                break;
            default:
                ((io.sentry.util.HintUtils.SentryNullableConsumer) this.f3513i).accept(obj);
                break;
        }
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        switch (this.f3512h) {
            case 12:
                ((androidx.media3.extractor.text.SubtitleExtractor) this.f3513i).lambda$parseAndWriteToOutput$0((androidx.media3.extractor.text.CuesWithTiming) obj);
                break;
            default:
                ((p076i4.Y) this.f3513i).c((androidx.media3.extractor.text.CuesWithTiming) obj);
                break;
        }
    }
}
