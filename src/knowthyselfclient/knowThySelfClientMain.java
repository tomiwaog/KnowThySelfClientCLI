package knowthyselfclient;
public class knowThySelfClientMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String zodiac = "";
        System.out.println("APP LAUNCHING...BEGIN ");
        // TODO code application logic here
        String getName = Console.askString("\nPlease enter Your Full Name: ");
        String inDd = Console.askString("\nPlease enter DAY of birth: ");

        Console.askString("\nPlease enter Your Favourite Food: ");
        Console.askString("\nOK " + getName + ", What is you Favourite Color?: ");
        String inMm = Console.askString("\nPlease enter MONTH of birth: ");
        Console.askString("\nAnd LASTLY, Enter Your Favourite beverage: ");
   
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
                zodiac = "aquarius";
            } else {
                zodiac = "capricorn";
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
                zodiac = "pisces";
            } else {
                zodiac = "aquarius";
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
                zodiac = "aries";
            } else {
                zodiac = "pisces";
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
                zodiac = "taurus";
            } else {
                zodiac = "aries";
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
                zodiac = "gemini";
            } else {
                zodiac = "taurus";
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
                zodiac = "cancer";
            } else {
                zodiac = "gemini";
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
                zodiac = "leo";
            } else {
                zodiac = "cancer";
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
                zodiac = "virgo";
            } else {
                zodiac = "leo";
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
                zodiac = "libra";
            } else {
                zodiac = "virgo";
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
                zodiac = "scorpio";
            } else {
                zodiac = "libra";
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
                zodiac = "sagittarius";
            } else {
                zodiac = "scorpio";
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
                zodiac = "capricon";
            } else {
                zodiac = "saggittarius";
            }
        } else {
            System.out
                    .println("You haven't entered a valid star sign... Please try again");
        }  
        
        //Receives name info from Server.
        System.out.println(welcomeUser(getName));
        //Rtrieves age details from server
        System.out.println("Born on "+ getDayOfBirth(inDd) + " of " + getMonthOfBirth(inMm));
        //Gets User Summary from Server
        System.out.println(findZodiac(zodiac));

    }

    private static String findZodiac(java.lang.String typeZodiacc) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.findZodiac(typeZodiacc);
    }

    private static String getDateOfBirth(java.lang.String dd, java.lang.String mm, int yyyy) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.getDateOfBirth(dd, mm, yyyy);
    }

    private static String getDayOfBirth(java.lang.String dd) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.getDayOfBirth(dd);
    }

    private static String getFaveColor(java.lang.String color) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.getFaveColor(color);
    }

    private static String getFaveDrink(java.lang.String drink) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.getFaveDrink(drink);
    }

    private static String getFaveFood(java.lang.String food) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.getFaveFood(food);
    }

    private static String getMonthOfBirth(java.lang.String monthdob) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.getMonthOfBirth(monthdob);
    }

    private static String getZodiacSign(java.lang.String zodiac) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.getZodiacSign(zodiac);
    }

    private static String welcomeUser(java.lang.String user) {
        knowthyselfclient.KnowThySelfWebService_Service service = new knowthyselfclient.KnowThySelfWebService_Service();
        knowthyselfclient.KnowThySelfWebService port = service.getAppWebPort();
        return port.welcomeUser(user);
    }








    
}