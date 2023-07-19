package javaders.day38enumsiterators;

import java.util.Arrays;

public enum UsStatesEnum {

    /*
    Enum olustururken class yerine "enum" keyword yazilir.
    Enumlar degisme ihtimali olmayan datalari depolamak icin kullanilir. Mesela gun isimleri, Monday, Tuesday...
    Eger applicationda gun isimleri kullanirsak bu gun isimleri veya ay isimleri enumda depolanir.
    Nicin bunu yapariz? Cunku application kendi basina ayakta durmalidir.(Stand Alone)
    App bir bilgiye ihtiyac duydugunda internetten almak yerine kendi deposundan almalidir.
    Enumlar buyuk harfle yazilirlar. Sabit olan enum ornek ALABAMA("Alabama") olarak depolamak isteyebiliriz.
    ALABAMA("Alabama", kisaltmasi olan AL, bir sehri "Montgomery"'i parantez icine ekledik. Boylece Alabama
    eyaleti ile ilgili detaylari ekledik)
    Enum'da eyalet ismi yaninda baska bilgiler de eklenebilir.Eyalet ismi, kisaltmasi ve baskenti gibi.

     */

    ALABAMA("Alabama", "AL", "Montgomery"),
    ALASKA("Alaska", "AK", "Juneau"),
    AMERICAN_SAMOA("American Samoa", "AS", "Pago Pago"),
    ARIZONA("Arizona", "AZ", "Phoenix"),
    ARKANSAS("Arkansas", "AR", "Little Rock"),
    CALIFORNIA("California", "CA", "Sacramento"),
    COLORADO("Colorado", "CO", "Denver"),
    CONNECTICUT("Connecticut", "CT", "Hartford"),
    DELAWARE("Delaware", "DE", "Dover"),
    DISTRICT_OF_COLUMBIA("District of Columbia", "DC", "Washington"),
    FLORIDA("Florida", "FL", "Tallahassee"),
    GEORGIA("Georgia", "GA", "Atlanta"),
    GUAM("Guam", "GU", "Hagatna"),
    HAWAII("Hawaii", "HI", "Honolulu"),
    IDAHO("Idaho", "ID", "Boise"),
    ILLINOIS("Illinois", "IL", "Springfield"),
    INDIANA("Indiana", "IN", "Indianapolis"),
    IOWA("Iowa", "IA", "Des Moines"),
    KANSAS("Kansas", "KS", "Topeka"),
    KENTUCKY("Kentucky", "KY", "Frankfort"),
    LOUISIANA("Louisiana", "LA", "Baton Rouge"),
    MAINE("Maine", "ME", "Augusta"),
    MARSHALL_ISLANDS("Marshall Islands", "", "Majuro"),
    MARYLAND("Maryland", "MD", "Annapolis"),
    MASSACHUSETTS("Massachusetts", "MA", "Boston"),
    MICHIGAN("Michigan", "MI", "Lansing"),
    MINNESOTA("Minnesota", "MN", "Saint Paul"),
    MISSISSIPPI("Mississippi", "MS", "Jackson"),
    MISSOURI("Missouri", "MO", "Jefferson City"),
    MONTANA("Montana", "MT", "Helena"),
    NEBRASKA("Nebraska", "NE", "Lincoln"),
    NEVADA("Nevada", "NV", "Carson City"),
    NEW_HAMPSHIRE("New Hampshire", "NH", "Concord"),
    NEW_JERSEY("New Jersey", "NJ", "Trenton"),
    NEW_MEXICO("New Mexico", "NM", "Santa Fe"),
    NEW_YORK("New York", "NY", "Albany"),
    NORTH_CAROLINA("North Carolina", "NC", "Raleigh"),
    NORTH_DAKOTA("North Dakota", "ND", "Bismarck"),
    NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands", "MP", "Saipan"),
    OHIO("Ohio", "OH", "Columbus"),
    OKLAHOMA("Oklahoma", "OK", "Oklahoma City"),
    OREGON("Oregon", "OR", "Salem"),
    PENNSYLVANIA("Pennsylvania", "PA", "Harrisburg"),
    PUERTO_RICO("Puerto Rico", "PR", "San Juan"),
    RHODE_ISLAND("Rhode Island", "RI","Providence"),
    SOUTH_CAROLINA("South Carolina", "SC", "Columbia"),
    SOUTH_DAKOTA("South Dakota", "SD", "Pierre"),
    TENNESSEE("Tennessee", "TN", "Nashville"),
    TEXAS("Texas", "TX", "Austin"),
    US_VIRGIN_ISLANDS("US Virgin Islands", "VI", "Charlotte Amalie"),
    UTAH("Utah", "UT", "Salt Lake City"),
    VERMONT("Vermont", "VT", "Montpelier"),
    VIRGINIA("Virginia", "VA", "Richmond"),
    WASHINGTON("Washington", "WA", "Olympia"),
    WEST_VIRGINIA("West Virginia", "WV", "Charleston"),
    WISCONSIN("Wisconsin", "WI", "Madison"),
    WYOMING("Wyoming", "WY", "Cheyenne");


    //iceriye koyulan her detay icin bir variable olusturmamiz lazim.
    //degistirilmez ve private yaptik

    private final String stateName;
    private final String abbreviation;
    private final String capital;

    //constructor koydugumuzda kirmizi cizgiler gitti.
    UsStatesEnum(String stateName, String abbreviation, String capital) {
        this.stateName = stateName;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    //private oldugu icin getter methodu olusturmamaiz lazim;
    //final methodundan dolayi(degistirilemez) setter ekleyemeyiz

    public String getStateName() {
        return stateName;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public String getCapital() {
        return capital;
    }
    //state kisaltmasini verince state'in ismini veren method
    public static String getStateNameByUsingAbbreviation(String abbreviation){  //static yaptik obje olusturmayla ugrasmamak icin
        return Arrays.stream(values())
                .filter(usState -> usState.getAbbreviation().equals(abbreviation))
                .findFirst().get().getStateName();
    }

    //state ismini verince state'in kisaltmasini veren method
    public static String getAbbreviationForStateName(String stateName) {
        return Arrays.stream(values())
                .filter(usState -> usState.getStateName().equals(stateName))
                .findFirst().get().getAbbreviation();
    }
}
