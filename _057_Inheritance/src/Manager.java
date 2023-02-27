public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int age, String address, String experience, int teamSize) {
        super(name, age, address, experience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void report(){
        System.out.println("REPORTED");
    }
}
