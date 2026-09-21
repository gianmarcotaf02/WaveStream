package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static float a(android.media.Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(android.media.Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(android.media.Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(android.media.Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(android.media.Rating rating) {
        return rating.isRated();
    }

    public static boolean f(android.media.Rating rating) {
        return rating.isThumbUp();
    }

    public static android.media.Rating g(boolean z6) {
        return android.media.Rating.newHeartRating(z6);
    }

    public static android.media.Rating h(float f9) {
        return android.media.Rating.newPercentageRating(f9);
    }

    public static android.media.Rating i(int i3, float f9) {
        return android.media.Rating.newStarRating(i3, f9);
    }

    public static android.media.Rating j(boolean z6) {
        return android.media.Rating.newThumbRating(z6);
    }

    public static android.media.Rating k(int i3) {
        return android.media.Rating.newUnratedRating(i3);
    }
}
