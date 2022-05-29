package DesignPatterns;

import java.util.Scanner;

abstract class Plan{
    int rate;
    abstract void getRate();

    public void calculateBills(int units)
    {
        System.out.println(rate*units);
    }
}

class DomesticPlan extends Plan{

    @Override
    void getRate() {
        rate=10;
    }
}
class CommercialPlan extends Plan{

    @Override
    void getRate() {
        rate=15;
    }
}
class InstitutionalPlan extends Plan{

    @Override
    void getRate() {
        rate=7;
    }
}

class GetPlanFactory
{
    public Plan getPlan(String planType)
    {
        if(planType.equalsIgnoreCase("DomesticPlan"))
            return new DomesticPlan();
        if(planType.equalsIgnoreCase("CommercialPlan"))
            return new CommercialPlan();
        if(planType.equalsIgnoreCase("InstitutionalPlan"))
            return new InstitutionalPlan();
        else return null;
    }

}

public class FactoryExample3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String planType=sc.nextLine();
        int units=sc.nextInt();

        GetPlanFactory getPlanFactory=new GetPlanFactory();

        Plan p=getPlanFactory.getPlan(planType);

        System.out.print("Bill amount for "+planType+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBills(units);
    }
}
