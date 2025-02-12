public class MyCalculate {

    public int addNumber(int a, int b){
        return a + b;
    }

    public String addString(String d, String e){
        return d + e;
    }

    public int checkVAT(double ammount, double ammountVAT){
        return (int)(ammountVAT/ammount*100);
    }
}
