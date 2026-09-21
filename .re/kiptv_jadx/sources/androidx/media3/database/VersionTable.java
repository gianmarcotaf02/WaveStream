package androidx.media3.database;

/* JADX INFO: loaded from: classes.dex */
public final class VersionTable {
    private static final java.lang.String COLUMN_FEATURE = "feature";
    private static final java.lang.String COLUMN_INSTANCE_UID = "instance_uid";
    private static final java.lang.String COLUMN_VERSION = "version";
    public static final int FEATURE_CACHE_CONTENT_METADATA = 1;
    public static final int FEATURE_CACHE_FILE_METADATA = 2;
    public static final int FEATURE_EXTERNAL = 1000;
    public static final int FEATURE_OFFLINE = 0;
    private static final java.lang.String PRIMARY_KEY = "PRIMARY KEY (feature, instance_uid)";
    private static final java.lang.String SQL_CREATE_TABLE_IF_NOT_EXISTS = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";
    private static final java.lang.String TABLE_NAME = "ExoPlayerVersions";
    public static final int VERSION_UNSET = -1;
    private static final java.lang.String WHERE_FEATURE_AND_INSTANCE_UID_EQUALS = "feature = ? AND instance_uid = ?";

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.database");
    }

    private VersionTable() {
    }

    private static java.lang.String[] featureAndInstanceUidArguments(int i3, java.lang.String str) {
        return new java.lang.String[]{java.lang.Integer.toString(i3), str};
    }

    public static int getVersion(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i3, java.lang.String str) throws androidx.media3.database.DatabaseIOException {
        try {
            if (!androidx.media3.common.util.Util.tableExists(sQLiteDatabase, TABLE_NAME)) {
                return -1;
            }
            android.database.Cursor cursorQuery = sQLiteDatabase.query(TABLE_NAME, new java.lang.String[]{"version"}, WHERE_FEATURE_AND_INSTANCE_UID_EQUALS, featureAndInstanceUidArguments(i3, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i9 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i9;
            } catch (java.lang.Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw new androidx.media3.database.DatabaseIOException(e);
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }

    public static void removeVersion(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i3, java.lang.String str) throws androidx.media3.database.DatabaseIOException {
        try {
            if (androidx.media3.common.util.Util.tableExists(sQLiteDatabase, TABLE_NAME)) {
                sQLiteDatabase.delete(TABLE_NAME, WHERE_FEATURE_AND_INSTANCE_UID_EQUALS, featureAndInstanceUidArguments(i3, str));
            }
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }

    public static void setVersion(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i3, java.lang.String str, int i9) throws androidx.media3.database.DatabaseIOException {
        try {
            sQLiteDatabase.execSQL(SQL_CREATE_TABLE_IF_NOT_EXISTS);
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(COLUMN_FEATURE, java.lang.Integer.valueOf(i3));
            contentValues.put(COLUMN_INSTANCE_UID, str);
            contentValues.put("version", java.lang.Integer.valueOf(i9));
            sQLiteDatabase.replaceOrThrow(TABLE_NAME, null, contentValues);
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }
}
