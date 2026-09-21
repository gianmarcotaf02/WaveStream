package androidx.media3.exoplayer.scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformScheduler implements androidx.media3.exoplayer.scheduler.Scheduler {
    private static final java.lang.String KEY_REQUIREMENTS = "requirements";
    private static final java.lang.String KEY_SERVICE_ACTION = "service_action";
    private static final java.lang.String KEY_SERVICE_PACKAGE = "service_package";
    private static final int SUPPORTED_REQUIREMENTS;
    private static final java.lang.String TAG = "PlatformScheduler";
    private final int jobId;
    private final android.app.job.JobScheduler jobScheduler;
    private final android.content.ComponentName jobServiceComponentName;

    public static final class PlatformSchedulerService extends android.app.job.JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(android.app.job.JobParameters jobParameters) {
            android.os.PersistableBundle extras = jobParameters.getExtras();
            int notMetRequirements = new androidx.media3.exoplayer.scheduler.Requirements(extras.getInt("requirements")).getNotMetRequirements(this);
            if (notMetRequirements != 0) {
                Y6.f.p(notMetRequirements, "Requirements not met: ", androidx.media3.exoplayer.scheduler.PlatformScheduler.TAG);
                jobFinished(jobParameters, true);
                return false;
            }
            java.lang.String string = extras.getString(androidx.media3.exoplayer.scheduler.PlatformScheduler.KEY_SERVICE_ACTION);
            string.getClass();
            java.lang.String string2 = extras.getString(androidx.media3.exoplayer.scheduler.PlatformScheduler.KEY_SERVICE_PACKAGE);
            string2.getClass();
            androidx.media3.common.util.Util.startForegroundService(this, new android.content.Intent(string).setPackage(string2));
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(android.app.job.JobParameters jobParameters) {
            return false;
        }
    }

    static {
        SUPPORTED_REQUIREMENTS = (android.os.Build.VERSION.SDK_INT >= 26 ? 16 : 0) | 15;
    }

    public PlatformScheduler(android.content.Context context, int i3) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.jobId = i3;
        this.jobServiceComponentName = new android.content.ComponentName(applicationContext, (java.lang.Class<?>) androidx.media3.exoplayer.scheduler.PlatformScheduler.PlatformSchedulerService.class);
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.jobScheduler = jobScheduler;
    }

    private static android.app.job.JobInfo buildJobInfo(int i3, android.content.ComponentName componentName, androidx.media3.exoplayer.scheduler.Requirements requirements, java.lang.String str, java.lang.String str2) {
        androidx.media3.exoplayer.scheduler.Requirements requirementsFilterRequirements = requirements.filterRequirements(SUPPORTED_REQUIREMENTS);
        if (!requirementsFilterRequirements.equals(requirements)) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring unsupported requirements: " + (requirementsFilterRequirements.getRequirements() ^ requirements.getRequirements()));
        }
        android.app.job.JobInfo.Builder builder = new android.app.job.JobInfo.Builder(i3, componentName);
        if (requirements.isUnmeteredNetworkRequired()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.isNetworkRequired()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.isIdleRequired());
        builder.setRequiresCharging(requirements.isChargingRequired());
        if (android.os.Build.VERSION.SDK_INT >= 26 && requirements.isStorageNotLowRequired()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString(KEY_SERVICE_ACTION, str);
        persistableBundle.putString(KEY_SERVICE_PACKAGE, str2);
        persistableBundle.putInt("requirements", requirements.getRequirements());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // androidx.media3.exoplayer.scheduler.Scheduler
    public boolean cancel() {
        this.jobScheduler.cancel(this.jobId);
        return true;
    }

    @Override // androidx.media3.exoplayer.scheduler.Scheduler
    public androidx.media3.exoplayer.scheduler.Requirements getSupportedRequirements(androidx.media3.exoplayer.scheduler.Requirements requirements) {
        return requirements.filterRequirements(SUPPORTED_REQUIREMENTS);
    }

    @Override // androidx.media3.exoplayer.scheduler.Scheduler
    public boolean schedule(androidx.media3.exoplayer.scheduler.Requirements requirements, java.lang.String str, java.lang.String str2) {
        return this.jobScheduler.schedule(buildJobInfo(this.jobId, this.jobServiceComponentName, requirements, str2, str)) == 1;
    }
}
