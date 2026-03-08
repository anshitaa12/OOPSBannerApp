public class OOPSBannerApp6 {

    public static String[] get0Pattern() {
        String[] pattern = {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
        return pattern;
    }

    public static String[] getPPattern() {
        String[] pattern = {
            "******   ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "******   ",
            "**       ",
            "**       "
        };
        return pattern;
    }

    public static String[] getSPattern() {
        String[] pattern = {
            "   ***** ",
            " **      ",
            "**       ",
            " **      ",
            "   ***   ",
            "      ** ",
            " *****   "
        };
        return pattern;
    }

    public static void main(String[] args) {

        String[] oPattern = get0Pattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}