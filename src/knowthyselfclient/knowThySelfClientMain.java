package knowthyselfclient;

public class knowThySelfClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String starsign = "";
        System.out.println("APP LAUNCHING...BEGIN ");
        // TODO code application logic here
        String getName = Console.askString("\nPlease enter Your Full Name: ");


        String inDd = Console.askString("\nPlease enter DAY of birth: ");

        Console.askString("\nPlease enter Your Favourite Food: ");
        Console.askString("\nOK " + getName + ", What is you Favourite Color?: ");
        String inMm = Console.askString("\nPlease enter MONTH of birth: ");
        Console.askString("\nAnd LASTLY, Enter Your Favourite beverage: ");

        System.out.println(welcomeUser(getName));
        System.out.println("Born on "+ getDayOfBirth(inDd) + " of " + getMonthOfBirth(inMm));
        // FOR MONTH JANUARY
        if (inMm.toLowerCase().contains("jan")) {
            if (inDd.toLowerCase().contains("20")
                    || inDd.toLowerCase().contains("21")
                    || inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "aquarius";
            } else {
                starsign = "capricorn";
            }
        } // FOR MONTH FEBRUARY
        else if (inMm.toLowerCase().contains("feb")) {
            if (inDd.toLowerCase().contains("18")
                    || inDd.toLowerCase().contains("19")
                    || inDd.toLowerCase().contains("20")
                    || inDd.toLowerCase().contains("21")
                    || inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "pisces";
            } else {
                starsign = "aquarius";
            }
        } // FOR MONTH MARCH
        else if (inMm.toLowerCase().contains("mar")) {
            if (inDd.toLowerCase().contains("20")
                    || inDd.toLowerCase().contains("21")
                    || inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "aries";
            } else {
                starsign = "pisces";
            }
        } // FOR MONTH APRIL
        else if (inMm.toLowerCase().contains("apr")) {
            if (inDd.toLowerCase().contains("20")
                    || inDd.toLowerCase().contains("21")
                    || inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "taurus";
            } else {
                starsign = "aries";
            }
        } // FOR MONTH MAY
        else if (inMm.toLowerCase().contains("may")) {
            if (inDd.toLowerCase().contains("20")
                    || inDd.toLowerCase().contains("21")
                    || inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "gemini";
            } else {
                starsign = "taurus";
            }
        } // FOR MONTH JUNE
        else if (inMm.toLowerCase().contains("jun")) {
            if (inDd.toLowerCase().contains("21")
                    || inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "cancer";
            } else {
                starsign = "gemini";
            }
        } // FOR MONTH JULY
        else if (inDd.toLowerCase().contains("jul")) {
            if (inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "leo";
            } else {
                starsign = "cancer";
            }
        } // FOR MONTH AUGUST
        else if (inMm.toLowerCase().contains("aug")) {
            if (inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "virgo";
            } else {
                starsign = "leo";
            }
        } // FOR MONTH SEPTEMBER
        else if (inMm.toLowerCase().contains("sep")) {
            if (inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "libra";
            } else {
                starsign = "virgo";
            }
        } // FOR MONTH OCTOBER
        else if (inMm.toLowerCase().contains("oct")) {
            if (inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "scorpio";
            } else {
                starsign = "libra";
            }
        } // FOR MONTH NOVEMBER
        else if (inMm.toLowerCase().contains("nov")) {
            if (inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "sagittarius";
            } else {
                starsign = "scorpio";
            }
        } // FOR MONTH DECEMBER
        else if (inMm.toLowerCase().contains("dec")) {
            if (inDd.toLowerCase().contains("22")
                    || inDd.toLowerCase().contains("23")
                    || inDd.toLowerCase().contains("24")
                    || inDd.toLowerCase().contains("25")
                    || inDd.toLowerCase().contains("26")
                    || inDd.toLowerCase().contains("27")
                    || inDd.toLowerCase().contains("28")
                    || inDd.toLowerCase().contains("29")
                    || inDd.toLowerCase().contains("30")
                    || inDd.toLowerCase().contains("31")) {
                starsign = "capricon";
            } else {
                starsign = "saggittarius";
            }
        } else {
            System.out
                    .println("You haven't entered a valid star sign... Please try again");
        }

        if (starsign == "gemini") {
            System.out.println("SUMMARY\nYou are intelligent, a thinker , communicative, humorous,"
                    + " multiskilled, indecisive, mutable, Adaptable, restless, witty and devious");
        }

        if (starsign == "leo") {
            System.out.println("SUMMARY\nYou are confident, melodramatic, generous, loyal, stubborn,"
                    + " vain, pretentious, family-oriented or prone to family issues");
        }
        if (starsign == "capricorn") {
            System.out.println("SUMMARY\nYou are stubborn, resourceful, hardworking, ambitous, dictorial,"
                    + " conceited, emotional, distrusting, responsible");
        }
        if (starsign == "pisces") {
            System.out.println("SUMMARY\nYou are emotional, compassionate, devoted, lazy, imaginative,"
                    + " oversensitive, self-pitying, and an escapist");
        }
        if (starsign == "aquarius") {
            System.out.println("SUMMARY\nYou are witty, communicative, original, intelligent, aloof and unemotional");
        }
        if (starsign == "aries") {
            System.out.println("SUMMARY\nYou are Independent, generous, moody, short-tempered, optimistic, self-involved and impatient");
        }
        if (starsign == "taurus") {
            System.out.println("SUMMARY\nYou are stubborn, honest, materialistic, lazy and self indulging");
        }
        if (starsign == "cancer") {
            System.out.println("SUMMARY\nYou are moody, homely, fmaily-oriented and (or) family issues or daddy issues,"
                    + " over-sensitive, insecure, caring, responsive and dependable");
        }
        if (starsign == "virgo") {
            System.out.println("SUMMARY\nYou are analytical, observant, fussy, precise, cold, interferromg"
                    + ", inflexible, direct, helpful, reliable, not fun");
        }
        if (starsign == "libra") {
            System.out.println("SUMMARY\nYou are Diplomatic, hospitable, colourful, Vain, indecisive, fair, social, intelligent and people pleaser");
        }
        if (starsign == "scorpio") {
            System.out.println("SUMMARY\nYou are resourceful, passionate, loyal, evil, stubborn, determined"
                    + "obsessive, jealous, intuitive, violent, aggressive, manipulative, ride or die person");
        }
        if (starsign == "sagittarius") {
            System.out.println("SUMMARY\nYou are exciting, independent, unemotional, adventurous, mutable, philosophical, "
                    + "stubborn and argumentative");
        }

    }

    private static String welcomeUser(java.lang.String user) {
        knowthyselfclient.KTSServiceServer_Service service = new knowthyselfclient.KTSServiceServer_Service();
        knowthyselfclient.KTSServiceServer port = service.getAppWebPort();
        return port.welcomeUser(user);
    }

    private static String getDayOfBirth(java.lang.String dd) {
        knowthyselfclient.KTSServiceServer_Service service = new knowthyselfclient.KTSServiceServer_Service();
        knowthyselfclient.KTSServiceServer port = service.getAppWebPort();
        return port.getDayOfBirth(dd);
    }

    private static String getMonthOfBirth(java.lang.String monthdob) {
        knowthyselfclient.KTSServiceServer_Service service = new knowthyselfclient.KTSServiceServer_Service();
        knowthyselfclient.KTSServiceServer port = service.getAppWebPort();
        return port.getMonthOfBirth(monthdob);
    }
    

}