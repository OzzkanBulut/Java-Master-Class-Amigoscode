public class Phone extends TechStuff {
    private String phoneModel;

    public Phone(String name, int price, String phoneModel) {
        super(name, price);
        this.phoneModel = phoneModel;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }
}
