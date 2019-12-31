package practiceenum;

public class Language {
    Country country;
    public Language(){

    }
    public Language(Country country){
        this.country = country;
    }

    public void usedLanguage(){
        switch(country){
            case USA:
                System.out.println("Speaks English, no need for interpreter");
                break;
            case UK:
                System.out.println("Speaks English, no need for interpreter");
                break;
            case Bangladesh:
                System.out.println("Speaks Bengali, needs bengali interpreter");
                break;
            case Canada:
                System.out.println("Speaks English, no need for interpreter");
                break;
            case India:
                System.out.println("Speaks Hindi,needs hindi interpreter");
                break;
            case Egypt:
                System.out.println("speaks standerd Arabic, needs arabic interpreter");
                break;
            case Pakistan:
                System.out.println("speaks urdu, needs urdu interpreter");
                break;
            case Algeria:
                System.out.println("speaks arabic, needs arabic interpreter");
                break;
            case Nepal:
                System.out.println("speaks nepali, needs nepali interpreter");
                break;
            default:
                System.out.println("Sorry we currenty do not have the interpreter of your language");
                break;
        }
    }

}
