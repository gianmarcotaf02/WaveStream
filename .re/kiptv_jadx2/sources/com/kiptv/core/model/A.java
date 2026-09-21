package com.kiptv.core.model;

import java.util.List;

@p119n8.i(with = B.class)
public final class A {
    HERO("hero"),
    CONTINUE_WATCHING("continueWatching"),
    NOW_ON_TV("nowOnTV"),
    NEW_EPISODES("newEpisodes"),
    RECENTLY_WATCHED_LIVE("recentlyWatchedLive"),
    MY_LIST("myList"),
    TRENDING_MOVIES("trendingMovies"),
    TRENDING_SERIES("trendingSeries"),
    RECOMMENDED("recommended"),
    TONIGHT_ON_TV("tonightOnTV"),
    RECENTLY_ADDED_MOVIES("recentlyAddedMovies"),
    RECENTLY_ADDED_SERIES("recentlyAddedSeries"),
    RECENTLY_ADDED_LIVE("recentlyAddedLive"),
    PLATFORM("platform"),
    CUSTOM_FEED("customFeed"),
    TRAKT_LIST("traktList");

    public static final HomeSectionKind$Companion Companion;

    public static final List f19660i;

    public static final p126o6.b f19667q;

    public final String f19668h;

    static {
        A a2 = HERO;
        A a9 = MY_LIST;
        A a10 = RECOMMENDED;
        f19667q = com.google.crypto.tink.shaded.protobuf.q0.t(aArr);
        Companion = new HomeSectionKind$Companion();
        f19660i = p078i6.p.B0(a2, a, a, a, a, a, a9, a, a, a10, a, a, a);
    }

    public A(String str) {
        super(str, i);
        this.f19668h = str;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f19666p.clone();
    }

    public final String a() {
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
