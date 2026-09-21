package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final android.app.Notification.Builder notificationBuilder;

    public DownloadNotificationHelper(android.content.Context context, java.lang.String str) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.notificationBuilder = android.os.Build.VERSION.SDK_INT >= 26 ? U.AbstractC0944q.d(applicationContext, str) : new android.app.Notification.Builder(applicationContext);
    }

    private android.app.Notification buildEndStateNotification(android.content.Context context, int i3, android.app.PendingIntent pendingIntent, java.lang.String str, int i9) {
        return buildNotification(context, i3, pendingIntent, str, i9, 0, 0, false, false, true);
    }

    private android.app.Notification buildNotification(android.content.Context context, int i3, android.app.PendingIntent pendingIntent, java.lang.String str, int i9, int i10, int i11, boolean z6, boolean z9, boolean z10) {
        this.notificationBuilder.setSmallIcon(i3);
        this.notificationBuilder.setContentTitle(i9 == 0 ? null : context.getResources().getString(i9));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new android.app.Notification.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i10, i11, z6);
        this.notificationBuilder.setOngoing(z9);
        this.notificationBuilder.setShowWhen(z10);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            this.notificationBuilder.setForegroundServiceBehavior(1);
        }
        return this.notificationBuilder.build();
    }

    public android.app.Notification buildDownloadCompletedNotification(android.content.Context context, int i3, android.app.PendingIntent pendingIntent, java.lang.String str) {
        return buildEndStateNotification(context, i3, pendingIntent, str, androidx.media3.exoplayer.R.string.exo_download_completed);
    }

    public android.app.Notification buildDownloadFailedNotification(android.content.Context context, int i3, android.app.PendingIntent pendingIntent, java.lang.String str) {
        return buildEndStateNotification(context, i3, pendingIntent, str, androidx.media3.exoplayer.R.string.exo_download_failed);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    public android.app.Notification buildProgressNotification(android.content.Context context, int i3, android.app.PendingIntent pendingIntent, java.lang.String str, java.util.List<androidx.media3.exoplayer.offline.Download> list, int i9) {
        int i10;
        int i11;
        boolean z6;
        int i12;
        int i13;
        boolean z9;
        float percentDownloaded;
        boolean z10;
        float f9 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i14 = 0;
        boolean z16 = true;
        for (int i15 = 0; i15 < list.size(); i15++) {
            androidx.media3.exoplayer.offline.Download download = list.get(i15);
            int i16 = download.state;
            if (i16 == 0) {
                z13 = true;
            } else if (i16 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f9 += percentDownloaded;
                    z16 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z14 |= z10;
                i14++;
                z12 = true;
            } else if (i16 == 5) {
                z15 = true;
            } else if (i16 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f9 += percentDownloaded;
                    z16 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z14 |= z10;
                i14++;
                z12 = true;
            }
        }
        if (!z12) {
            if (!z13 || i9 == 0) {
                if (z15) {
                    i11 = androidx.media3.exoplayer.R.string.exo_download_removing;
                } else {
                    i10 = 0;
                }
                z6 = true;
            } else {
                i10 = (i9 & 2) != 0 ? androidx.media3.exoplayer.R.string.exo_download_paused_for_wifi : (i9 & 1) != 0 ? androidx.media3.exoplayer.R.string.exo_download_paused_for_network : androidx.media3.exoplayer.R.string.exo_download_paused;
                z6 = false;
            }
            if (z6) {
                if (z12) {
                    int i17 = (int) (f9 / i14);
                    if (z16 && z14) {
                        z11 = true;
                    }
                    i13 = i17;
                    z9 = z11;
                } else {
                    i13 = 0;
                    z9 = true;
                }
                i12 = 100;
            } else {
                i12 = 0;
                i13 = 0;
                z9 = false;
            }
            return buildNotification(context, i3, pendingIntent, str, i10, i12, i13, z9, true, false);
        }
        i11 = androidx.media3.exoplayer.R.string.exo_download_downloading;
        i10 = i11;
        z6 = true;
        if (z6) {
            if (z12) {
                int i18 = (int) (f9 / i14);
                if (z16) {
                    z11 = true;
                }
                i13 = i18;
                z9 = z11;
            } else {
                i13 = 0;
                z9 = true;
            }
            i12 = 100;
        } else {
            i12 = 0;
            i13 = 0;
            z9 = false;
        }
        return buildNotification(context, i3, pendingIntent, str, i10, i12, i13, z9, true, false);
    }
}
