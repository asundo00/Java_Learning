public class SecondMinutes {

    public static String GetDurationString(int minutes, int seconds) {
        int hours = 0;
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        if (seconds > 60) {
            int minutes2 = seconds / 60;
            seconds = seconds % 60;
            minutes += minutes2;
        }

        if (minutes / 60 != 0) {
            hours = (int) (minutes / 60);
            minutes = minutes % 60;
        }

        return hours + "H " + minutes + "min " + seconds + "s ";
    }

    public static String GetDurationString(int seconds) {
        int minutes = 0;
        if (seconds < 0)
            return "Invalid";
        else {
            minutes = seconds / 60;
            seconds = seconds % 60;
        }
        return "minute" + minutes + "sekunde=" + seconds;
    }
}



