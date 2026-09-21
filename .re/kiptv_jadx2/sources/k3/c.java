package k3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.play_billing.V0;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

public final class c {

    public final Context f24443a;

    public final p098l3.d f24444b;

    public final a f24445c;

    public c(Context context, p098l3.d dVar, a aVar) {
        this.f24443a = context;
        this.f24444b = dVar;
        this.f24445c = aVar;
    }

    public final void a(p041e3.i iVar, int i3, boolean z6) {
        Context context = this.f24443a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f21395a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        p013b3.c cVar = iVar.f21397c;
        adler32.update(byteBufferAllocate.putInt(p124o3.a.a(cVar)).array());
        byte[] bArr = iVar.f21396b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z6) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i9 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i9 < i3) {
                        break;
                    }
                    V0.q("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseB = ((p098l3.g) this.f24444b).b();
        String strValueOf = String.valueOf(p124o3.a.a(cVar));
        String str = iVar.f21395a;
        Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            a aVar = this.f24445c;
            builder.setMinimumLatency(aVar.a(cVar, jLongValue, i3));
            Set set = ((b) aVar.f24439b.get(cVar)).f24442c;
            if (set.contains(d.f24446h)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(d.j)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(d.f24447i)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(SentryThread.JsonKeys.PRIORITY, p124o3.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(cVar, jLongValue, i3)), lValueOf, Integer.valueOf(i3)};
            String strT = V0.t("JobInfoScheduler");
            if (Log.isLoggable(strT, 3)) {
                Log.d(strT, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
