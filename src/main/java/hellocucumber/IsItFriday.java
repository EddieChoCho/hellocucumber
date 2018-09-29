package hellocucumber;

class IsItFriday {

    public static String MESSAGE_IS_FRIDAY = "TGIF";
    public static String MESSAGE_IS_NOT_FRIDAY = "Nope";

    static String isItFriday(String today) {
        return today.equals("Friday") ? MESSAGE_IS_FRIDAY : MESSAGE_IS_NOT_FRIDAY;
    }
}