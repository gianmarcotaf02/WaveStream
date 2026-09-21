package p015b5;

import E8.d;
import V4.AbstractC0968k;
import V4.C0959b;
import V4.C0966i;
import V4.C0967j;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.EPGReminder;
import com.kiptv.core.service.EPGReminderReceiver;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p070h6.A;
import p109m6.a;
import p117n6.c;

public final class k {
    public static final f Companion = new f();

    public final Context f17968a;

    public final C0967j f17969b;

    public final AlarmManager f17970c;

    public k(Context context, C0967j store) {
        m.e(context, "context");
        m.e(store, "store");
        this.f17968a = context;
        this.f17969b = store;
        Object systemService = context.getSystemService("alarm");
        m.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.f17970c = (AlarmManager) systemService;
    }

    public final Intent a(int i3, int i9, String str, String str2, int i10, String str3, String str4) {
        Intent intent = new Intent(this.f17968a, (Class<?>) EPGReminderReceiver.class);
        intent.setAction("com.kiptv.core.action.EPG_REMINDER");
        intent.putExtra("reminder_id", i3);
        intent.putExtra("stream_id", i9);
        intent.putExtra("channel_name", str);
        intent.putExtra("program_title", str2);
        intent.putExtra("lead_time_minutes", i10);
        if (str3 != null) {
            intent.putExtra("playlist_id", str3);
        }
        if (str4 != null) {
            intent.putExtra("playlist_name", str4);
        }
        return intent;
    }

