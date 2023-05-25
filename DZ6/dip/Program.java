package DZ6.dip;

public class Program {

    
    public static void main(String[] args) {

        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
    }

}
