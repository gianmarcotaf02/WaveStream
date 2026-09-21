package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 com.kiptv.core.model.A[], still in use, count: 1, list:
  (r0v4 com.kiptv.core.model.A[]) from 0x00d4: INVOKE (r0v4 com.kiptv.core.model.A[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:213)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@p119n8.i(with = com.kiptv.core.model.B.class)
public final class A {
    HERO("hero"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTINUE_WATCHING("continueWatching"),
    /* JADX INFO: Fake field, exist only in values array */
    NOW_ON_TV("nowOnTV"),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EPISODES("newEpisodes"),
    /* JADX INFO: Fake field, exist only in values array */
    RECENTLY_WATCHED_LIVE("recentlyWatchedLive"),
    MY_LIST("myList"),
    /* JADX INFO: Fake field, exist only in values array */
    TRENDING_MOVIES("trendingMovies"),
    /* JADX INFO: Fake field, exist only in values array */
    TRENDING_SERIES("trendingSeries"),
    RECOMMENDED("recommended"),
    /* JADX INFO: Fake field, exist only in values array */
    TONIGHT_ON_TV("tonightOnTV"),
    /* JADX INFO: Fake field, exist only in values array */
    RECENTLY_ADDED_MOVIES("recentlyAddedMovies"),
    /* JADX INFO: Fake field, exist only in values array */
    RECENTLY_ADDED_SERIES("recentlyAddedSeries"),
    /* JADX INFO: Fake field, exist only in values array */
    RECENTLY_ADDED_LIVE("recentlyAddedLive"),
    PLATFORM("platform"),
    CUSTOM_FEED("customFeed"),
    TRAKT_LIST("traktList");

    public static final com.kiptv.core.model.HomeSectionKind$Companion Companion;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.List f19660i;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f19667q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19668h;

    static {
        com.kiptv.core.model.A a2 = HERO;
        com.kiptv.core.model.A a9 = MY_LIST;
        com.kiptv.core.model.A a10 = RECOMMENDED;
        f19667q = com.google.crypto.tink.shaded.protobuf.q0.t(aArr);
        Companion = new com.kiptv.core.model.HomeSectionKind$Companion();
        f19660i = p078i6.p.B0(a2, a, a, a, a, a, a9, a, a, a10, a, a, a);
    }

    public A(java.lang.String str) {
        super(str, i);
        this.f19668h = str;
    }

    public static com.kiptv.core.model.A valueOf(java.lang.String str) {
        return (com.kiptv.core.model.A) java.lang.Enum.valueOf(com.kiptv.core.model.A.class, str);
    }

    public static com.kiptv.core.model.A[] values() {
        return (com.kiptv.core.model.A[]) f19666p.clone();
    }

    public final java.lang.String a() {
        switch (this) {
            case HERO:
                return "home.section.hero";
            case CONTINUE_WATCHING:
                return "continueWatching.title";
            case NOW_ON_TV:
                return "home.section.nowOnTV";
            case NEW_EPISODES:
                return "home.section.newEpisodes";
            case RECENTLY_WATCHED_LIVE:
                return "livetv.recentlyWatched";
            case MY_LIST:
                return "myList.title";
            case TRENDING_MOVIES:
                return "trending.movies";
            case TRENDING_SERIES:
                return "trending.series";
            case RECOMMENDED:
                return "home.section.recommended";
            case TONIGHT_ON_TV:
                return "home.section.tonightOnTV";
            case RECENTLY_ADDED_MOVIES:
                return "home.section.recentlyAddedMovies";
            case RECENTLY_ADDED_SERIES:
                return "home.section.recentlyAddedSeries";
            case RECENTLY_ADDED_LIVE:
                return "home.section.recentlyAddedLive";
            case PLATFORM:
                return "home.section.platform";
            case CUSTOM_FEED:
                return "home.section.customFeed";
            case TRAKT_LIST:
                return "home.section.traktList";
            default:
                throw new I3.b();
        }
    }

    public final boolean b() {
        return (this == PLATFORM || this == CUSTOM_FEED || this == TRAKT_LIST) ? false : true;
    }
}
