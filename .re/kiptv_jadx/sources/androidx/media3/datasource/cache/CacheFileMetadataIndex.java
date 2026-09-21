package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
final class CacheFileMetadataIndex {
    private static final int COLUMN_INDEX_LAST_TOUCH_TIMESTAMP = 2;
    private static final int COLUMN_INDEX_LENGTH = 1;
    private static final int COLUMN_INDEX_NAME = 0;
    private static final java.lang.String COLUMN_LENGTH = "length";
    private static final java.lang.String COLUMN_NAME = "name";
    private static final java.lang.String TABLE_PREFIX = "ExoPlayerCacheFileMetadata";
    private static final java.lang.String TABLE_SCHEMA = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
    private static final int TABLE_VERSION = 1;
    private static final java.lang.String WHERE_NAME_EQUALS = "name = ?";
    private final androidx.media3.database.DatabaseProvider databaseProvider;
    private java.lang.String tableName;
    private static final java.lang.String COLUMN_LAST_TOUCH_TIMESTAMP = "last_touch_timestamp";
    private static final java.lang.String[] COLUMNS = {"name", "length", COLUMN_LAST_TOUCH_TIMESTAMP};

    public CacheFileMetadataIndex(androidx.media3.database.DatabaseProvider databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    public static void delete(androidx.media3.database.DatabaseProvider databaseProvider, long j) throws androidx.media3.database.DatabaseIOException {
        java.lang.String hexString = java.lang.Long.toHexString(j);
        try {
            java.lang.String tableName = getTableName(hexString);
            android.database.sqlite.SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                androidx.media3.database.VersionTable.removeVersion(writableDatabase, 2, hexString);
                dropTable(writableDatabase, tableName);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }

    private static void dropTable(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private android.database.Cursor getCursor() {
        this.tableName.getClass();
        return this.databaseProvider.getReadableDatabase().query(this.tableName, COLUMNS, null, null, null, null, null);
    }

    private static java.lang.String getTableName(java.lang.String str) {
        return p121o0.p.C(TABLE_PREFIX, str);
    }

    public java.util.Map<java.lang.String, androidx.media3.datasource.cache.CacheFileMetadata> getAll() throws androidx.media3.database.DatabaseIOException {
        try {
            android.database.Cursor cursor = getCursor();
            try {
                java.util.HashMap map = new java.util.HashMap(cursor.getCount());
                while (cursor.moveToNext()) {
                    java.lang.String string = cursor.getString(0);
                    string.getClass();
                    map.put(string, new androidx.media3.datasource.cache.CacheFileMetadata(cursor.getLong(1), cursor.getLong(2)));
                }
                cursor.close();
                return map;
            } catch (java.lang.Throwable th) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }

    public void initialize(long j) throws androidx.media3.database.DatabaseIOException {
        try {
            java.lang.String hexString = java.lang.Long.toHexString(j);
            this.tableName = getTableName(hexString);
            if (androidx.media3.database.VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 2, hexString) != 1) {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    androidx.media3.database.VersionTable.setVersion(writableDatabase, 2, hexString, 1);
                    dropTable(writableDatabase, this.tableName);
                    writableDatabase.execSQL("CREATE TABLE " + this.tableName + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }

    public void remove(java.lang.String str) throws androidx.media3.database.DatabaseIOException {
        this.tableName.getClass();
        try {
            this.databaseProvider.getWritableDatabase().delete(this.tableName, WHERE_NAME_EQUALS, new java.lang.String[]{str});
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }

    public void removeAll(java.util.Set<java.lang.String> set) throws androidx.media3.database.DatabaseIOException {
        this.tableName.getClass();
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                java.util.Iterator<java.lang.String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.tableName, WHERE_NAME_EQUALS, new java.lang.String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }

    public void set(java.lang.String str, long j, long j9) throws androidx.media3.database.DatabaseIOException {
        this.tableName.getClass();
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", java.lang.Long.valueOf(j));
            contentValues.put(COLUMN_LAST_TOUCH_TIMESTAMP, java.lang.Long.valueOf(j9));
            writableDatabase.replaceOrThrow(this.tableName, null, contentValues);
        } catch (android.database.SQLException e6) {
            throw new androidx.media3.database.DatabaseIOException(e6);
        }
    }
}
