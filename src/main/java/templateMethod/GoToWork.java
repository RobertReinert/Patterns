package templateMethod;

public abstract class GoToWork {

    abstract void eatBreakfast();
    abstract void dressYourself();


    //template Method
    public final void goToWork(){
        eatBreakfast();
        dressYourself();
        useTransportOption();
    }

    private void useTransportOption(){
        System.out.println("Car");
    }

}
