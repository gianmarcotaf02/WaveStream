package k3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f24443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p098l3.d f24444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3.a f24445c;

    public c(android.content.Context context, p098l3.d dVar, k3.a aVar) {
        this.f24443a = context;
        this.f24444b = dVar;
        this.f24445c = aVar;
    }

    public final void a(p041e3.i iVar, int i3, boolean z6) {
        android.content.Context context = this.f24443a;
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class);
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        java.util.zip.Adler32 adler32 = new java.util.zip.Adler32();
        adler32.update(context.getPackageName().getBytes(java.nio.charset.Charset.forName("UTF-8")));
        adler32.update(iVar.f21395a.getBytes(java.nio.charset.Charset.forName("UTF-8")));
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        p013b3.c cVar = iVar.f21397c;
        adler32.update(byteBufferAllocate.putInt(p124o3.a.a(cVar)).array());
        byte[] bArr = iVar.f21396b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z6) {
            for (android.app.job.JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i9 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i9 < i3) {
                        break;
                    }
                    com.google.android.gms.internal.play_billing.V0.q("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                    return;
                }
            }
        }
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = ((p098l3.g) this.f24444b).b();
        java.lang.String strValueOf = java.lang.String.valueOf(p124o3.a.a(cVar));
        java.lang.String str = iVar.f21395a;
        android.database.Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new java.lang.String[]{str, strValueOf});
        try {
            java.lang.Long lValueOf = cursorRawQuery.moveToNext() ? java.lang.Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            android.app.job.JobInfo.Builder builder = new android.app.job.JobInfo.Builder(value, componentName);
            k3.a aVar = this.f24445c;
            builder.setMinimumLatency(aVar.a(cVar, jLongValue, i3));
            java.util.Set set = ((k3.b) aVar.f24439b.get(cVar)).f24442c;
            if (set.contains(k3.d.f24446h)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(k3.d.j)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(k3.d.f24447i)) {
                builder.setRequiresDeviceIdle(true);
            }
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(io.sentry.protocol.SentryThread.JsonKeys.PRIORITY, p124o3.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", android.util.Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            java.lang.Object[] objArr = {iVar, java.lang.Integer.valueOf(value), java.lang.Long.valueOf(aVar.a(cVar, jLongValue, i3)), lValueOf, java.lang.Integer.valueOf(i3)};
            java.lang.String strT = com.google.android.gms.internal.play_billing.V0.t("JobInfoScheduler");
            if (android.util.Log.isLoggable(strT, 3)) {
                android.util.Log.d(strT, java.lang.String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (java.lang.Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
