package homeworkpractice;

public class MethodPractice {

    public void makeup (){
        System.out.println("I need to buy more makeup");
    }
    public void perfume () {
        System.out.println("I gotta go to bath & body works to buy body mist");
    }
    public void outfit () {
        System.out.println("My outfit of the day will be black shirt and grey jeans");
    }
    public static void accessories () {
        System.out.println("Without putting on accessories, I can't go out");
    }
    public static void shoes (){
        System.out.println("I bought new shoes to match with my outfit");
    }
    public static void shopping (){
        System.out.println("Even if I didn't had much money, I would still be excited to go for shopping");
    }
    public int punch (int p, int k) {
        int slap = p + k;
        return slap;
    }
    public String pillow (String p){
        String matress = p;
        return matress;
    }
    public static String fabric (String f){
        String design = f;
        return design;
    }
    public static int teddy (int t, int m){
        int minnie = t*m;
        return minnie;
    }
    String forest;
    int tiger = 10;
    static String juice = "Goya";
    static int coffee;
    public static void lotion () {
        String l = "Apply lotion to moisture the skin";
        System.out.println(l);
    }
    public static void earphone (){
        int e = 2;
        System.out.println(e);
    }
    public void kpop (String bts){
        System.out.println(bts);
    }
    public void hat (int h){
        System.out.println(h);
    }

    public static void main(String[] args) {
        MethodPractice methodpractice = new MethodPractice();
        methodpractice.makeup();
        accessories();
        methodpractice.perfume();
        shoes();
        methodpractice.outfit();
        shopping();
        int fight = methodpractice.punch(10,5) ;
        System.out.println(fight);
        String bed = methodpractice.pillow("I bought new pillow and matress for bed");
        System.out.println(bed);
        String dress = fabric("New designs were made for the dress");
        System.out.println(dress);
        int plushie = teddy(8,84);
        System.out.println(plushie);
        methodpractice.forest = "Plant more trees to save the forest";
        System.out.println(methodpractice.forest);
        System.out.println(methodpractice.tiger);
        System.out.println(juice);
        coffee = 2;
        System.out.println(coffee);
        lotion();
        earphone();
        methodpractice.kpop("7 members");
        methodpractice.hat(8);
    }

}
