package human;
/*
                                                                Ի՞նչ է կանստրուկտրը

                                                Կանստրուկտրը ֆունկցիա է որը ֆունկցիայից տարբերվում է 2 բանով
                                                1․ վերադարձվող արժեքի տիպը չի գրվում,
                                                2․ պետք է ունենա այն անունը որը ունի կլասը:
 */
public class Human {

    private String name;

    private int year;
    public Human(String name,int year){
        this.name = name;
        this.year  =year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b,int c){
        return a + b + c;
    }

    public int sum(int a, String aa){
        return 0;
    }

    public int sum(String bb,int b){
        return 0;
    }

}
