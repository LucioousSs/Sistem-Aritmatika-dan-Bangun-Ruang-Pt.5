public class listMobil {
    private String make, model, regNo;
    private int KMTravelled;

    // Constructor
    listMobil () {
        make ="Unknown";
        model="Unknown";
        regNo="Unknown";
        KMTravelled=0;

    }


    // method overloading, dimana nama sama disuatu class dengan parameter berbeda
    public listMobil(String make, String model, String regNo, int KMTravelled) {
        this.make = make;
        this.model = model;
        this.regNo = regNo;
        this.KMTravelled = KMTravelled;
    }


    public void setregNo(String regNo){
        this.regNo = regNo;
    }
    
    public void setMake (String make){
        this.make=make;
    }

    public void setModel (String model){
        this.model=model;
    }

    public void setKMTravelled (int value){
        this.KMTravelled+=value;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getKMTravelled() {
        return KMTravelled;
    }
    
}
