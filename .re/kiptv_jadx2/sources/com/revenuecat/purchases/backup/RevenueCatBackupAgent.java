package com.revenuecat.purchases.backup;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.os.ParcelFileDescriptor;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/backup/RevenueCatBackupAgent;", "Landroid/app/backup/BackupAgentHelper;", "<init>", "()V", "Lh6/A;", "onCreate", "Landroid/os/ParcelFileDescriptor;", "oldState", "Landroid/app/backup/BackupDataOutput;", "data", "newState", "onBackup", "(Landroid/os/ParcelFileDescriptor;Landroid/app/backup/BackupDataOutput;Landroid/os/ParcelFileDescriptor;)V", "Landroid/app/backup/BackupDataInput;", "", "appVersionCode", "onRestore", "(Landroid/app/backup/BackupDataInput;JLandroid/os/ParcelFileDescriptor;)V", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RevenueCatBackupAgent extends BackupAgentHelper {
    public static final String REVENUECAT_PREFS_FILE_NAME = "com_revenuecat_purchases_preferences";

    @Override
    public void onBackup(ParcelFileDescriptor oldState, BackupDataOutput data, ParcelFileDescriptor newState) throws IOException {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            M0.t(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "RevenueCatBackupAgent: Initiating backup");
        }
        super.onBackup(oldState, data, newState);
    }

    @Override
    public void onCreate() {
        addHelper("revenuecat_prefs_backup", new SharedPreferencesBackupHelper(this, REVENUECAT_PREFS_FILE_NAME));
    }

    @Override
    public void onRestore(BackupDataInput data, long appVersionCode, ParcelFileDescriptor newState) {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            M0.t(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "RevenueCatBackupAgent: Initiating restoration");
        }
        super.onRestore(data, appVersionCode, newState);
    }
}