    public final void b(int i3) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f17968a, i3, a(i3, 0, "", "", 0, null, null), 603979776);
        if (broadcast != null) {
            this.f17970c.cancel(broadcast);
            broadcast.cancel();
        }
    }

    public final Object c(int i3, c cVar) {
        g gVar;
        k kVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i9 = gVar.f17957l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.f17957l = i9 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.j;
        a aVar = a.f25430h;
        int i10 = gVar.f17957l;
        A a2 = A.f22523a;
        if (i10 == 0) {
            P.u0(obj);
            gVar.f17954h = this;
            gVar.f17955i = i3;
            gVar.f17957l = 1;
            C0967j c0967j = this.f17969b;
            Object objM = d.M(AbstractC0968k.a(c0967j.f10313a), new C0966i(c0967j, i3, null), gVar);
            if (objM != aVar) {
                objM = a2;
            }
            if (objM == aVar) {
                return aVar;
            }
            kVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = gVar.f17955i;
            kVar = gVar.f17954h;
            P.u0(obj);
        }
        kVar.b(i3);
        return a2;
    }

    public final Object d(c cVar) {
        h hVar;
        k kVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i3 = hVar.f17960k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.f17960k = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objE = hVar.f17959i;
        a aVar = a.f25430h;
        int i9 = hVar.f17960k;
        if (i9 == 0) {
            P.u0(objE);
            hVar.f17958h = this;
            hVar.f17960k = 1;
            objE = this.f17969b.e(hVar);
            if (objE == aVar) {
                return aVar;
            }
            kVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = hVar.f17958h;
            P.u0(objE);
        }
        List list = (List) objE;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.b(((EPGReminder) it.next()).f19744a);
            }
            Log.d("EPGReminderScheduler", "Cleaned " + list.size() + " expired reminders");
        }
        return A.f22523a;
    }

    public final void e(EPGReminder ePGReminder) {
        int i3 = ePGReminder.f19744a;
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f17968a, i3, a(i3, ePGReminder.f19745b, ePGReminder.f19746c, ePGReminder.f19747d, ePGReminder.g, ePGReminder.f19750h, ePGReminder.f19751i), 201326592);
        m.d(broadcast, "getBroadcast(...)");
        long jA = (ePGReminder.a() - System.currentTimeMillis()) / ((long) 1000);
        int i9 = Build.VERSION.SDK_INT;
        AlarmManager alarmManager = this.f17970c;
        int i10 = ePGReminder.f19744a;
        try {
            if (i9 >= 31 && !alarmManager.canScheduleExactAlarms()) {
                alarmManager.setAndAllowWhileIdle(0, ePGReminder.a(), broadcast);
                Log.w("EPGReminderScheduler", "Scheduled INEXACT alarm id=" + i10 + " fires in " + jA + "s — canScheduleExactAlarms()==false. Notification may be delayed by up to ~15 minutes. Consider granting SCHEDULE_EXACT_ALARM in Settings.");
                return;
            }
            alarmManager.setExactAndAllowWhileIdle(0, ePGReminder.a(), broadcast);
            Log.d("EPGReminderScheduler", "Scheduled EXACT alarm id=" + i10 + " fires in " + jA + "s (program='" + ePGReminder.f19747d + "' channel=" + ePGReminder.f19746c + " lead=" + ePGReminder.g + "m)");
        } catch (SecurityException e6) {
            Log.w("EPGReminderScheduler", "Exact alarm denied, using inexact: " + e6.getMessage());
            alarmManager.setAndAllowWhileIdle(0, ePGReminder.a(), broadcast);
        }
    }

    public final Object f(c cVar) {
        i iVar;
        k kVar;
        k kVar2;
        Iterator it;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i3 = iVar.f17963k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.f17963k = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objD = iVar.f17962i;
        a aVar = a.f25430h;
        int i9 = iVar.f17963k;
        if (i9 == 0) {
            P.u0(objD);
            iVar.f17961h = this;
            iVar.f17963k = 1;
            if (d(iVar) != aVar) {
                kVar = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            kVar = iVar.f17961h;
            P.u0(objD);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar2 = iVar.f17961h;
            P.u0(objD);
        }
        it = ((Iterable) objD).iterator();
        while (it.hasNext()) {
            kVar2.e((EPGReminder) it.next());
        }
        return A.f22523a;
        C0967j c0967j = kVar.f17969b;
        iVar.f17961h = kVar;
        iVar.f17963k = 2;
        objD = c0967j.d(iVar);
        if (objD != aVar) {
            kVar2 = kVar;
            it = ((Iterable) objD).iterator();
            while (it.hasNext()) {
                kVar2.e((EPGReminder) it.next());
            }
            return A.f22523a;
        }
        return aVar;
    }

    public final Object g(EPGProgram ePGProgram, int i3, String str, int i9, String str2, String str3, c cVar) {
        j jVar;
        k kVar;
        EPGReminder ePGReminder;
        k kVar2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.f17967l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f17967l = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.j;
        Object obj2 = a.f25430h;
        int i11 = jVar.f17967l;
        if (i11 != 0) {
            if (i11 == 1) {
                ePGReminder = jVar.f17965i;
                kVar = jVar.f17964h;
                P.u0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ePGReminder = jVar.f17965i;
                kVar2 = jVar.f17964h;
                P.u0(obj);
            }
            kVar2.e(ePGReminder);
            return ePGReminder;
        }
        P.u0(obj);
        if (ePGProgram.f19741d - (((long) i9) * 60000) <= System.currentTimeMillis()) {
            Log.d("EPGReminderScheduler", "Skip reminder, fire time already passed for " + ePGProgram.f19739b);
            return null;
        }
        EPGReminder.INSTANCE.getClass();
        EPGReminder ePGReminder2 = new EPGReminder((i3 * 31) ^ Long.hashCode(ePGProgram.f19741d), i3, str, ePGProgram.f19739b, ePGProgram.f19741d, ePGProgram.f19742e, i9, str2, str3);
        jVar.f17964h = this;
        jVar.f17965i = ePGReminder2;
        jVar.f17967l = 1;
        C0967j c0967j = this.f17969b;
        Object objM = d.M(AbstractC0968k.a(c0967j.f10313a), new C0959b(c0967j, ePGReminder2, null), jVar);
        if (objM != obj2) {
            objM = A.f22523a;
        }
        if (objM != obj2) {
            kVar = this;
            ePGReminder = ePGReminder2;
        }
        return obj2;
        jVar.f17964h = kVar;
        jVar.f17965i = ePGReminder;
        jVar.f17967l = 2;
        if (kVar.d(jVar) != obj2) {
            kVar2 = kVar;
            kVar2.e(ePGReminder);
            return ePGReminder;
        }
        return obj2;
    }
}
