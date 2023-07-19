package javaders.day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {

        String capitalOfIllinios = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinios);

        String abbrevitaionOfFlorida =UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbrevitaionOfFlorida);

        //Data type'i enum'in kendisi olamlidir.
        UsStatesEnum state = UsStatesEnum.ALASKA;   //Enumlar variable'larin data type'i olarak kullanbilanir.
        System.out.println(state);

        String stateName= UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);  //ALASKA

        String abbreviationOfAlaska= UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);  //AK
    }
}
