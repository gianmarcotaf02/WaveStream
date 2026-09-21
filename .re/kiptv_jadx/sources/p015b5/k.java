package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final p015b5.f Companion = new p015b5.f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f17968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V4.C0967j f17969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.app.AlarmManager f17970c;

    public k(android.content.Context context, V4.C0967j store) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(store, "store");
        this.f17968a = context;
        this.f17969b = store;
        java.lang.Object systemService = context.getSystemService("alarm");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.f17970c = (android.app.AlarmManager) systemService;
    }

    public final android.content.Intent a(int i3, int i9, java.lang.String str, java.lang.String str2, int i10, java.lang.String str3, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(this.f17968a, (java.lang.Class<?>) com.kiptv.core.service.EPGReminderReceiver.class);
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
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(this.f17968a, i3, a(i3, 0, "", "", 0, null, null), 603979776);
        if (broadcast != null) {
            this.f17970c.cancel(broadcast);
            broadcast.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(int i3, p117n6.c cVar) {
        p015b5.g gVar;
        p015b5.k kVar;
        if (cVar instanceof p015b5.g) {
            gVar = (p015b5.g) cVar;
            int i9 = gVar.f17957l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.f17957l = i9 - Integer.MIN_VALUE;
            } else {
                gVar = new p015b5.g(this, cVar);
            }
        } else {
            gVar = new p015b5.g(this, cVar);
        }
        java.lang.Object obj = gVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = gVar.f17957l;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            gVar.f17954h = this;
            gVar.f17955i = i3;
            gVar.f17957l = 1;
            V4.C0967j c0967j = this.f17969b;
            java.lang.Object objM = E8.d.M(V4.AbstractC0968k.a(c0967j.f10313a), new V4.C0966i(c0967j, i3, null), gVar);
            if (objM != aVar) {
                objM = a2;
            }
            if (objM == aVar) {
                return aVar;
            }
            kVar = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = gVar.f17955i;
            kVar = gVar.f17954h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        kVar.b(i3);
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p117n6.c cVar) {
        p015b5.h hVar;
        p015b5.k kVar;
        if (cVar instanceof p015b5.h) {
            hVar = (p015b5.h) cVar;
            int i3 = hVar.f17960k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.f17960k = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new p015b5.h(this, cVar);
            }
        } else {
            hVar = new p015b5.h(this, cVar);
        }
        java.lang.Object objE = hVar.f17959i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = hVar.f17960k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objE);
            hVar.f17958h = this;
            hVar.f17960k = 1;
            objE = this.f17969b.e(hVar);
            if (objE == aVar) {
                return aVar;
            }
            kVar = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = hVar.f17958h;
            com.google.common.util.concurrent.P.u0(objE);
        }
        java.util.List list = (java.util.List) objE;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.b(((com.kiptv.core.model.EPGReminder) it.next()).f19744a);
            }
            android.util.Log.d("EPGReminderScheduler", "Cleaned " + list.size() + " expired reminders");
        }
        return p070h6.A.f22523a;
    }

    public final void e(com.kiptv.core.model.EPGReminder ePGReminder) {
        int i3 = ePGReminder.f19744a;
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(this.f17968a, i3, a(i3, ePGReminder.f19745b, ePGReminder.f19746c, ePGReminder.f19747d, ePGReminder.g, ePGReminder.f19750h, ePGReminder.f19751i), 201326592);
        kotlin.jvm.internal.m.d(broadcast, "getBroadcast(...)");
        long jA = (ePGReminder.a() - java.lang.System.currentTimeMillis()) / ((long) 1000);
        int i9 = android.os.Build.VERSION.SDK_INT;
        android.app.AlarmManager alarmManager = this.f17970c;
        int i10 = ePGReminder.f19744a;
        try {
            if (i9 >= 31 && !alarmManager.canScheduleExactAlarms()) {
                alarmManager.setAndAllowWhileIdle(0, ePGReminder.a(), broadcast);
                android.util.Log.w("EPGReminderScheduler", "Scheduled INEXACT alarm id=" + i10 + " fires in " + jA + "s — canScheduleExactAlarms()==false. Notification may be delayed by up to ~15 minutes. Consider granting SCHEDULE_EXACT_ALARM in Settings.");
                return;
            }
            alarmManager.setExactAndAllowWhileIdle(0, ePGReminder.a(), broadcast);
            android.util.Log.d("EPGReminderScheduler", "Scheduled EXACT alarm id=" + i10 + " fires in " + jA + "s (program='" + ePGReminder.f19747d + "' channel=" + ePGReminder.f19746c + " lead=" + ePGReminder.g + "m)");
        } catch (java.lang.SecurityException e6) {
            android.util.Log.w("EPGReminderScheduler", "Exact alarm denied, using inexact: " + e6.getMessage());
            alarmManager.setAndAllowWhileIdle(0, ePGReminder.a(), broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[LOOP:0: B:25:0x005d->B:27:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(p117n6.c cVar) {
        p015b5.i iVar;
        p015b5.k kVar;
        p015b5.k kVar2;
        java.util.Iterator it;
        if (cVar instanceof p015b5.i) {
            iVar = (p015b5.i) cVar;
            int i3 = iVar.f17963k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.f17963k = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new p015b5.i(this, cVar);
            }
        } else {
            iVar = new p015b5.i(this, cVar);
        }
        java.lang.Object objD = iVar.f17962i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = iVar.f17963k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objD);
            iVar.f17961h = this;
            iVar.f17963k = 1;
            if (d(iVar) != aVar) {
                kVar = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            kVar = iVar.f17961h;
            com.google.common.util.concurrent.P.u0(objD);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar2 = iVar.f17961h;
            com.google.common.util.concurrent.P.u0(objD);
        }
        it = ((java.lang.Iterable) objD).iterator();
        while (it.hasNext()) {
            kVar2.e((com.kiptv.core.model.EPGReminder) it.next());
        }
        return p070h6.A.f22523a;
        V4.C0967j c0967j = kVar.f17969b;
        iVar.f17961h = kVar;
        iVar.f17963k = 2;
        objD = c0967j.d(iVar);
        if (objD != aVar) {
            kVar2 = kVar;
            it = ((java.lang.Iterable) objD).iterator();
            while (it.hasNext()) {
                kVar2.e((com.kiptv.core.model.EPGReminder) it.next());
            }
            return p070h6.A.f22523a;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object g(com.kiptv.core.model.EPGProgram ePGProgram, int i3, java.lang.String str, int i9, java.lang.String str2, java.lang.String str3, p117n6.c cVar) {
        p015b5.j jVar;
        p015b5.k kVar;
        com.kiptv.core.model.EPGReminder ePGReminder;
        p015b5.k kVar2;
        if (cVar instanceof p015b5.j) {
            jVar = (p015b5.j) cVar;
            int i10 = jVar.f17967l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f17967l = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new p015b5.j(this, cVar);
            }
        } else {
            jVar = new p015b5.j(this, cVar);
        }
        java.lang.Object obj = jVar.j;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i11 = jVar.f17967l;
        if (i11 != 0) {
            if (i11 == 1) {
                ePGReminder = jVar.f17965i;
                kVar = jVar.f17964h;
                com.google.common.util.concurrent.P.u0(obj);
            } else {
                if (i11 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ePGReminder = jVar.f17965i;
                kVar2 = jVar.f17964h;
                com.google.common.util.concurrent.P.u0(obj);
            }
            kVar2.e(ePGReminder);
            return ePGReminder;
        }
        com.google.common.util.concurrent.P.u0(obj);
        if (ePGProgram.f19741d - (((long) i9) * 60000) <= java.lang.System.currentTimeMillis()) {
            android.util.Log.d("EPGReminderScheduler", "Skip reminder, fire time already passed for " + ePGProgram.f19739b);
            return null;
        }
        com.kiptv.core.model.EPGReminder.INSTANCE.getClass();
        com.kiptv.core.model.EPGReminder ePGReminder2 = new com.kiptv.core.model.EPGReminder((i3 * 31) ^ java.lang.Long.hashCode(ePGProgram.f19741d), i3, str, ePGProgram.f19739b, ePGProgram.f19741d, ePGProgram.f19742e, i9, str2, str3);
        jVar.f17964h = this;
        jVar.f17965i = ePGReminder2;
        jVar.f17967l = 1;
        V4.C0967j c0967j = this.f17969b;
        java.lang.Object objM = E8.d.M(V4.AbstractC0968k.a(c0967j.f10313a), new V4.C0959b(c0967j, ePGReminder2, null), jVar);
        if (objM != obj2) {
            objM = p070h6.A.f22523a;
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
